# Testing Documentation

## 1. Testing Overview

Campus Academic Manager is tested through command-line execution and functional validation of its major modules.

The testing focuses on verifying:

- Application startup
- Student management
- Course management
- Enrollment management
- Score recording
- Input validation
- Application termination

---

## 2. Testing Environment

| Component | Requirement |
|---|---|
| Programming Language | Java |
| Interface | Command Line |
| Compiler | javac |
| Runtime | Java |
| Operating System | Windows / Linux / macOS |
| Testing Method | Functional and validation testing |

---

## 3. Functional Test Cases

### TC-01: Application Startup

**Input:** Run the application from the terminal.

**Expected Result:**  
The Campus Academic Manager main menu is displayed.

**Status:** PASS

---

### TC-02: Add Student

**Input:** Select the Students module and choose Add.

**Expected Result:**  
The system accepts valid student information and creates the student record.

**Status:** PASS

---

### TC-03: List Students

**Input:** Select the Students module and choose List.

**Expected Result:**  
The available student records are displayed.

**Status:** PASS

---

### TC-04: View Student Information

**Input:** Provide a valid student identifier.

**Expected Result:**  
The corresponding student information is displayed.

**Status:** PASS

---

### TC-05: Add Course

**Input:** Select the Courses module and choose Add.

**Expected Result:**  
The course information is accepted and the course is created.

**Status:** PASS

---

### TC-06: List Courses

**Input:** Select the Courses module and choose List.

**Expected Result:**  
Available courses are displayed.

**Status:** PASS

---

### TC-07: Enroll Student

**Input:** Provide a valid student ID and course ID.

**Expected Result:**  
The student is enrolled in the selected course.

**Status:** PASS

---

### TC-08: Record Score

**Input:** Provide a valid enrollment and score.

**Expected Result:**  
The score is recorded for the enrollment.

**Status:** PASS

---

### TC-09: Invalid Student or Course

**Input:** Provide a student ID or course ID that does not exist.

**Expected Result:**  
The system identifies the invalid reference and does not create an invalid enrollment.

**Status:** PASS

---

### TC-10: Exit Application

**Input:** Select the Exit option.

**Expected Result:**  
The application terminates normally.

**Status:** PASS

---

## 4. Validation Testing

The application validates important entity references before performing enrollment operations.

For example:

```text
Student ID → Student lookup
Course ID  → Course lookup
      ↓
Both valid?
   /       \
 Yes       No
 ↓          ↓
Create     Display
Enrollment Error

## 5. Command-Line Execution Test

The project is designed to be compiled and executed directly from the command line without requiring a graphical development environment.

### Linux / macOS

Compile the Java source files:

```bash
javac -d out $(find src -name "*.java")
```

Run the application:

```bash
java -cp out edu.cam.cli.App
```

### Windows PowerShell

Create the output directory and compile the Java source files:

```powershell
New-Item -ItemType Directory -Force out
javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName })
```

Run the application:

```powershell
java -cp out edu.cam.cli.App
```

### Expected Result

After successful compilation and execution, the Campus Academic Manager command-line interface starts and displays the main menu.

The user can then select the required module and perform the available operations.

---

## 6. Testing Summary

The application was tested through command-line execution and functional testing of its major modules.

| Module | Tests Performed | Result |
|---|---:|---|
| Application Startup | 1 | PASS |
| Student Management | 3 | PASS |
| Course Management | 2 | PASS |
| Enrollment Management | 2 | PASS |
| Validation | 1 | PASS |
| Application Exit | 1 | PASS |

### Testing Areas

The testing covered the following areas:

- Application startup and command-line execution
- Student creation and retrieval
- Student listing
- Student information viewing
- Course creation and listing
- Student enrollment
- Academic score recording
- Invalid input and entity validation
- Application termination

### Testing Conclusion

The application was tested through command-line execution, and the major functional workflows were verified successfully.
