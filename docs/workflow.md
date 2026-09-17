# 2. Workflow Diagram

## Overview

The Campus Academic Manager follows a menu-driven workflow through which the user can manage students, courses, and enrollments.

<img width="4703" height="2004" alt="Image" src="https://github.com/user-attachments/assets/ceb420d3-e495-455e-9066-7f5e3df899eb" />

### Workflow Explanation

1. The user starts the Campus Academic Manager application from the command line.
2. The application displays the main menu.
3. The user selects the required module.
4. The application performs the selected operation.
5. The required information is validated.
6. The operation is completed if the provided information is valid.
7. The result of the operation is displayed to the user.
8. The user is returned to the main menu.
9. The user can perform another operation or select the Exit option.
10. The application terminates when the user chooses Exit.

## Student Management Workflow

The Student Management module handles student-related operations.

### Add Student

1. The user selects Student Management.
2. The user selects the option to add a student.
3. The user enters the required student information.
4. The system validates the provided information.
5. The student record is created and stored.
6. The result is displayed to the user.

### List Students

1. The user selects Student Management.
2. The user selects the option to list students.
3. The system retrieves the available student records.
4. The student records are displayed.

### View Student Information

1. The user selects Student Management.
2. The user provides the required student identifier.
3. The system searches for the corresponding student.
4. The student information is displayed if the student exists.

## Course Management Workflow

The Course Management module handles course-related operations.

### Add Course

1. The user selects Course Management.
2. The user selects the option to add a course.
3. The user enters the required course information.
4. The system validates the provided information.
5. The course record is created and stored.
6. The result is displayed to the user.

### List Courses

1. The user selects Course Management.
2. The user selects the option to list courses.
3. The system retrieves the available course records.
4. The course records are displayed.

## Enrollment Management Workflow

The Enrollment Management module handles the relationship between students and courses.

### Enroll Student

1. The user selects Enrollment Management.
2. The user selects the enrollment operation.
3. The user provides the student identifier.
4. The user provides the course identifier.
5. The system verifies that the student exists.
6. The system verifies that the course exists.
7. If both are valid, the enrollment is created.
8. The enrollment information is stored.
9. The result is displayed to the user.

### Record Score

1. The user selects Enrollment Management.
2. The user selects the score-related operation.
3. The user provides the required enrollment information.
4. The user enters the academic score.
5. The system validates the provided information.
6. The score is recorded for the enrollment.
7. The result is displayed to the user.

## Exit Workflow

1. The user selects the Exit option from the main menu.
2. The application terminates normally.

## Workflow Summary

The overall workflow consists of application startup, menu selection, module operation, data validation, data processing, result display, and return to the main menu until the user exits the application.
