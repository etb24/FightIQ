import React from 'react'
import './Footer.css';
import { FaGithub, FaEnvelope, FaLinkedin } from 'react-icons/fa';


const Footer: React.FC = () => {
    return (
        <footer className="app-footer">
            <div className="footer-columns">
                <div>
                    <h4>FightIQ</h4>
                    <p>UFC stats & analysis platform</p>
                </div>
                <div className="footer-icons">
                    <a href="https://github.com/etb24" target="_blank" rel="noreferrer">
                        <FaGithub size={24} />
                    </a>
                    <a href="https://www.linkedin.com/in/ethanbonato/" target="_blank" rel="noreferrer">
                        <FaLinkedin size={24} />
                    </a>
                    <a href="mailto:bonatoethan@gmail.com" target="_blank" rel="noreferrer">
                        <FaEnvelope size={24} />
                    </a>
                </div>
            </div>
            <p className="footer-bottom">© 2025 FightIQ.</p>
        </footer>
    );
};

export default Footer;