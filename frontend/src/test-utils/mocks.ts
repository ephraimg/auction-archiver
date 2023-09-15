export const createEbayImage = (withProps: Partial<EbayImage> = {}): EbayImage => ({
    width: 200,
    height: 150,
    imageUrl: 'www.google.com',
    ...withProps
});

export const createEbayImageThumbnail = (withProps: Partial<EbayImage> = {}): EbayImage => createEbayImage({
    width: 30,
    height: 20,
    ...withProps
})

export const createEbayCategory = (withProps: Partial<EbayCategory> = {}): EbayCategory => ({
    categoryId: '123-category-abc', // TODO check this format
    categoryName: 'my-favorite-category', // TODO check this format
    ...withProps
});

export const createEbayConvertedAmount = (withProps: Partial<EbayConvertedAmount> = {}): EbayConvertedAmount => ({
    convertedFromCurrency: 'MXN',
    convertedFromValue: '245',
    currency: 'USD',
    value: '204',
    ...withProps
});

export const createEbaySeller = (withProps: Partial<EbaySeller> = {}): EbaySeller => ({
    username: 'awesome-seller-1985',
    feedbackPercentage: '97.5',
    feedbackScore: 564,
    ...withProps
});

export const createMockItemSummary = (withProps: Partial<EbayItemSummary> = {}): EbayItemSummary => ({
    additionalImages: [
        createEbayImage(),
        createEbayImage({ imageUrl: 'http://another-url' })
    ],
    bidCount: 14,
    buyingOptions: [EbayBuyingOption.AUCTION, EbayBuyingOption.BEST_OFFER],
    categories: [createEbayCategory()],
    currentBidPrice: createEbayConvertedAmount(),
    image: createEbayImage({ imageUrl: 'http://url-url'}),
    itemEndDate: 'January 10', // TODO: Check this format
    /**
     * The URI for the Browse API getItem method, which can be used
     * to retrieve more details about items in the search results.
     */
    itemHref: 'http://myitemref.com',
    itemId: '4236236', // TODO check this format
    /**
     *  The URL to the View Item page of the item
     */
    itemWebUrl: 'http://itemweburl.net',
    price: createEbayConvertedAmount({ value: '555'}),
    seller: createEbaySeller(),
    shortDescription: 'This is a fake item',
    thumbnailImages: [
        createEbayImageThumbnail({ imageUrl: 'http://miniurl'}),
        createEbayImageThumbnail({ imageUrl: 'http://otherminiurl'})
    ],
    title: 'A title for an item summary',
    watchCount: 13,
    ...withProps
});