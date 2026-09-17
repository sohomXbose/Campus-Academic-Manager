# Campus Academic Manager (CAM)

Campus Academic Manager (CAM) is a Java-based console application designed to manage basic academic activities such as students, courses, enrollments, and academic scores.

The project demonstrates Object-Oriented Programming concepts and Java programming techniques through a modular command-line application.

---

## Project Overview

Managing student and course information manually can become difficult as the amount of academic information increases. Campus Academic Manager provides a simple console-based system to organize academic information through separate modules for students, courses, and enrollments.

The application allows users to:

* Add and view student information
* Add and view course information
* Enroll students in courses
* Record academic scores
* View enrollment-related student information

---

## Features

### Student Management

* Add new students
* List available students
* View student information
* View enrollment-related information

### Course Management

* Add new courses
* List available courses
* Store course-related information

### Enrollment Management

* Enroll students into courses
* Record academic scores
* Validate student and course references during enrollment

---

## Technologies Used

| Component            | Technology                                                   |
| -------------------- | ------------------------------------------------------------ |
| Programming Language | Java                                                         |
| Interface            | Command Line / Console                                       |
| Data Structures      | HashMap, ArrayList                                           |
| Programming Concepts | Object-Oriented Programming                                  |
| Java Features        | Classes, Inheritance, Enums, Collections, Exception Handling |
| Design Concepts      | Builder Pattern, Repository-based data management            |
| Data Files           | CSV                                                          |

---

## Project Structure

```text
Campus-Academic-Manager/
│
├── src/
│   ├── cli/
│   │   └── App.java
│   │
│   ├── config/
│   │   └── AppSettings.java
│   │
│   ├── domain/
│   │   ├── Person.java
│   │   ├── Student.java
│   │   ├── Instructor.java
│   │   ├── Course.java
│   │   ├── Enrollment.java
│   │   ├── Grade.java
│   │   └── Semester.java
│   │
│   └── service/
│       ├── Repository.java
│       ├── StudentManager.java
│       ├── CourseManager.java
│       └── EnrollmentManager.java
│
├── data/
│   ├── students.csv
│   └── courses.csv
│
├── docs/
│   ├── architecture.md
│   ├── workflow.md
│   ├── use-case.md
│   ├── class-diagram.md
│   ├── sequence-diagram.md
│   └── testing.md
│
├── README.md
├── statement.md
└── .gitignore
```

### Directory Description

- **`src/`** — Contains the Java source code of the application.
- **`src/cli/`** — Contains the command-line application entry point.
- **`src/config/`** — Contains application configuration-related classes.
- **`src/domain/`** — Contains the main academic domain classes such as students, courses, instructors, enrollments, grades, and semesters.
- **`src/service/`** — Contains the service and repository classes responsible for application operations and data management.
- **`data/`** — Contains CSV files used for storing student and course data.
- **`docs/`** — Contains project documentation covering architecture, workflow, use cases, class design, sequence flow, and testing.
- **`README.md`** — Provides project overview, setup, execution, features, and documentation links.
- **`statement.md`** — Contains the project problem statement, objectives, scope, and related information.
- **`.gitignore`** — Specifies files and directories that should not be tracked by Git.

## Requirements

Before running the project, make sure the following are installed:

* Java Development Kit (JDK)
* Git
* Command Prompt, PowerShell, or any terminal

Check the Java installation:

```bash
java -version
```
```bash
javac -version
```
Check Git:

```bash
git --version
```

---

## Installation

### 1. Clone the Repository

```bash
git clone https://github.com/sohomXbose/Campus-Academic-Manager.git
```

### 2. Open the Project Directory

```bash
cd Campus-Academic-Manager
```

---

## Compilation

The project can be compiled directly from the command line.

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
java -cp out cli.App
```

The application starts through the command-line interface and displays the main menu.

Select the required option and follow the instructions displayed in the terminal.

---

## Example Workflow

A typical application workflow is:

```text
Start Application
       ↓
   Main Menu
       ↓
Select Required Module
       ↓
 ┌─────┼──────────┐
 ↓     ↓          ↓
Students Courses Enrollments
 ↓     ↓          ↓
Manage Manage   Manage
Students Courses Enrollments
       ↓
Return to Main Menu
       ↓
      Exit
```

Detailed workflow documentation is available in [`docs/workflow.md`](docs/workflow.md).

---

## Testing

The application can be tested directly from the command line.

### Basic Test Cases

| Test Case                | Expected Result                            |
| ------------------------ | ------------------------------------------ |
| Start application        | Main menu is displayed                     |
| Add student              | Student information is accepted            |
| List students            | Available students are displayed           |
| View student information | Student details are displayed              |
| Add course               | Course information is accepted             |
| List courses             | Available courses are displayed            |
| Enroll student           | Student is enrolled in the selected course |
| Record score             | Score is recorded for the enrollment       |
| Invalid student/course   | Invalid input is handled                   |
| Exit                     | Application terminates                     |

Detailed testing documentation is available in [`docs/testing.md`](docs/testing.md).

---

## Object-Oriented Concepts Demonstrated

The project demonstrates the following Java and Object-Oriented Programming concepts:

* Classes and Objects
* Encapsulation
* Inheritance
* Polymorphism
* Enums
* Collections
* Exception Handling
* Modular Package Structure
* Builder Pattern
* Repository-based data management

---

## Functional Modules

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

## Documentation

Detailed project documentation is available in the `docs/` directory.

* [Architecture](docs/architecture.md)
* [Workflow](docs/workflow.md)
* [Use Case](docs/use-case.md)
* [Class Diagram](docs/class-diagram.md)
* [Sequence Diagram](docs/sequence-diagram.md)
* [Testing Documentation](docs/testing.md)

The project statement is available in [`statement.md`](statement.md).

---

## Design

The project follows a modular architecture consisting of:

- Command-line interface
- Configuration layer
- Service layer
- Domain layer
- Repository-based data management
- CSV-based data files

Detailed architecture information is available in
[Architecture Documentation](docs/architecture.md).
---

## Future Enhancements

Possible future improvements include:

* Persistent database storage
* User authentication and authorization
* Improved input validation
* Search and filtering functionality
* Detailed academic reports
* Graphical user interface
* Expanded testing coverage

---

## Author

Developed as an academic project for the VITyarthi flipped course evaluation.

**Project:** Campus Academic Manager (CAM)

**Language:** Java

**Interface:** Command Line


**Project:** Campus Academic Manager (CAM)

**Language:** Java

**Interface:** Command Line
