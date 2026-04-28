# DECISION LOG — Smart Task Manager API


## 1. Time Breakdown

- 10 mins → Project setup using Spring Starter Project in Eclipse
- 0.5 hour → Implemented core REST API (Controller, Service, Store)
- 10 mins hour → Designed data model with Enum-based status (PENDING, COMPLETED)
- 1.5 hour → Implemented smart feature (Auto Priority Suggestion)
- 0.5 hour → Testing APIs using Postman / curl
- 1 hour → Debugging, Git push and documentation

Total time spent: 3–4 hours

---

## 2. Where AI Was Used — and Why

- Used AI to explore possible smart feature options (priority suggestion, duplicate detection, NLP parsing)
- Used AI for Debugging, documentation 

Reason:
AI was used as a productivity tool to speed up exploration and reduce time spent on boilerplate decisions under a strict time constraint. Final implementation decisions were still made manually.

---

## 3. Where AI Was NOT Used — and Why

- Understanding the problem statement and converting requirements into API design
- Core API implementation (Controller, Service, Store layer)
- Enum-based status design (PENDING, COMPLETED)
- Final architecture decisions (use of PATCH for updates, service-layer separation)
- Integration of business logic into service layer (task creation and update flow)

Reason:
These parts required direct understanding of system flow, REST principles. They were implemented manually to ensure correctness and maintain control over architecture.

---

## 4. At Least 2 Bad AI Outputs (Required)

### Case 1: Over-engineered architecture suggestion
AI initially suggested using a microservices architecture and implementing the solution in Python with ML-based components
AI suggested using a MySQL database with JPA/Hibernate for persistence.

Issue:
This was unnecessary for a 4–6 hour constrained assignment and would slow down implementation significantly.

Fix:
Replaced with a simple in-memory HashMap-based store to keep the system lightweight and fast.

---

### Case 2: Over-complex smart feature suggestion
AI suggested NLP/embedding-based similarity detection using external ML libraries.

Issue:
This added unnecessary complexity and external dependencies beyond the scope of the task.

Fix:
Replaced with a lightweight rule-based priority suggestion system using keyword matching (e.g., urgent, bug, critical).

---

## 5. Trade-offs Made

- Used in-memory storage instead of a database to reduce setup time
- Avoided authentication/authorization to focus on core API functionality
- Implemented only one smart feature instead of multiple options
- Used rule-based logic instead of machine learning models

Justification:
The goal was to deliver a working, clean, and maintainable solution within strict time constraints while avoiding over-engineering.

---

## 6. What I Would Improve With More Time

If additional time were available, I would improve the system in the following ways:

- Replace in-memory store with a persistent database (PostgreSQL/MySQL)
- Add proper validation using Bean Validation (Jakarta Validation)
- Implement global exception handling for cleaner API responses

---

## Final Summary

This project focuses on simplicity, correctness, and maintainability under strict time constraints. The system is designed using clean separation of concerns (Controller → Service → Store) with one meaningful smart feature (rule-based priority suggestion). AI was used selectively as a support tool, while all architectural decisions and core logic were implemented manually.