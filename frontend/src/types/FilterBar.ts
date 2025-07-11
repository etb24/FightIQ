export interface FilterBarProps {
    searchText: string;
    country: string;
    weightClass: string;
    onSearchTextChange: (text: string) => void;
    onCountryChange: (country: string) => void;
    onWeightClassChange: (weightClass: string) => void;
    onSearch: () => void;
    onClear: () => void;
    countries: string[];
}