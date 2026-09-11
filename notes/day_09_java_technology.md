Java

Definition:
Java is a high-level, object-oriented, platform-independent 
programming language developed by Sun Microsystems. Now is a part of oracle. 
It is widely used for backend applications, web applications, 
enterprise software, Android development, and distributed systems.

Why use Java?

Object-Oriented — supports class, object, inheritance, polymorphism, etc.
Platform Independent — Java code runs on any system having a JVM.
Secure — provides features such as bytecode verification and managed memory.
Robust — strong type checking and exception handling.
Multithreaded — supports executing multiple tasks simultaneously.
Large ecosystem — Spring Boot, Hibernate, Maven, Gradle, etc.
Java execution flow

Java Source Code
       ↓
     javac  Demo.java 
       ↓
Bytecode (.class)
       ↓
      JVM
       ↓
Operating System

The key idea is:

Write Once, Run Anywhere

                                        Java 

            J2SE                        J2EE                        J2ME
            JSE                         JEE                         JME
            Java Standard Edition       Java Enterprise Edition     Java Micro Edition 
            Core Java 

            standalone or               web application             device application 
            desktop application 
            Basic Java 
            OOPs concept 
            exception handling 
            overview of multithreading 
            collection framework 
            jdbc 


Important Java concepts

| Concept            | Meaning                            |
| ------------------ | ---------------------------------- |
| Variable           | Stores data                        |
| Data Types         | Define type of data                |
| Operator           | Performs operations                |
| `if/else`          | Decision making                    |
| Loop               | Repeats code                       |
| Method             | Reusable block of code             |
| Class              | Blueprint for objects              |
| Object             | Instance of a class                |
| Constructor        | Initializes an object              |
| Inheritance        | Reuses parent class features       |
| Polymorphism       | Same operation, different behavior |
| Encapsulation      | Protects/controls data             |
| Abstraction        | Hides implementation details       |
| Interface          | Defines a contract                 |
| Exception Handling | Handles runtime errors             |
| Collections        | Stores/manages groups of objects   |
| Generics           | Provides type safety               |
| Stream API         | Processes collections              |
| Multithreading     | Executes tasks concurrently        |


Java Data Types

Data types specify what type of value a variable can store.

Java data types are mainly divided into:

Data Types
    │
    ├── Primitive
    │
    └── Non-Primitive / Reference

Primitive Data Types

Java has 8 primitive data types.
| Type      |          Size | Example                          | Use                   |
| --------- | ------------: | -------------------------------- | --------------------- |
| `byte`    |         8-bit | `byte age = 20;`                 | Small integers        |
| `short`   |        16-bit | `short year = 2026;`             | Small/medium integers |
| `int`     |        32-bit | `int salary = 60000;`            | Common integer values |
| `long`    |        64-bit | `long population = 1400000000L;` | Large integers        |
| `float`   |        32-bit | `float price = 99.5f;`           | Decimal values        |
| `double`  |        64-bit | `double salary = 60000.50;`      | More precise decimals |
| `char`    |        16-bit | `char grade = 'A';`              | Single character      |
| `boolean` | JVM-dependent | `boolean passed = true;`         | `true` / `false`      |


Non-Primitive / Reference Types

These types refer to objects rather than storing the primitive value directly.

Common examples:

String
Arrays
Classes
Interfaces
Enums
Objects

Primitive vs Reference

| Primitive                | Reference              |
| ------------------------ | ---------------------- |
| Stores a basic value     | Refers to an object    |
| 8 types                  | Many types             |
| `int`, `double`, `char`  | `String`, Array, Class |
| Generally simpler/faster | Used for complex data  |


Java Operators – High-Level Notes

Operator is a symbol used to perform an operation on values or variables.

Operators
   │
   ├── Arithmetic
   ├── Assignment
   ├── Relational / Comparison
   ├── Logical
   ├── Unary

Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning        | Example |
| -------- | -------------- | ------- |
| `+`      | Addition       | `a + b` |
| `-`      | Subtraction    | `a - b` |
| `*`      | Multiplication | `a * b` |
| `/`      | Division       | `a / b` |
| `%`      | Remainder      | `a % b` |

Assignment Operators

Used to assign or update values.
| Operator | Example  | Equivalent  |
| -------- | -------- | ----------- |
| `=`      | `a = 10` | Assign      |
| `+=`     | `a += 5` | `a = a + 5` |
| `-=`     | `a -= 5` | `a = a - 5` |
| `*=`     | `a *= 5` | `a = a * 5` |
| `/=`     | `a /= 5` | `a = a / 5` |
| `%=`     | `a %= 5` | `a = a % 5` |


Relational / Comparison Operators

Used to compare two values. The result is true or false.
| Operator | Meaning               |
| -------- | --------------------- |
| `==`     | Equal                 |
| `!=`     | Not equal             |
| `>`      | Greater than          |
| `<`      | Less than             |
| `>=`     | Greater than or equal |
| `<=`     | Less than or equal    |

Logical Operators

Used to combine multiple conditions.
| Operator | Meaning |   |    |
| -------- | ------- | - | -- |
| `&&`     | AND     |   |    |
| `        |         | ` | OR |
| `!`      | NOT     |   |    |

Java if Statement and switch Statement

Both if and switch are used for decision making in Java.

Decision Making
      │
      ├── if
      ├── if-else
      ├── else-if
      └── switch

if vs switch

| `if`                              | `switch`                         |   |               |
| --------------------------------- | -------------------------------- | - | ------------- |
| Used for conditions               | Used for fixed choices           |   |               |
| Supports complex conditions       | Best for matching values         |   |               |
| Supports `>`, `<`, `>=`, `&&`, `  |                                  | ` | Matches cases |
| Good for ranges                   | Good for menu/options            |   |               |
| Can evaluate multiple expressions | Usually evaluates one expression |   |               |


Java Looping Statements

