import * as React from 'react';
import { Dispatch, SetStateAction } from "react";
import { Tab } from "../../entities";
import { TabLink } from "./TabLink";

interface NavigationProps {
    setTab: Dispatch<SetStateAction<Tab>>;
}
export const Navigation: React.FC<NavigationProps> = props => {
    const { setTab } = props;

    return <>
        <TabLink setTab={() => setTab(Tab.Search)}>Search</TabLink>
        <TabLink setTab={() => setTab(Tab.Archive)}>Archive</TabLink>
        <hr />
    </>
}