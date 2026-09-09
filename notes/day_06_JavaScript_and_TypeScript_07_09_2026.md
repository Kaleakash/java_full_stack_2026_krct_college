Synchronous JavaScript

Definition: Executes statements one after another in order.

Use: Normal calculations and sequential operations.

console.log("Task 1");
console.log("Task 2");
console.log("Task 3");

Output:

Task 1
Task 2
Task 3

Meaning:

Task 1 → finish → Task 2 → finish → Task 3

AJAX : 

Asynchronous JavaScript

Definition: Starts a time-consuming operation and allows other 
JavaScript work to continue before the result arrives.
means set of task execute independently. 

    console.log("task 1")     Asynchronous
    console.log("task 2")     Asynchronous  
    console.log("task 3")     Asynchronous


Use: API calls, timers, server requests, file operations, etc.

setTimeout 
setInterval 
clearInterval 


console.log("Start");

setTimeout(() => {
    console.log("Task completed");
}, 2000);

console.log("End");

Output:

Start
End
Task completed

Meaning:

Start task
   ↓
Don't wait
   ↓
Continue
   ↓
End
   ↓
Result comes later

Promise


Definition: A Promise represents the future result of an asynchronous operation.
or 
Promise is a pre defined object which help to handle asynchronous event of data of any types. 


Use: Handle asynchronous success or failure.

let promise = new Promise((resolve, reject) => {

    let success = true;

    if (success) {
        resolve("Task completed");
    } else {
        reject("Task failed");
    }
});

if promise resolved automatically then get call
if promise rejected catch get call. 

promise
    .then(result => console.log(result))
    .catch(error => console.log(error));

Remember:

resolve() → Success
reject()  → Failure

.then()   → Handle success
.catch()  → Handle failure


fetch()

Definition: fetch() is a built-in JavaScript function used to make HTTP requests to a 
REST API/server.

with help of frontend technologies like JavaScript 
React or Angular framework we can call backend technologies using web service ie 
Rest full web service. 

fetch function return type is promise object. 

Use: Get, send, update or delete data from a backend.

Simple GET example
fetch("https://jsonplaceholder.typicode.com/users")
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.log(error);
    });
Meaning
fetch()
   ↓
HTTP request
   ↓
REST API
   ↓
Response
   ↓
response.json()
   ↓
JavaScript data

fetch() returns a Promise, and response.json() also returns a Promise.


async / await

Definition: Cleaner syntax for working with Promises. It does not replace Promises.

Use: Make asynchronous code easier to read.
await : is a keyword which make asynchronous code to synchronous 

async function getData() {

    try {
        let response = await fetch("https://example.com/users");

        let data = await response.json();

        console.log(data);

    } catch (error) {
        console.log(error);
    }
}

Meaning:

async → function works with asynchronous code

await → wait for Promise result inside that function


TypeScript : 

Definition

TypeScript is a strongly typed programming language developed by Microsoft. 
It is a superset of JavaScript, meaning existing JavaScript 
code can generally be used in TypeScript.

Simple Example

JavaScript:

demo.js 

let age = 20;

age = "twenty";   // Allowed in JavaScript

TypeScript:
demo.ts 

let age: number = 20;

age = "twenty";   // Error

TypeScript identifies the problem during development, before the application runs.

To run TypeScript example we need convert TS to JS. 


Node.js – Simple Definition

Node.js is a JavaScript runtime environment 
that allows us to run JavaScript outside the browser.



Normally:

JavaScript → Browser

With Node.js:

JavaScript → Node.js → Computer / Server

Before Node JS, JavaScript was known as client side scripting language 
But after node JS JavaScript also known as client side as well as server side 
scripting language 
with help of node js we can create server side programming code. 

Use Cases
Backend/API development
Running JavaScript applications
Development tools
Package management
Running TypeScript tools
Building React/Angular applications


Simple Example

Create app.js:

console.log("Hello from Node.js");

Run:

node app.js

Output:

Hello from Node.js

