Java Interface
Definition

An interface is a contract that defines what a class must do, 
without necessarily defining how it should do it.

interface also known as 100% pure abstract class before java 8. 
interface contains all method abstract and it contains only final variable or fields. 
by default all variable in interface public static and final 
by default all method in interface are public and abstract 

It is mainly used for abstraction, loose coupling, and multiple implementations.
using interface we can achieve multiple inheritance. 

Interface
   ↓
Defines contract
   ↓
Class implements interface
   ↓
Provides implementation

Basic Syntax

interface Payment {
    void pay();     // by default method is public and abstract. 
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

        Payment payment;            // creating reference of interface. 

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

    double INTEREST_RATE = 7.5;     // by default variable are public static and final 

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
// using interface we can achieve multiple inheritance. 

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

class extends only one class. 
interface extends another interface ie more than one. 
class implements interface is more than one 
interface extends/implements to class (no)





Interface vs Abstract Class

| Interface                                                          | Abstract Class                         |
| ------------------------------------------------------------------ | -------------------------------------- |
| Defines a contract                                                 | Provides common/partial implementation |
| Uses `interface`                                                   | Uses `abstract class`                  |
| Class uses `implements`                                            | Class uses `extends`                   |
| A class can implement multiple interfaces                          | A class can extend only one class      |
| Good for loose coupling                                            | Good for shared base functionality     |
| Supports abstract methods and can also have default/static methods | Can have abstract and normal methods   |



Java 8 Interface

Java 8 introduced important changes to interfaces. 
Before Java 8, interfaces were mainly used to define abstract methods. 
Java 8 allows interfaces to contain default methods and static methods with implementation.

Main Features of Java 8 Interface
Interface
   │
   ├── Abstract methods
   ├── Default methods      ← Java 8
   ├── Static methods       ← Java 8
   └── Functional Interface ← Java 8


public interface Info {
	abstract void dis1();	// by default abstract 
	default void dis2() {
		System.out.println("default implementation");
	}
	static void dis3() {
		System.out.println("static implementation");
	}
}

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

It was introduced in Java 8 mainly to allow new 
functionality to be added to existing interfaces without 
forcing every existing implementation class to implement the new method.

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
class UpiPayment implements Payment {

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

Calculator addition = (a, b) -> a + b;

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
| Functional interfaces | Commonly used with anonymous classes  |  ✅ Works naturally with Lambda |
| Lambda expressions    | ❌                                    | ✅                             |


Java Abstraction

Definition

Abstraction means hiding internal implementation details and showing only the required functionality to the user.


You don't need to know how the bank internally validates the account, 
checks the balance, or processes the transaction.

That is abstraction.

Abstraction in Java

Java mainly provides abstraction using:

Abstraction
    │
    ├── Abstract Class
    │
    └── Interface




Java Packages – Predefined and User-Defined

What is a Package?

A package is a group of related Java classes, interfaces, and other types.

Packages are mainly used for:

Organizing code
Avoiding class-name conflicts
Controlling access
Managing large applications

Package Structure
Java Application
      |
      ├── package1
      │     ├── ClassA
      │     └── ClassB
      |
      └── package2
            ├── ClassC
            └── ClassD

A package is declared using the package keyword:

package com.company.employee;

Types of Packages

There are two commonly discussed categories:

Packages
   |
   ├── Predefined Packages
   |
   └── User-Defined Packages

Predefined Packages

These are packages provided by the Java API.

Examples:
                        root package 

        java                                    javax 


Package	Purpose
java.lang	String, Math, Object, System, etc.
java.util	Scanner, ArrayList, HashMap, etc.
java.io	    File and I/O operations
java.time	Date and time
java.sql	JDBC/database operations
java.net	Networking

Example:

import java.util.Scanner;
import java.util.ArrayList;

java.lang is automatically available to Java programs, so classes such as String, System, and Math normally don't need an explicit import.

3. User-Defined Package

A user-defined package is a package created by the developer to organize application-specific classes.

For example:

Employee Management System

com.company.employee
        |
        ├── Employee.java
        └── EmployeeService.java

com.company.main
        |
        └── Main.java


Complete Example with Access Specifiers

This example demonstrates:

User-defined packages
public
protected
default
private

using these 4 access specifies we can control the visibility or accessiblity of variable, 
methods, class part of same package or other package. 

Access from the same package
Access from another package
Inheritance across packages
Project Structure
JavaPackageDemo
│
└── src
    │
    ├── company
    │   └── employee
    │       ├── Employee.java
    │       └── EmployeeService.java
    │
    └── company
        └── app
            └── Developer.java
Step 1: Create Employee Class

File:

company/employee/Employee.java
package company.employee;

public class Employee {

