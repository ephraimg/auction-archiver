import * as React from 'react';
import { AuctionItemList } from "../../components/AuctionItemList";
import { AuctionItemSearchForm } from "./AuctionItemSearchForm";
import axios from 'axios';
import { AuctionItem } from "../../entities";

interface ItemSummarySearchContainerProps {
    auctionItems: AuctionItem[];
    setAuctionItems:  React.Dispatch<React.SetStateAction<AuctionItem[]>>;
}

export const ItemSummarySearchContainer: React.FC<ItemSummarySearchContainerProps> = props => {
    const { auctionItems, setAuctionItems } = props;

    const searchAuctionItems = async (searchTerm: string) => {
        const resp = await axios.get(
            'http://localhost:8080/search',
            { params: { q: searchTerm }}
        );
        setAuctionItems(resp.data.auctionItems);
    }

    return (
        <>
            <AuctionItemSearchForm searchAuctionItems={searchAuctionItems}/>
            <AuctionItemList auctionItems={auctionItems}/>
        </>
    );
}