HTML Forms
Concept

HTML forms are used to collect user information such as registration, 
login, feedback, admission, and contact details.

Important Form Tags

| Tag          | Purpose                               |
| ------------ | ------------------------------------- |
| `<form>`     | Defines the form                      |
| `<label>`    | Label for a form field                |
| `<input>`    | Accepts user input                    |
| `<textarea>` | Multi-line input                      |
| `<select>`   | Dropdown list                         |
| `<option>`   | Dropdown option                       |
| `<button>`   | Creates a button                      |
| `<fieldset>` | Groups related fields                 |
| `<legend>`   | Caption for a field group             |
| `<datalist>` | Provides predefined input suggestions |
| `<output>`   | Displays calculated/result output     |



Common <input> types

text
email
password
number
date
radio
checkbox
file
url
tel
submit
reset

Complete Form Example

registration.html 

<form action="/students/register" method="post">

    <fieldset>

        <legend>Student Registration</legend>

        <label for="name">Name:</label>
        <input
            type="text"
            id="name"
            name="name"
            placeholder="Enter name"
            required
        >

        <br><br>

        <label for="email">Email:</label>
        <input
            type="email"
            id="email"
            name="email"
            placeholder="Enter email"
        >

        <br><br>

        <label for="password">Password:</label>
        <input
            type="password"
            id="password"
            name="password"
        >

        <br><br>

        <label for="age">Age:</label>
        <input
            type="number"
            id="age"
            name="age"
            min="18"
            max="60"
        >

        <br><br>

        <label for="dob">Date of Birth:</label>
        <input
            type="date"
            id="dob"
            name="dob"
        >

        <br><br>

        <label>Gender:</label>

        <input
            type="radio"
            id="male"
            name="gender"
            value="Male"
        >
        <label for="male">Male</label>

        <input
            type="radio"
            id="female"
            name="gender"
            value="Female"
        >
        <label for="female">Female</label>

        <br><br>

        <label>Skills:</label>

        <input
            type="checkbox"
            id="java"
            name="skills"
            value="Java"
        >
        <label for="java">Java</label>

        <input
            type="checkbox"
            id="python"
            name="skills"
            value="Python"
        >
        <label for="python">Python</label>

        <br><br>

        <label for="course">Course:</label>

        <select id="course" name="course">

            <option value="">Select Course</option>
            <option value="java">Java</option>
            <option value="python">Python</option>
            <option value="mern">MERN</option>

        </select>

        <br><br>

        <label for="address">Address:</label>

        <textarea
            id="address"
            name="address"
            rows="4"
            cols="40"
            placeholder="Enter address"
        ></textarea>

        <br><br>

        <label for="resume">Resume:</label>

        <input
            type="file"
            id="resume"
            name="resume"
        >

        <br><br>

        <button type="submit">
            Register
        </button>

        <button type="reset">
            Clear
        </button>

    </fieldset>

</form>

<div> and <span>
Concept

<div> and <span> are generic containers used to group or 
identify content.

| Tag      | Type        | Common Use                   |
| -------- | ----------- | ---------------------------- |
| `<div>`  | Block-level | Group sections/content       |
| `<span>` | Inline      | Style/identify small content |


Example

<div class="student-card">
    <h2>Rahul Kumar</h2>
    <p>
        Course:
        <span class="course">Java Full Stack</span>
    </p>
    <p>
        Status:
        <span class="status">Active</span>
    </p>
</div>

<div>
 ├── Student Information
 ├── <span>Java Full Stack</span>
 └── <span>Active</span>

div → groups larger/block content
span → identifies small/inline content

Semantic HTML
Concept

Semantic HTML uses meaningful tags that describe the 
purpose of the content.

Instead of using <div> for everything, 
use appropriate semantic elements.

Important Semantic Tags

| Tag         | Purpose                 |
| ----------- | ----------------------- |
| `<header>`  | Header/top section      |
| `<nav>`     | Navigation links        |
| `<main>`    | Main page content       |
| `<section>` | Logical content section |
| `<article>` | Independent content     |
| `<aside>`   | Related/sidebar content |
| `<footer>`  | Footer/bottom section   |
| `<address>` | Contact information     |


Example

<header>

    <h1>College Student Portal</h1>

</header>