    public String name;

    protected String department;

    String location;        // default

    private double salary;


    public Employee(
        String name,
        String department,
        String location,
        double salary
    ) {

        this.name = name;
        this.department = department;
        this.location = location;
        this.salary = salary;
    }


    public void displayPublic() {

        System.out.println(
            "Name: " + name
        );
    }


    protected void displayProtected() {

        System.out.println(
            "Department: " + department
        );
    }


    void displayDefault() {

        System.out.println(
            "Location: " + location
        );
    }


    private void displayPrivate() {

        System.out.println(
            "Salary: " + salary
        );
    }


    public void displayAll() {

        displayPublic();
        displayProtected();
        displayDefault();
        displayPrivate();
    }
}
Step 2: Same Package Access

Create:

company/employee/EmployeeService.java
package company.employee;

public class EmployeeService {

    public void testAccess() {

        Employee employee =
            new Employee(
                "Rahul",
                "IT",
                "Bangalore",
                60000
            );


        // public → accessible
        System.out.println(
            employee.name
        );


        // protected → accessible
        System.out.println(
            employee.department
        );


        // default → accessible
        System.out.println(
            employee.location
        );


        // private → NOT accessible
        // System.out.println(employee.salary);
    }
}

Why can EmployeeService access department and location?

Because both classes are in:

company.employee

So:

Same Package

public     ✓
protected  ✓
default    ✓
private    ✗
Step 3: Child Class in Another Package

Create:

company/app/Developer.java
package company.app;

import company.employee.Employee;

public class Developer extends Employee {

    public Developer(
        String name,
        String department,
        String location,
        double salary
    ) {

        super(
            name,
            department,
            location,
            salary
        );
    }


    public void displayDeveloper() {

        // public → accessible
        System.out.println(
            "Name: " + name
        );


        // protected → accessible
        // because Developer extends Employee
        System.out.println(
            "Department: " + department
        );


        // default → NOT accessible
        // System.out.println(location);


        // private → NOT accessible
        // System.out.println(salary);
    }
}

This demonstrates an important rule:

Different package + Child class

public     ✓
protected  ✓
default    ✗
private    ✗

For protected, access from a subclass in another package is through inheritance; it is not general package-wide access.

Step 4: Main Class in Another Package

Create:

company/app/Main.java
package company.app;

import company.employee.Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee =
            new Employee(
                "Rahul",
                "IT",
                "Bangalore",
                60000
            );


        // public → accessible
        System.out.println(
            employee.name
        );


        // protected → NOT accessible here
        // System.out.println(employee.department);


        // default → NOT accessible
        // System.out.println(employee.location);


        // private → NOT accessible
        // System.out.println(employee.salary);


        employee.displayAll();
    }
}

Output:

Rahul
Name: Rahul
Department: IT
Location: Bangalore
Salary: 60000.0

displayAll() is public, so Main can call it. Inside Employee, the method can access all four members because they are members of the same class.

Access Specifiers with Packages

This is the most important table:

| Access Specifier | Same Class | Same Package | Child Class, Different Package | Non-Child, Different Package |
| ---------------- | ---------: | -----------: | -----------------------------: | ---------------------------: |
| `private`        |          ✓ |            ✗ |                              ✗ |                            ✗ |
| **default**      |          ✓ |            ✓ |                              ✗ |                            ✗ |
| `protected`      |          ✓ |            ✓ |                             ✓* |                            ✗ |
| `public`         |          ✓ |            ✓ |                              ✓ |                            ✓ |


* A protected member in another package is accessible to a subclass through inheritance, subject to Java's protected-access rules.

Visual Understanding
                         Employee
                    company.employee
                         │
       ┌─────────────────┼─────────────────┐
       │                 │                 │
    private           protected          public
       │                 │                 │
 Same class        Same package       Everywhere
 only              + subclass
                   in another
                   package


Java Exception Handling


What is an Exception?

An exception is an abnormal condition that occurs during program execution 
and disrupts the normal flow of the program.