What is NPM?

NPM (Node Package Manager) is a package manager that comes with Node.js.

It is used to:

Install libraries/packages
Manage project dependencies
Run project scripts
Manage package versions

Node.js vs NPM

| Node.js             | NPM                      |
| ------------------- | ------------------------ |
| Runs JavaScript     | Manages packages         |
| Runtime environment | Package manager          |
| `node app.js`       | `npm install package`    |
| Executes JS         | Installs libraries/tools |


Installing TypeScript

First check whether Node.js and NPM are installed.

Open Command Prompt / Terminal:

node --version

Example:

v22.x.x

Check NPM:

npm --version

Install TypeScript

There are two common approaches.

syntax to install module/package/dependencies using npm command 

npm install -g moduleName/packageName

Install TypeScript Globally

npm install -g typescript

Check:

tsc --version

Create TypeScript File

Create:

app.ts


TypeScript Data Types

TypeScript provides JavaScript's basic data types and adds a powerful type 
system to make code safer and easier to maintain.

Basic Data Types

| Data Type   | Meaning                        | Example                           |
| ----------- | ------------------------------ | --------------------------------- |
| `number`    | Numbers                        | `let age: number = 21`            |
| `string`    | Text                           | `let name: string = "Rahul"`      |
| `boolean`   | `true` / `false`               | `let active: boolean = true`      |
| `any`       | Any type                       | `let value: any = 10`             |
| `unknown`   | Unknown type, safer than `any` | `let value: unknown = 10`         |
| `null`      | No value                       | `let data: null = null`           |
| `undefined` | Value not assigned             | `let data: undefined = undefined` |
| `bigint`    | Very large integer             | `let n: bigint = 100n`            |
| `symbol`    | Unique value                   | `let id: symbol = Symbol()`       |


Example 

let name: string = "Rahul";

let age: number = 21;

function greet(name: string): string {

    return "Hello " + name;
}

console.log(greet(name));

console.log("Age:", age);

Convert .ts to .js

Use the TypeScript compiler:

tsc app.ts

Then run the application 

node app.js 

TypeScript Functions

A function is a reusable block of code that performs a specific task.

The main difference from JavaScript is that TypeScript allows us to specify types 
for parameters and return values.

Basic Syntax
function functionName(parameter: type): returnType {
    // code
}

Function with No Return Value

Use void when the function doesn't return anything.

function displayStudent(name: string): void {
    console.log("Student:", name);
}

displayStudent("Rahul");

Optional Parameter

Use ? when a parameter is optional.

function greet(
    name: string,
    course?: string
): void {

    console.log("Name:", name);

    if (course) {
        console.log("Course:", course);
    }
}

greet("Rahul");

greet("Priya", "Java");

Default Parameter

A default value is used when the argument isn't provided.

function greet(
    name: string,
    course: string = "Java"
): void {

    console.log(name, course);
}

greet("Rahul");

greet("Priya", "Python");

Arrow Function

TypeScript also supports arrow functions.

const add = (
    a: number,
    b: number
): number => {

    return a + b;
};

console.log(add(10, 20));

Short form:

const add = (a: number, b: number): number =>
    a + b;

class Student {

    id: number;
    name: string;
    course: string;

    display(): void {
        console.log(this.id, this.name, this.course);
    }
}

Here:

id, name, course → properties
display() → method
this → refers to the current object
Constructor

A constructor is a special method that is automatically called when an object is created.

It is mainly used to initialize object properties.

class Student {

    id: number;
    name: string;

    constructor(id: number, name: string) {

        this.id = id;
        this.name = name;
    }
}

Create an object:

const student1 =
    new Student(101, "Rahul");

const student2 =
    new Student(102, "Priya");

The constructor automatically executes when new Student() is called.

Complete Working Example

Create student.ts:

class Student {

    id: number;
    name: string;
    course: string;
    marks: number;


    // Constructor
    constructor(
        id: number,
        name: string,
        course: string,
        marks: number
    ) {

        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }


