package com.ephraimglick.auctionarchiver.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EbayImage {
    private short height;
    private short width;
    private String imageUrl;
}