using some technique we need to handle generated exception ie is exception handling 

                                        Java 

    Compile  program                                                       Run program 
    javac Demo.java                                                        java Demo 
    syntax error or type error

Compile-Time Error vs Runtime Error

These are important concepts to distinguish.

Compile-Time Error

A compile-time error occurs while the Java compiler is compiling the source code.

Example:

public class Demo {

    public static void main(String[] args) {

        int number = 10;

        System.out.println("Value of "+number);
    }
}

The semicolon is missing.

Source Code
    ↓
Compiler
    ↓
Compile-time error
    ↓
.class file NOT generated

Another example:

int number = "Hello";

Java reports a type incompatibility.

Common compile-time errors
Missing ;
Incorrect syntax
Type mismatch
Undefined variable
Missing import
Incorrect method arguments
Unhandled checked exception

Runtime Error

A runtime error occurs after the program has successfully compiled and started executing.

Example:

public class Demo {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        System.out.println(a / b);
    }
}

This compiles successfully, but while executing:

ArithmeticException

Flow:

Source Code
    ↓
Compiler
    ↓
Successful compilation
    ↓
JVM
    ↓
Exception during execution
                                    Run time 
Error : The error which generated at run time which we can't handle it. 
JVM crash, out of memory or software/hardware issue. 

Exception : it is a type of error which generate at run time which we can handle it. 

Both are pre defined classes. part of lang package. by default every java program 
import lang package. 


Error vs Exception

Java has a common hierarchy starting from Throwable.

                    Object
                       |
                   Throwable
                  /         \
               Error       Exception
                |              |
        Serious problems    
                               |
                    ┌──────────┴──────────┐
                    ↓                     ↓
                Checked Exception   Unchecked Exception

                SQLException            RuntimeException 
                IOException             |
                FileNotFoundException   ArithmeticException 
                                        NumberFormatException 
                                        NullPointerException 



More specifically:

Throwable
│
├── Error
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── ...
│
└── Exception
    │
    ├── RuntimeException        (Un checked exception )
    │   ├── ArithmeticException
    │   ├── NullPointerException
    │   ├── ArrayIndexOutOfBoundsException
    │   └── NumberFormatException
    │
    └── Other checked exceptions        (checked exception)
        ├── IOException
        ├── SQLException
        └── ClassNotFoundException
Error

Error generally represents serious problems associated with the JVM or environment.

Example:

OutOfMemoryError
StackOverflowError

Applications generally don't try to recover from these in normal application logic.

Exception

Exception represents conditions that an application can often handle or recover from.

Example:

IOException
SQLException
ArithmeticException
NullPointerException

5. Types of Exceptions

The two important categories are:

Exception
   │
   ├── Checked Exception
   │
   └── Unchecked Exception
Checked Exception

Checked by the compiler.

Examples:

IOException
SQLException
ClassNotFoundException

The program must handle the exception or declare it using throws.

Example:

import java.io.IOException;

class FileService {

    void readFile() throws IOException {

        // file operation
    }
}
Unchecked Exception

Unchecked exceptions are generally subclasses of RuntimeException.

Examples:

ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
NumberFormatException

The compiler does not require you to catch or declare them.

To handle both checked as well as unchecked exception java provided 
5 keyword 
try
catch 
finally 
throw 
throws 


6. try

The try block contains code that may cause an exception.

try {

    int result = 10 / 0;

}

By itself, try must be followed by catch, finally, or both.

7. catch

catch is used to handle an exception thrown from the try block.

try {

    int result = 10 / 0;

} catch (ArithmeticException e) {

    System.out.println(
        "Cannot divide by zero"
    );
}

Output:

Cannot divide by zero

Here:

try
 ↓
Exception
 ↓
catch
 ↓
Handle exception

8. Multiple catch Blocks

A single try can have multiple catch blocks.

public class MultipleCatchDemo {

    public static void main(String[] args) {

        try {

            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        }
        catch (ArithmeticException e) {

            System.out.println(
                "Arithmetic error"
            );
        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "Invalid array index"
            );
        }
        catch (Exception e) {

            System.out.println(
                "Some other exception occurred"
            );
        }
    }
}

Output:

Invalid array index
Important Rule

Specific exceptions should generally come before a more general exception.

Correct:

catch (ArithmeticException e) {
}

catch (Exception e) {
}

Incorrect:

catch (Exception e) {
}

