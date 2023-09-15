import * as React from 'react';
import {ItemSummaryList} from "./ItemSummaryList";
import {ItemSummarySearchForm} from "./ItemSummarySearchForm";
import axios from 'axios';

export const ItemSummarySearchContainer: React.FC = () => {
    const [itemSummaries, setItemSummaries] = React.useState<EbayItemSummary[]>([]);

    const searchItemSummaries = async (searchTerm: string) => {
        const resp = await axios.get(
            'http://localhost:8080/search',
            { params: { q: searchTerm }}
        );
        setItemSummaries(resp.data.itemSummaries);
    }

    return (
        <>
            <ItemSummarySearchForm searchItemSummaries={searchItemSummaries}/>
            <ItemSummaryList itemSummaries={itemSummaries}/>
        </>
    );
}