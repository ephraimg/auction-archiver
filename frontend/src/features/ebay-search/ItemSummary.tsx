import * as React from 'react';
import './index.css';

interface ItemSummaryProps {
    itemSummary: EbayItemSummary;
}
export const ItemSummary: React.FC<ItemSummaryProps> = props => {
    const { itemSummary } = props;
    return <div className="item-summary">
        <ItemSummaryImage image={itemSummary.image} itemWebUrl={itemSummary.itemWebUrl} />
        <ItemSummaryInfo itemSummary={itemSummary} />
    </div>
}

export const ItemSummaryImage: React.FC<{ image: EbayImage, itemWebUrl: string }> = props => {
    const { image, itemWebUrl } = props;
    const img = image?.imageUrl
        ? <img src={image.imageUrl} />
        : <img src="https://placehold.co/50x50/white/light-gray?text=No\nimage" />;
    return <a className="item-summary-image" href={itemWebUrl}>{img}</a>
}

export const ItemSummaryInfo: React.FC<ItemSummaryProps> = props => {
    const { itemSummary } = props;
    const {
        itemWebUrl,
        title,
        price,
        seller,
    } = itemSummary;

    return <div className="item-summary-info">
        <div className="item-title">
            <a href={itemWebUrl} target="_blank">{title}</a>
            <span className="short-description">Short description should be here</span>
        </div>
        <div className="item-details">
            <span className="item-price">
                {price.value} {price.currency}
            </span>
            <span className="seller">
                {seller.username}{' '}
                ({seller.feedbackScore}){' '}
                {seller.feedbackPercentage}%
            </span>
            <span className="end-date">2023-09-21 18:33:00 UTC</span>
        </div>
    </div>
}
