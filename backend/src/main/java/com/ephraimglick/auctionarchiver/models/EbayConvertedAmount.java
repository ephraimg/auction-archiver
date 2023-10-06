package com.ephraimglick.auctionarchiver.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EbayConvertedAmount {
    private String convertedFromCurrency;
    private String convertedFromValue;
    private String currency;
    private String value;
}
