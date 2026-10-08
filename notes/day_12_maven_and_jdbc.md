Maven
1. What is Maven?

Maven is build tool. 

Build tool is responsible to compile, run, creating executable file ie jar, war, ear
help to download external dependencies, help to create documentation. 
Ant 
Maven 
Gradle 


Apache Maven is a build automation and 
dependency management tool primarily used for Java applications.
In simple words:
Maven helps us compile, test, package, run, and manage dependencies of a 
Java project automatically.

Instead of manually downloading JAR files, 
compiling Java files, running tests, and 
creating JAR/WAR files, Maven can do these tasks using simple commands.

in Angular or JavaScript 
npm : javascript library 
mvn : for java technology 
pip : for python 


Maven is mainly used for
1. Project creation for all ide. (generic project)
2. Dependency management
3. Compilation
4. Unit testing
5. Packaging
6. Running build lifecycle
7. Creating JAR/WAR files
8. Plugin management
9. Managing transitive dependencies

2. Why do we need Maven?

Suppose you create a Java application that uses:
- Spring Boot
- MySQL
- JUnit
- Jackson
- Hibernate
Without Maven, you may need to manually download many .jar files.

For example:
mysql-connector.jar
junit.jar
jackson-core.jar
jackson-databind.jar
hibernate.jar
...

You also need to make sure that compatible versions are available.
With Maven, you simply declare the dependencies in:

pom.xml         Project Object Model (maven configuration file which hold all configuration details )

For example:
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.12.2</version>
</dependency>

Maven downloads the required JAR and its required dependencies automatically.
3. Maven Architecture

A simple Maven flow is:
             pom.xml
                |
                v
        +----------------+
        |     Maven      |
        +----------------+
                |
       +--------+--------+
       |        |        |
       v        v        v
 Dependencies  Plugins  Lifecycle
       |        |        |
       +--------+--------+
                |
                v
        Build Java Project
                |
                v
       target/project.jar

4. Maven Setup

To use Maven, generally we need:

JDK
 +
Maven
 +
IDE

For example:
JDK 17 / 21 / 25
Maven
IntelliJ IDEA / Eclipse / VS Code

5. Step 1 — Check Java
Open Command Prompt:
java -version

Example:
java version "21.0.x"

Also check the compiler:
javac -version

Example:
javac 21.0.x

If these commands work, Java is installed.
6. Step 2 — Download Maven
Download Maven from the official Apache Maven website:
Apache Maven
Download the Binary zip archive.
For example:
apache-maven-3.x.x-bin.zip

Extract it somewhere such as:
C:\apache-maven

or:
C:\Program Files\Apache\maven

7. Step 3 — Configure Environment Variables
On Windows, configure:
MAVEN_HOME
MAVEN_HOME=C:\apache-maven\apache-maven-3.x.x

Then add Maven's bin directory to Path:
%MAVEN_HOME%\bin

Your Path will contain something similar to:
C:\apache-maven\apache-maven-3.x.x\bin

8. Step 4 — Verify Maven
Open a new Command Prompt.
Run:
mvn -version

You should see something similar to:
Apache Maven 3.x.x

Maven home: C:\apache-maven\apache-maven-3.x.x

Java version: 21.x.x

Java home: C:\Program Files\Java\jdk-21

OS name: Windows

Now Maven is ready.
9. Maven Project Structure
A standard Maven project looks like this:
my-maven-project
│
├── pom.xml
│
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               └── App.java
    │
    └── test
        └── java
            └── com
                └── example
                    └── AppTest.java


Creating sample project using maven with help of command prompt 

open the command prompt 
mvn archetype:generate
hit enter key 
hit enter key 
groupId : SampleGroupName
artifactId : projectName 
version : 1.0
package : com 

Y 

move inside a project 
mvn clean 
mvn compile 
mvn test 
mvn package 
mvn install 



The important directories are:
src/main/java

Production Java code.
src/test/java

Test code.
target

Generated build output.
And:
pom.xml

Maven's most important configuration file.
10. What is pom.xml?
POM means:
Project Object Model

pom.xml contains information about the Maven project.
For example:
<project>

    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>

    <artifactId>employee-app</artifactId>

    <version>1.0-SNAPSHOT</version>

</project>

Three important elements are:
<groupId>com.example</groupId>
<artifactId>employee-app</artifactId>
<version>1.0-SNAPSHOT</version>

Together they identify the project.
11. Understanding GroupId, ArtifactId and Version
groupId
Usually represents the organization/company/package namespace.
<groupId>com.example</groupId>

For a company:
<groupId>com.deutschebank</groupId>

artifactId
The name of the application/library.
<artifactId>employee-management</artifactId>

version
The version of the project.
<version>1.0-SNAPSHOT</version>

So:
com.example
     +
employee-management
     +
1.0-SNAPSHOT

uniquely identifies the Maven artifact.
12. Simple Maven Example
Let's create a very simple Java application.
Project
hello-maven
│
├── pom.xml
│
└── src
    └── main
        └── java
            └── com
                └── example
                    └── App.java

