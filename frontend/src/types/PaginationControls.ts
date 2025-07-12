export interface PaginationControlProps {
    page: number;
    totalPages: number;
    onPrevious: () => void;
    onNext: () => void;
}