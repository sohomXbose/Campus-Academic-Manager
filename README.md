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
- **Java Features:** Classes, Inheritance, Enums, Collections, and Exception Handling
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
```

---

## Requirements

Before running the project, make sure the following are installed:

- Java Development Kit (JDK)
- Command Prompt, PowerShell, or any terminal

Check your Java installation:

```bash
java -version
```

and:

```bash
javac -version
```

---

## Installation

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/Campus-Academic-Manager.git
```

### 2. Open the Project Directory

```bash
cd Campus-Academic-Manager
```

---

## Compilation

Compile all Java source files into a separate output directory.

### Windows PowerShell

```powershell
New-Item -ItemType Directory -Force out
javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName })
```

### Linux / macOS

```bash
mkdir -p out
javac -d out $(find src -name "*.java")
```

---

## Running the Application

After successful compilation, run:

```bash
java -cp out edu.cam.cli.App
```

The application will display the main menu:

```text
Campus Academic Manager
1. Students
2. Courses
3. Enrollments
0. Exit
```

Select the required option and follow the instructions displayed in the terminal.

---

## Example Workflow

A typical workflow is:

```text
Start Application
       ↓
   Main Menu
       ↓
Select Students
       ↓
Add / List / View Student
       ↓
Select Courses
       ↓
Add / List Course
       ↓
Select Enrollments
       ↓
Enroll Student / Record Score
       ↓
Return to Main Menu
       ↓
      Exit
```

---

## Testing

The application can be tested directly from the command line.

### Basic Test Cases

| Test Case | Expected Result |
|---|---|
| Start application | Main menu is displayed |
| Add student | Student information is accepted |
| List students | Available students are displayed |
| View student information | Student details are displayed |
| Add course | Course information is accepted |
| List courses | Available courses are displayed |
| Enroll student | Student is enrolled in the selected course |
| Record score | Score is recorded for the enrollment |
| Invalid student/course | Invalid input is handled |
| Exit | Application terminates |

---

## Object-Oriented Concepts Demonstrated

The project demonstrates several Java and OOP concepts, including:

- Classes and Objects
- Encapsulation
- Inheritance
- Polymorphism
- Enums
- Collections
- Exception Handling
- Modular Package Structure
- Builder Pattern
- Repository-based data management

---

## Functional Modules

The project consists of three major functional modules.

### Student Management

Responsible for creating, storing, listing, and retrieving student information.

### Course Management

Responsible for creating and listing courses.

### Enrollment Management

Responsible for connecting students with courses and recording academic scores.

---

## Non-Functional Requirements

### Performance

The application is designed to provide quick responses for normal academic management operations.

### Usability

The system uses a simple menu-driven command-line interface with clear prompts.

### Reliability

Input and entity validation are used to reduce invalid operations.

### Maintainability

The application is divided into domain, service, configuration, and CLI packages to keep responsibilities separated.

### Error Handling

Invalid entities and inappropriate input are handled through validation and exception handling.

---

## Design

The project follows a modular structure:

```text
User
  │
  ▼
CLI Application
  │
  ▼
Service Layer
  │
  ├── Student Manager
  ├── Course Manager
  └── Enrollment Manager
  │
  ▼
Domain Layer
  │
  ├── Student
  ├── Instructor
  ├── Course
  ├── Enrollment
  ├── Grade
  └── Semester
```

Detailed architecture, workflow, UML diagrams, and other design documentation are provided in the project documentation.

---

## Future Enhancements

Possible future improvements include:

- Persistent database storage
- User authentication and authorization
- Improved input validation
- Search and filtering functionality
- Detailed academic reports
- Graphical user interface
- Expanded testing coverage

---

## Author

Developed as an academic project for the VITyarthi flipped course evaluation.

**Project:** Campus Academic Manager (CAM)

**Language:** Java

**Interface:** Command Line
