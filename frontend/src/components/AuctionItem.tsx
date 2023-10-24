import * as React from 'react';
import './index.css';
import { SaveButton } from "./SaveButton";
import { AuctionItem as AuctionItemEntity } from "../entities";

interface ItemSummaryProps {
    auctionItem: AuctionItemEntity;
    saved?: boolean;
}

export const AuctionItem: React.FC<ItemSummaryProps> = props => {
    const { auctionItem, saved } = props;

    return <div className="item-summary">
        <AuctionItemImage imageUrl={auctionItem.imageUrl} itemWebUrl={auctionItem.itemWebUrl} />
        <AuctionItemInfo auctionItem={auctionItem} />
        <SaveButton auctionItem={auctionItem} saved={saved} />
    </div>
}

export const AuctionItemImage: React.FC<{ imageUrl: string | null, itemWebUrl: string }> = props => {
    const { imageUrl, itemWebUrl } = props;
    const img = imageUrl
        ? <img src={imageUrl} />
        : <img src="https://placehold.co/50x50/white/light-gray?text=No\nimage" />;
    return <a className="item-summary-image" href={itemWebUrl}>{img}</a>
}

export const AuctionItemInfo: React.FC<ItemSummaryProps> = props => {
    const { auctionItem } = props;
    const {
        itemWebUrl,
        title,
        priceAmount,
        priceCurrency,
        ebaySellerId,
        ebaySellerFeedbackScore,
        ebaySellerFeedbackPercentage
    } = auctionItem;

    return <div className="item-summary-info">
        <div className="item-title">
            <a href={itemWebUrl} target="_blank">{title}</a>
            <span className="short-description">Short description should be here</span>
        </div>
        <div className="item-details">
            <span className="item-price">
                {priceAmount} {priceCurrency}
            </span>
            <span className="seller">
                {ebaySellerId}{' '}
                ({ebaySellerFeedbackScore}){' '}
                {ebaySellerFeedbackPercentage}%
            </span>
            <span className="end-date">2023-09-21 18:33:00 UTC</span>
        </div>
    </div>
}
