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

    const [countries, setCountries] = useState<string[]>([]);

    const handleSearch = () => {
        setLoading(true);
        fetchFighters(searchText, selectedCountry, selectedWeightClass)
            .then(data => {
                setFighters(data);
                setLoading(false);
            })
            .catch(err => {
                setError(err);
                setLoading(false);
            });
    };

    const handleClearFilters = () => {
        const clearedCountry = '';
        const clearedWeightClass = '';
        const clearedSearchText = '';

        setSelectedCountry(clearedCountry);
        setSelectedWeightClass(clearedWeightClass);
        setSearchText(clearedSearchText);

        //pass the cleared values to fetch immediately
        setLoading(true);
        fetchFighters(clearedCountry, clearedWeightClass, clearedSearchText)
            .then(data => {
                setFighters(data);
                setLoading(false);
            })
            .catch(err => {
                setError(err);
                setLoading(false);
            });
    };

    useEffect(() => {
        handleSearch();  //load all fighters on page load
        fetchCountries()
            .then((data) => {
                setCountries(data);
            })
            .catch(console.error);
    }, []);

    if (loading) return <p>Loading fighters...</p>;
    if (error) return <p>Error: {error.message}</p>;

    return (
        <div>
            <h1>All UFC Fighters</h1>
            <FilterBar
                searchText={searchText}
                country={selectedCountry}
                weightClass={selectedWeightClass}
                onSearchTextChange={setSearchText}
                onCountryChange={setSelectedCountry}
                onWeightClassChange={setSelectedWeightClass}
                onSearch={handleSearch}
                onClear={handleClearFilters}
                countries={countries}
            />
            <FightersTable fighters={fighters} />
        </div>
    );
};

export default FightersPage;