A loop is used to execute the same block of code repeatedly until a condition becomes false.

Why use loops?

Instead of writing:

System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);

Types of Loops
Loops
 │
 ├── for
 ├── while
 ├── do-while
 └── enhanced for / for-each    : generally we use with array or collection framework 

Loop Comparison

| Loop       | Best Use                   |
| ---------- | -------------------------- |
| `for`      | Known number of iterations |
| `while`    | Condition-based repetition |
| `do-while` | Must execute at least once |
| `for-each` | Arrays and collections     |


Java Array
Definition

An array is a collection of multiple values of the 
same data type stored under one variable name.

Instead of:

int mark1 = 80;
int mark2 = 75;
int mark3 = 90;

we can use:

int a;
int abc[];
                int []abc;
int[] abc;
int [] abc;

int abc[10];            error in java. 


int[] marks = {80, 75, 90};

Key Features
Stores multiple values.
Normally contains values of the same type.
Array size is fixed after creation.

Index starts from 0.
Uses length to get the size.
Creating an Array
Direct Initialization
int[] marks = {80, 75, 90, 85};

Index:

Value:    80   75   90   85
Index:     0    1    2    3

Access values:

System.out.println(marks[0]); // 80
System.out.println(marks[2]); // 90
Creating with Size

dataType[] arrayName = new DataType[size];

int[] marks = new int[5];

Assign values:

marks[0] = 80;
marks[1] = 75;
marks[2] = 90;
marks[3] = 85;
marks[4] = 70;
Array Length
int[] marks = {80, 75, 90, 85};

System.out.println(marks.length);

Output:

4
Loop Through Array
Normal for Loop
int[] marks = {80, 75, 90, 85};

for (int i = 0; i < marks.length; i++) {

    System.out.println(marks[i]);
}
Enhanced for Loop
for (int mark : marks) {

    System.out.println(mark);
}

String Array

Arrays can also store strings.

String[] students = {
    "Rahul",
    "Priya",
    "Amit",
    "Sneha"
};

for (String student : students) {

    System.out.println(student);
}

Java Scanner Class

Definition

Scanner is a Java class used to read input from the user, 
usually from the keyboard.

It belongs to:

java.util

So we need to import it:

import java.util.Scanner;
Basic Flow
User
  ↓
Keyboard Input
  ↓
Scanner
  ↓
Java Program
  ↓
Process Data
  ↓
Output
Basic Example
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();
    }
}

If the user enters:

Rahul

Output:

Hello Rahul

| Method          | Used For      | Example                 |
| --------------- | ------------- | ----------------------- |
| `nextInt()`     | Integer       | `scanner.nextInt()`     |
| `nextDouble()`  | Decimal       | `scanner.nextDouble()`  |
| `nextFloat()`   | Float         | `scanner.nextFloat()`   |
| `nextLong()`    | Long          | `scanner.nextLong()`    |
| `next()`        | One word      | `scanner.next()`        |
| `nextLine()`    | Complete line | `scanner.nextLine()`    |
| `nextBoolean()` | Boolean       | `scanner.nextBoolean()` |




Java Class and Object
Object : object is a any real world entity 
        property or state----> have--> variables / fields   
Person 
        behaviour ----> do/does ---> functions / methods 

Bank 
Customer 
Order 
Product 
Account 

Class

A class is a blueprint or template used to create objects.

It defines:

Properties → data/state
Methods → behavior
Example
class Employee {

    int id;
    String name;
    double salary;

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

Here:

Employee
   ↓
Class
   ↓
Properties
   ├── id
   ├── name
   └── salary
       
Methods
   └── display()
Object

An object is a real instance of a class.

We create an object using the new keyword.

Employee emp1 = new Employee();

Here:

Employee → Class
emp1     → Reference variable
new Employee() → Object

We can assign values:

emp1.id = 101;
emp1.name = "Rahul";
emp1.salary = 60000;

emp1.display();

Output:

ID: 101
Name: Rahul
Salary: 60000.0
Multiple Objects

One class can create multiple objects.

Employee emp1 = new Employee();

emp1.id = 101;
emp1.name = "Rahul";
emp1.salary = 60000;


Employee emp2 = new Employee();

emp2.id = 102;
emp2.name = "Priya";
emp2.salary = 70000;

Both objects use the same class structure but contain different data.

             Employee Class
                  |
          ┌───────┴────────┐
          ↓                ↓
       emp1              emp2
          ↓                ↓
    ID: 101           ID: 102
    Rahul             Priya
    60000             70000
Complete Working Example

class Employee {

    int id;
    String name;
    String department;
    double salary;


    void displayEmployee() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}


public class EmployeeDemo {

    public static void main(String[] args) {

        // Object 1
        Employee emp1 = new Employee();

        emp1.id = 101;
        emp1.name = "Rahul";
        emp1.department = "IT";
        emp1.salary = 60000;


        // Object 2
        Employee emp2 = new Employee();

        emp2.id = 102;
        emp2.name = "Priya";
        emp2.department = "HR";
        emp2.salary = 55000;


        // Display
        emp1.displayEmployee();

        System.out.println("----------------");

        emp2.displayEmployee();
    }
}

Output:

ID: 101
Name: Rahul
Department: IT
Salary: ₹60000.0
----------------
ID: 102
Name: Priya
Department: HR
Salary: ₹55000.0

| Class                                  | Object                       |
| -------------------------------------- | ---------------------------- |
| Blueprint/template                     | Instance of a class          |
| Defines properties and methods         | Contains actual values       |
| Does not represent one specific entity | Represents a specific entity |
| `class Employee`                       | `new Employee()`             |
| One class can create many objects      | Each object has its own data |


Java Constructor
Definition

A constructor is a special block in a class that is used to initialize an object when it is created.

Key Points
Constructor name must be same as the class name.
It has no return type, not even void.
It is automatically called when we use new.
It is mainly used to initialize object properties.
A class can have multiple constructors using constructor overloading.

Basic Example
class Employee {

