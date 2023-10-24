package com.ephraimglick.auctionarchiver.controllers;

import com.ephraimglick.auctionarchiver.models.AuctionItem;
import com.ephraimglick.auctionarchiver.models.AuctionItemPagedCollection;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.AUCTION_ITEMS;
import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.SEARCH;

@RequestMapping()
public interface AuctionArchiverApi extends BaseApi {
    @GetMapping(SEARCH)
    AuctionItemPagedCollection search(@RequestParam String q);

    @GetMapping(AUCTION_ITEMS)
    List<AuctionItem> listArchivedItems();

    @PostMapping(AUCTION_ITEMS)
    ResponseEntity<?> archiveItem(@RequestBody AuctionItem auctionItem);
}
