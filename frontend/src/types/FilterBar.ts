export interface FilterBarProps {
    country: string;
    weightClass: string;
    onCountryChange: (country: string) => void;
    onWeightClassChange: (weightClass: string) => void;
    onSearch: () => void;
    countries: string[];
}