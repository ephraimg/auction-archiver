import * as React from 'react';
import { AuctionItem } from "./AuctionItem";
import { AuctionItem as AuctionItemEntity } from "../entities";

interface AuctionItemListProps {
    auctionItems: AuctionItemEntity[] | null;
    saved?: boolean;
}
export const AuctionItemList: React.FC<AuctionItemListProps> = props => {
    const { auctionItems, saved } = props;

    return <div>
        {(auctionItems || []).map(item =>
            <AuctionItem key={item.ebayItemId} auctionItem={item} saved={saved} />
        )}
    </div>;
}