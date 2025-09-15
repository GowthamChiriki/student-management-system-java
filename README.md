# Student Management System

A console-based Student Management System built in **Java** using **JDBC** and **MySQL**.

## Features
- Add, update, and delete student records
- Search for a student by ID
- View all students in the database
- Demonstrates use of **JDBC CRUD operations** and **prepared statements**

## Tech Stack
- **Java**: Core programming language
- **JDBC**: Database connectivity
- **MySQL**: Relational database

## Project Structure

```Student Management System/
├── src/ # Java source code
│ ├── Main.java
│ ├── Student.java
│ ├── StudentDAO.java
│ └── DBConnection.java
├── .gitignore # Git ignore file
└── README.md # Project documentation
```

## How to Run
**Setup MySQL Database**
   ```sql
   CREATE DATABASE student_db;
   USE student_db;

   CREATE TABLE students (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100),
       age INT,
       grade VARCHAR(10)
   );
```
```Author
Gowtham Chiriki
GitHub: https://github.com/GowthamChiriki
Backend / Java Developer | JDBC & MySQL | Spring Boot Learner
```
