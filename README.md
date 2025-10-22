# CLI--Based-Student-Record-Management-System.
Overview:
The Student Record Management System is a Command-Line Interface (CLI) based CRUD application developed using Spring ORM with Hibernate Template.
It provides functionality to manage student data, allowing users to create, read, update, and delete student records directly through the console.
This project demonstrates how to use the Spring Framework in combination with Hibernate ORM to perform database operations efficiently and in a structured manner.

Features:
1.Add new student records.
2.Retrieve all student records.
3.Fetch specific student details by ID.
4.Update existing student information.
5.Delete student records from the database.

Technologies used:
| Category             | Technology              |
| -------------------- | ----------------------- |
| Framework            | Spring ORM              |
| ORM Tool             | Hibernate Template      |
| Programming Language | Java                    |
| Database             | MySQL (configurable)    |
| Build Tool           | Maven                   |
| IDE                  | Eclipse                 |

Project Structure:
springorm/
│
├── pom.xml
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/spring/orm/
│   │           ├── App.java              (Main entry point - CLI interface)
│   │           ├── Test.java             (Optional test runner)
│   │           ├── config.xml            (Spring configuration file)
│   │           │
│   │           ├── Dao/
│   │           │   └── StudentDao.java   (Handles CRUD operations using Hibernate)
│   │           │
│   │           └── entities/
│   │               └── Student.java      (Entity class mapped to the student table)
│   │
│   └── test/
│       └── java/
│           └── (Unit tests, if applicable)
│
└── README.md

Key Concepts Implemented:
1.Spring ORM Configuration and Dependency Injection
2.Hibernate Template usage for database persistence
3.Data Access Object (DAO) design pattern
4.CRUD operations with Hibernate
5.Console-based user interface for interaction
