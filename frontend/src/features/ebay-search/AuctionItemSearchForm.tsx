import * as React from 'react';
import { FormEvent } from "react";

interface AuctionItemSearchFormProps {
    searchAuctionItems: (searchTerm: string) => Promise<void>;
}
export const AuctionItemSearchForm: React.FC<AuctionItemSearchFormProps> = props => {
    const { searchAuctionItems } = props;
    const [searchTerm, setSearchTerm] = React.useState("");

    const handleSubmit = async (e: FormEvent) => {
        e.preventDefault();
        searchAuctionItems(searchTerm);
    }

    return <form onSubmit={handleSubmit}>
        <input
            type="text"
            id="search-term"
            placeholder=""
            onChange={e => setSearchTerm(e.target.value)}
            value={searchTerm}
        />
        <button type="submit">Search</button>
    </form>;
}