    // Method
    displayStudent(): void {

        console.log("ID:", this.id);
        console.log("Name:", this.name);
        console.log("Course:", this.course);
        console.log("Marks:", this.marks);
    }


    // Method
    checkResult(): string {

        if (this.marks >= 40) {
            return "Pass";
        }

        return "Fail";
    }
}


// Create objects

const student1 = new Student(
    101,
    "Rahul",
    "Java Full Stack",
    85
);

const student2 = new Student(
    102,
    "Priya",
    "Python Full Stack",
    35
);


// Call methods

student1.displayStudent();

console.log("Result:", student1.checkResult());

console.log("----------------");

student2.displayStudent();

console.log("Result:", student2.checkResult());

Compile:

npx tsc student.ts

Run:

node student.js

TypeScript Interface
Definition

An interface in TypeScript is used to define the structure or shape of an object.

It specifies what properties and methods an object should have, but normally does not contain the actual implementation.

Employee Interface with Properties

Suppose an employee must have id, name, department and salary.

interface Employee {

    id: number;

    name: string;

    department: string;

    salary: number;
}


// Object using interface

const employee: Employee = {

    id: 101,

    name: "Rahul",

    department: "IT",

    salary: 60000
};


console.log(employee);

Access Properties
console.log(employee.id);
console.log(employee.name);
console.log(employee.department);
console.log(employee.salary);

Bank Interface with Functions

An interface can define properties and function/method signatures.

interface BankAccount {
    deposit(amount: number): void;

    withdraw(amount: number): void;

    getBalance(): number;
}


Class Implementing Bank Interface
class SavingsAccount implements BankAccount {

    accountNumber: string;

    accountHolder: string;

    balance: number;


    constructor(
        accountNumber: string,
        accountHolder: string,
        balance: number
    ) {

        this.accountNumber = accountNumber;

        this.accountHolder = accountHolder;

        this.balance = balance;
    }


    deposit(amount: number): void {

        this.balance += amount;

        console.log(
            "Deposited: ₹" + amount
        );
    }


    withdraw(amount: number): void {

        if (amount <= this.balance) {

            this.balance -= amount;

            console.log(
                "Withdrawn: ₹" + amount
            );

        } else {

            console.log(
                "Insufficient balance"
            );
        }
    }


    getBalance(): number {

        return this.balance;
    }
}

TypeScript Modules

Definition

A module is a separate TypeScript file that contains related variables, 
functions, classes, or interfaces.

Modules help us:

Organize large applications
Reuse code
Avoid naming conflicts
Maintain code easily
Separate different responsibilities

first create the typescript configuration file using below command as 

tsc --init 

this command help to create tsconfig.json file. which contains all configuration details. 

tsconfig.json file do few changes as 

"target": "es2020",
//    "verbatimModuleSyntax": true,         make is comments 


calculator.ts

export function add(
    a: number,
    b: number
): number {

    return a + b;
}


export function subtract(
    a: number,
    b: number
): number {

    return a - b;
}


export function multiply(
    a: number,
    b: number
): number {

    return a * b;
}


export function divide(
    a: number,
    b: number
): number {

    return a / b;
}

Here, export makes the functions available to other files.

app.ts

import {
    add,
    subtract,
    multiply,
    divide
} from "./calculator";


console.log("Addition:", add(10, 5));

console.log("Subtraction:", subtract(10, 5));

console.log("Multiplication:", multiply(10, 5));

console.log("Division:", divide(10, 5));

to convert tsc 

to run main file 

node app.js/main.js 



Decorator in TypeScript

Simple Definition

A decorator is a special function that adds extra 
information or behavior to a class, method, property, or parameter.

In simple words:

Decorator = tells TypeScript/Angular something special about a piece of code.

Decorators are written using @.
all decorator or annotation start with pre fix @ followed by decorator name. 


Common Angular Decorators
1. @Component
2. @Injectable
3. @NgModule 
4. @Input 
5. @Output 

