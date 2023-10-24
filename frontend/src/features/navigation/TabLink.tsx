import * as React from 'react';
import './index.css';

interface TabLinkProps {
    setTab: () => void;
    children?: React.ReactNode;
}
export const TabLink: React.FC<TabLinkProps> = props => {
    const { setTab, children } = props;

    return <span className="tab-link" onClick={setTab}>
        {children}
    </span>;
}