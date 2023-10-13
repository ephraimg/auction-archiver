package com.ephraimglick.auctionarchiver.services;

import com.ephraimglick.auctionarchiver.models.EbaySearchPagedItemSummariesCollection;
import com.ephraimglick.auctionarchiver.models.EbayTokenResponse;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuctionArchiverEbayService implements EbayService {
    private final OkHttpClient client = new OkHttpClient();
    private EbayTokenResponse tokenResponse;
    private LocalDateTime tokenExpiryTime;
    private final String EBAY_AUTH_CODE = System.getenv("EBAY_AUTH_CODE");

    private Boolean needNewToken() {
        if (this.tokenResponse == null) {
            return true;
        }
        // Don't try to use a token that's just about to expire!
        LocalDateTime expiryTimeWithLeeway = tokenExpiryTime.plusMinutes(1);
        return LocalDateTime.now().isAfter(expiryTimeWithLeeway);
    }

    public void getToken() {
        if (!this.needNewToken()) {
            return;
        }

        RequestBody body = RequestBody.create(
                MediaType.parse("application/x-www-form-urlencoded"),
                "grant_type=client_credentials&scope=https://api.ebay.com/oauth/api_scope");
        Request request = new Request.Builder()
                .url("https://api.sandbox.ebay.com/identity/v1/oauth2/token")
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("Authorization", "Basic " + EBAY_AUTH_CODE)
                .build();
        Call call = client.newCall(request);

        try (Response response = call.execute()) {
            String responseBody = response.body().string();
            Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
            EbayTokenResponse tokenResponse = gson.fromJson(responseBody, EbayTokenResponse.class);
            this.tokenResponse = tokenResponse;
            Long expiresInMinutes = Long.valueOf(tokenResponse.getExpiresIn());
            this.tokenExpiryTime = LocalDateTime.now().plusMinutes(expiresInMinutes);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public EbaySearchPagedItemSummariesCollection searchItemSummaries(String searchTerm) {
        if (!this.needNewToken()) {
            Request request = new Request.Builder()
                    .url("https://api.sandbox.ebay.com/buy/browse/v1/item_summary/search?q=" + searchTerm)
                    .get()
                    .addHeader("Authorization", "Bearer " + this.tokenResponse.accessToken)
                    .build();
            Call call = client.newCall(request);
            try (Response response = call.execute()) {
                Gson gson = new GsonBuilder().create();
                String responseBody = response.body().string();
                return gson.fromJson(
                        responseBody,
                        EbaySearchPagedItemSummariesCollection.class
                );
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            throw new RuntimeException("No eBay token available");
        }

        return new EbaySearchPagedItemSummariesCollection();
    }

}
