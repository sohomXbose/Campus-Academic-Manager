# 2. Workflow Diagram

### File:

`docs/workflow.md`

## Workflow Diagram

```text
Start
  ↓
Launch Application
  ↓
Display Main Menu
  ↓
Select Module
  ├── Students
  │     ↓
  │   Student Management
  │     ├── Add Student
  │     ├── List Students
  │     └── View Student Information
  │
  ├── Courses
  │     ↓
  │   Course Management
  │     ├── Add Course
  │     └── List Courses
  │
  ├── Enrollments
  │     ↓
  │   Enrollment Management
  │     ├── Enroll Student
  │     └── Record Score
  │
  └── Exit
        ↓
       End
```

### Workflow Explanation

The application starts from the command line and displays the main menu. The user selects one of the three modules: **Students, Courses, or Enrollments**. After completing an operation, the user is returned to the main menu until the Exit option is selected.

---

# 3. Use Case Diagram

### File:

`docs/use-case.md`

## Use Case Diagram

```text
                         ┌──────────────────────────────┐
                         │   Campus Academic Manager    │
                         │                              │
                         │  ┌────────────────────────┐  │
                         │  │ Add Student            │  │
                         │  └────────────────────────┘  │
                         │  ┌────────────────────────┐  │
                         │  │ List Students           │  │
                         │  └────────────────────────┘  │
                         │  ┌────────────────────────┐  │
                         │  │ View Student Info       │  │
                         │  └────────────────────────┘  │
                         │                              │
                         │  ┌────────────────────────┐  │
                         │  │ Add Course              │  │
                         │  └────────────────────────┘  │
                         │  ┌────────────────────────┐  │
                         │  │ List Courses            │  │
                         │  └────────────────────────┘  │
                         │                              │
                         │  ┌────────────────────────┐  │
                         │  │ Enroll Student          │  │
                         │  └────────────────────────┘  │
                         │  ┌────────────────────────┐  │
                         │  │ Record Score            │  │
                         │  └────────────────────────┘  │
                         └──────────────────────────────┘
                                      ▲
                                      │
                                      │
                                  ┌───────┐
                                  │ User  │
                                  └───────┘
```

## Use Case Description

| Actor | Use Case | Description |
|---|---|---|
| User | Add Student | Creates a student record |
| User | List Students | Displays available students |
| User | View Student Information | Displays information about a student |
| User | Add Course | Creates a course |
| User | List Courses | Displays available courses |
| User | Enroll Student | Enrolls a student in a course |
| User | Record Score | Records the academic score for an enrollment |

### Actor

**User** is the primary actor interacting with the command-line application.

---

# 4. Class Diagram

### File:

`docs/class-diagram.md`

## Class Diagram

```text
                    ┌──────────────────────┐
                    │       Person         │
                    │      <<abstract>>    │
                    ├──────────────────────┤
                    │ - id                 │
                    │ - name               │
                    └──────────┬───────────┘
                               │
                    ┌──────────┴───────────┐
                    │                      │
                    ▼                      ▼
          ┌──────────────────┐   ┌──────────────────┐
          │     Student      │   │    Instructor    │
          ├──────────────────┤   ├──────────────────┤
          │ - studentId      │   │ - instructorId   │
          │ - program        │   └──────────────────┘
          └────────┬─────────┘
                   │
                   │
                   │ 1
                   │
                   │ *
                   ▼
          ┌──────────────────┐
          │    Enrollment    │
          ├──────────────────┤
          │ - enrollmentId   │
          │ - score          │
          │ - grade          │
          └───────┬─────┬────┘
                  │     │
                  │     │
                  ▼     ▼
          ┌──────────┐ ┌──────────┐
          │  Course  │ │  Grade   │
          ├──────────┤ ├──────────┤
          │ - id     │ │ <<enum>> │
          │ - name   │ └──────────┘
          │ - credits│
          └──────────┘

                ┌──────────────┐
                │  Semester    │
                │   <<enum>>   │
                └──────────────┘


          ┌─────────────────────────┐
          │       Repository        │
          ├─────────────────────────┤
          │ + save()                │
          │ + find()                │
          │ + findAll()             │
          └────────────┬────────────┘
                       │
                       │
          ┌────────────┼────────────┐
          │            │            │
          ▼            ▼            ▼
 ┌────────────────┐ ┌────────────────┐ ┌──────────────────┐
 │ StudentManager │ │ CourseManager  │ │ EnrollmentManager│
 └────────────────┘ └────────────────┘ └──────────────────┘
```

### Class Relationship Explanation

- `Person` provides common attributes for people represented in the system.
- `Student` and `Instructor` are specialized person entities.
- `Student` can have multiple enrollments.
- Each `Enrollment` connects a student with a course.
- `Enrollment` contains academic score and grade information.
- Manager classes provide operations for their respective modules.
- `Repository` provides data management for the application.

---

# 5. Sequence Diagram

### File:

`docs/sequence-diagram.md`

## Sequence Diagram — Enroll Student

```text
User              App          EnrollmentManager
 │                 │                    │
 │ Select          │                    │
 │ Enrollments     │                    │
 ├────────────────>│                    │
 │                 │                    │
 │                 │ Request Student ID │
 │<────────────────┤                    │
 │                 │                    │
 │ Enter Student ID│                    │
 ├────────────────>│                    │
 │                 │                    │
 │                 │ Request Course ID   │
 │<────────────────┤                    │
 │                 │                    │
 │ Enter Course ID │                    │
 ├────────────────>│                    │
 │                 │                    │
 │                 │ enroll(studentId,  │
 │                 │ courseId)          │
 │                 ├───────────────────>│
 │                 │                    │
 │                 │                    │ Find Student
 │                 │                    ├───────────────┐
 │                 │                    │               │
 │                 │                    │<──────────────┘
 │                 │                    │
 │                 │                    │ Find Course
 │                 │                    ├───────────────┐
 │                 │                    │               │
 │                 │                    │<──────────────┘
 │                 │                    │
 │                 │                    │ Validate
 │                 │                    │ Student/Course
 │                 │                    │
 │                 │                    │ Create Enrollment
 │                 │                    │
 │                 │<───────────────────┤
 │                 │ Enrollment Created │
 │                 │                    │
 │<────────────────┤                    │
 │ Display Success │                    │
 │                 │                    │
```

### Sequence Explanation

The user selects enrollment management and provides a student ID and course ID. The application passes these details to the `EnrollmentManager`. The enrollment manager verifies the student and course through the corresponding managers and repository. If both are valid, an enrollment is created and stored. Otherwise, an appropriate validation error is returned to the user.
