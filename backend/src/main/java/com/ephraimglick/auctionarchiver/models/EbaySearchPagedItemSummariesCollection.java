package com.ephraimglick.auctionarchiver.models;

import java.util.List;

public class EbaySearchPagedItemSummariesCollection extends EbaySearchPagedCollection {
    List<EbayItemSummary> itemSummaries;

    public List<EbayItemSummary> getItemSummaries() {
        return itemSummaries;
    }

    public void setItemSummaries(List<EbayItemSummary> itemSummaries) {
        this.itemSummaries = itemSummaries;
    }
}
