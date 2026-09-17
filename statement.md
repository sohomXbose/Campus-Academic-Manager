# Project Statement

## Project Title

**Campus Academic Manager (CAM)**

---

## 1. Problem Statement

Academic information such as student details, course information, enrollments, and academic scores needs to be organized and easily accessible for effective academic management.

Campus Academic Manager (CAM) is developed as a console-based Java application to provide a structured way to manage these basic academic activities. The system organizes student, course, and enrollment information through separate modules and provides a simple command-line interface for performing academic management operations.

The project aims to demonstrate how Java and Object-Oriented Programming concepts can be applied to develop a modular academic management application.

---

## 2. Objectives

The main objectives of Campus Academic Manager are:

- To provide a simple system for managing student information.
- To manage course information through a dedicated course module.
- To allow students to be enrolled in available courses.
- To record academic scores associated with enrollments.
- To organize the application using modular Java packages.
- To demonstrate Object-Oriented Programming concepts in a practical application.
- To provide a command-line interface that can be executed directly from a terminal.

---

## 3. Scope

### In Scope

The current project covers the following academic management activities:

- Creating and viewing student records.
- Listing available students.
- Creating and listing courses.
- Enrolling students into courses.
- Recording academic scores for enrollments.
- Managing academic entities through Java classes and service components.
- Performing the application workflow through a command-line interface.

### Out of Scope

The current version does not include:

- Web-based user interface.
- Mobile application.
- Cloud-based deployment.
- Online payment processing.
- External authentication systems.
- Integration with external university databases.
- Full database-backed persistence.

These features may be considered for future versions of the project.

---

## 4. Target Users

The system is intended for users who need to perform basic academic management activities, such as:

### Students

Students can have their academic information represented in the system, including course enrollments and scores.

### Academic Staff

Academic staff can use the system to manage student, course, and enrollment information.

### Course Administrators

Course-related information and student enrollments can be managed through the available course and enrollment modules.

---

## 5. High-Level Features

### Student Management

The Student Management module provides functionality for:

- Adding students.
- Listing students.
- Viewing student information.
- Viewing enrollment-related information.

### Course Management

The Course Management module provides functionality for:

- Adding courses.
- Listing available courses.
- Maintaining course-related information.

### Enrollment Management

The Enrollment Management module provides functionality for:

- Enrolling students in courses.
- Recording academic scores.
- Validating student and course references during enrollment.

---

## 6. System Workflow

The general workflow of the application is:

```text
Start
  |
  v
Main Menu
  |
  +-------------------+
  |                   |
  v                   v
Students            Courses
  |                   |
  v                   v
Add / List / Info   Add / List
  |                   |
  +---------+---------+
            |
            v
       Enrollments
            |
            v
    Enroll / Record Score
            |
            v
       Main Menu
            |
            v
           Exit
