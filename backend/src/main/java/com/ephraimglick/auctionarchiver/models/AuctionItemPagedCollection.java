package com.ephraimglick.auctionarchiver.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AuctionItemPagedCollection extends EbaySearchPagedCollection {
    List<AuctionItem> auctionItems;
}