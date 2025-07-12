import {Fighter} from "./Fighter";

export interface FightersTableProps {
    fighters: Fighter[];
    sortBy: string;
    sortDirection: 'asc' | 'desc';
    onSort: (field: string) => void;
}