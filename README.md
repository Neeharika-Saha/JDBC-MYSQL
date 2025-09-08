# JDBC-MySQL Examples

This repository contains Java programs demonstrating how to use **JDBC (Java Database Connectivity)** with a **MySQL database**. It covers essential operations such as **connecting**, **inserting**, **selecting**, **updating**, and **deleting** records using both `Statement` and `PreparedStatement`. Designed to be beginner-friendly with clear, modular examples.

---

##  Features

- Establish and manage **database connections**
- Perform CRUD operations:
  - **Insert**: `JdbcInsertDemo`
  - **Select**: `JdbcSelectDemo`
  - **Update / Delete**: `JdbcUpdateAndDeleteDemo`
- Use of `Statement` and (safer) `PreparedStatement`
- Proper resource management and exception handling
- Clean, easy-to-follow code structure

---

## 📂 Repository Structure

JDBC-MYSQL/
├── JdbcInsertDemo/                 # Insert operation project
│   ├── src/
│   │   └── in/ns/test/InsertDemo.java
│   ├── bin/                        # Compiled .class files
│   ├── .classpath
│   ├── .project
│   └── .settings/
│
├── JdbcSelectDemo/                 # Select operation project
│   ├── src/
│   │   └── in/ns/select/SelectDemo.java
│   ├── bin/
│   ├── .classpath
│   ├── .project
│   └── .settings/
│
├── JdbcUpdateAndDeleteDemo/        # Update & Delete operation project
│   ├── src/
│   │   ├── in/ns/update/UpdateDemo.java
│   │   └── in/ns/delete/DeleteDemo.java
│   ├── bin/
│   ├── .classpath
│   ├── .project
│   └── .settings/
│
└── README.md                       # Project documentation



---

##  Prerequisites

- Java Development Kit (**JDK 8** or higher)
- **MySQL** Server (version 5.7+ or 8.0+)
- **MySQL Connector/J** JDBC driver
- An IDE like **Eclipse** or **VS Code**

---

##  Installation & Running

1. **Clone the repository**
    ```bash
    git clone https://github.com/Neeharika-Saha/JDBC-MYSQL.git
    cd JDBC-MYSQL
    ```

2. **Import into your IDE**  
   - For **Eclipse**: File → Import → Existing Projects into Workspace  
   - For **VS Code**: Open folder directly

3. **Add JDBC Driver**  
   - Download `mysql-connector-java-x.x.x.jar`  (mysql-connector 8 jar file)
   - Add it to each project's build path

4. **Configure Database Credentials**  
   In each Java file, modify:
   ```java
   DriverManager.getConnection(
       "jdbc:mysql://localhost:3306/your_database",
       "your_username",
       "your_password"
   );

##  Run the Demo Programs

- InsertDemo: Inserts a new record
- SelectDemo: Retrieves and displays records
- UpdateDemo / DeleteDemo: Update or delete existing records

##  Best Practices

- Use PreparedStatement to prevent SQL injection
- Always close JDBC resources (Connection, Statement, ResultSet) appropriately or use try-with-resources

##  Contributions & Contact

Contributions are welcome! Feel free to fork the repo and submit PRs with improvements, additional use cases, or other database examples.

Created by Neeharika Saha — reach out at: sahaneeharika2@gmail.com
