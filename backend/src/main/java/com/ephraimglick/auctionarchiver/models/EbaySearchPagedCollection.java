package com.ephraimglick.auctionarchiver.models;

public abstract class EbaySearchPagedCollection {
    private String href;
    private short limit;
    private short next;
    private short offset;
    private short prev;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public short getLimit() {
        return limit;
    }

    public void setLimit(short limit) {
        this.limit = limit;
    }

    public short getNext() {
        return next;
    }

    public void setNext(short next) {
        this.next = next;
    }

    public short getOffset() {
        return offset;
    }

    public void setOffset(short offset) {
        this.offset = offset;
    }

    public short getPrev() {
        return prev;
    }

    public void setPrev(short prev) {
        this.prev = prev;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

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