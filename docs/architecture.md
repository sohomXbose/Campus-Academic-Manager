# System Architecture

## Architecture Diagram

<img width="1362" height="1392" alt="Image" src="https://github.com/user-attachments/assets/20820c80-f823-4af2-9ab7-dac4bba0e529" />


## Architecture Description

The Campus Academic Manager follows a modular layered architecture.

- **User:** Interacts with the application through the command-line interface.
- **CLI Layer:** Handles user input and application navigation.
- **Service Layer:** Contains `StudentManager`, `CourseManager`, and `EnrollmentManager` for application operations.
- **Domain Layer:** Contains the core entities such as Student, Course, Enrollment, Instructor, Grade, and Semester.
- **Repository:** Handles the storage and retrieval of application data.

## Architecture Explanation

```text
User
  ↓
Command Line Interface
  ↓
App.java
  ↓
Service Layer
  ├── StudentManager
  ├── CourseManager
  └── EnrollmentManager
  ↓
Domain Layer
  ├── Student
  ├── Course
  ├── Enrollment
  ├── Instructor
  ├── Grade
  └── Semester
  ↓
Repository
  ↓
In-Memory Data
```

** Architecture type:** Layered / modular architecture.