catch (ArithmeticException e) {
}

The second catch becomes unreachable because Exception already catches that exception type.

9. finally
finally block execute 100% sure doesn't matter exception generate or not. 


The finally block is generally used for cleanup code.

It normally executes whether an exception occurs or not.

public class FinallyDemo {

    public static void main(String[] args) {

        try {

            int result = 10 / 2;

            System.out.println(
                "Result: " + result
            );

        }
        catch (ArithmeticException e) {

            System.out.println(
                "Arithmetic error"
            );

        }
        finally {

            System.out.println(
                "Finally block executed"
            );
        }
    }
}

Output:

Result: 5
Finally block executed

If an exception occurs:

try {

    int result = 10 / 0;

}
catch (ArithmeticException e) {

    System.out.println(
        "Exception handled"
    );

}
finally {

    System.out.println(
        "Cleanup operation"
    );
}

Output:

Exception handled
Cleanup operation

Typical use:

try
 ↓
Resource operation
 ↓
catch → handle problem
 ↓
finally → cleanup

For resources such as files and database connections, try-with-resources is often preferable to manually closing them in finally.

Unchecked Exception – ArithmeticException

Occurs when an invalid arithmetic operation is performed.

public class ArithmeticDemo {

    public static void main(String[] args) {

        try {

            int a = 100;
            int b = 0;

            int result = a / b;

            System.out.println(result);

        }
        catch (ArithmeticException e) {

            System.out.println(
                "Cannot divide by zero"
            );
        }
    }
}

Output:

Cannot divide by zero

Unchecked Exception – ArrayIndexOutOfBoundsException

Occurs when we access an array using an invalid index.

public class ArrayDemo {

    public static void main(String[] args) {

        int[] numbers = {
            10, 20, 30
        };

        try {

            System.out.println(
                numbers[5]
            );

        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "Invalid array index"
            );
        }
    }
}

Valid indexes are:

10   20   30
 ↑    ↑    ↑
 0    1    2

Index 5 does not exist.

Multiple Unchecked Exceptions

A practical example:

public class ExceptionDemo {

    public static void main(String[] args) {

        try {

            int[] numbers = {10, 20, 30};

            int number = 10 / 0;

            System.out.println(numbers[5]);

        }
        catch (ArithmeticException e) {

            System.out.println(
                "Arithmetic problem"
            );

        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "Array index problem"
            );

        }
        finally {

            System.out.println(
                "Execution completed"
            );
        }
    }
}

Output:

Arithmetic problem
Execution completed

Only the first exception encountered in the try block is thrown, so numbers[5] is not reached.

throw

The throw keyword is used when we explicitly want to throw an exception.
that exception can be pre defined or user defined 
syntax 
throw new Exception();
throw new ExceptionSubClass(); // it can be pre defined or user defined. 


Example
public class EmployeeDemo {

    static void checkSalary(double salary) {

        if (salary < 0) {

            throw new IllegalArgumentException(
                "Salary cannot be negative"
            );
        }

        System.out.println(
            "Salary: " + salary
        );
    }

    public static void main(String[] args) {

        checkSalary(-5000);
    }
}

Here we are intentionally throwing:

throw new IllegalArgumentException(
    "Salary cannot be negative"
);
14. throw with Custom Exception

We can create our own exception class for business-specific errors.

Step 1 – Create Custom Exception
class InsufficientBalanceException
        extends Exception {

    public InsufficientBalanceException(
        String message
    ) {

        super(message);
    }
}
Step 2 – Use throw
class BankAccount {

    private double balance = 10000;

    void withdraw(double amount)
        throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                "Insufficient balance"
            );
        }

        balance -= amount;

        System.out.println(
            "Withdrawal successful"
        );
    }
}
Step 3 – Handle the Exception
public class BankDemo {

    public static void main(String[] args) {

        BankAccount account =
            new BankAccount();

        try {

            account.withdraw(15000);

        }
        catch (InsufficientBalanceException e) {

            System.out.println(
                "Transaction failed: "
                + e.getMessage()
            );
        }
    }
}

Output:

Transaction failed: Insufficient balance

Here we have:

withdraw()
    ↓
Condition checked
    ↓
throw new InsufficientBalanceException()
    ↓
catch
    ↓
Handle business exception
15. throws

throws is used in a method declaration to tell the caller that the method may throw one or more exceptions.

Example:

class FileService {

