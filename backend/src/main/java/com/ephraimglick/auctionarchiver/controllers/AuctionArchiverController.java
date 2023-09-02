package com.ephraimglick.auctionarchiver.controllers;

import com.ephraimglick.auctionarchiver.models.EbaySearchPagedItemSummariesCollection;
import com.ephraimglick.auctionarchiver.services.AuctionArchiverEbayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.SEARCH;

@RestController
public class AuctionArchiverController implements AuctionArchiverApi {
    private final AuctionArchiverEbayService eBayService = new AuctionArchiverEbayService();

    @GetMapping(SEARCH)
    public EbaySearchPagedItemSummariesCollection search(@RequestParam String q) {
        eBayService.getToken();
        return eBayService.searchItemSummaries(q);
    }

}
