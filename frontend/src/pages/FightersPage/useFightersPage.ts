import { useEffect, useState } from 'react';
import { fetchCountries, fetchFighters } from '../../api/fighterApi';
import { Fighter } from '../../types/Fighter';

export const useFightersPage = () => {
    const [fighters, setFighters] = useState<Fighter[]>([]);
    const [countries, setCountries] = useState<string[]>([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState<Error | null>(null);

    const [selectedCountry, setSelectedCountry] = useState('');
    const [selectedWeightClass, setSelectedWeightClass] = useState('');
    const [searchText, setSearchText] = useState('');
    const [searchQuery, setSearchQuery] = useState('');
    const [page, setPage] = useState(0);
    const [pageSize] = useState(10);
    const [totalPages, setTotalPages] = useState(0);

    const [sortBy, setSortBy] = useState('name');
    const [sortDirection, setDirection] = useState<'asc' | 'desc'>('asc');

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
        setSortBy('name');
        setDirection('asc');
    };

    const defaultSortDirections: Record<string, 'asc' | 'desc'> = {
        //strings
        name: 'asc',

        //stats (prefer higher first)
        wins: 'desc',
        losses: 'desc',
        draws: 'desc',
        knockouts: 'desc',
        submissions: 'desc',
        firstRoundFinishes: 'desc',
        strikingAccuracy: 'desc',
        takedownAccuracy: 'desc',
        sigStrLandedTotal: 'desc',
        sigStrAttemptedTotal: 'desc',
        takedownsLandedTotal: 'desc',
        takedownsAttemptedTotal: 'desc',
        sigStrikesPerMin: 'desc',
        takedownsAvgPerMin: 'desc',
        sigStrDef: 'desc',
        knockdownAvg: 'desc',
        sigStrAbsorbedPerMin: 'asc', // lower is better
        subAvgPerMin: 'desc',
        takedownDef: 'desc',
        avgFightTime: 'desc',
        sigStrikesWhileStanding: 'desc',
        sigStrikesWhileClinched: 'desc',
        sigStrikesWhileGrounded: 'desc',
    };

    const handleSort = (field: string) => {
        const isSameField = sortBy === field;

        let newDirection: 'asc' | 'desc';

        if (isSameField) {
            newDirection = sortDirection === 'asc' ? 'desc' : 'asc';
        } else {
            newDirection = defaultSortDirections[field] || 'asc';
        }

        setSortBy(field);
        setDirection(newDirection);
        setPage(0);
    };

    // FIX: find a better way to do this
    const updateFilterAndResetPage = (updater: () => void) => {
        updater();
        setPage(0);
    };

    useEffect(() => {
        let isMounted = true;

        fetchCountries()
            .then((data) => {
                if (isMounted) {
                    setCountries(data);
                }
            })
            .catch(err => {
                if (isMounted) {
                    setError(err);
                }
            });

        return () => {
            isMounted = false;
        };
    }, []);

    useEffect(() => {
        let isMounted = true;

        setLoading(true);
        setError(null);

        fetchFighters(searchQuery, selectedCountry, selectedWeightClass, page, pageSize, sortBy, sortDirection)
            .then(data => {
                if (!isMounted) {
                    return;
                }
                setFighters(data.content);
                setTotalPages(data.totalPages);
            })
            .catch(err => {
                if (isMounted) {
                    setError(err);
                }
            })
            .finally(() => {
                if (isMounted) {
                    setLoading(false);
                }
            });

        return () => {
            isMounted = false;
        };
    }, [searchQuery, selectedCountry, selectedWeightClass, page, pageSize, sortBy, sortDirection]);

    return {
        fighters,
        countries,
        loading,
        error,
        page,
        totalPages,
        selectedCountry,
        selectedWeightClass,
        searchText,
        sortBy,
        sortDirection,
        setSearchText,
        setSelectedCountry,
        setSelectedWeightClass,
        setPage,
        handleSearch,
        handleClearFilters,
        handleSort,
        updateFilterAndResetPage,
    };
};
