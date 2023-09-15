import * as React from 'react';
import {FormEvent} from "react";

interface ItemSummarySearchFormProps {
    searchItemSummaries: (searchTerm: string) => Promise<void>;
}
export const ItemSummarySearchForm: React.FC<ItemSummarySearchFormProps> = props => {
    const { searchItemSummaries } = props;
    const [searchTerm, setSearchTerm] = React.useState("");

    const handleSubmit = async (e: FormEvent) => {
        e.preventDefault();
        searchItemSummaries(searchTerm);
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