    void readFile()
        throws IOException {

        // file operation
    }
}

The method is saying:

"This method may throw IOException; the caller needs to deal with it."

16. throws with Custom Exception

Using our bank example:

class BankAccount {

    private double balance = 10000;

    void withdraw(double amount)
        throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                "Insufficient balance"
            );
        }

        balance -= amount;
    }
}

Notice the difference:

throws InsufficientBalanceException

declares the possibility.

Inside the method:

throw new InsufficientBalanceException(...)

actually creates and throws the exception.

Caller:

public class BankDemo {

    public static void main(String[] args) {

        BankAccount account =
            new BankAccount();

        try {

            account.withdraw(15000);

        }
        catch (InsufficientBalanceException e) {

            System.out.println(
                e.getMessage()
            );
        }
    }
}
17. throw vs throws

This is one of the most important interview questions.

| `throw`                                | `throws`                                |
| -------------------------------------- | --------------------------------------- |
| Used to actually throw an exception    | Used to declare possible exceptions     |
| Used inside method/block               | Used in method signature                |
| Followed by an exception object        | Followed by exception class names       |
| Usually throws one exception at a time | Can declare multiple exceptions         |
| `throw new Exception()`                | `method() throws Exception`             |
| Programmer explicitly triggers it      | Informs caller about possible exception |


throw
if (age < 18) {

    throw new IllegalArgumentException(
        "Age must be 18 or above"
    );
}
throws
void register()
    throws InvalidAgeException {

    // method implementation
}
Together

They are frequently used together:

void withdraw(double amount)
    throws InsufficientBalanceException {

    if (amount > balance) {

        throw new InsufficientBalanceException(
            "Insufficient balance"
        );
    }
}

Think of it as:

throws
  ↓
"I may throw this exception"

throw
  ↓
"Now I am throwing this exception"
18. Complete Exception Handling Flow
                    Java Program
                         |
                         ↓
                  Exception occurs
                         |
                         ↓
                  try block catches?
                    /          \
                  Yes           No
                   |             |
                   ↓             ↓
                catch        Propagate
                   |
                   ↓
              finally
                   |
                   ↓
            Continue / End
19. Complete Example
class InsufficientBalanceException
        extends Exception {

    public InsufficientBalanceException(
        String message
    ) {

        super(message);
    }
}


class BankAccount {

    private double balance;

    BankAccount(double balance) {

        this.balance = balance;
    }


    void withdraw(double amount)
        throws InsufficientBalanceException {

        if (amount <= 0) {

            throw new IllegalArgumentException(
                "Amount must be greater than zero"
            );
        }

        if (amount > balance) {

            throw new InsufficientBalanceException(
                "Insufficient balance"
            );
        }

        balance -= amount;

        System.out.println(
            "Withdrawal successful"
        );
    }


    double getBalance() {

        return balance;
    }
}


public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        BankAccount account =
            new BankAccount(10000);

        try {

            account.withdraw(15000);

        }
        catch (InsufficientBalanceException e) {

            System.out.println(
                "Bank Error: "
                + e.getMessage()
            );

        }
        catch (IllegalArgumentException e) {

            System.out.println(
                "Input Error: "
                + e.getMessage()
            );

        }
        finally {

            System.out.println(
                "Current Balance: ₹"
                + account.getBalance()
            );
        }
    }
}

Output:

Bank Error: Insufficient balance
Current Balance: ₹10000.0



Java Multithreading
Definition
Program, Process, Processor and Thread

Before learning multithreading, understand these four terms clearly.

1.1 Program

A program is a set of instructions written to perform a particular task.

Example:

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

This Java source code is a program.

Simple meaning

Program = instructions stored on disk.

2. Process

When a program is executed, the operating system creates a process.

For example, when you run:

java Hello

the operating system creates a process for the running Java application.

A process has its own:

Memory
Resources
Address space
Threads
Example

Suppose you open:

Chrome
IntelliJ IDEA
MS Word

Each running application can have one or more processes.

Simple meaning

Process = a running program.

3. Processor / CPU

A processor, or CPU, is the hardware that executes instructions.

For example:

Program
   ↓
Process
   ↓
Threads
   ↓
CPU executes instructions

Modern computers can have multiple CPU cores.

For example:

CPU
 ├── Core 1
 ├── Core 2
 ├── Core 3
 └── Core 4