<nav>

    <a href="#home">Home</a>
    <a href="#students">Students</a>
    <a href="#courses">Courses</a>
    <a href="#contact">Contact</a>

</nav>


<main>

    <section id="students">

        <h2>Students</h2>

        <p>
            Student information is maintained here.
        </p>

    </section>


    <section id="courses">

        <h2>Courses</h2>

        <p>
            Java, Python and MERN courses are available.
        </p>

    </section>


    <aside>

        <h3>Important Notice</h3>

        <p>
            Student registration closes on Friday.
        </p>

    </aside>

</main>


<footer>

    <p>
        © 2026 College Student Portal
    </p>

</footer>

Key point: Semantic HTML improves code readability, accessibility, SEO, and maintainability.

40. Complete Meaningful Example

Now combine the concepts into a Student Management Portal.

<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta
        name="viewport"
        content="width=device-width, initial-scale=1.0"
    >

    <title>College Student Portal</title>

</head>


<body>

    <!-- Header -->

    <header>

        <h1>College Student Management Portal</h1>

        <p>
            Manage student registration and course information.
        </p>

    </header>


    <hr>


    <!-- Navigation -->

    <nav>

        <a href="#home">Home</a> |

        <a href="#students">Students</a> |

        <a href="#courses">Courses</a> |

        <a href="#registration">Registration</a> |

        <a href="#contact">Contact</a>

    </nav>


    <hr>


    <!-- Home -->

    <main>

        <section id="home">

            <h2>Welcome</h2>

            <p>
                Welcome to the
                <strong>College Student Management Portal</strong>.
            </p>

            <p>
                Students can register for
                <em>technical training programs</em>.
            </p>

        </section>


        <!-- Courses -->

        <section id="courses">

            <h2>Available Courses</h2>

            <ul>

                <li>Java Full Stack</li>

                <li>Python Full Stack</li>

                <li>MERN Stack</li>

                <li>Data Science</li>

            </ul>


            <h3>Admission Process</h3>

            <ol>

                <li>Complete registration</li>

                <li>Upload documents</li>

                <li>Attend counselling</li>

                <li>Confirm admission</li>

            </ol>

        </section>


        <!-- Students -->

        <section id="students">

            <h2>Student Information</h2>

            <table border="1" cellpadding="10">

                <thead>

                    <tr>

                        <th>ID</th>

                        <th>Name</th>

                        <th>Course</th>

                        <th>City</th>

                        <th>Marks</th>

                    </tr>

                </thead>


                <tbody>

                    <tr>

                        <td>101</td>

                        <td>Rahul</td>

                        <td>Java</td>

                        <td>Bengaluru</td>

                        <td>85</td>

                    </tr>


                    <tr>

                        <td>102</td>

                        <td>Priya</td>

                        <td>Python</td>

                        <td>Mumbai</td>

                        <td>91</td>

                    </tr>


                    <tr>

                        <td>103</td>

                        <td>Amit</td>

                        <td>MERN</td>

                        <td>Delhi</td>

                        <td>88</td>

                    </tr>

                </tbody>

            </table>

        </section>


        <!-- Registration -->

        <section id="registration">

            <h2>Student Registration</h2>

            <form
                action="/register"
                method="post"
            >

                <p>

                    <label for="name">
                        Full Name:
                    </label>

                    <br>

                    <input
                        type="text"
                        id="name"
                        name="name"
                        placeholder="Enter full name"
                        required
                    >

                </p>


                <p>

                    <label for="email">
                        Email:
                    </label>

                    <br>

                    <input
                        type="email"
                        id="email"
                        name="email"
                        placeholder="Enter email"
                        required
                    >

                </p>


                <p>

                    <label for="password">
                        Password:
                    </label>

                    <br>

                    <input
                        type="password"
                        id="password"
                        name="password"
                        required
                    >

                </p>


                <p>

                    <label for="age">
                        Age:
                    </label>

                    <br>

                    <input
                        type="number"
                        id="age"
                        name="age"
                        min="17"
                        max="60"
                    >

                </p>


                <p>

                    <label for="dob">
                        Date of Birth:
                    </label>

                    <br>

                    <input
                        type="date"
                        id="dob"
                        name="dob"
                    >

                </p>


                <p>

                    <strong>Gender:</strong>

                    <br>

                    <input
                        type="radio"
                        id="male"
                        name="gender"
                        value="Male"
                    >

                    <label for="male">
                        Male
                    </label>


                    <input
                        type="radio"
                        id="female"
                        name="gender"
                        value="Female"
                    >

                    <label for="female">
                        Female
                    </label>

                </p>


                <p>

                    <strong>Skills:</strong>

                    <br>

                    <input
                        type="checkbox"
                        id="java"
                        name="skills"
                        value="Java"
                    >

                    <label for="java">
                        Java
                    </label>


                    <input
                        type="checkbox"
                        id="python"
                        name="skills"
                        value="Python"
                    >

                    <label for="python">
                        Python
                    </label>


                    <input
                        type="checkbox"
                        id="javascript"
                        name="skills"
                        value="JavaScript"
                    >

                    <label for="javascript">
                        JavaScript
                    </label>

                </p>


                <p>

                    <label for="course">
                        Select Course:
                    </label>

                    <br>

                    <select
                        id="course"
                        name="course"
                        required
                    >

                        <option value="">
                            Select Course
                        </option>

                        <option value="java">
                            Java Full Stack
                        </option>

                        <option value="python">
                            Python Full Stack
                        </option>

                        <option value="mern">
                            MERN Stack
                        </option>

                    </select>

                </p>


                <p>

                    <label for="address">
                        Address:
                    </label>

                    <br>

                    <textarea
                        id="address"
                        name="address"
                        rows="5"
                        cols="40"
                        placeholder="Enter address"
                    ></textarea>

                </p>


                <p>

                    <label for="resume">
                        Upload Resume:
                    </label>

                    <br>

                    <input
                        type="file"
                        id="resume"
                        name="resume"
                    >

                </p>


                <button type="submit">
                    Register Student
                </button>


                <button type="reset">
                    Clear
                </button>

            </form>

        </section>

    </main>


    <hr>


    <!-- Contact -->

    <section id="contact">

        <h2>Contact Us</h2>

        <address>

            College Student Support Center<br>

            Bengaluru, Karnataka<br>

            Email:
            <a href="mailto:support@college.com">
                support@college.com
            </a>

            <br>

            Phone:
            <a href="tel:+919876543210">
                +91 98765 43210
            </a>

        </address>

    </section>


    <!-- Footer -->

    <footer>

        <p>
            &copy; 2026 College Student Portal.
            All Rights Reserved.
        </p>

    </footer>


