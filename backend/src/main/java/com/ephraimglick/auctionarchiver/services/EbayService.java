package com.ephraimglick.auctionarchiver.services;

import com.ephraimglick.auctionarchiver.models.EbaySearchPagedItemSummariesCollection;

import java.io.IOException;

public interface EbayService {
    public void getToken();
    public EbaySearchPagedItemSummariesCollection searchItemSummaries(String searchTerm) throws IOException;
}
