interface EbaySeller {
    username: String;
    feedbackPercentage: String;
    feedbackScore: number;
}

enum EbayBuyingOption {
    FIXED_PRICE = 'FIXED_PRICE',
    AUCTION = "AUCTION",
    BEST_OFFER = 'BEST_OFFER',
    CLASSIFIED_AD = 'CLASSIFIED_AD',
}

interface EbayCategory {
    categoryId: string;
    categoryName: string;
}

interface EbayImage {
    height: number;
    width: number;
    imageUrl: string;
}

interface EbayConvertedAmount {
    convertedFromCurrency: string;
    convertedFromValue: string;
    currency: string;
    value: string;
}

interface EbayItemSummary {
    additionalImages: EbayImage[];
    bidCount: number;
    buyingOptions: EbayBuyingOption[];
    categories: EbayCategory[];
    currentBidPrice: EbayConvertedAmount;
    image: EbayImage;
    itemEndDate: string;
    /**
     * The URI for the Browse API getItem method, which can be used
     * to retrieve more details about items in the search results.
     */
    itemHref: string;
    itemId: string;
    /**
     *  The URL to the View Item page of the item
     */
    itemWebUrl: string;
    price: EbayConvertedAmount;
    seller: EbaySeller;
    shortDescription: string;
    thumbnailImages: EbayImage[];
    title: string;
    watchCount: number;
}