</body>

</html>



CSS – Cascading Style Sheets
CSS Definition

CSS (Cascading Style Sheets) is used to style and 
design HTML elements.

CSS controls:

Colors
Fonts
Backgrounds
Spacing
Borders
Size
Alignment
Layout

HTML     → Structure
CSS      → Style + Layout
JavaScript → Behaviour

Simple Example

<h1>Student Portal</h1>

h1 {
    color: blue;
    font-size: 30px;
}

Types of CSS

Inline CSS

CSS is written inside the HTML element.

<h1 style="color: blue;">Student Portal</h1>

Internal CSS

CSS is written inside <style> this tag must be inside a head body. 

<style>
    h1 {
        color: blue;
    }
</style>

<h1>Welcome to Internal or Embedded CSS </h1>

External CSS

CSS is written in a separate file.

<link rel="stylesheet" href="style.css">
h1 {
    color: blue;
}

External CSS is preferred for real-world applications because the same CSS can be reused across multiple HTML pages.

CSS Selectors

A selector identifies the HTML element to which CSS should be applied.

Element Selector

Selects all elements of a particular type.

p {
    color: gray;
}

Class Selector

Used when multiple elements need the same style.

<p class="student">Rahul</p>
<p class="student">Priya</p>

.student {
    color: blue;
}

ID Selector

Used to identify a specific element.

<h1 id="title">Student Portal</h1>

#title {
    color: green;
}

Group Selector

Applies the same style to multiple elements.

h1, h2, p {
    font-family: Arial;
}


Selector Summary

| Selector | Syntax    | Example       |
| -------- | --------- | ------------- |
| Element  | `element` | `p {}`        |
| Class    | `.class`  | `.student {}` |
| ID       | `#id`     | `#title {}`   |
| Group    | `A, B`    | `h1, p {}`    |


