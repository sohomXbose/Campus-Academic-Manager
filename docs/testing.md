# Testing Documentation

## 1. Testing Overview

Campus Academic Manager is tested through command-line execution and functional validation of its major modules.

The testing focuses on:

* Application startup
* Student management
* Course management
* Enrollment management
* Score recording
* Input validation
* Application termination

## 2. Testing Environment

| Component            | Requirement                               |
| -------------------- | ----------------------------------------- |
| Programming Language | Java                                      |
| Interface            | Command Line                              |
| Compiler             | `javac`                                   |
| Runtime              | Java                                      |
| Operating System     | Windows / Linux / macOS                   |
| Testing Method       | Functional Testing and Validation Testing |

## 3. Functional Test Cases

### TC-01: Application Startup

**Action:** Run the application from the terminal.

**Expected Result:**
The Campus Academic Manager starts successfully and displays the main menu.

**Result:** PASS / FAIL

---

### TC-02: Add Student

**Action:** Select Student Management and add a student using valid information.

**Expected Result:**
The student information is accepted and a student record is created.

**Result:** PASS / FAIL

---

### TC-03: List Students

**Action:** Select the option to list students.

**Expected Result:**
Available student records are displayed.

**Result:** PASS / FAIL

---

### TC-04: View Student Information

**Action:** Provide a valid student identifier.

**Expected Result:**
The corresponding student information is displayed.

**Result:** PASS / FAIL

---

### TC-05: Add Course

**Action:** Select Course Management and add a course using valid information.

**Expected Result:**
The course information is accepted and a course record is created.

**Result:** PASS / FAIL

---

### TC-06: List Courses

**Action:** Select the option to list courses.

**Expected Result:**
Available course records are displayed.

**Result:** PASS / FAIL

---

### TC-07: Enroll Student

**Action:** Provide a valid student identifier and course identifier.

**Expected Result:**
The student is successfully enrolled in the selected course.

**Result:** PASS / FAIL

---

### TC-08: Record Score

**Action:** Provide valid enrollment information and an academic score.

**Expected Result:**
The score is recorded for the enrollment.

**Result:** PASS / FAIL

---

### TC-09: Invalid Student or Course

**Action:** Provide an invalid student identifier or course identifier during enrollment.

**Expected Result:**
The system identifies the invalid reference and prevents the invalid enrollment.

**Result:** PASS / FAIL

---

### TC-10: Exit Application

**Action:** Select the Exit option.

**Expected Result:**
The application terminates normally.

**Result:** PASS / FAIL

## 4. Command-Line Execution Test

### Windows PowerShell

Create the output directory and compile the source files:

```powershell
New-Item -ItemType Directory -Force out
javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName })
```

Run the application:

```powershell
java -cp out edu.cam.cli.App
```

### Linux / macOS

Compile the source files:

```bash
mkdir -p out
javac -d out $(find src -name "*.java")
```

Run the application:

```bash
java -cp out edu.cam.cli.App
```

## 5. Test Summary

| Test Area             | Test Cases |
| --------------------- | ---------: |
| Application Startup   |          1 |
| Student Management    |          3 |
| Course Management     |          2 |
| Enrollment Management |          2 |
| Validation            |          1 |
| Application Exit      |          1 |
| **Total**             |     **10** |

## 6. Testing Conclusion

The test cases cover the major functional workflows of the Campus Academic Manager. The application should be executed from the command line and each test case should be verified before the final submission.

The final PASS/FAIL status should reflect the actual result observed during testing.
