# Use Case

## Overview

Campus Academic Manager is a command-line academic management application. The primary actor interacting with the system is the User.

The system provides functionality for managing students, courses, and enrollments.

## Diagram

<img width="911" height="1352" alt="Image" src="https://github.com/user-attachments/assets/aad8e3fd-1f49-4f1e-aefb-fd6e804f0ce7" />

## Primary Actor

### User

The User interacts with the application through the command-line interface and performs academic management operations.

## Use Cases

The main use cases of the system are:

1. Add Student
2. List Students
3. View Student Information
4. Add Course
5. List Courses
6. Enroll Student
7. Record Score
8. Exit Application

## Add Student

**Actor:** User

**Description:**  
Allows the user to create a new student record.

**Precondition:**  
The application is running and the Student Management module is available.

**Main Flow:**

1. User selects Student Management.
2. User selects Add Student.
3. User enters the required student details.
4. The system validates the information.
5. The system creates the student record.
6. The system stores the record.
7. The operation result is displayed.

**Postcondition:**  
A new student record is available in the system.

## List Students

**Actor:** User

**Description:**  
Allows the user to view the available student records.

**Main Flow:**

1. User selects Student Management.
2. User selects List Students.
3. The system retrieves student records.
4. The system displays the available students.

**Postcondition:**  
Student information is displayed to the user.

## View Student Information

**Actor:** User

**Description:**  
Allows the user to retrieve information about a particular student.

**Main Flow:**

1. User selects Student Management.
2. User provides the student identifier.
3. The system searches for the student.
4. The system displays the corresponding information.

**Alternative Flow:**

If the student cannot be found, the system displays an appropriate message.

## Add Course

**Actor:** User

**Description:**  
Allows the user to create a new course record.

**Main Flow:**

1. User selects Course Management.
2. User selects Add Course.
3. User enters the required course details.
4. The system validates the information.
5. The system creates the course record.
6. The course record is stored.

**Postcondition:**  
A new course record is available in the system.

## List Courses

**Actor:** User

**Description:**  
Allows the user to view the available courses.

**Main Flow:**

1. User selects Course Management.
2. User selects List Courses.
3. The system retrieves the available courses.
4. The system displays the course information.

## Enroll Student

**Actor:** User

**Description:**  
Allows the user to enroll a student in a course.

**Main Flow:**

1. User selects Enrollment Management.
2. User selects Enroll Student.
3. User provides the student identifier.
4. User provides the course identifier.
5. The system validates the student.
6. The system validates the course.
7. The system creates the enrollment.
8. The enrollment is stored.
9. The result is displayed.

**Alternative Flow:**

If the student or course cannot be found, the enrollment is not created and an appropriate error message is displayed.

## Record Score

**Actor:** User

**Description:**  
Allows the user to record an academic score associated with an enrollment.

**Main Flow:**

1. User selects Enrollment Management.
2. User selects the score operation.
3. User provides the required enrollment information.
4. User enters the score.
5. The system validates the information.
6. The score is recorded.
7. The result is displayed.

## Exit Application

**Actor:** User

**Description:**  
Allows the user to terminate the application.

**Main Flow:**

1. User selects Exit.
2. The application terminates normally.

## Use Case Summary

The User is the primary actor and can perform student, course, and enrollment management operations through the command-line interface.