Basic CSS Properties

.student {
    color: blue;
    background-color: lightgray;

    font-family: Arial;
    font-size: 18px;
    font-weight: bold;

    width: 300px;
    height: 150px;

    margin: 20px;
    padding: 20px;

    border: 1px solid black;
    border-radius: 10px;

    text-align: center;
}

| Property           | Purpose               |
| ------------------ | --------------------- |
| `color`            | Text color            |
| `background-color` | Background color      |
| `font-family`      | Font type             |
| `font-size`        | Text size             |
| `font-weight`      | Text thickness        |
| `text-align`       | Text alignment        |
| `width`            | Element width         |
| `height`           | Element height        |
| `margin`           | Outside spacing       |
| `padding`          | Inside spacing        |
| `border`           | Border around element |
| `border-radius`    | Rounded corners       |


CSS Box Model

Every HTML element is treated as a box.

The Box Model contains:

Content
   ↓
Padding
   ↓
Border
   ↓
Margin

        Margin
  ┌─────────────────┐
  │     Border      │
  │  ┌───────────┐  │
  │  │  Padding  │  │
  │  │ ┌───────┐ │  │
  │  │ │Content│ │  │
  │  │ └───────┘ │  │
  │  └───────────┘  │
  └─────────────────┘

  Example using box model 

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">

    <title>Student Profile</title>

    <!-- External CSS -->
    <link rel="stylesheet" href="style.css">
</head>

<body>

    <div class="student-card">

        <h2>Rahul Kumar</h2>

        <p>Course: Java Full Stack</p>

        <p>Email: rahul@example.com</p>

        <button>View Profile</button>

    </div>

</body>

</html>

external css file

/* Student Card */

.student-card {

    /* Content */
    width: 300px;

    /* Padding - space inside */
    padding: 20px;

    /* Border */
    border: 2px solid #2563eb;

    /* Margin - space outside */
    margin: 50px auto;

    /* Other styling */
    background-color: #f0f7ff;

    border-radius: 10px;

    font-family: Arial, sans-serif;

    text-align: center;
}


/* Heading */

.student-card h2 {
    color: #2563eb;
}


/* Button */

.student-card button {

    padding: 10px 20px;

    background-color: #2563eb;

    color: white;

    border: none;

    border-radius: 5px;

    cursor: pointer;
}

CSS Flex box

Flex box is used to arrange HTML elements in a row or 
column and control their alignment and spacing.

The parent element becomes a Flex container:

.container {
    display: flex;
}
Important Flex Properties

.container {
    display: flex;

    flex-direction: row;

    justify-content: space-between;

    align-items: center;

    gap: 20px;

    flex-wrap: wrap;
}

| Property          | Purpose                           |
| ----------------- | --------------------------------- |
| `display: flex`   | Creates Flex container            |
| `flex-direction`  | Row or column                     |
| `justify-content` | Main-axis alignment               |
| `align-items`     | Cross-axis alignment              |
| `gap`             | Space between items               |
| `flex-wrap`       | Allows items to move to next line |


CSS Box Model vs Flexbox

A simple way to explain this to students is:

Box Model → controls the space and size of an individual element.
Flexbox → controls the arrangement and alignment of multiple elements.

Complete Working Example

This example uses External CSS, Box Model, and Flexbox together.

Folder Structure

student-portal/
│
├── index.html
└── style.css

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">

    <title>Student Course Portal</title>

    <!-- External CSS -->
    <link rel="stylesheet" href="style.css">

</head>

<body>


    <!-- Header -->

    <header class="header">

        <h1>Student Portal</h1>

        <nav>
            <a href="#">Home</a>
            <a href="#">Students</a>
            <a href="#">Courses</a>
        </nav>

    </header>


    <!-- Main -->

    <main>

        <h2 class="page-title">
            Available Courses
        </h2>


        <!-- FLEX CONTAINER -->

        <section class="course-container">


            <!-- FLEX ITEM -->

            <div class="course-card">

                <h3>Java Full Stack</h3>

                <p>
                    Learn Java, Spring Boot,
                    React and SQL.
                </p>

                <button>
                    Enroll
                </button>

            </div>


            <!-- FLEX ITEM -->

            <div class="course-card">

                <h3>Python Full Stack</h3>

                <p>
                    Learn Python, Django,
                    React and Database.
                </p>

                <button>
                    Enroll
                </button>

            </div>


            <!-- FLEX ITEM -->

            <div class="course-card">

                <h3>MERN Stack</h3>

                <p>
                    Learn MongoDB, Express,
                    React and Node.js.
                </p>

                <button>
                    Enroll
                </button>

            </div>


        </section>

    </main>


    <!-- Footer -->

    <footer>

        <p>
            © 2026 Student Portal
        </p>

    </footer>


