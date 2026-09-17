# System Architecture

## Architecture Diagram

<img width="2632" height="2494" alt="Image" src="https://github.com/user-attachments/assets/17c39a27-b291-4744-ad95-467143aa4db7" />


## Architecture Description

The Campus Academic Manager follows a modular layered architecture.

- **User:** Interacts with the application through the command-line interface.
- **CLI Layer:** Handles user input and application navigation.
- **Service Layer:** Contains `StudentManager`, `CourseManager`, and `EnrollmentManager` for application operations.
- **Domain Layer:** Contains the core entities such as Student, Course, Enrollment, Instructor, Grade, and Semester.
- **Repository:** Handles the storage and retrieval of application data.
