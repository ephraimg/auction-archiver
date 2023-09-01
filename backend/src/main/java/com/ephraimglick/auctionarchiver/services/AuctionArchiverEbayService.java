package com.ephraimglick.auctionarchiver.services;

import com.ephraimglick.auctionarchiver.models.EbaySearchPagedItemSummariesCollection;

public class AuctionArchiverEbayService implements EbayService {
    public void getToken() {
    }

    public EbaySearchPagedItemSummariesCollection searchItemSummaries() {
        return new EbaySearchPagedItemSummariesCollection();
    }

}
