# 🚆 Train Search System

A **Spring Boot–based Train Search Application** that allows users to search train schedules **either by station codes** (e.g., KOP → PUNE) or **by station names** (e.g., Kolhapur → Pune).
The API returns a list of matching train schedules between the given source and destination.

---

## ✨ Features

* 🔍 Search trains using **station codes**
* 🔎 Search trains using **station names**
* 📄 Returns full train schedule details
* 🧩 Clean layered architecture (Controller → Service → Repository → Model)
* 🌐 CORS enabled for frontend integration
* 📦 REST API with easy Postman testing

---

## ⚙️ Tech Stack

* **Java 17+**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **MySQL**
* **Lombok** (optional)
* **Postman** for API testing

---

## 🗃️ Project Structure

* `TrainSearchController` → Handles incoming requests
* `TrainSearchService` → Business logic
* `TrainSchedule` → Entity model representing train details
* `TrainSearchRepository` → Database operations using JPA

---

## 🔌 API Endpoints

### 🔹 **1. Search Train by Station Code**

```http
GET /train/by-code?sourceCode=SRC&destinationCode=DEST
```

**Example:**

```http
GET /train/by-code?sourceCode=SUR&destinationCode=PUNE
```

**Response:**
Returns a list of train schedules matching the source & destination station codes.

---

### 🔹 **2. Search Train by Station Name**

```http
GET /train/by-name?sourceName=SRC&destinationName=DEST
```

**Example:**

```http
GET /train/by-name?sourceName=Solapur&destinationName=Pune
```

**Response:**
List of matching trains based on station names.

---

## 📥 Sample Response (Example)

```json
[
  {
    "trainId": 101,
    "trainName": "Kolhapur - Pune Express",
    "source": "Kolhapur",
    "destination": "Pune",
    "departureTime": "06:30",
    "arrivalTime": "10:15"
  }
]
```

---

## 🗃️ Database Table (Example)

Your `TrainSchedule` table may contain fields like:

* `train_id`
* `train_name`
* `source`
* `source_code`
* `destination`
* `destination_code`
* `departure_time`
* `arrival_time`

---

## ⚙️ Configuration

Configure your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/train_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---

## ▶️ How to Run

1. Clone the repository:

```bash
https://github.com/AniketPawar2602/Train_Project.git
```

2. Configure the database in `application.properties`.

3. Run the project:

```bash
./mvnw spring-boot:run
```

4. Test the API using Postman:

```
http://localhost:8080/train/by-code
http://localhost:8080/train/by-name
```

---

## 🙋 Author

**Aniket Pawar**
🔗 [LinkedIn](https://www.linkedin.com/in/aniket-pawar-2b8587271/)