App.java
package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println("Hello Maven!");

    }
}

13. Simple pom.xml
Create:
pom.xml

with:
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="
         http://maven.apache.org/POM/4.0.0
         https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>

    <artifactId>hello-maven</artifactId>

    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
    </properties>

</project>

14. Run Maven
Open the terminal inside:
hello-maven

Run:
mvn compile

Maven will compile the Java source.
You will see:
BUILD SUCCESS

Maven creates:
target

Directory:
hello-maven
│
├── pom.xml
├── src
│
└── target
    └── classes
        └── com
            └── example
                └── App.class

15. What is a Maven Goal?
This is an important Maven concept.
A goal is a specific task that Maven can execute.
For example:
mvn compile

Here:
compile

is a Maven goal.
Other examples:

mvn test

mvn package

mvn clean

mvn install

mvn validate

16. Common Maven Goals

| Goal | Purpose |
|---|---|
| `validate` | Validate project configuration |
| `compile` | Compile source code |
| `test` | Run unit tests |
| `package` | Create JAR/WAR |
| `verify` | Verify package/build |
| `install` | Install artifact into local repository |
| `clean` | Delete `target` directory |

JDBC — Java Database Connectivity

1. What is JDBC?
JDBC (Java Database Connectivity) is a Java API used to connect 
Java applications with databases and perform database operations.
In simple words:
JDBC allows a Java program to communicate with a database such as 
MySQL, Oracle, PostgreSQL, SQL Server, etc.

For example, a Java application can use JDBC to:
- Connect to a database
- Insert records
- Retrieve records
- Update records
- Delete records
- Execute SQL queries
- Execute stored procedures
- Manage transactions

Simple architecture

Java Application
       |
       v
     JDBC API
       |
       v
   JDBC Driver : it is a software help to connect the database. 
       |
       v
    Database

For example:
Java Application
       |
       v
JDBC API
       |
       v
MySQL JDBC Driver
       |
       v
     MySQL

2. Why do we need JDBC?
Suppose we have an Employee Management application.
The Java application needs to execute:
SELECT * FROM employee;

Java itself does not understand how to communicate directly with MySQL.
JDBC provides the standard API, while the JDBC driver knows how to communicate with the specific database.
Java
  |
  | JDBC API
  v
JDBC Driver
  |
  | Database-specific communication
  v
MySQL

3. JDBC Components
The important JDBC components are:

DriverManager
Connection
Statement
PreparedStatement
CallableStatement
ResultSet
SQLException


Connection
Represents a connection between Java and the database.
Connection connection;

Statement
Used to execute SQL statements.
Statement statement;

PreparedStatement
Used for parameterized SQL queries.
PreparedStatement preparedStatement;

ResultSet
Stores the result returned by a SELECT query.
ResultSet resultSet;

4. Types of JDBC Drivers

There are 4 types of JDBC drivers.
Type 1  : from java 8 onward type 1 driver removed. 
Type 2
Type 3
Type 4

Type 1 — JDBC-ODBC Bridge Driver
Architecture:
Java Application
       |
       v
    JDBC API
       |
       v
JDBC-ODBC Driver
       |
       v
      ODBC
       |
       v
   Database

The JDBC request is converted into ODBC calls.
Advantages
- Easy to understand
- Useful historically for simple applications
Disadvantages
- Requires ODBC
- Platform dependent
- Slow compared with newer drivers
Current status
Obsolete / removed from modern Java environments.
You generally do not use Type 1 today.

5. Type 2 — Native-API Driver
Architecture:
Java Application
       |
       v
    JDBC API
       |
       v
Type 2 Driver
       |
       v
Native Database API
       |
       v
    Database

The driver converts JDBC calls into database-specific native API calls.
Advantages
- Better performance than Type 1
- Uses native database libraries
Disadvantages
- Requires native libraries
- Platform dependent
Example conceptually:
Java
 ↓
JDBC
 ↓
Oracle Native API
 ↓
Oracle Database

6. Type 3 — Network Protocol Driver
Architecture:
Java Application
       |
       v
    JDBC API
       |
       v
 Type 3 Driver
       |
       v
 Middleware Server
       |
       v
   Database

The JDBC driver communicates with a middleware server.
The middleware communicates with the database.
Advantages
- No database-specific native library on the client
- Can support multiple databases
Disadvantages
- Requires middleware
- More complex architecture
7. Type 4 — Thin Driver
This is the most commonly used type today.
Architecture:
Java Application
       |
       v
    JDBC API
       |
       v
Type 4 JDBC Driver
       |
       v
    Database

The driver communicates directly with the database using the database's network protocol.
Examples:

MySQL Connector/J
PostgreSQL JDBC Driver
Oracle JDBC Driver
Microsoft SQL Server JDBC Driver

Advantages
- Pure Java
- Platform independent
- No native library required
- Good performance
- Easy to deploy
Therefore:
Modern Java applications generally use Type 4 JDBC drivers.

Simple JDBC Example
Let's use MySQL.
Suppose we have this table:
CREATE DATABASE company;

USE company;

CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    salary DOUBLE
);

Insert some data:
INSERT INTO employee
VALUES
(101, 'Akash', 75000),
(102, 'Rahul', 65000),
(103, 'Priya', 80000);

10. Add MySQL JDBC Driver
If using Maven, add the MySQL Connector/J dependency.
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>9.4.0</version>
</dependency>

The exact driver version should match the version appropriate for your project.
11. Simple JDBC SELECT Program
import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "root";

        try {

            // 1. Create connection
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Database connected!");

            // 2. Create statement
            Statement statement =
                    connection.createStatement();

            // 3. Execute SQL query
            String sql = "SELECT * FROM employee";

            ResultSet resultSet =
                    statement.executeQuery(sql);

            // 4. Process result
            while (resultSet.next()) {

                int id = resultSet.getInt("id");

                String name =
                        resultSet.getString("name");

                double salary =
                        resultSet.getDouble("salary");

                System.out.println(
                        id + " " + name + " " + salary
                );
            }

            // 5. Close connection
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}

12. How this program works
The complete flow is:
DriverManager
      |
      v
getConnection()
      |
      v
Connection
      |
      v
createStatement()
      |
      v
Statement
      |
      v
executeQuery()
      |
      v
ResultSet
      |
      v
Read database records

13. Understanding Each Line
Step 1 — Database URL
String url =
    "jdbc:mysql://localhost:3306/company";

Break it down:
jdbc:mysql://localhost:3306/company
  │     │        │       │      │
  │     │        │       │      └── Database
  │     │        │       └───────── Port
  │     │        └───────────────── Host
  │     └────────────────────────── Database type
  └──────────────────────────────── JDBC

So:
jdbc:mysql://localhost:3306/company

means:
Connect to the MySQL database named company running on localhost at port 3306.

14. Step 2 — Create Connection
Connection connection =
    DriverManager.getConnection(
        url,
        username,
        password
    );

This establishes the connection:
Java
 ↓
DriverManager
 ↓
MySQL JDBC Driver
 ↓
MySQL Database

15. Step 3 — Create Statement
Statement statement =
    connection.createStatement();

The Statement object allows us to send SQL commands to the database.
16. Step 4 — Execute Query
String sql = "SELECT * FROM employee";

ResultSet resultSet =
    statement.executeQuery(sql);

The database returns the records.
For example:
101  Akash  75000
102  Rahul  65000
103  Priya  80000

17. Step 5 — Read ResultSet
while (resultSet.next()) {

    int id = resultSet.getInt("id");

    String name =
        resultSet.getString("name");

    double salary =
        resultSet.getDouble("salary");
}

Think of ResultSet as a cursor:
ResultSet

        id     name      salary
       -------------------------
 →     101    Akash      75000
       102    Rahul      65000
       103    Priya      80000

resultSet.next() moves the cursor to the next row.
18. JDBC INSERT Example
For inserting data:
String sql =
    "INSERT INTO employee VALUES (104, 'John', 70000)";

int rows =
    statement.executeUpdate(sql);

System.out.println(
    rows + " row inserted"
);

For INSERT, UPDATE, and DELETE, we generally use:
executeUpdate()

19. executeQuery() vs executeUpdate()
This is very important.
SELECT
executeQuery()

Example:
ResultSet rs =
    statement.executeQuery(
        "SELECT * FROM employee"
    );

INSERT / UPDATE / DELETE
executeUpdate()

Example:
int rows =
    statement.executeUpdate(
        "DELETE FROM employee WHERE id = 104"
    );

Summary
SQL	JDBC Method
SELECT	executeQuery()
INSERT	executeUpdate()
UPDATE	executeUpdate()
DELETE	executeUpdate()


20. Why PreparedStatement?
Suppose we want to search employee by ID.
Instead of:
String sql =
    "SELECT * FROM employee WHERE id = " + id;

we should use:
String sql =
    "SELECT * FROM employee WHERE id = ?";

Then:
PreparedStatement ps =
    connection.prepareStatement(sql);

ps.setInt(1, 101);

ResultSet rs =
    ps.executeQuery();

This is called a parameterized query.
It is preferred because it helps prevent SQL injection and handles values more safely.
21. Complete PreparedStatement Example
import java.sql.*;

public class EmployeeSearch {

    public static void main(String[] args) {

        String url =
            "jdbc:mysql://localhost:3306/company";

        String username = "root";
        String password = "root";

        int employeeId = 101;

        String sql =
            "SELECT * FROM employee WHERE id = ?";

        try (
            Connection connection =
                DriverManager.getConnection(
                    url,
                    username,
                    password
                );

            PreparedStatement ps =
                connection.prepareStatement(sql)
        ) {

            ps.setInt(1, employeeId);

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {

                    System.out.println(
                        "ID: " +
                        rs.getInt("id")
                    );

                    System.out.println(
                        "Name: " +
                        rs.getString("name")
                    );

                    System.out.println(
                        "Salary: " +
                        rs.getDouble("salary")
                    );
                }
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}

Here we are using try-with-resources, so JDBC resources are automatically closed.


