import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import HomePage from './pages/HomePage';
import FightersPage from './pages/FightersPage';

const App: React.FC = () => {
  return (
      <Router>
        <nav>
          <Link to="/">Home</Link> |
          <Link to="/fighters"> View Fighters</Link>
        </nav>
        <Routes>
            <Route path="/" element={<HomePage />} />
            <Route path="/fighters" element={<FightersPage />} />
        </Routes>
      </Router>
  );
};

export default App;
