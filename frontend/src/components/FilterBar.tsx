import React from 'react';
import {FilterBarProps} from "../types/FilterBar";

const FilterBar: React.FC<FilterBarProps> = ({
                                                 country,
                                                 weightClass,
                                                 searchText,
                                                 onSearchTextChange,
                                                 onCountryChange,
                                                 onWeightClassChange,
                                                 onSearch,
                                                 onClear,
                                                 countries
                                             }) => {
    return (
        <div style={{ marginBottom: '1rem' }}>
            <label>
                Search by Name:
                <input
                    type="text"
                    value={searchText}
                    onChange={(e) => onSearchTextChange(e.target.value)}
                    placeholder="Enter fighter name"
                    style={{ marginLeft: '0.5rem' }}
                />
            </label>
            <label>
                Country:
                <select value={country} onChange={(e) => onCountryChange(e.target.value)}>
                    <option value="">All</option>
                    {countries.map((c: string) => (
                        <option key={c} value={c}>{c}</option>
                    ))}
                </select>
            </label>

            <label style={{ marginLeft: '1rem' }}>
                Weight Class:
                <select value={weightClass} onChange={(e) => onWeightClassChange(e.target.value)}>
                    <option value="">All</option>
                    <option value="Flyweight Division">Flyweight</option>
                    <option value="Bantamweight Division">Bantamweight</option>
                    <option value="Featherweight Division">Featherweight</option>
                    <option value="Lightweight Division">Lightweight</option>
                    <option value="Welterweight Division">Welterweight</option>
                    <option value="Middleweight Division">Middleweight</option>
                    <option value="Light Heavyweight Division">Light Heavyweight</option>
                    <option value="Heavyweight Division">Heavyweight</option>

                    <option value="Women's Strawweight Division">Women's Strawweight</option>
                    <option value="Women's Flyweight Division">Women's Flyweight</option>
                    <option value="Women's Bantamweight Division">Women's Bantamweight</option>
                    <option value="Women's Featherweight Division">Women's Featherweight</option>
                    <option value= "N/A" >N/A</option>
                </select>
            </label>

            <button onClick={onSearch} style={{ marginLeft: '1rem' }}>
                Search
            </button>
            <button onClick={onClear} style={{ marginLeft: '0.5rem' }}>
                Clear
            </button>

        </div>
    );
};

export default FilterBar;