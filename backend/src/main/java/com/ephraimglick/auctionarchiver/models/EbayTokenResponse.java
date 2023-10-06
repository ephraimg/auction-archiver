package com.ephraimglick.auctionarchiver.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EbayTokenResponse {
    public String accessToken;
    public String expiresIn;
    public String tokenType;
}
