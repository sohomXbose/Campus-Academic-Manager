# Storage Design

## 1. Overview

The Campus Academic Manager uses **CSV files for lightweight data storage**. The application stores student and course information in separate CSV files located in the `data/` directory.

The current storage design is file-based and does not require an external database server.

---

## 2. Storage Files

The project uses the following CSV files:

```text
data/
├── students.csv
└── courses.csv
```

### students.csv

Stores information related to students.

| Field | Description |
|---|---|
| Student ID | Unique identifier for a student |
| Student Name | Name of the student |
| Email | Student email address |
| Department | Academic department of the student |

### courses.csv

Stores information related to courses.

| Field | Description |
|---|---|
| Course ID | Unique identifier for a course |
| Course Name | Name of the course |
| Credits | Number of credits assigned to the course |
| Instructor | Instructor associated with the course |

---

## 3. Data Relationships

The application manages the relationship between students and courses through the **Enrollment** entity.

A student can enroll in multiple courses, and a course can have multiple students.

Conceptually:

```text
Student
   |
   | 1
   |
   | M
Enrollment
   |
   | M
   |
   | 1
Course
```

The `Enrollment` entity connects a student with a course and can contain academic information such as the recorded score or grade.

---

## 4. Data Management

The application uses the repository layer to manage stored data.

The repository is responsible for:

- Loading data from CSV files.
- Maintaining application data during execution.
- Providing data to the service layer.
- Supporting student and course retrieval.
- Supporting enrollment-related operations.

The service layer performs application-level operations such as adding students, adding courses, and creating enrollments.

---

## 5. Data Flow

The general data flow is:

```text
CSV Files
    ↓
Repository
    ↓
Service Layer
    ↓
Command-Line Interface
    ↓
User
```

For operations that modify data:

```text
User
  ↓
Command-Line Interface
  ↓
Service Layer
  ↓
Repository
  ↓
Application Data
```

---

## 6. Data Validation

The application performs validation before processing academic records.

Examples include:

- Checking whether a student exists before performing student-related operations.
- Checking whether a course exists before enrollment.
- Preventing operations involving invalid student or course identifiers.
- Validating user input before processing the requested operation.

Invalid operations are handled through validation and error handling mechanisms.

---

## 7. Storage Limitations

The current CSV-based storage approach is suitable for a lightweight academic command-line application.

However, it has some limitations:

- It is not designed for large-scale datasets.
- Concurrent access is limited.
- Advanced querying is not available.
- Transaction management is not provided.
- Data relationships are maintained by application logic rather than database constraints.

---

## 8. Future Storage Enhancement

The storage layer can be extended in the future to use a relational database such as **MySQL, PostgreSQL, or SQLite**.

A database implementation could provide:

- Primary and foreign key constraints.
- Structured relationships between students, courses, and enrollments.
- Efficient querying.
- Transaction management.
- Improved scalability.
- Persistent enrollment and academic records.

The current repository-based design allows the storage implementation to be enhanced without significantly changing the command-line interface or domain model.

---

## 9. Summary

The Campus Academic Manager uses a **CSV-based file storage approach** for student and course data. The repository layer provides controlled access to the stored information, while the service layer handles application operations and validation.

This design keeps the project simple, lightweight, and suitable for a command-line academic management application while leaving room for future migration to a relational database.
