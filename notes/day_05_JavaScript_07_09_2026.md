1. Control Flow

Definition: Controls the order in which JavaScript statements execute.

Concept	Simple Definition	Use Case

| Concept      | Simple Definition                             | Use Case                       |
| ------------ | --------------------------------------------- | ------------------------------ |
| `if`         | Executes code when a condition is true        | Check eligibility              |
| `if...else`  | Chooses between two conditions                | Pass/Fail                      |
| `switch`     | Selects one option from multiple values       | Day/Menu selection             |
| `while`      | Repeats while condition is true               | Repeat until condition changes |
| `do...while` | Executes at least once, then checks condition | Menu/input validation          |
| `for`        | Repeats code for a known number/range         | Print 1–10                     |



Example
let marks = 75;

if (marks >= 40) {
    console.log("Student Passed");
} else {
    console.log("Student Failed");
}

Meaning: If marks are 40 or more → Passed; otherwise → Failed.



2. Function

Definition: A reusable block of code that performs a specific task.

Use case: Avoid repeating the same code.

function add(a, b) {
    return a + b;
}

let result = add(10, 20);

console.log(result);

Output:

30
Parameter vs Argument
function greet(name) { }   // name = parameter

greet("Akash");            // "Akash" = argument

3. Types of Functions
Normal Function
function greet(name) {
    return "Hello " + name;
}

console.log(greet("Akash"));

Use: General reusable functionality.

Function Expression

Definition: A function stored inside a variable.

const add = function(a, b) {
    return a + b;
};

console.log(add(10, 20));

Use: Store/pass functions as values.

Arrow Function

Definition: Shorter syntax for writing a function expression.
in arrow function, function keyword replace by =>. if you write one line statement 
{} not required and arrow function by default return the value without return keyword. 

const add = (a, b) => a + b;

console.log(add(10, 20));

Use: Very common in modern JavaScript, especially callbacks and React.

Callback Function

Definition: A function passed to another function to be executed later.

passing function name or function body or function itself to another function as a 
parameter is known as callback functions. 
function processUser(callback) {
    callback("Akash");
}

processUser((name) => {
    console.log("Hello " + name);
});

Output:

Hello Akash

Use: Events, timers, array methods, asynchronous operations.

4. JavaScript Object

Object : any real world entity 
Like Person, Bank, Animal, Customer etc. 

Property --> have 
Behaviour --->do/does 

Definition: A collection of related key-value pairs representing an entity.

Use case: Store related information together.

let student = {
    name: "Rahul",
    age: 20,
    marks: 85
};              this is student object 

let name = "Raj";       these 3 ara normal variables not link to gether. 
let age = 34;
let marks = 56;

console.log(student.name);
console.log(student.marks);

Output:

Rahul
85

5. Built-in Objects

JavaScript provides predefined objects such as:

 Pre defined object 
 as well as user defined objects. 

few are basic pre defined objects. 

Array
String
Math
Date
Object
JSON
Map
Set

Array

Use: Store multiple values.

let students = ["Rahul", "Priya", "Amit"];

console.log(students[0]);

Output:

Rahul

Common methods:

push()
pop()
map()
filter()
reduce()
forEach()
find()

String

let name = "JavaScript";

console.log(name.toUpperCase());
console.log(name.length);

Output:

JAVASCRIPT
10

User-Defined Objects

There are three important ways.

Object Literal: this type of syntax prefer if you want to store only property. 

Use: Create one/few objects.

let student = {
    name: "Rahul",
    marks: 85
};

Constructor Function

Use: Create multiple similar objects; common in older JavaScript code.

function Student(name, marks) {
    this.name = name;
    this.marks = marks;
}

let student1 = new Student("Rahul", 80);
let student2 = new Student("Priya", 90);
Class

Use: Create multiple similar objects with properties and methods; modern syntax.

class Student {

    constructor(name, marks) {
        this.name = name;
        this.marks = marks;
    }

    display() {
        console.log(this.name + " - " + this.marks);
    }
}

let student = new Student("Rahul", 85);

student.display();

Easy comparison:

Object Literal       → One object
Constructor Function → Multiple similar objects
Class                → Multiple similar objects + behavior



8. Events

Definition: An event is an action that happens in the browser or on an HTML element.
when user interact with any web page contents different types of event occurs. 
or 
event provide bridge between html and JS contents. 

Use: Make webpages interactive.

Common events:

click
input
change
submit
keydown
keyup
mouseover
mouseout
focus
blur

Js provide all pre defined event start with pre fix on followed by event names 

onclick 
ondblclick
onmouseover
onkeyup
onkeydown
onsubmit 

etc 

Example
button.addEventListener("click", () => {
    console.log("Button clicked");
});

Meaning:

click happens
     ↓
event detected
     ↓
callback function executes

The recommended modern approach is:

addEventListener()




DOM

Definition: DOM (Document Object Model) represents 
an HTML page as a tree of objects that JavaScript can access and modify.

Use: Dynamically change webpage content, CSS, attributes and elements.

Example

<h1 id="heading">Hello</h1>

<button id="button">Change</button>

let heading = document.getElementById("heading");
let button = document.getElementById("button");

button.addEventListener("click", () => {
    heading.textContent = "Welcome to JavaScript";
});

Meaning:

User clicks button
       ↓
JavaScript catches event
       ↓
Finds <h1>
       ↓
Changes text
       ↓
Webpage updates

Important DOM methods
getElementById()
querySelector()
querySelectorAll()
createElement()
appendChild()
remove()
setAttribute()
addEventListener()

9. Synchronous JavaScript

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

10. Asynchronous JavaScript

Definition: Starts a time-consuming operation and allows other JavaScript work to continue before the result arrives.

Use: API calls, timers, server requests, file operations, etc.

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

11. Promise


Definition: A Promise represents the future result of an asynchronous operation.

Use: Handle asynchronous success or failure.

let promise = new Promise((resolve, reject) => {

    let success = true;

    if (success) {
        resolve("Task completed");
    } else {
        reject("Task failed");
    }
});

promise
    .then(result => console.log(result))
    .catch(error => console.log(error));

Remember:

resolve() → Success
reject()  → Failure

.then()   → Handle success
.catch()  → Handle failure
12. async / await

Definition: Cleaner syntax for working with Promises. It does not replace Promises.

Use: Make asynchronous code easier to read.

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
13. fetch()

Definition: fetch() is a built-in JavaScript function used to make HTTP requests to a REST API/server.

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