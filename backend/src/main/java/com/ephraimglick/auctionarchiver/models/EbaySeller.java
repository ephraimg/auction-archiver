package com.ephraimglick.auctionarchiver.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EbaySeller {
    private String username;
    private String feedbackPercentage;
    private int feedbackScore;
}
