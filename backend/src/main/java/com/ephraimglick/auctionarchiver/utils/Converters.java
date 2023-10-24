package com.ephraimglick.auctionarchiver.utils;

import com.ephraimglick.auctionarchiver.models.AuctionItem;
import com.ephraimglick.auctionarchiver.models.AuctionItemPagedCollection;
import com.ephraimglick.auctionarchiver.models.EbayItemSummary;
import com.ephraimglick.auctionarchiver.models.EbaySearchPagedItemSummariesCollection;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Converters {
    public AuctionItemPagedCollection convertCollection(EbaySearchPagedItemSummariesCollection ebayCollection) {
        AuctionItemPagedCollection auctionItemPagedCollection = new AuctionItemPagedCollection();
        auctionItemPagedCollection.setHref(ebayCollection.getHref());
        auctionItemPagedCollection.setLimit(ebayCollection.getLimit());
        auctionItemPagedCollection.setOffset(ebayCollection.getOffset());
        auctionItemPagedCollection.setPrev(ebayCollection.getPrev());
        auctionItemPagedCollection.setNext(ebayCollection.getNext());
        auctionItemPagedCollection.setTotal(ebayCollection.getTotal());
        List<EbayItemSummary> itemSummaries = ebayCollection.getItemSummaries();
        List<AuctionItem> auctionItems;
        if (itemSummaries == null) {
            auctionItems = new ArrayList<>();
        } else {
            auctionItems = itemSummaries
                    .stream()
                    .map(AuctionItem::new)
                    .toList();
        }
        auctionItemPagedCollection.setAuctionItems(auctionItems);
        return auctionItemPagedCollection;
    }
}
