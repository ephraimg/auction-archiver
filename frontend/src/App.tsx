import * as React from 'react';
import './App.css'
import { ItemSummarySearchContainer } from "./features/ebay-search";
import { Navigation } from "./features/navigation";
import { Archive } from "./features/ebay-archive";
import {AuctionItem, Tab} from "./entities";

export const App = () => {
    const [tab, setTab] = React.useState<Tab>(Tab.Search)
    const [auctionItems, setAuctionItems] = React.useState<AuctionItem[]>([]);

    return (
        <>
            <Navigation setTab={setTab} />
            {tab === Tab.Search
                ? <ItemSummarySearchContainer auctionItems={auctionItems} setAuctionItems={setAuctionItems} />
                : <Archive />
            }
        </>
    ) ;
}