Multiple threads can execute concurrently, depending on the number of CPU cores and the operating system's scheduling.

4. Thread

A thread is the smallest unit of execution inside a process.

A process can contain multiple threads.

For example:

Java Application Process
│
├── Thread 1
├── Thread 2
├── Thread 3
└── Thread 4

Each thread can perform a different task.

Example

An online shopping application may have:

Thread 1 → Process customer request
Thread 2 → Send email
Thread 3 → Process payment
Thread 4 → Generate report
5. Program vs Process vs Thread



| Term      | Meaning                             | Example                   |
| --------- | ----------------------------------- | ------------------------- |
| Program   | Set of instructions                 | Java `.class` application |
| Process   | Running program                     | Running Java application  |
| Processor | Hardware that executes instructions | CPU                       |
| Thread    | Unit of execution inside process    | `main` thread             |


What is Multithreading?

Multithreading is the process of executing multiple threads concurrently within a single process.

For example:

Java Application
       |
       +----------------+
       |                |
   Thread 1          Thread 2
       |                |
 Download file     Play music

Both tasks can make progress concurrently.

Why use multithreading?

Common use cases:

Web servers
Banking applications
Payment processing
File processing
Background tasks
Downloading files
Database operations
Chat applications
Games
Enterprise applications
7. Default Thread in Java

When a Java application starts, JVM automatically creates a thread called the main thread.

Consider:

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Java");

    }
}

The main() method is executed by the main thread.

We can verify this using:

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Java");

        System.out.println(
            "Current Thread: " +
            Thread.currentThread().getName()
        );
    }
}
Output
Hello Java
Current Thread: main

The JVM created the main thread automatically.

8. Default Thread Example
public class Main {

    public static void main(String[] args) {

        System.out.println("Program started");

        System.out.println(
            "Thread Name: " +
            Thread.currentThread().getName()
        );

        System.out.println(
            "Thread ID: " +
            Thread.currentThread().getId()
        );

        System.out.println(
            "Thread Priority: " +
            Thread.currentThread().getPriority()
        );

        System.out.println("Program completed");
    }
}

Possible output:

Program started
Thread Name: main
Thread ID: 1
Thread Priority: 5
Program completed
Important
Thread.currentThread()

returns the thread currently executing the code.

9. Creating a Custom Thread

There are two traditional ways to create a thread:

Approach 1

Extend the Thread class.

Approach 2

Implement the Runnable interface.

10. Creating Thread Using Thread Class

Create a class that extends Thread.

class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println(
            "Custom thread is running"
        );

    }
}

Then create the object:

public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        thread.start();

    }
}

Output:

Custom thread is running
11. Why start() Instead of run()?

This is extremely important.

We should normally use:

thread.start();

not:

thread.run();
start()

start() asks JVM to create/start a new thread, and that thread eventually executes run().

start()
  ↓
New thread
  ↓
run()
run()

If you directly call:

thread.run();

it is simply a normal method call.

No new thread is created.

12. Thread Example with Loop
class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                "Child Thread: " + i
            );

        }
    }
}

public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        thread.start();

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                "Main Thread: " + i
            );

        }
    }
}

The output order is not guaranteed.

You might see:

Main Thread: 1
Child Thread: 1
Main Thread: 2
Child Thread: 2
Child Thread: 3
Main Thread: 3
...

or another order.

Why?

Because the JVM/OS scheduler decides when each runnable thread gets CPU time.

13. Thread Name

We can assign a custom thread name.

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(
            "Running: " +
            Thread.currentThread().getName()
        );
    }
}

public class Main {

    public static void main(String[] args) {

        MyThread t1 =
            new MyThread("Employee-Thread");

        t1.start();
    }
}

Output:

Running: Employee-Thread
14. Creating Thread Using Runnable

Another approach is implementing Runnable.

class MyTask implements Runnable {

    @Override
    public void run() {

        System.out.println(
            "Runnable task is running"
        );
    }
}

Create a Thread object:

public class Main {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread thread = new Thread(task);

        thread.start();
    }
}

Output:

Runnable task is running
15. Why Use Runnable?

Java supports single inheritance.

Suppose:

class Employee extends Person

Now you cannot do:

class Employee extends Person, Thread

because Java doesn't support multiple class inheritance.

Instead:

class Employee extends Person
              implements Runnable

This allows the class to inherit from another class and still define a task that can run in a thread.

