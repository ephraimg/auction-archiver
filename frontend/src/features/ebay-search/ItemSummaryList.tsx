import * as React from 'react';
import {ItemSummary} from "./ItemSummary";

interface ItemSummaryListProps {
    itemSummaries: EbayItemSummary[];
}
export const ItemSummaryList: React.FC<ItemSummaryListProps> = props => {
    const { itemSummaries } = props;
    return <div>
        {itemSummaries.map(summ =>
            <ItemSummary key={summ.itemId} itemSummary={summ}/>
        )}
    </div>;
}