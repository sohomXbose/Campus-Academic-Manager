# System Architecture

## Architecture Diagram

![Campus Academic Manager Architecture]


## Architecture Description

The Campus Academic Manager follows a modular layered architecture.

- **User:** Interacts with the application through the command-line interface.
- **CLI Layer:** Handles user input and application navigation.
- **Service Layer:** Contains `StudentManager`, `CourseManager`, and `EnrollmentManager` for application operations.
- **Domain Layer:** Contains the core entities such as Student, Course, Enrollment, Instructor, Grade, and Semester.
- **Repository:** Handles the storage and retrieval of application data.
