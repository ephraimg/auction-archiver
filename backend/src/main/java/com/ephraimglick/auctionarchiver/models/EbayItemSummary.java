package com.ephraimglick.auctionarchiver.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
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