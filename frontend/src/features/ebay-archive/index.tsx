import * as React from 'react';
import axios, { AxiosError } from 'axios';
import {AuctionItem} from "../../entities";
import {AuctionItemList} from "../../components/AuctionItemList";

export const Archive: React.FC = () => {
    const [archivedItems, setArchivedItems] = React.useState<AuctionItem[]>();

    React.useEffect(() => {
        const fetchArchivedItems = async () => {
            await axios.get<AuctionItem[]>(
                'http://localhost:8080/auction-items'
            ).then(res => {
                setArchivedItems(res.data);
            }).catch((e: AxiosError) => {
                alert('Could not fetch auction items.\n' + e.message);
            });
        }

        fetchArchivedItems();
    }, [])

    return archivedItems
        ? <AuctionItemList auctionItems={archivedItems} saved />
        : "No archived items yet";
}