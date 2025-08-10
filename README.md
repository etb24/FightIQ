# FightIQ – UFC Stats & Fighter Analysis Platform

FightIQ was built to serve as a searchable and sortable UFC statistics database. The app allows users to explore detailed fighter data, compare metrics and discover insights all through a modern, responsive interface.

---

## Tech Stack

### Frontend
- **React**
- **TypeScript**
- **HTML/CSS**


### Backend
- **Java**
- **Spring Boot**
- **PostgreSQL**

---

## Features

- **Search & Filters**: Filter fighters by name, weight class or country
- **Sortable Table**: Click any stat column to sort
- **Pagination Support**: Navigate between pages of fighters easily

---

## Future Features

- Fighter comparison view  
- Fighter profiles with career stats  
- ML-powered fight prediction
- Upcoming events landing page  
- Integration with UFC live data feeds

---

## Key Learnings

### Full-Stack Integration
- REST API endpoints for filtered & paginated data
- CORS configuration to securely connect frontend/backend
- Modular React hooks and state management

### Data Handling
- Cleaned and loaded large CSVs into PostgreSQL
- Designed schema for fighter stats with normalization
- Implemented fallback values for missing/null fields

### DevOps & Deployment
- Environment separation for local and production
- API designed with scalability in mind
- Planning future Docker containerization

---

## Lessons Learned

### What Worked Well
- **Code Modularity**: Components, hooks and utility functions well-isolated  
- **Backend-first**: API-first approach made frontend integration smoother  
- **Incremental UI Building**: Testing each page and state transition individually

### What I’d Improve Next Time
- Set up **automated testing** from the beginning  
- Add **CI/CD pipeline** to simplify deployment  
- Perform **frontend error boundary checks** for failed API calls
