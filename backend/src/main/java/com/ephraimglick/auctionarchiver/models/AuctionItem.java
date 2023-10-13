package com.ephraimglick.auctionarchiver.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class AuctionItem {
    private List<String> additionalImageUrls;
    private int bidCount;
    private EbayConvertedAmount currentBidPrice;
    private String ebaySellerId;
    private String itemCreationDate;
    private String itemEndDate;
    private String imageUrl;
    /**
     * The URI for the eBay Browse API getItem method, which can be used
     * to retrieve more details about items in the search results.
     */
    private String ebayItemAPIHref;
    private String ebayItemId;
    /**
     *  The URL to the View Item page of the item
     */
    private String itemWebUrl;
    private String priceAmount;
    private String priceCurrency;
    private String shortDescription;
    private List<String> thumbnailImageUrls;
    private String title;

    public AuctionItem(EbayItemSummary ebayItemSummary) {
        List<EbayImage> additionalImages = ebayItemSummary.getAdditionalImages();
        this.additionalImageUrls = additionalImages != null
                ? additionalImages.stream()
                    .map(EbayImage::getImageUrl)
                    .collect(Collectors.toList())
                : new ArrayList<>();
        this.bidCount = ebayItemSummary.getBidCount();
        this.currentBidPrice = ebayItemSummary.getCurrentBidPrice();
        this.ebaySellerId = ebayItemSummary.getSeller() != null
                ? ebayItemSummary.getSeller().getUsername()
                : null;
        this.itemCreationDate = ebayItemSummary.getItemCreationDate();
        this.itemEndDate = ebayItemSummary.getItemEndDate();
        this.imageUrl = ebayItemSummary.getImage() != null
                ? ebayItemSummary.getImage().getImageUrl()
                : null;
        this.ebayItemAPIHref = ebayItemSummary.getItemHref();
        this.ebayItemId = ebayItemSummary.getItemId();
        this.itemWebUrl = ebayItemSummary.getItemWebUrl();
        this.priceAmount = ebayItemSummary.getPrice() != null
                ? ebayItemSummary.getPrice().getValue()
                : null;
        this.priceCurrency = ebayItemSummary.getPrice() != null
                ? ebayItemSummary.getPrice().getCurrency()
                : null;
        this.shortDescription = ebayItemSummary.getShortDescription();
        List<EbayImage> thumbnailImageUrls = ebayItemSummary.getThumbnailImages();
        this.thumbnailImageUrls = thumbnailImageUrls != null
                ? thumbnailImageUrls
                    .stream()
                    .map(EbayImage::getImageUrl)
                    .collect(Collectors.toList())
                : null;
        this.title = ebayItemSummary.getTitle();
    }
}