</body>

</html>

/* =========================
   GLOBAL
========================= */

* {
    box-sizing: border-box;
}

body {
    margin: 0;

    font-family: Arial, sans-serif;

    background-color: #f4f6f8;

    color: #333;
}


/* =========================
   HEADER
========================= */

.header {

    /* Flexbox */

    display: flex;

    justify-content: space-between;

    align-items: center;


    /* Box Model */

    padding: 20px 40px;


    /* Styling */

    background-color: #1f2937;

    color: white;
}


.header h1 {
    margin: 0;
}


nav {

    display: flex;

    gap: 20px;
}


nav a {

    color: white;

    text-decoration: none;
}


nav a:hover {

    text-decoration: underline;
}


/* =========================
   PAGE TITLE
========================= */

.page-title {

    margin: 40px 0 25px;

    text-align: center;

    color: #1e3a8a;
}


/* =========================
   FLEX CONTAINER
========================= */

.course-container {

    /* Flexbox */

    display: flex;

    flex-direction: row;

    justify-content: space-between;

    align-items: stretch;

    gap: 20px;

    flex-wrap: wrap;


    /* Container spacing */

    width: 90%;

    margin: 0 auto;
}


/* =========================
   COURSE CARD
========================= */

.course-card {

    /*
       FLEXBOX
       Each card shares
       available space
    */

    flex: 1;

    min-width: 250px;


    /*
       BOX MODEL
    */

    padding: 25px;

    border: 2px solid #ddd;

    margin: 5px;


    /*
       Other CSS
    */

    background-color: white;

    border-radius: 10px;

    box-shadow: 0 3px 8px
                rgba(0, 0, 0, 0.1);
}


/* Card Heading */

.course-card h3 {

    margin-top: 0;

    color: #2563eb;

    font-size: 22px;
}


/* Card Paragraph */

.course-card p {

    line-height: 1.6;

    margin-bottom: 20px;
}


/* Button */

.course-card button {

    padding: 10px 20px;

    border: none;

    border-radius: 5px;

    background-color: #2563eb;

    color: white;

    cursor: pointer;
}


.course-card button:hover {

    background-color: #1d4ed8;
}


/* =========================
   FOOTER
========================= */

footer {

    margin-top: 40px;

    padding: 20px;

    text-align: center;

    background-color: #1f2937;

    color: white;
}


/* =========================
   RESPONSIVE
========================= */

@media (max-width: 700px) {

    .header {

        flex-direction: column;

        gap: 15px;
    }


    .course-container {

        flex-direction: column;
    }

}


JavaScript Notes
JavaScript Definition

JavaScript is a scripting object based interpreter language used to add logic, interactivity and dynamic behavior to web applications.

HTML       → Structure
CSS        → Design
JavaScript → Logic + Behaviour

Common Use Cases

Form validation
Button click events
Dynamic web pages
Calculations
API communication
DOM manipulation
Interactive dashboards
Frontend applications using React
Backend development using Node.js


Variables, Constants & Primitive Types
Variables

Variables are used to store data.

JavaScript provides:

let
const
var

let

Used when the value can change.
let age = 20;
age = 21;

const

Used when the variable should not be reassigned.

const college = "ABC College";
// Error
college = "XYZ College";

var

Older way of declaring variables.

var name = "Rahul";

Recommended: Use let and const in modern JavaScript.

Primitive Data Types

Primitive types represent basic values.

| Type      | Example                 |
| --------- | ----------------------- |
| String    | `"Rahul"`               |
| Number    | `25`, `85.5`            |
| Boolean   | `true`, `false`         |
| Undefined | `let x;`                |
| Null      | `let x = null;`         |
| BigInt    | `12345678901234567890n` |
| Symbol    | `Symbol("id")`          |


