import React from 'react';
import { useNavigate } from 'react-router-dom';

import "./HomePage.css";

const Index: React.FC = () => {
    const navigate = useNavigate();

    return (
        <div className="hero">
            <h1 className="page-heading">Welcome to FightIQ</h1>
            <p>Your home for UFC stats</p>
            <button onClick={() => navigate('/fighters')}>Browse Fighters</button>

            <div className="features">
                <div className="feature-card">
                    <h3>Fighter Stats</h3>
                    <p>Complete access to database containing every UFC fighter in history and with detailed stats like striking, grappling, and win methods for every fighter.</p>
                </div>
                <div className="feature-card">
                    <h3>Powerful Filters</h3>
                    <p>Search, Filter and Sort by weight class, country, or performance metrics to explore your favorite fighters.</p>
                </div>
                <div className="feature-card">
                    <h3>Fast & Modern UI</h3>
                    <p>Built with React and Spring Boot for blazing-fast performance.</p>
                </div>
            </div>
        </div>


    );
};

export default Index;