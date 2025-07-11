import axios from 'axios';
import { Fighter } from '../types/Fighter';
import { PagedResponse } from '../types/PagedResponse';

const BASE_URL = 'http://localhost:8080/fighters';

export const fetchFighters = async (name: string = '', country: string = '', weightClass: string = '', page: number, size:number) => {
    const res = await axios.get<PagedResponse<Fighter>>(BASE_URL, {
        params: {
            name: name || undefined,
            country: country || undefined,
            weight_class: weightClass || undefined,
            page: page,
            size: size,
        },
    });
    return res.data;
};

export const fetchCountries = async (): Promise<string[]> => {
    const res = await axios.get<string[]>('http://localhost:8080/fighters/countries');
    return res.data;
};