import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import "./App.css";
import NavBar from './components/NavBar';
import HomePage from './pages/HomePage';
import FightersPage from './pages/FightersPage';
import Footer from "./components/Footer";

const App: React.FC = () => {
    return (
        <Router>
            <NavBar />
            <main className="app-main">
                <Routes>
                    <Route path="/" element={<HomePage />} />
                    <Route path="/fighters" element={<FightersPage />} />
                </Routes>
            </main>
            <Footer/>
        </Router>
    );
};

export default App;
