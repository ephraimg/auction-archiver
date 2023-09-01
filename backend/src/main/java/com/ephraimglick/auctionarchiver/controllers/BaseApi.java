package com.ephraimglick.auctionarchiver.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.API_V1;

@RequestMapping(value = API_V1, produces = MediaType.APPLICATION_JSON_VALUE)
public interface BaseApi {
}
