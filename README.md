# Campus Academic Manager (CAM)

Campus Academic Manager (CAM) is a Java-based console application designed to manage basic academic activities such as students, courses, enrollments, and academic scores.

The project demonstrates the application of Object-Oriented Programming concepts and Java programming techniques through a modular command-line application.

---

## Project Overview

Managing student and course information manually can become difficult as the amount of academic information increases. Campus Academic Manager provides a simple console-based system to organize this information through separate modules for students, courses, and enrollments.

The application allows users to:

- Add and view student information
- Add and view course information
- Enroll students in courses
- Record academic scores
- View enrollment-related student information

---

## Features

### 1. Student Management
- Add new students
- List available students
- View student information
- View enrollment information associated with a student

### 2. Course Management
- Add new courses
- List available courses
- Store course-related information

### 3. Enrollment Management
- Enroll students into courses
- Record scores for enrollments
- Validate student and course references during enrollment

---

## Technologies Used

- **Programming Language:** Java
- **Interface:** Command Line / Console
- **Data Structures:** HashMap and ArrayList
- **Concepts:** Object-Oriented Programming
- **Java Features:** Classes, inheritance, enums, collections, exception handling
- **Design Concepts:** Builder Pattern and Repository-based data management

---

## Project Structure

```text
Campus-Academic-Manager/
│
├── src/
│   └── edu/
│       └── cam/
│           ├── cli/
│           │   └── App.java
│           │
│           ├── config/
│           │
│           ├── domain/
│           │   ├── Person.java
│           │   ├── Student.java
│           │   ├── Instructor.java
│           │   ├── Course.java
│           │   ├── Enrollment.java
│           │   ├── Grade.java
│           │   └── Semester.java
│           │
│           └── service/
│               ├── Repository.java
│               ├── StudentManager.java
│               ├── CourseManager.java
│               └── EnrollmentManager.java
│
├── data/
│   ├── students.csv
│   └── courses.csv
│
├── README.md
└── statement.md
