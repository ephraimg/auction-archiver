package com.ephraimglick.auctionarchiver.controllers;

import com.ephraimglick.auctionarchiver.models.EbaySearchPagedItemSummariesCollection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.SEARCH;

@RequestMapping()
public interface AuctionArchiverApi extends BaseApi {
    @GetMapping(SEARCH)
    EbaySearchPagedItemSummariesCollection search(@RequestParam String q);
}
