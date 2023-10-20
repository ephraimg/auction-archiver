package com.ephraimglick.auctionarchiver.controllers;

import com.ephraimglick.auctionarchiver.models.EbayItemSummary;
import com.ephraimglick.auctionarchiver.models.EbaySearchPagedItemSummariesCollection;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.AUCTION_ITEMS;
import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.SEARCH;

@RequestMapping()
public interface AuctionArchiverApi extends BaseApi {
    @GetMapping(SEARCH)
    EbaySearchPagedItemSummariesCollection search(@RequestParam String q);

    @PostMapping(AUCTION_ITEMS)
    ResponseEntity<?> archiveItem(@RequestBody EbayItemSummary itemSummary);
}
