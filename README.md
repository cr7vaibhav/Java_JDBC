# Java JDBC
Connect to a MySQL database using JDBC, executes a query, and retrieves results.

## Features

- Connects to MySQL using JDBC.
- Executes a `SELECT` query on the `people` table.
- Prints the `firstname` of each entry.

## Prerequisites

- **Java JDK**
- **MySQL Server**
- **MySQL JDBC Driver** in the classpath

## Setup

1. **MySQL Database**:
   ```sql
   CREATE DATABASE jdbc_prac;
   USE jdbc_prac;
   CREATE TABLE people (id INT AUTO_INCREMENT PRIMARY KEY, firstname VARCHAR(255), lastname VARCHAR(255));
   INSERT INTO people (firstname, lastname) VALUES ('John', 'Doe'), ('Jane', 'Smith');
   ```

2. **Dependencies**:
    - **Maven**:
      ```xml
      <dependency>
          <groupId>mysql</groupId>
          <artifactId>mysql-connector-java</artifactId>
          <version>8.0.32</version>
      </dependency>
      ```
    - **Gradle**:
      ```groovy
      dependencies {
          implementation 'mysql:mysql-connector-java:8.0.32'
      }
      ```

3. **Update Credentials**:
   ```java
   String url = "jdbc:mysql://localhost:3360/jdbc_prac";
   String username = "username";
   String password = "password";
   ```

## Code Summary

- **Load Driver**: `Class.forName("com.mysql.cj.jdbc.Driver")`
- **Connect to DB**: `DriverManager.getConnection(url, username, password)`
- **Execute Query**: `SELECT * FROM people`
- **Print Results**: `System.out.println(resultSet.getString("firstname"))`

---

