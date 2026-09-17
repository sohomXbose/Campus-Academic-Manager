# Sequence Diagram

## Overview

This document describes the sequence of interactions involved when a user enrolls a student in a course.

The sequence demonstrates the interaction between the User, the command-line application, the EnrollmentManager, the StudentManager, the CourseManager, and the Repository.

##Diagram



## Enroll Student Sequence

### Participants

- **User** - Performs the enrollment operation.
- **App** - Handles the command-line interaction.
- **EnrollmentManager** - Processes the enrollment request.
- **StudentManager** - Retrieves and validates student information.
- **CourseManager** - Retrieves and validates course information.
- **Repository** - Stores and retrieves application data.

## Sequence Description

1. The User starts the application.
2. The User selects the Enrollment Management option.
3. The App requests the student identifier.
4. The User provides the student identifier.
5. The App requests the course identifier.
6. The User provides the course identifier.
7. The App passes the enrollment request to the EnrollmentManager.
8. The EnrollmentManager requests the student information from the StudentManager.
9. The StudentManager uses the Repository to retrieve the student.
10. The student information is returned to the EnrollmentManager.
11. The EnrollmentManager requests the course information from the CourseManager.
12. The CourseManager uses the Repository to retrieve the course.
13. The course information is returned to the EnrollmentManager.
14. The EnrollmentManager validates the student and course information.
15. If both references are valid, the EnrollmentManager creates the enrollment.
16. The new enrollment is stored through the Repository.
17. The successful enrollment result is returned to the App.
18. The App displays the result to the User.

## Alternative Flow

If the provided student identifier does not correspond to an existing student:

1. The StudentManager cannot retrieve the requested student.
2. The EnrollmentManager receives the validation failure.
3. The enrollment is not created.
4. The App displays an appropriate error message.

If the provided course identifier does not correspond to an existing course:

1. The CourseManager cannot retrieve the requested course.
2. The EnrollmentManager receives the validation failure.
3. The enrollment is not created.
4. The App displays an appropriate error message.

## Sequence Summary

The enrollment operation follows a layered interaction in which the command-line interface receives input, the EnrollmentManager coordinates the operation, the StudentManager and CourseManager validate the required entities, and the Repository handles data storage and retrieval.
