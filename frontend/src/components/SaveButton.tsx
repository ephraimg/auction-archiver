import * as React from 'react';
import './index.css';
import axios from 'axios';
import { AxiosError, AxiosResponse } from 'axios';
import { AuctionItem } from "../entities";

interface SaveButtonProps {
    auctionItem: AuctionItem;
    saved?: boolean;
}
export const SaveButton: React.FC<SaveButtonProps> = props => {
    const { auctionItem, saved } = props;

    const handleClick = async () => {
        await axios.post(
            'http://localhost:8080/auction-items',
            auctionItem
        ).then((res: AxiosResponse) => {
            if (res.status === 201) {
                alert('Saved item!');
            }
        })
        .catch((e: AxiosError) => {
            alert('Could not save item.\n' + e.message);
        });

    }
    return <div className="save-button">
        { saved
            ? <button disabled>Saved</button>
            : <button onClick={handleClick}>Save</button>
        }
    </div>
}