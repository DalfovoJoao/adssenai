# Student Grade Management — Java

A small console project developed to practice **Object-Oriented Programming (OOP)** while studying Systems Analysis and Development.

> This is a new educational implementation inspired by a previous university exercise about managing student enrollments and grades. It is not a recovered copy of the original assignment.

## Features

- Store a student's name and course.
- Enter two grades between 0 and 10.
- Calculate the arithmetic average.
- Display the result as **Approved** (average 7 or higher) or **Not approved**.
- Reject invalid grades and non-numeric input.

## Technologies

- Java (JDK 11 or later)
- Java Standard Library — `Scanner`

## How to run

Open a terminal in the project folder and run:

```bash
javac Enrollment.java Main.java
java Main
```

Example input:

```text
Student name: Alex Johnson
Course name: Programming
First grade (0-10): 8
Second grade (0-10): 9
```

Example output:

```text
Student: Alex Johnson
Course: Programming
Average: 8.50
Status: Approved
```

## Files

- `Enrollment.java` — encapsulates student details, grade validation, average calculation, and status.
- `Main.java` — reads user input and displays results.

## Concepts practiced

Classes and objects, constructors, private attributes, public methods, encapsulation, conditions, error handling, and console input.

## Notes

This is an introductory academic-style project. The passing threshold is **7.0** as a project assumption, not a university-wide rule. It does not store data in a database.
