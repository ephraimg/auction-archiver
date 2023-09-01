package com.ephraimglick.auctionarchiver.models;

public class EbayConvertedAmount {
    private String convertedFromCurrency;
    private String convertedFromValue;
    private String currency;
    private String value;

    public String getConvertedFromCurrency() {
        return convertedFromCurrency;
    }

    public void setConvertedFromCurrency(String convertedFromCurrency) {
        this.convertedFromCurrency = convertedFromCurrency;
    }

    public String getConvertedFromValue() {
        return convertedFromValue;
    }

    public void setConvertedFromValue(String convertedFromValue) {
        this.convertedFromValue = convertedFromValue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