    int id;
    String name;

    Employee(int id, String name) {

        this.id = id;
        this.name = name;
    }

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

Creating an object:

Employee emp =
    new Employee(101, "Rahul");

emp.display();

Output:

ID: 101
Name: Rahul
How it works
new Employee(101, "Rahul")
             ↓
       Constructor called
             ↓
     id = 101
     name = Rahul
             ↓
        Object ready
Why this?

this refers to the current object.

Employee(int id, String name) {

    this.id = id;
    this.name = name;
}

Here:

this.id     → object's property
id          → constructor parameter

this.name   → object's property
name        → constructor parameter
Default Constructor

If you don't create any constructor, Java provides a default constructor automatically.

class Student {

    int id;
    String name;
}

We can create:

Student student = new Student();

But if you create your own constructor, Java does not automatically provide the no-argument constructor.

No-Argument Constructor

You can explicitly create one:

class Student {

    int id;
    String name;

    Student() {

        id = 0;
        name = "Unknown";
    }
}

Usage:

Student student = new Student();

System.out.println(student.name);

Output:

Unknown
Parameterized Constructor

A constructor that accepts parameters is called a parameterized constructor.

class Student {

    int id;
    String name;
    String course;

    Student(
        int id,
        String name,
        String course
    ) {

        this.id = id;
        this.name = name;
        this.course = course;
    }
}

Usage:

Student student =
    new Student(
        101,
        "Rahul",
        "Java"
    );

Constructor vs Method

| Constructor                        | Method                           |
| ---------------------------------- | -------------------------------- |
| Initializes object                 | Performs an operation            |
| Same name as class                 | Can have any valid name          |
| No return type                     | Can have a return type           |
| Called automatically with `new`    | Called explicitly                |
| Mainly used during object creation | Used throughout object lifecycle |


Java Encapsulation

Definition

Encapsulation means wrapping data and methods together inside a 
class and controlling access to that data.

In simple terms:

Keep data private and provide controlled access through methods.

Real-world example

In a Bank Account, the balance should not be directly modified by anyone.

Instead of:

account.balance = -50000;

we control it through methods such as:

account.deposit(5000);
account.withdraw(2000);
How Encapsulation Works

Usually, we use:

private → hide/protect data
public methods → provide controlled access
Getter → read data
Setter → update data
        BankAccount
       ┌─────────────┐
       │ private     │
       │ balance     │
       └──────┬──────┘
              │
       Controlled access
              ↓
       getBalance()
       deposit()
       withdraw()
Simple Example

class Employee {

    private int id;
    private String name;
    private double salary;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setSalary(double salary) {

        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }
}
Using the class
public class EmployeeDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setId(101);
        employee.setName("Rahul");
        employee.setSalary(60000);

        System.out.println(
            "ID: " + employee.getId()
        );

        System.out.println(
            "Name: " + employee.getName()
        );

        System.out.println(
            "Salary: " + employee.getSalary()
        );
    }
}

Output:

ID: 101
Name: Rahul
Salary: 60000.0
Why private?

Because this is not allowed:

employee.salary = -50000;

salary is private, so it can only be accessed inside the Employee class.

Instead:

employee.setSalary(-50000);

The setter can validate the value:

public void setSalary(double salary) {

    if (salary > 0) {
        this.salary = salary;
    }
}

Therefore, invalid data is prevented.

Meaningful Example – Bank Account
class BankAccount {

    private double balance;


    public BankAccount(double balance) {

        this.balance = balance;
    }


    public void deposit(double amount) {

        if (amount > 0) {

            balance = balance + amount;

            System.out.println(
                "Amount deposited successfully"
            );
        }
    }


    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance = balance - amount;

            System.out.println(
                "Amount withdrawn successfully"
            );
        }
        else {

            System.out.println(
                "Invalid withdrawal"
            );
        }
    }


    public double getBalance() {

        return balance;
    }
}

Usage:

public class BankDemo {

    public static void main(String[] args) {

        BankAccount account =
            new BankAccount(10000);

        account.deposit(5000);

        account.withdraw(3000);

        System.out.println(
            "Current Balance: ₹"
            + account.getBalance()
        );
    }
}

Output:

Amount deposited successfully
Amount withdrawn successfully
Current Balance: ₹12000.0

Encapsulation Benefits

| Benefit               | Meaning                              |
| --------------------- | ------------------------------------ |
| **Data protection**   | Prevents direct modification         |
| **Validation**        | Allows checking data before updating |
| **Controlled access** | Access through methods               |
| **Maintainability**   | Internal implementation can change   |
| **Security**          | Important data can be hidden         |


Java Inheritance
Definition

Inheritance is an OOP concept where one class acquires 
properties and methods of another class.

Types of inheritance 
1. single inheritance : one super class and one sub class 
class A {}
class B extends A {}
2. multi level inheritance : one super class and n number of sub class connected one by one 
class A {}
class B extends A{}
class C extends B {}
class D extends C{}
3. hierarchical inheritance : one super class and n number of class class connected 
directly to super class. 
class A {}
class B extends A{}
class C extends A{}
4. multiple level inheritance : more than one super class and one sub class.
class A {}
class B {}
class C extends A,B {}      : wrong in java. 
this type of inheritance we can achieve using interface. 

OOps relationship 
is a 
has a 

class Employee{
        id,name,salary
        Address add = new Address();
}
class Manager extends Employee{
    numberOfEmp
}
class ProjectManager extends Manager{
        clientInfo;
}
class Developer extends Employee{
    projectName;
}
class Address{
    city and state 
}



It helps with code reuse and represents an "is-a" relationship.

Real-world example
Employee
   ↑
   |
Developer

A Developer is an Employee, so the Developer class can inherit common employee functionality.

