# System Architecture

## Architecture Diagram

https://github.com/sohomXbose/Campus-Academic-Manager/blob/main/docs/architecture.png?raw=true


## Architecture Description

The Campus Academic Manager follows a modular layered architecture.

- **User:** Interacts with the application through the command-line interface.
- **CLI Layer:** Handles user input and application navigation.
- **Service Layer:** Contains `StudentManager`, `CourseManager`, and `EnrollmentManager` for application operations.
- **Domain Layer:** Contains the core entities such as Student, Course, Enrollment, Instructor, Grade, and Semester.
- **Repository:** Handles the storage and retrieval of application data.
