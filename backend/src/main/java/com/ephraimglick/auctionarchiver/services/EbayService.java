package com.ephraimglick.auctionarchiver.services;

import com.ephraimglick.auctionarchiver.models.EbaySearchPagedItemSummariesCollection;

public interface EbayService {
    public void getToken();
    public EbaySearchPagedItemSummariesCollection searchItemSummaries();
}