Basic Syntax
class Parent {

    // properties
    // methods
}


class Child extends Parent {

    // additional properties
    // additional methods
}

Java uses the extends keyword for class inheritance.

Simple Example
class Employee {

    String name;

    void work() {

        System.out.println(
            name + " is working"
        );
    }
}


class Developer extends Employee {

    void writeCode() {

        System.out.println(
            name + " is writing code"
        );
    }
}

Create an object:

public class InheritanceDemo {

    public static void main(String[] args) {

        Developer developer =
            new Developer();

        developer.name = "Rahul";

        developer.work();

        developer.writeCode();
    }
}

Output:

Rahul is working
Rahul is writing code

Here Developer gets the name property and work() method from Employee.

Parent and Child Class
Employee
   │
   │ extends
   ↓
Developer
Employee → Parent / Superclass
Developer → Child / Subclass
Meaningful Example – Employee Management
class Employee {

    int id;
    String name;
    double salary;


    void displayEmployee() {

        System.out.println(
            "ID: " + id
        );

        System.out.println(
            "Name: " + name
        );

        System.out.println(
            "Salary: ₹" + salary
        );
    }
}


class Developer extends Employee {

    String programmingLanguage;


    void writeCode() {

        System.out.println(
            name + " is developing using "
            + programmingLanguage
        );
    }
}


public class EmployeeDemo {

    public static void main(String[] args) {

        Developer developer =
            new Developer();

        developer.id = 101;
        developer.name = "Rahul";
        developer.salary = 60000;
        developer.programmingLanguage = "Java";

        developer.displayEmployee();

        developer.writeCode();
    }
}

Output:

ID: 101
Name: Rahul
Salary: ₹60000.0
Rahul is developing using Java

The Developer class has its own property and method, 
but it also reuses the properties and method of Employee.

super Keyword

super is used to access the parent class members.

Example
class Employee {

    String name;

    Employee(String name) {

        this.name = name;
    }
}


class Developer extends Employee {

    String language;

    Developer(
        String name,
        String language
    ) {

        super(name);

        this.language = language;
    }

    void display() {

        System.out.println(
            "Name: " + name
        );

        System.out.println(
            "Language: " + language
        );
    }
}

Usage:

Developer developer =
    new Developer(
        "Rahul",
        "Java"
    );

developer.display();

Output:

Name: Rahul
Language: Java

Here:

super(name);

calls the parent class constructor.

Types of Inheritance in Java
Single Inheritance

One parent → one child.

Employee
   ↓
Developer

Supported using:

class Developer extends Employee
Multilevel Inheritance

Multiple levels of inheritance.

Employee
   ↓
Developer
   ↓
SeniorDeveloper

Example:

class Employee {
}

class Developer extends Employee {
}

class SeniorDeveloper extends Developer {
}
Hierarchical Inheritance

One parent → multiple children.

       Employee
       /      \
      ↓        ↓
 Developer    Tester
class Employee {
}

class Developer extends Employee {
}

class Tester extends Employee {
}
Multiple Inheritance

One class inheriting from multiple classes:

Employee     Person
    \         /
     \       /
      Developer

Java does not support multiple inheritance through classes.

Instead, Java can achieve this type of behavior using interfaces.

| Inheritance               | Encapsulation                   |
| ------------------------- | ------------------------------- |
| Reuses code               | Protects data                   |
| Parent-child relationship | Data hiding                     |
| Uses `extends`            | Uses `private`, getters/setters |
| Focuses on reuse          | Focuses on controlled access    |


Java Polymorphism

Definition

Polymorphism means "one name, multiple forms."

In Java, the same method name can behave differently depending on the situation.

Polymorphism
     │
     ├── Compile-time
     │      ↓
     │   Method Overloading
     │
     └── Runtime
            ↓
       Method Overriding

Method Overloading – Compile-Time Polymorphism

Method overloading means having multiple methods with the same name 
but different parameters in the same class.

Example
class Calculator {

    int add(int a, int b) {

        return a + b;
    }

    int add(int a, int b, int c) {

        return a + b + c;
    }

    double add(double a, double b) {

        return a + b;
    }
}

Usage:

public class Demo {

    public static void main(String[] args) {

        Calculator calculator =
            new Calculator();

        System.out.println(
            calculator.add(10, 20)
        );

        System.out.println(
            calculator.add(10, 20, 30)
        );

        System.out.println(
            calculator.add(10.5, 20.5)
        );
    }
}

Output:

30
60
31.0
Important

The method name is the same:

add()
add()
add()

But the parameters are different:

add(int, int)
add(int, int, int)
add(double, double)

Java determines which method to call during compilation.

Method Overriding – Runtime Polymorphism

Method overriding occurs when a child class 
provides its own implementation of a method already defined in the parent class.

Example
class Employee {

    void work() {

        System.out.println(
            "Employee is working"
        );
    }
}


class Developer extends Employee {

    @Override
    void work() {

        System.out.println(
            "Developer is writing code"
        );
    }
}


class Tester extends Employee {

    @Override
    void work() {

        System.out.println(
            "Tester is testing software"
        );
    }
}

Now:

public class Demo {

    public static void main(String[] args) {
        // creating same class object and assign to same class reference. 
        Employee emp = new Employee();
        
        // creating sub class object and assign to super class reference. 
        // possible 
        // Run time polymorphism 
        Employee emp1 = new Developer();    // override method or super class method. 
        Developer dev1 = new Developer();   // only its own method 

        Employee emp2 = new Tester();

        emp1.work();

        emp2.work();
    }
}

Output:

Developer is writing code
Tester is testing software

Notice:

Employee emp1 = new Developer();
Employee emp2 = new Tester();

The reference type is Employee, but the actual objects are different.

Therefore, Java decides at runtime which work() implementation should execute.

Meaningful Example – Payment System

