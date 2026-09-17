# Class Diagram

## Overview

The Campus Academic Manager is organized into domain classes and service classes. The domain classes represent the main entities of the academic system, while the service classes handle operations related to those entities.

## Domain Classes

### Person

`Person` is an abstract class that represents common information associated with people in the system.

It provides common attributes and behavior that can be shared by specialized person classes.

### Student

`Student` represents a student in the academic management system.

The Student class contains student-specific information and inherits common information from the Person class.

### Instructor

`Instructor` represents an instructor in the academic system.

The Instructor class inherits common information from the Person class.

### Course

`Course` represents an academic course.

A course contains information related to the course, such as its identifier, name, and credit information.

### Enrollment

`Enrollment` represents the association between a student and a course.

An enrollment contains information related to the student's course enrollment and academic performance.

### Grade

`Grade` represents academic grade values using an enumeration.

### Semester

`Semester` represents semester-related values using an enumeration.

## Service Classes

### StudentManager

`StudentManager` is responsible for student-related operations.

Its responsibilities include:

- Adding students
- Listing students
- Retrieving student information

### CourseManager

`CourseManager` is responsible for course-related operations.

Its responsibilities include:

- Adding courses
- Listing courses
- Managing course information

### EnrollmentManager

`EnrollmentManager` is responsible for enrollment-related operations.

Its responsibilities include:

- Creating enrollments
- Validating student and course information
- Recording academic scores

## Repository

`Repository` provides data management functionality for the application.

It is used by the service classes to store and retrieve application entities.

Common repository operations include:

- Saving data
- Finding data
- Retrieving all available data

## Class Relationships

### Person and Student

`Student` inherits from `Person`.

### Person and Instructor

`Instructor` inherits from `Person`.

### Student and Enrollment

A student can have multiple enrollment records.

### Course and Enrollment

A course can be associated with multiple enrollment records.

### Enrollment and Grade

An enrollment contains academic grade information.

### Enrollment and Semester

An enrollment can contain semester-related information.

### Service Classes and Repository

The `StudentManager`, `CourseManager`, and `EnrollmentManager` use the `Repository` for data management.

## Class Design Summary

The class structure separates academic entities from application operations. Domain classes represent the data and relationships, while service classes manage the operations performed on those entities. The Repository provides a common mechanism for storing and retrieving data.
