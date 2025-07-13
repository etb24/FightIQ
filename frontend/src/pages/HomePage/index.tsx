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
        </div>


    );
};

export default Index;