This is a common real-world use of runtime polymorphism.

class Payment {

    void pay(double amount) {

        System.out.println(
            "Processing payment: ₹" + amount
        );
    }
}


class CardPayment extends Payment {

    @Override
    void pay(double amount) {

        System.out.println(
            "Paid ₹" + amount
            + " using Card"
        );
    }
}


class UpiPayment extends Payment {

    @Override
    void pay(double amount) {

        System.out.println(
            "Paid ₹" + amount
            + " using UPI"
        );
    }
}


class CashPayment extends Payment {

    @Override
    void pay(double amount) {

        System.out.println(
            "Paid ₹" + amount
            + " using Cash"
        );
    }
}
Using Polymorphism
public class PaymentDemo {

    public static void main(String[] args) {

        Payment payment;


        payment = new CardPayment();

        payment.pay(500);


        payment = new UpiPayment();

        payment.pay(1000);


        payment = new CashPayment();

        payment.pay(300);
    }
}

Output:

Paid ₹500.0 using Card
Paid ₹1000.0 using UPI
Paid ₹300.0 using Cash

The same:

payment.pay()

produces different behavior.

                 Payment
                    │
                 pay()
                    │
        ┌───────────┼───────────┐
        ↓           ↓           ↓
      Card          UPI        Cash
        ↓           ↓           ↓
    Card Pay     UPI Pay    Cash Pay

Overloading vs Overriding

| Overloading               | Overriding              |
| ------------------------- | ----------------------- |
| Compile-time polymorphism | Runtime polymorphism    |
| Same class normally       | Parent-child classes    |
| Same method name          | Same method signature   |
| Parameters must differ    | Parameters must be same |
| No inheritance required   | Requires inheritance    |
| Example: `add()`          | Example: `pay()`        |


Java abstract, final and static Keywords

These are important Java keywords used to control classes, methods, and variables.

abstract Keyword

Definition:
abstract is used when we want to create a 
partial/ incomplete class or method and force child classes to provide the implementation.

Abstract Class
abstract class Employee {

    abstract void work();

    void login() {
        System.out.println("Employee logged in");
    }
}

Here, work() has no implementation.

A child class must implement it:

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}

Usage:

Employee employee = new Developer();

employee.login();
employee.work();

Output:

Employee logged in
Developer writes code

Important Points
Abstract class cannot be directly instantiated.
Abstract method does not have a body.
Child class must implement abstract methods.
Abstract class can have normal methods and variables.

abstract class
      ↓
Common functionality
      +
Incomplete functionality
      ↓
Child class provides implementation

final Keyword

Definition:
final is used to restrict modification.

It can be used with:

Variable
Method
Class

Final Variable

A final variable cannot be changed after initialization.

final double PI = 3.14159;

// PI = 4.5;  // Error

Example:

class Employee {

    final int employeeId = 101;

}

Once assigned, employeeId cannot be changed.

Final Method

A final method cannot be overridden by a child class.

class Employee {

    final void companyPolicy() {

        System.out.println(
            "Follow company policy"
        );
    }
}

Child class:

class Developer extends Employee {

    // Cannot override companyPolicy()
}

Final Class

A final class cannot be inherited.

final class SecurityManager {

    void checkSecurity() {
        System.out.println("Security checked");
    }
}

This is not allowed:

class AdminSecurity extends SecurityManager {
    // Error
}
Easy Rule
final variable → cannot change

final method   → cannot override

final class    → cannot extend

static Keyword

Definition:
static means the member belongs to the class rather than individual objects.

It is commonly used with:

Variables
Methods
Blocks
Nested classes

Static Variable

A static variable is shared by all objects of the class.

class Employee {

    int id;
    String name;

    static String company = "ABC Technologies";
}

Create objects:

Employee emp1 = new Employee();

emp1.id = 101;
emp1.name = "Rahul";


Employee emp2 = new Employee();

emp2.id = 102;
emp2.name = "Priya";

Both employees share:

Employee.company
Employee Class
      |
      └── static company
             ↓
       ABC Technologies
          ↑       ↑
          |       |
        emp1     emp2
Static Method

A static method belongs to the class and can be called without creating an object.

class Calculator {

    static int add(int a, int b) {

        return a + b;
    }
}

Call it using the class name:

int result =
    Calculator.add(10, 20);

System.out.println(result);

Output:

30
Important Point

A static method cannot directly access a non-static instance variable.

class Employee {

    int salary;

    static void display() {

        // System.out.println(salary);
        // Error
    }
}

Because salary belongs to an object, while display() belongs to the class.

Why is main() Static?

You have already seen:

public static void main(String[] args)

main() is static because Java needs to execute it without creating an object of the class first.

JVM
 ↓
main()
 ↓
Create objects
 ↓
Execute application
Static Block

A static block is executed when the class is loaded.

class Employee {

    static {
        System.out.println(
            "Employee class loaded"
        );
    }
}

It is mainly used for static initialization.

Complete Meaningful Example
abstract class Employee {

    final int employeeId;

    static String company =
        "ABC Technologies";


    Employee(int employeeId) {

        this.employeeId = employeeId;
    }


    abstract void work();


    final void companyPolicy() {

        System.out.println(
            "Employee must follow company policy"
        );
    }


    static void companyDetails() {

        System.out.println(
            "Company: " + company
        );
    }
}


class Developer extends Employee {

    Developer(int employeeId) {

        super(employeeId);
    }


    @Override
    void work() {

        System.out.println(
            "Developer writes Java code"
        );
    }
}


public class KeywordDemo {

    public static void main(String[] args) {

        Developer developer =
            new Developer(101);

        System.out.println(
            "Employee ID: "
            + developer.employeeId
        );

        developer.work();

        developer.companyPolicy();

        Employee.companyDetails();
    }
}

Output:

Employee ID: 101
Developer writes Java code
Employee must follow company policy
Company: ABC Technologies
Concepts used
abstract
   ↓
