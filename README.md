# Smart Task Manager API

A lightweight Spring Boot REST API for managing tasks with a rule-based smart feature for priority suggestion.

---

## 🚀 Features

- Create a new task
- Get all tasks
- Update task status using PATCH
- Enum-based task status (PENDING, COMPLETED)
- Smart feature: Auto Priority Suggestion (rule-based)

---

## 🧠 Smart Feature

### Auto Priority Suggestion

The system automatically suggests a task priority based on keywords in the title and description.

- **High Priority**: urgent, bug, critical, error
- **Low Priority**: later, optional, nice to have
- **Medium Priority**: default fallback

---

## 🏗️ Tech Stack

- Java 17
- Spring Boot
- Spring Web
- In-memory HashMap (no database)

---

## 📁 Project Structure

   com.example.demo
   
    controllers → REST controllers
    services → Business logic
    models → Task + Enum
    store → In-memory storage (HashMap)
    util → Smart feature logic


---

## 📌 API Endpoints

### 1. Create Task

**Request Body:**
```json
{
  "title": "login bug",
  "description": "urgent issue in production"
}

Response:

{
  "task": { ... },
  "priority": {
    "priority": "high",
    "reason": "High priority"
  }
}

###2. Get All Tasks
GET /tasks

###3. Update Task Status
PATCH /tasks/{id}

Request Body:

{
  "status": "completed"
}

## How to Run
###1. Clone the repository
###2. Open in Eclipse / IntelliJ
###3. Run Spring Boot application
    SmartTaskApiApplication.java
###4. API will run on:
     http://localhost:8080



