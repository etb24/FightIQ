import React from 'react';
import FightersTable from '../../components/FightersTable';
import FilterBar from '../../components/FilterBar';
import PaginationControls from '../../components/PaginationControls';
import {useFightersPage} from './useFightersPage';

const FightersPage: React.FC = () => {
    const {
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
    } = useFightersPage();

    if (loading) return <p>Loading fighters...</p>;
    if (error) return <p>Error: {error.message}</p>;

    return (
        <section className="page-section">
            <header className="page-header">
                <h1 className="page-heading">All UFC Fighters</h1>
                <p className="page-subheading">Search, filter, and compare UFC athletes across every weight class.</p>
            </header>
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
            <FightersTable
                fighters={fighters}
                sortBy={sortBy}
                sortDirection={sortDirection}
                onSort={handleSort}
            />

            <PaginationControls
                page={page}
                totalPages={totalPages}
                onPrevious={() => setPage(prev => Math.max(prev - 1, 0))}
                onNext={() => setPage(prev => prev + 1)}
            />
        </section>
    );
};

export default FightersPage;