16. Thread vs Runnable


| Thread                              | Runnable                       |
| ----------------------------------- | ------------------------------ |
| Extend `Thread`                     | Implement `Runnable`           |
| Class cannot extend another class   | Class can extend another class |
| Task and thread are tightly coupled | Task and thread are separated  |
| Simple examples                     | More flexible design           |
| `new MyThread()`                    | `new Thread(task)`             |


Thread Life Cycle Diagram
              start()
   NEW --------------------> RUNNABLE
                               |
                               |
                         CPU Scheduler
                               |
                               v
                            RUNNING*
                               |
              +----------------+----------------+
              |                |                |
              v                v                v
          BLOCKED          WAITING       TIMED_WAITING
              |                |                |
              +----------------+----------------+
                               |
                               v
                            RUNNABLE
                               |
                               |
                         run() completes
                               |
                               v
                         TERMINATED

RUNNING is commonly used when explaining execution, but in Java's Thread.State enum, active execution is represented by RUNNABLE.

21. NEW State

When we create a thread:

Thread t =
    new Thread();

the thread is in the:

NEW

state.

It has not started yet.

22. RUNNABLE State

When we call:

t.start();

the thread becomes eligible to run.

NEW
 ↓
start()
 ↓
RUNNABLE

The scheduler decides when it actually executes.

23. BLOCKED State

A thread enters BLOCKED when it is waiting to acquire a monitor lock.

This commonly occurs with:

synchronized

Example:

synchronized void process() {
    // critical section
}

If Thread 1 has the lock and Thread 2 tries to enter the synchronized method, Thread 2 may become BLOCKED.

24. WAITING State

A thread can enter WAITING when it waits indefinitely for another thread's action.

Examples:

object.wait();

or:

thread.join();

without a timeout.

25. TIMED_WAITING State

A thread waits for a specific amount of time.

Examples:

Thread.sleep(2000);

or:

thread.join(2000);
26. TERMINATED State

When the run() method completes:

public void run() {

    System.out.println("Task completed");

}

the thread becomes:

TERMINATED

A terminated thread cannot be started again.

Thread Life Cycle Working Example
class MyTask extends Thread {

    @Override
    public void run() {

        System.out.println(
            "Thread is running"
        );

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
        }

        System.out.println(
            "Thread completed"
        );
    }
}

public class Main {

    public static void main(String[] args)
            throws InterruptedException {

        MyTask t =
            new MyTask();

        System.out.println(
            "Before start: " +
            t.getState()
        );

        t.start();

        System.out.println(
            "After start: " +
            t.getState()
        );

        Thread.sleep(500);

        System.out.println(
            "During sleep: " +
            t.getState()
        );

        t.join();

        System.out.println(
            "After completion: " +
            t.getState()
        );
    }
}

Possible output:

Before start: NEW
After start: RUNNABLE
Thread is running
During sleep: TIMED_WAITING
Thread completed
After completion: TERMINATED

The exact state observed immediately after start() can vary because thread scheduling is nondeterministic.

What is Synchronization?

Synchronization is a mechanism in Java used to control access to a shared resource when multiple threads are executing at the same time.

In simple words:

Synchronization allows only one thread at a time to access a critical section of code.

Real-world example

Suppose a movie has:

Available tickets = 1

Two customers try to book it:

Customer 1 → Thread 1
Customer 2 → Thread 2

Without synchronization, both threads may see:

Ticket available = 1

and both may book the same ticket.

With synchronization:

Thread 1 → checks → books ticket
                         ↓
                    ticket = 0
                         ↓
Thread 2 → checks → no ticket
2. Ticket Reservation Without Synchronization

First, let's see the problem.

TicketBooking class
class TicketBooking {

    private int availableTickets = 1;

    public void bookTicket(String customerName) {

        if (availableTickets > 0) {

            System.out.println(
                customerName + " found ticket available"
            );

            // Simulate booking processing
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            availableTickets--;

            System.out.println(
                customerName + " booked the ticket"
            );

        } else {

            System.out.println(
                customerName + " could not book the ticket"
            );
        }
    }
}
CustomerTask class

No anonymous class and no lambda.

class CustomerTask implements Runnable {

    private TicketBooking booking;
    private String customerName;

    public CustomerTask(
            TicketBooking booking,
            String customerName) {

        this.booking = booking;
        this.customerName = customerName;
    }

