import axios from 'axios';
import { Fighter } from '../types/Fighter';

const BASE_URL = 'http://localhost:8080/fighters';

export const fetchFighters = async (name: string = '', country: string = '', weightClass: string = '') => {
    const res = await axios.get<Fighter[]>(BASE_URL, {
        params: {
            name: name || undefined,
            country: country || undefined,
            weight_class: weightClass || undefined,

        },
    });
    return res.data;
};

export const fetchCountries = async (): Promise<string[]> => {
    const res = await axios.get<string[]>('http://localhost:8080/fighters/countries');
    return res.data;
};