Employee is an abstract class
work() is abstract


final
   ↓
employeeId cannot be changed
companyPolicy() cannot be overridden


static
   ↓
company belongs to the class
companyDetails() can be called without object

Quick Comparison

| Keyword    | Main Purpose                       | Example                   |
| ---------- | ---------------------------------- | ------------------------- |
| `abstract` | Define incomplete/common structure | `abstract class Employee` |
| `final`    | Restrict modification/inheritance  | `final int id`            |
| `static`   | Share member at class level        | `static String company`   |


Easy way to remember
abstract → "Child must provide implementation"

final    → "Cannot be changed"

static   → "Belongs to the class"

Java Interface
Definition

An interface is a contract that defines what a class must do, without necessarily defining how it should do it.

It is mainly used for abstraction, loose coupling, and multiple implementations.

Interface
   ↓
Defines contract
   ↓
Class implements interface
   ↓
Provides implementation
Basic Syntax
interface Payment {

    void pay();
}

A class implements the interface using implements.

class UpiPayment implements Payment {

    @Override
    public void pay() {

        System.out.println(
            "Payment using UPI"
        );
    }
}
Complete Example
interface Payment {

    void pay(double amount);

    void refund(double amount);
}


class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid ₹" + amount + " using UPI"
        );
    }

    @Override
    public void refund(double amount) {

        System.out.println(
            "Refunded ₹" + amount + " through UPI"
        );
    }
}


class CardPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid ₹" + amount + " using Card"
        );
    }

    @Override
    public void refund(double amount) {

        System.out.println(
            "Refunded ₹" + amount + " through Card"
        );
    }
}


public class PaymentDemo {

    public static void main(String[] args) {

        Payment payment;

        payment = new UpiPayment();

        payment.pay(1000);
        payment.refund(200);


        payment = new CardPayment();

        payment.pay(2000);
        payment.refund(500);
    }
}

Output:

Paid ₹1000.0 using UPI
Refunded ₹200.0 through UPI
Paid ₹2000.0 using Card
Refunded ₹500.0 through Card

Here:

              Payment
             Interface
                 │
        ┌────────┴────────┐
        ↓                 ↓
   UpiPayment        CardPayment
        ↓                 ↓
   pay() / refund()   pay() / refund()

The interface defines:

void pay();
void refund();

But each class provides its own implementation.

Interface with Properties

Interfaces can also contain constants.

interface Bank {

    double INTEREST_RATE = 7.5;

    void calculateInterest();
}

By default, interface fields are effectively:

public static final

So:

INTEREST_RATE = 8.0;

is not allowed.

Multiple Interfaces

One class can implement multiple interfaces.

This is an important difference from class inheritance.

interface Printable {

    void print();
}


interface Scannable {

    void scan();
}


class Printer implements Printable, Scannable {

    @Override
    public void print() {

        System.out.println("Printing document");
    }

    @Override
    public void scan() {

        System.out.println("Scanning document");
    }
}

Usage:

Printer printer = new Printer();

printer.print();
printer.scan();

Output:

Printing document
Scanning document
Structure
Printable ───┐
             ↓
          Printer
             ↑
Scannable ───┘

Interface vs Abstract Class

| Interface                                                          | Abstract Class                         |
| ------------------------------------------------------------------ | -------------------------------------- |
| Defines a contract                                                 | Provides common/partial implementation |
| Uses `interface`                                                   | Uses `abstract class`                  |
| Class uses `implements`                                            | Class uses `extends`                   |
| A class can implement multiple interfaces                          | A class can extend only one class      |
| Good for loose coupling                                            | Good for shared base functionality     |
| Supports abstract methods and can also have default/static methods | Can have abstract and normal methods   |


Real-World Example

Consider an online shopping application.

Different payment methods can follow the same contract:

             Payment
            Interface
                │
      ┌─────────┼─────────┐
      ↓         ↓         ↓
     UPI       Card      NetBanking

All payment classes must provide:

pay()

But the implementation can be different.

This allows the application to work with:

Payment payment;

instead of depending directly on:

UpiPayment
CardPayment

This is called loose coupling and is very important in enterprise applications.

Java 8 Interface

Java 8 introduced important changes to interfaces. Before Java 8, interfaces were mainly used to define abstract methods. Java 8 allows interfaces to contain default methods and static methods with implementation.

Main Features of Java 8 Interface
Interface
   │
   ├── Abstract methods
   ├── Default methods      ← Java 8
   ├── Static methods       ← Java 8
   └── Functional Interface ← Java 8
Abstract Method

An interface can define methods that implementing classes must implement.

interface Payment {

    void pay(double amount);
}

Implementation:

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid ₹" + amount + " using UPI"
        );
    }
}
Default Method

A default method contains an implementation inside the interface.

It was introduced in Java 8 mainly to allow new functionality to be added to existing interfaces without forcing every existing implementation class to implement the new method.

interface Payment {

    void pay(double amount);

    default void receipt() {

        System.out.println(
            "Payment receipt generated"
        );
    }
}

The implementing class automatically gets the receipt() method.

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid ₹" + amount + " using UPI"
        );
    }
}

Usage:

Payment payment = new UpiPayment();

payment.pay(1000);

payment.receipt();

Output:

Paid ₹1000.0 using UPI
Payment receipt generated
Important
abstract method → Child must implement

default method → Child gets implementation automatically
Static Method in Interface

Java 8 also allows static methods with implementation.

interface Payment {

    static void paymentInfo() {

        System.out.println(
            "Payment processing system"
        );
    }
}

A static interface method is called using the interface name.

Payment.paymentInfo();

Output:

Payment processing system

It is not called through an object.

// payment.paymentInfo();  // Not allowed
Functional Interface

A functional interface contains exactly one abstract method.

It can have:

One abstract method
Multiple default methods
Multiple static methods

