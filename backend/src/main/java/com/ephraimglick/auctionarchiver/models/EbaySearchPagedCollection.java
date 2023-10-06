package com.ephraimglick.auctionarchiver.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class EbaySearchPagedCollection {
    private String href;
    private short limit;
    private short next;
    private short offset;
    private short prev;
    private int total;

}

//"autoCorrections" :
//        { /* AutoCorrections */
//        "q" : "string"},
//
//"refinement" :
//        { /* Refinement */
//        "aspectDistributions" : [
//        { /* AspectDistribution */
//        "aspectValueDistributions" : [
//        { /* AspectValueDistribution */
//        "localizedAspectValue" : "string",
//        "matchCount" : "integer",
//        "refinementHref" : "string"}
//        ],
//        "localizedAspectName" : "string"}
//        ],
//        "buyingOptionDistributions" : [
//        { /* BuyingOptionDistribution */
//        "buyingOption" : "string",
//        "matchCount" : "integer",
//        "refinementHref" : "string"}
//        ],
//        "categoryDistributions" : [
//        { /* CategoryDistribution */
//        "categoryId" : "string",
//        "categoryName" : "string",
//        "matchCount" : "integer",
//        "refinementHref" : "string"}
//        ],
//        "conditionDistributions" : [
//        { /* ConditionDistribution */
//        "condition" : "string",
//        "conditionId" : "string",
//        "matchCount" : "integer",
//        "refinementHref" : "string"}
//        ],
//        "dominantCategoryId" : "string"},
//        "total" : "integer",
//
//"warnings" : [
//        { /* ErrorDetailV3 */
//        "category" : "string",
//        "domain" : "string",
//        "errorId" : "integer",
//        "inputRefIds" : [
//        "string"
//        ],
//        "longMessage" : "string",
//        "message" : "string",
//        "outputRefIds" : [
//        "string"
//        ],
//        "parameters" : [
//        { /* ErrorParameterV3 */
//        "name" : "string",
//        "value" : "string"}
//        ],
//        "subdomain" : "string"}
//        ]