Example
let name = "Rahul";       // String
let age = 21;             // Number
let passed = true;        // Boolean
let result;               // Undefined
let address = null;       // Null

Operators & Expressions

An operator performs an operation on values.

An expression is a combination of values, variables and operators that produces a result.

Arithmetic Operators

| Operator | Meaning        | Example  |
| -------- | -------------- | -------- |
| `+`      | Addition       | `10 + 5` |
| `-`      | Subtraction    | `10 - 5` |
| `*`      | Multiplication | `10 * 5` |
| `/`      | Division       | `10 / 5` |
| `%`      | Remainder      | `10 % 3` |
| `**`     | Power          | `2 ** 3` |


let marks = 80;
let bonus = 5;

let total = marks + bonus;

console.log(total); // 85

Assignment Operators
let marks = 80;

marks += 5;    // 85
marks -= 5;    // 80
marks *= 2;    // 160
marks /= 2;    // 80

Comparison Operators

Used to compare values.

| Operator | Meaning               |
| -------- | --------------------- |
| `==`     | Equal value           |
| `===`    | Equal value and type  |
| `!=`     | Not equal             |
| `!==`    | Not equal value/type  |
| `>`      | Greater than          |
| `<`      | Less than             |
| `>=`     | Greater than or equal |
| `<=`     | Less than or equal    |


Example
let marks = 75;

console.log(marks >= 40);  // true
console.log(marks === 75); // true

Prefer === and !== in modern JavaScript.

Logical Operators

Logical operators combine conditions.

| Operator | Meaning | Example                |    |       |   |         |
| -------- | ------- | ---------------------- | -- | ----- | - | ------- |
| `&&`     | AND     | `age >= 18 && citizen` |    |       |   |         |
| `        |         | `                      | OR | `java |   | python` |
| `!`      | NOT     | `!loggedIn`            |    |       |   |         |


AND

Both conditions must be true.

let age = 20;
let hasId = true;

console.log(age >= 18 && hasId);

Result:

true
OR

At least one condition must be true.

let java = true;
let python = false;

console.log(java || python);

Result:

true
NOT

Reverses the result.

let loggedIn = false;

console.log(!loggedIn);

Result:

true
Control Flow

Control flow determines which statements should execute and how many times.

Control Flow
     │
     ├── if
     ├── if-else
     ├── else-if
     ├── switch
     ├── for
     ├── while
     └── do-while
if

Executes code when a condition is true.

let marks = 75;

if (marks >= 40) {
    console.log("Pass");
}
if-else
let marks = 35;

if (marks >= 40) {
    console.log("Pass");
} else {
    console.log("Fail");
}
if-else-if

Useful when there are multiple conditions.

let marks = 82;

if (marks >= 90) {
    console.log("A+");
} else if (marks >= 75) {
    console.log("A");
} else if (marks >= 60) {
    console.log("B");
} else if (marks >= 40) {
    console.log("C");
} else {
    console.log("Fail");
}
switch

Used when we need to compare one value against multiple possible values.

let course = "Java";

switch (course) {

    case "Java":
        console.log("Java Full Stack");
        break;

    case "Python":
        console.log("Python Full Stack");
        break;

    case "MERN":
        console.log("MERN Stack");
        break;

    default:
        console.log("Course not available");
}
Loops

Loops execute a block of code repeatedly.

for Loop

Used when the number of iterations is known.

for (let i = 1; i <= 5; i++) {
    console.log(i);
}

Output:

1
2
3
4
5
while Loop

Used when execution depends on a condition.

let i = 1;

while (i <= 5) {

    console.log(i);

    i++;
}
do-while

Executes at least once, even if the condition is initially false.

let i = 1;

do {

    console.log(i);

    i++;

} while (i <= 5);
Demo – Logical Operators & Control Flow
Student Eligibility Example

Suppose a student can register for an advanced course when:

Age is at least 18
Marks are at least 60
Student has completed the prerequisite course
let age = 20;
let marks = 75;
let prerequisiteCompleted = true;

if (
    age >= 18 &&
    marks >= 60 &&
    prerequisiteCompleted
) {
    console.log("Student is eligible");
} else {
    console.log("Student is not eligible");
}

Output:

Student is eligible

