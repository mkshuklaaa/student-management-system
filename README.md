🎓 Student Management System
📖 Description

A console-based Student Management System built using Java, JDBC, MySQL, and Maven.
This project allows users to Add, View, Update, and Delete student records in a MySQL database.
Perfect for learning Java database connectivity and for showcasing on your resume.

✨ Features

➕ Add new student records

👀 View all students in a table format

✏️ Update student information by ID

🗑️ Delete students by ID

🖥️ Simple console-based interface

🛠️ Technology Stack

Backend: Java

Database: MySQL

Database Connectivity: JDBC

Build Tool: Maven

IDE: VS Code / IntelliJ IDEA

⚙️ Installation & Setup

Clone the repository

git clone https://github.com/mkshuklaaa/student-management-system.git


Install Java JDK 17+ and verify:

java -version


Install MySQL Server & Workbench and create the database:

CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    course VARCHAR(100)
);


Install Maven (if not already) and verify:

mvn -v


Open the project in VS Code or IntelliJ IDEA.

Add MySQL dependency in pom.xml:

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>


Update DB connection in DBConnection.java with your MySQL username & password.

▶️ How to Run
Using Maven
mvn compile
mvn exec:java -Dexec.mainClass="com.student.App"


Or simply Run App.java from your IDE.

🗂️ Project Structure
student-management/
├── src/
│   └── main/java/com/student/
│        ├── App.java           // Main menu
│        ├── DBConnection.java  // MySQL connection
│        ├── Student.java       // Model class
│        └── StudentDAO.java    // CRUD operations
├── pom.xml
└── README.md

🖼️ Sample Output
=== STUDENT MANAGEMENT SYSTEM ===
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 1
Enter name: Manish
Enter age: 21
Enter course: Java
✅ Student added successfully!

🌱 Optional Next Steps

🔐 Add Admin login system

🖼️ Create a GUI using Java Swing

🔍 Add search by name/course feature
