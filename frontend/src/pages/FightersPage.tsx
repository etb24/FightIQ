import React, { useEffect, useState } from 'react';
import {fetchCountries, fetchFighters} from '../api/fighterApi';
import FightersTable from '../components/FightersTable';
import FilterBar from '../components/FilterBar';
import { Fighter } from '../types/Fighter';

const FightersPage: React.FC = () => {
    const [fighters, setFighters] = useState<Fighter[]>([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState<Error | null>(null);
    const [selectedCountry, setSelectedCountry] = useState<string>('');
    const [selectedWeightClass, setSelectedWeightClass] = useState<string>('');
    const [searchText, setSearchText] = useState<string>('');
    const [page, setPage] = useState(0);
    const [totalPages, setTotalPages] = useState(0);
    const [pageSize] = useState<number>(20);

    const [searchQuery, setSearchQuery] = useState<string>('');
    const [countries, setCountries] = useState<string[]>([]);

    const handleSearch = () => {
        setPage(0);
        setSearchQuery(searchText);
    };

    const handleClearFilters = () => {
        setSelectedCountry('');
        setSelectedWeightClass('');
        setSearchText('');
        setSearchQuery('');
        setPage(0);
    };

    // FIX: find a better way to do this
    const updateFilterAndResetPage = (updater: () => void) => {
        updater();
        setPage(0);
    };


    useEffect(() => {
        setLoading(true);
        fetchCountries()
            .then((data) => {
                setCountries(data);
            })
        fetchFighters(searchQuery, selectedCountry, selectedWeightClass, page, pageSize)
            .then(data => {
                setFighters(data.content);
                setTotalPages(data.totalPages);
                setLoading(false);
            })
            .catch(err => {
                setError(err);
                setLoading(false);
            });
    }, [searchQuery, selectedCountry, selectedWeightClass, page]);

    if (loading) return <p>Loading fighters...</p>;
    if (error) return <p>Error: {error.message}</p>;

    return (
        <div>
            <h1>All UFC Fighters</h1>
            <FilterBar
                searchText={searchText}
                country={selectedCountry}
                weightClass={selectedWeightClass}
                onSearchTextChange={(text) => updateFilterAndResetPage(() => setSearchText(text))}
                onCountryChange={(country) => updateFilterAndResetPage(() => setSelectedCountry(country))}
                onWeightClassChange={(weight) => updateFilterAndResetPage(() => setSelectedWeightClass(weight))}
                onSearch={handleSearch}
                onClear={handleClearFilters}
                countries={countries}
            />
            <FightersTable fighters={fighters} />

            <button onClick={() => setPage(prev => Math.max(prev - 1, 0))} disabled={page === 0}>
                Previous
            </button>

            <button onClick={() => setPage(prev => prev + 1)} disabled={page + 1 >= totalPages}>
                Next
            </button>
        </div>
    );
};

export default FightersPage;