Example:

@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);
}

We can implement it using a lambda expression, another important Java 8 feature.

Calculator addition =
    (a, b) -> a + b;

System.out.println(
    addition.calculate(10, 20)
);

Output:

30
Meaningful Example – Employee Bonus
@FunctionalInterface
interface BonusCalculator {

    double calculateBonus(double salary);

    default void displayMessage() {

        System.out.println(
            "Bonus calculation completed"
        );
    }

    static void companyPolicy() {

        System.out.println(
            "Employees are eligible for bonus"
        );
    }
}

Using the interface:

public class EmployeeDemo {

    public static void main(String[] args) {

        BonusCalculator bonusCalculator =
            salary -> salary * 0.10;

        double salary = 60000;

        double bonus =
            bonusCalculator.calculateBonus(salary);

        System.out.println(
            "Salary: ₹" + salary
        );

        System.out.println(
            "Bonus: ₹" + bonus
        );

        bonusCalculator.displayMessage();

        BonusCalculator.companyPolicy();
    }
}

Output:

Salary: ₹60000.0
Bonus: ₹6000.0
Bonus calculation completed
Employees are eligible for bonus

| Feature               | Before Java 8                        | Java 8                        |
| --------------------- | ------------------------------------ | ----------------------------- |
| Abstract methods      | ✅                                    | ✅                             |
| Constants             | ✅                                    | ✅                             |
| Default methods       | ❌                                    | ✅                             |
| Static methods        | ❌                                    | ✅                             |
| Functional interfaces | Commonly used with anonymous classes  | ✅ Works naturally with Lambda |
| Lambda expressions    | ❌                                    | ✅                             |


Java Abstraction
Definition

Abstraction means hiding internal implementation details and showing only the required functionality to the user.

Real-world example

When you use an ATM:

User
 ↓
Select Withdraw
 ↓
Enter Amount
 ↓
Get Money

You don't need to know how the bank internally validates the account, checks the balance, or processes the transaction.

That is abstraction.

Abstraction in Java

Java mainly provides abstraction using:

Abstraction
    │
    ├── Abstract Class
    │
    └── Interface
Abstract Class

An abstract class is a class declared using the abstract keyword.

It can contain:

Abstract methods
Normal methods
Variables
Constructors
Example
abstract class Payment {

    abstract void pay(double amount);

    void receipt() {

        System.out.println(
            "Payment receipt generated"
        );
    }
}

The abstract method:

abstract void pay(double amount);

does not have an implementation.

The child class provides the implementation.

class UpiPayment extends Payment {

    @Override
    void pay(double amount) {

        System.out.println(
            "Paid ₹" + amount + " using UPI"
        );
    }
}

Usage:

public class PaymentDemo {

    public static void main(String[] args) {

        Payment payment =
            new UpiPayment();

        payment.pay(1000);

        payment.receipt();
    }
}

Output:

Paid ₹1000.0 using UPI
Payment receipt generated
Important Point

We cannot create an object directly from an abstract class.

// Not allowed

Payment payment =
    new Payment();

But we can create a child object:

Payment payment =
    new UpiPayment();
Interface as Abstraction

An interface can define a contract.

interface Payment {

    void pay(double amount);
}

Different classes can implement it differently:

class CardPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid ₹" + amount + " using Card"
        );
    }
}


class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid ₹" + amount + " using UPI"
        );
    }
}

Usage:

Payment payment;

payment = new CardPayment();

payment.pay(500);

payment = new UpiPayment();

payment.pay(1000);

Output:

Paid ₹500.0 using Card
Paid ₹1000.0 using UPI

The caller only knows:

payment.pay();

The internal payment implementation is hidden.

Meaningful Example – Vehicle
abstract class Vehicle {

    abstract void start();

    void stop() {

        System.out.println(
            "Vehicle stopped"
        );
    }
}


class Car extends Vehicle {

    @Override
    void start() {

        System.out.println(
            "Car starts using engine"
        );
    }
}


class Bike extends Vehicle {

    @Override
    void start() {

        System.out.println(
            "Bike starts using engine"
        );
    }
}

Usage:

public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle vehicle;

        vehicle = new Car();

        vehicle.start();
        vehicle.stop();


        vehicle = new Bike();

        vehicle.start();
        vehicle.stop();
    }
}

Output:

Car starts using engine
Vehicle stopped
Bike starts using engine
Vehicle stopped

Here:

Vehicle
  │
  ├── start() → abstract
  └── stop()  → common implementation
       │
       ├── Car
       └── Bike

Abstraction vs Encapsulation

These two concepts are often confused.

| Abstraction                         | Encapsulation                                 |
| ----------------------------------- | --------------------------------------------- |
| Hides implementation details        | Hides/protects data                           |
| Focuses on **what** the object does | Focuses on **how data is accessed/protected** |
| Uses abstract classes/interfaces    | Uses `private`, getters/setters               |
| Example: `payment.pay()`            | Example: `account.getBalance()`               |


Java Package and Access Specifiers
Package
Definition

A package is a way to group related Java classes and interfaces together.

It helps in:

Organizing code
Avoiding class-name conflicts
Controlling access
Managing large applications
Example
com.college.student
        |
        ├── Student.java
        ├── StudentService.java
        └── StudentController.java

A package is declared at the top of a Java file:

package com.college.student;
Creating and Using a Package
Student.java
package college;

public class Student {

    public void display() {

        System.out.println(
            "Student information"
        );
    }
}
Main.java
import college.Student;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();
    }
}

Output:

Student information

Here:

college
   ↓
Package

Student
   ↓
Class
Access Specifiers

Access specifiers control where a class, variable, method, or constructor can be accessed.

Java has four access levels:

public
protected
default
private
public

Accessible from anywhere.

public class Employee {

    public String name;

    public void display() {

        System.out.println(name);
    }
}

Can be accessed from:

