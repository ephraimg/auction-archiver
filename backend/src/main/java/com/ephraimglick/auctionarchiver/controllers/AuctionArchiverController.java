package com.ephraimglick.auctionarchiver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.SEARCH;

@RestController
public class AuctionArchiverController implements AuctionArchiverApi {

    @GetMapping(SEARCH)
    public String search() {
        return "Search result";
    }

}
