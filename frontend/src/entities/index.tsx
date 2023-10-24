export enum Tab {
    Search = 'Search',
    Archive = 'Archive'
}

export interface EbaySeller {
    username: String;
    feedbackPercentage: String;
    feedbackScore: number;
}

export enum EbayBuyingOption {
    FIXED_PRICE = 'FIXED_PRICE',
    AUCTION = "AUCTION",
    BEST_OFFER = 'BEST_OFFER',
    CLASSIFIED_AD = 'CLASSIFIED_AD',
}

export interface EbayCategory {
    categoryId: string;
    categoryName: string;
}

export interface EbayImage {
    height: number;
    width: number;
    imageUrl: string;
}

export interface EbayConvertedAmount {
    convertedFromCurrency: string;
    convertedFromValue: string;
    currency: string;
    value: string;
}

export interface EbayItemSummary {
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

export interface EbaySearchPagedCollection {
    href: string;
    limit: number;
    next: number;
    offset: number;
    prev: number;
    total: number;
    itemSummaries: EbayItemSummary[];
}

export interface AuctionItem {
    id: string;
    additionalImageUrls: string[];
    bidCount: number;
    currentBidPriceAmount: string;
    currentBidPriceCurrency: string;
    ebaySellerId: string;
    ebaySellerFeedbackScore: number;
    ebaySellerFeedbackPercentage: string;
    itemCreationDate: string;
    itemEndDate: string;
    imageUrl: string;
    /**
     * The URI for the eBay Browse API getItem method, which can be used
     * to retrieve more details about items in the search results.
     */
    ebayItemAPIHref: string;
    ebayItemId: string;
    /**
     *  The URL to the View Item page of the item
     */
    itemWebUrl: string;
    priceAmount: string;
    priceCurrency: string;
    shortDescription: string;
    thumbnailImageUrls: string[];
    title: string;
}

export interface AuctionItemPagedCollection {
    href: string;
    limit: number;
    next: number;
    offset: number;
    prev: number;
    total: number;
    auctionItems: AuctionItem[];
}