package com.ephraimglick.auctionarchiver.models;

import java.util.List;

public class EbayItemSummary {
    private List<EbayImage> additionalImages;
    private int bidCount;
    private EbayBuyingOption[] buyingOptions;
    private List<EbayCategory> categories;
    private EbayConvertedAmount currentBidPrice;
    private EbayImage image;
    private String itemCreationDate;
    private String itemEndDate;
    /**
     * The URI for the Browse API getItem method, which can be used
     * to retrieve more details about items in the search results.
     */
    private String itemHref;
    private String itemId;
    /**
     *  The URL to the View Item page of the item
     */
    private String itemWebUrl;
    private EbayConvertedAmount price;
    private String shortDescription;
    private List<EbayImage> thumbnailImages;
    private String title;
    private short watchCount;
    private EbaySeller seller;

    public EbayBuyingOption[] getBuyingOptions() {
        return buyingOptions;
    }

    public void setBuyingOptions(EbayBuyingOption[] buyingOptions) {
        this.buyingOptions = buyingOptions;
    }

    public String getItemCreationDate() {
        return itemCreationDate;
    }

    public void setItemCreationDate(String itemCreationDate) {
        this.itemCreationDate = itemCreationDate;
    }

    public int getBidCount() {
        return bidCount;
    }

    public void setBidCount(int bidCount) {
        this.bidCount = bidCount;
    }

    public EbaySeller getSeller() {
        return seller;
    }

    public void setSeller(EbaySeller seller) {
        this.seller = seller;
    }

    public List<EbayImage> getAdditionalImages() {
        return additionalImages;
    }

    public void setAdditionalImages(List<EbayImage> additionalImages) {
        this.additionalImages = additionalImages;
    }

    public List<EbayCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<EbayCategory> categories) {
        this.categories = categories;
    }

    public EbayConvertedAmount getCurrentBidPrice() {
        return currentBidPrice;
    }

    public void setCurrentBidPrice(EbayConvertedAmount currentBidPrice) {
        this.currentBidPrice = currentBidPrice;
    }

    public EbayImage getImage() {
        return image;
    }

    public void setImage(EbayImage image) {
        this.image = image;
    }

    public String getItemEndDate() {
        return itemEndDate;
    }

    public void setItemEndDate(String itemEndDate) {
        this.itemEndDate = itemEndDate;
    }

    public String getItemHref() {
        return itemHref;
    }

    public void setItemHref(String itemHref) {
        this.itemHref = itemHref;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemWebUrl() {
        return itemWebUrl;
    }

    public void setItemWebUrl(String itemWebUrl) {
        this.itemWebUrl = itemWebUrl;
    }

    public EbayConvertedAmount getPrice() {
        return price;
    }

    public void setPrice(EbayConvertedAmount price) {
        this.price = price;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public List<EbayImage> getThumbnailImages() {
        return thumbnailImages;
    }

    public void setThumbnailImages(List<EbayImage> thumbnailImages) {
        this.thumbnailImages = thumbnailImages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getWatchCount() {
        return watchCount;
    }

    public void setWatchCount(short watchCount) {
        this.watchCount = watchCount;
    }
}

//    "adultOnly" : "boolean",
//    "availableCoupons" : "boolean",
//    "buyingOptions" : ["string"],

//    "compatibilityMatch" : "CompatibilityMatchEnum : [EXACT,POSSIBLE]",
//    "compatibilityProperties" : [
//        { /* CompatibilityProperty */
//            "localizedName" : "string",
//                "name" : "string",
//                "value" : "string"
//        }
//    ],
//    "condition" : "string",
//    "conditionId" : "string",

//    "distanceFromPickupLocation" :
//        { /* TargetLocation */
//        "unitOfMeasure" : "string",
//        "value" : "string"
//        },
//    "energyEfficiencyClass" : "string",
//    "epid" : "string",

//    "itemAffiliateWebUrl" : "string",
//    "itemCreationDate" : "string",

//    "itemGroupHref" : "string",
//    "itemGroupType" : "string",

//    "itemLocation" :
//        { /* ItemLocationImpl */
//            "addressLine1" : "string",
//            "addressLine2" : "string",
//            "city" : "string",
//            "country" : "CountryCodeEnum : [AD,AE,AF...]",
//            "county" : "string",
//            "postalCode" : "string",
//            "stateOrProvince" : "string"
//        },

//    "leafCategoryIds" : [
//            "string"
//        ],
//    "legacyItemId" : "string",
//    "listingMarketplaceId" : "MarketplaceIdEnum : [EBAY_AU,EBAY_AT,EBAY_BE...]",
//    "marketingPrice" :
//        { /* MarketingPrice */
//            "discountAmount" :
//                { /* ConvertedAmount */
//                    "convertedFromCurrency" : "CurrencyCodeEnum : [AED,AFN,ALL...]",
//                    "convertedFromValue" : "string",
//                    "currency" : "CurrencyCodeEnum : [AED,AFN,ALL...]",
//                    "value" : "string"
//                },
//            "discountPercentage" : "string",
//            "originalPrice" :
//                { /* ConvertedAmount */
//                    "convertedFromCurrency" : "CurrencyCodeEnum : [AED,AFN,ALL...]",
//                    "convertedFromValue" : "string",
//                    "currency" : "CurrencyCodeEnum : [AED,AFN,ALL...]",
//                    "value" : "string"
//                },
//            "priceTreatment" : "PriceTreatmentEnum : [MINIMUM_ADVERTISED_PRICE,LIST_PRICE,MARKDOWN]"
//        },
//    "pickupOptions" : [
//        { /* PickupOptionSummary */
//            "pickupLocationType" : "string"
//        }
//    ],

//    "priceDisplayCondition" : "PriceDisplayConditionEnum : [ONLY_SHOW_WHEN_ADDED_IN_CART,ONLY_SHOW_ON_REQUEST,ALWAYS_SHOW]",
//    "priorityListing" : "boolean",
//    "qualifiedPrograms" : [
//        "string"
//        ],
//    "seller" :
//        { /* Seller */
//            "feedbackPercentage" : "string",
//                "feedbackScore" : "integer",
//                "sellerAccountType" : "string",
//        "username" : "string"
//        },
//    "shippingOptions" : [
//            { /* ShippingOptionSummary */
//                "guaranteedDelivery" : "boolean",
//                "maxEstimatedDeliveryDate" : "string",
//                "minEstimatedDeliveryDate" : "string",
//                "shippingCost" :
//                    { /* ConvertedAmount */
//                        "convertedFromCurrency" : "CurrencyCodeEnum : [AED,AFN,ALL...]",
//                        "convertedFromValue" : "string",
//                        "currency" : "CurrencyCodeEnum : [AED,AFN,ALL...]",
//                        "value" : "string"
//                    },
//                "shippingCostType" : "string"
//            }
//        ],

//    "topRatedBuyingExperience" : "boolean",
//    "tyreLabelImageUrl" : "string",
//    "unitPrice" :
//        { /* ConvertedAmount */
//            "convertedFromCurrency" : "CurrencyCodeEnum : [AED,AFN,ALL...]",
//            "convertedFromValue" : "string",
//            "currency" : "CurrencyCodeEnum : [AED,AFN,ALL...]",
//            "value" : "string"
//        },
//    "unitPricingMeasure" : "string",