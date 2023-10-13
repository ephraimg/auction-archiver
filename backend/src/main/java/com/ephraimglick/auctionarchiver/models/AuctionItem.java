package com.ephraimglick.auctionarchiver.models;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class AuctionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ElementCollection
    private List<String> additionalImageUrls;
    private int bidCount;
    private String currentBidPriceAmount;
    private String currentBidPriceCurrency;
    private String ebaySellerId;
    private String itemCreationDate;
    private String itemEndDate;
    private String imageUrl;
    /**
     * The URI for the eBay Browse API getItem method, which can be used
     * to retrieve more details about items in the search results.
     */
    private String ebayItemAPIHref;
    @Column(unique = true)
    private String ebayItemId;
    /**
     *  The URL to the View Item page of the item
     */
    private String itemWebUrl;
    private String priceAmount;
    private String priceCurrency;
    private String shortDescription;
    @ElementCollection
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
        this.currentBidPriceAmount = ebayItemSummary.getCurrentBidPrice() != null
                ? ebayItemSummary.getCurrentBidPrice().getValue()
                : null;
        this.currentBidPriceCurrency = ebayItemSummary.getCurrentBidPrice() != null
                ? ebayItemSummary.getCurrentBidPrice().getCurrency()
                : null;
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