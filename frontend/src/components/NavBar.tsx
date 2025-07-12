import React from 'react';
import { Link } from 'react-router-dom';
import './NavBar.css';

const NavBar: React.FC = () => {
    return (
        <nav className="navbar">
            <div className="navbar-logo">FightIQ</div>
            <ul className="navbar-links">
                <li><Link to="/">Home</Link></li>
                <li><Link to="/fighters">Fighters</Link></li>
            </ul>
        </nav>
    );
};

export default NavBar;