Same class       ✓
Same package     ✓
Child class      ✓
Other package    ✓
private

Accessible only inside the same class.

class Employee {

    private double salary;

    private void calculateSalary() {

        System.out.println(
            "Calculating salary"
        );
    }
}

Outside the class:

// employee.salary;          // Error
// employee.calculateSalary(); // Error

Commonly used for encapsulation.

default

If no access modifier is specified, it is called default/package-private access.

class Employee {

    String name;

    void display() {

        System.out.println(name);
    }
}

It can be accessed only within the same package.

Same class       ✓
Same package     ✓
Child class
different pkg   ✗
Other package    ✗

Example:

package college;

class Student {

    String name;
}

Another class in the same college package can access name.

protected

protected members can be accessed:

Within the same package
In a child class in another package
class Employee {

    protected double salary;

    protected void displaySalary() {

        System.out.println(salary);
    }
}
Access idea
Same class                  ✓
Same package                ✓
Child class                 ✓
Non-child, different pkg    ✗
Access Specifier Comparison

Access Specifier Comparison

| Access      | Same Class | Same Package | Child Class | Other Package |
| ----------- | ---------: | -----------: | ----------: | ------------: |
| `private`   |          ✓ |            ✗ |           ✗ |             ✗ |
| `default`   |          ✓ |            ✓ |          ✓* |             ✗ |
| `protected` |          ✓ |            ✓ |           ✓ |            ✗* |
| `public`    |          ✓ |            ✓ |           ✓ |             ✓ |


Meaningful Example

Suppose we have:

college
   |
   └── Employee.java

app
   |
   └── Main.java
Employee.java
package college;

public class Employee {

    private int id;

    protected String department;

    String name;

    public double salary;


    public Employee(
        int id,
        String name,
        String department,
        double salary
    ) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    public void display() {

        System.out.println(
            "Employee: " + name
        );
    }
}
Main.java
package app;

import college.Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee =
            new Employee(
                101,
                "Rahul",
                "IT",
                60000
            );

        System.out.println(
            employee.salary
        );

        employee.display();

        // employee.id;
        // Error: private

        // employee.name;
        // Error: default

        // employee.department;
        // Error here because Main is
        // in another package and is
        // not a subclass
    }
}
Package vs Access Specifier

| Package                      | Access Specifier                       |
| ---------------------------- | -------------------------------------- |
| Organizes related classes    | Controls accessibility                 |
| Uses `package` keyword       | `public`, `private`, `protected`       |
| Example: `package college;`  | Example: `private int salary;`         |
| Helps structure applications | Helps implement security/encapsulation |


Java this and super Keywords

Both this and super are used mainly in classes, constructors, and inheritance.

this  → Current object
super → Parent class object/reference
this Keyword
Definition

this refers to the current object.

It is commonly used when a constructor or method parameter has the same name as an instance variable.

Example
class Employee {

    int id;
    String name;

    Employee(int id, String name) {

        this.id = id;
        this.name = name;
    }
}

Here:

this.id    → instance variable
id         → constructor parameter

this.name  → instance variable
name       → constructor parameter
Usage
Employee emp =
    new Employee(101, "Rahul");

System.out.println(emp.id);
System.out.println(emp.name);

Output:

101
Rahul
this() – Calling Another Constructor

this() is used to call another constructor of the same class.

class Employee {

    int id;
    String name;

    Employee() {

        this(101, "Unknown");
    }

    Employee(int id, String name) {

        this.id = id;
        this.name = name;
    }
}

Here:

this(101, "Unknown");

calls another constructor in the same class.

Important

this() must be the first statement inside the constructor.

super Keyword
Definition

super refers to the parent class.

It is mainly used to:

Access parent class variables
Call parent class methods
Call parent class constructor
Access Parent Variable
class Employee {

    String name = "Employee";
}


class Developer extends Employee {

    String name = "Developer";

    void display() {

        System.out.println(name);

        System.out.println(super.name);
    }
}

Usage:

Developer developer =
    new Developer();

developer.display();

Output:

Developer
Employee

Here:

name       → Child class variable
super.name → Parent class variable
super() – Calling Parent Constructor
class Employee {

    String name;

    Employee(String name) {

        this.name = name;
    }
}


class Developer extends Employee {

    String language;

    Developer(
        String name,
        String language
    ) {

        super(name);

        this.language = language;
    }
}

Here:

super(name);

calls the parent class constructor.

super.method()

super can also call a method from the parent class.

class Employee {

    void work() {

        System.out.println(
            "Employee is working"
        );
    }
}


class Developer extends Employee {

    @Override
    void work() {

        super.work();

        System.out.println(
            "Developer is writing code"
        );
    }
}

Usage:

Developer developer =
    new Developer();

developer.work();

Output:

Employee is working
Developer is writing code
Complete Meaningful Example
class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    void display() {

        System.out.println(
            "Employee: " + name
        );

        System.out.println(
            "Salary: ₹" + salary
        );
    }
}


class Developer extends Employee {

    String language;

    Developer(
        String name,
        double salary,
        String language
    ) {

        super(name, salary);

        this.language = language;
    }

    @Override
    void display() {

        super.display();

        System.out.println(
            "Language: " + language
        );
    }
}


public class Demo {

    public static void main(String[] args) {

        Developer developer =
            new Developer(
                "Rahul",
                60000,
                "Java"
            );

        developer.display();
    }
}

Output:

Employee: Rahul
Salary: ₹60000.0
Language: Java

this vs super
| `this`                                     | `super`                              |
| ------------------------------------------ | ------------------------------------ |
| Refers to current object                   | Refers to parent class               |
| Used for current class members             | Used for parent class members        |
| `this.name`                                | `super.name`                         |
| `this()` calls current class constructor   | `super()` calls parent constructor   |
| `this.method()` calls current class method | `super.method()` calls parent method |


