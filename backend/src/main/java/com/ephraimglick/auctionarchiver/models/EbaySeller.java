package com.ephraimglick.auctionarchiver.models;

public class EbaySeller {
    private String username;
    private String feedbackPercentage;
    private int feedbackScore;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFeedbackPercentage() {
        return feedbackPercentage;
    }

    public void setFeedbackPercentage(String feedbackPercentage) {
        this.feedbackPercentage = feedbackPercentage;
    }

    public int getFeedbackScore() {
        return feedbackScore;
    }

    public void setFeedbackScore(int feedbackScore) {
        this.feedbackScore = feedbackScore;
    }
}
