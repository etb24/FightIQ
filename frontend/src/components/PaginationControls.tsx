import React from 'react';
import './PaginationControls.css';
import { PaginationControlProps } from '../types/PaginationControls';

const PaginationControls: React.FC<PaginationControlProps> = ({ page, totalPages, onPrevious, onNext }) => {
    return (
        <nav aria-label="Pagination Navigation" className="pagination-controls">
            <button className="pagination-btn" onClick={onPrevious} disabled={page === 0} aria-label="Previous page">
                Previous
            </button>

            <span className="pagination-status">
                Page {page + 1} of {totalPages}
            </span>

            <button className="pagination-btn" onClick={onNext} disabled={page + 1 >= totalPages} aria-label="Next page">
                Next
            </button>
        </nav>
    );
};

export default PaginationControls;