    @Override
    public void run() {

        booking.bookTicket(customerName);
    }
}
Main class
public class Main {

    public static void main(String[] args) {

        TicketBooking booking =
            new TicketBooking();

        CustomerTask customer1 =
            new CustomerTask(
                booking,
                "Raj"
            );

        CustomerTask customer2 =
            new CustomerTask(
                booking,
                "Ravi"
            );

        Thread thread1 =
            new Thread(customer1);

        Thread thread2 =
            new Thread(customer2);

        thread1.start();
        thread2.start();
    }
}
Possible output
Raj found ticket available
Ravi found ticket available
Raj booked the ticket
Ravi booked the ticket
Problem

We have:

Available tickets = 1

But:

Raj → booked
Ravi → booked

Two customers booked one ticket.

This is a race condition.

3. Why Does This Happen?

Look at this code:

if (availableTickets > 0) {

    Thread.sleep(100);

    availableTickets--;
}

Initially:

availableTickets = 1
Thread 1
Raj checks
1 > 0 → TRUE

Before Raj decreases the ticket count, Thread 2 gets a chance to execute.

Thread 2
Ravi checks
1 > 0 → TRUE

Both threads think the ticket is available.

Then:

Raj → books
Ravi → books

This is the problem synchronization solves.

4. Ticket Reservation With Synchronization

Now change only the method:

public synchronized void bookTicket(String customerName)

Complete code:

TicketBooking
class TicketBooking {

    private int availableTickets = 1;

    public synchronized void bookTicket(
            String customerName) {

        if (availableTickets > 0) {

            System.out.println(
                customerName + " found ticket available"
            );

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            availableTickets--;

            System.out.println(
                customerName + " booked the ticket"
            );

        } else {

            System.out.println(
                customerName + " could not book the ticket"
            );
        }
    }
}
CustomerTask
class CustomerTask implements Runnable {

    private TicketBooking booking;
    private String customerName;

    public CustomerTask(
            TicketBooking booking,
            String customerName) {

        this.booking = booking;
        this.customerName = customerName;
    }

    @Override
    public void run() {

        booking.bookTicket(customerName);
    }
}
Main
public class Main {

    public static void main(String[] args) {

        TicketBooking booking =
            new TicketBooking();

        CustomerTask customer1 =
            new CustomerTask(
                booking,
                "Raj"
            );

        CustomerTask customer2 =
            new CustomerTask(
                booking,
                "Ravi"
            );

        Thread thread1 =
            new Thread(customer1);

        Thread thread2 =
            new Thread(customer2);

        thread1.start();
        thread2.start();
    }
}
Possible output
Raj found ticket available
Raj booked the ticket
Ravi could not book the ticket

Or:

Ravi found ticket available
Ravi booked the ticket
Raj could not book the ticket

The customer who gets the ticket is not guaranteed.

But only one customer can book the single available ticket.

5. What Does synchronized Do?

This:

public synchronized void bookTicket(...)

means:

Only one thread at a time can execute this synchronized method for the same TicketBooking object.

Suppose Raj gets the lock:

TicketBooking object
       |
       ↓
    Lock
       |
       ↓
    Raj Thread

Ravi has to wait:

Ravi Thread
     |
     ↓
Waiting for lock

After Raj finishes:

Raj
 ↓
releases lock
 ↓
Ravi gets lock
 ↓
checks tickets
 ↓
0 tickets

Therefore Ravi cannot book the same ticket.

6. Simple Comparison
Without synchronization
Tickets = 1

Raj  → Check → 1 available
Ravi → Check → 1 available

Raj  → Book
Ravi → Book

❌ Problem
Two customers booked one ticket
With synchronization
Tickets = 1

Raj  → Lock → Check → Book → Tickets = 0
                    ↓
                 Unlock

Ravi → Lock → Check → No ticket

✅ Correct
7. Why Do We Need Synchronization?

Synchronization is required when:

Multiple Threads
       ↓
Access Same Data
       ↓
At Least One Thread Modifies Data
       ↓
Race Condition Possible
       ↓
Use Synchronization

Common examples:

Ticket reservation
Bank account withdrawal
Bank account deposit
Inventory management
Seat reservation
Order processing
Shared counter
Stock management
Easy definition for trainees

Synchronization is the process of controlling multiple threads so that only one thread at a time can access a critical section involving shared data.

