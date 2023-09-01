package com.ephraimglick.auctionarchiver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.SEARCH;

@RequestMapping()
public interface AuctionArchiverApi extends BaseApi {
    @GetMapping(SEARCH)
    public String search();
}
