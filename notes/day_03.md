
ALTER TABLE

Used to modify an existing table structure.

alter table tableName 
    add
    drop 
    modify 

Add a Column

ALTER TABLE customers
ADD phone VARCHAR(15);


Meaning

The existing customers table now has an additional phone column.


below query help to add, modify and drop columns in existing table 

alter table customers add gender varchar(1);
alter table customers modify column gender varchar(5);
alter table customers drop column city;


DROP TABLE

Used to remove a table completely.

DROP TABLE customers;

Removes the table structure.
Removes the data stored in the table.

TRUNCATE TABLE

Used to remove all records while keeping the table structure.

TRUNCATE TABLE customers;

Difference

drop 
1. ddl 
2. it remove table structure as well as all records. 

truncate 
1. ddl 
2. it remove all records but not table structure 
3. with truncate we can't use where clause. 
4. once we delete using truncate we can't undo. 

delete 
1. dml 
2. it remove all records but not table structure 
3. with delete we can use where clause 
4. if we delete using delete we an undo ie rollback using tcl commands. 

mysql function 

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    department VARCHAR(50),
    salary DECIMAL(10,2),
    city VARCHAR(50)
);

INSERT INTO employees
(emp_id, emp_name, department, salary, city)
VALUES
(101, 'Rahul', 'IT', 60000, 'Bengaluru'),
(102, 'Priya', 'HR', 45000, 'Mumbai'),
(103, 'Amit', 'IT', 75000, 'Bengaluru'),
(104, 'Sneha', 'Finance', 55000, 'Delhi'),
(105, 'Kiran', 'IT', 65000, 'Chennai'),
(106, 'Neha', 'HR', 50000, 'Bengaluru');


1. SQL Functions

function is a set of instruction to perform a specific task. 
function mainly divided into 2 parts. 
1. user defined function (pl sql)
2. pre defined functions. 

SQL functions are predefined operations used to 
perform calculations or manipulate data.

Two Basic Types
Type	Meaning

1. Single-Row Function	Works on one row at a time. it takes 
one or more than one parameter and return value or result. the result 
apply for each record individually. 

2. Multi-Row Function	Works on multiple rows and returns one result

Single-Row Functions
Operate on each individual record.
Return one result for each input row.

Commonly used in SELECT, WHERE, and ORDER BY.

Common Categories

String functions
Numeric functions
Date functions
Conversion functions
Conditional functions

3. String Functions
UPPER()

Converts text to uppercase.

SELECT emp_name, UPPER(emp_name) AS uppercase_name
FROM employees;

Result
emp_name	uppercase_name
Rahul	RAHUL
Priya	PRIYA
Amit	AMIT

LOWER()

Converts text to lowercase.

SELECT emp_name, LOWER(emp_name) AS lowercase_name
FROM employees;

LENGTH()

Returns the number of characters.

SELECT emp_name, LENGTH(emp_name) AS name_length
FROM employees;

Example:

emp_name	name_length
Rahul	5
Priya	5
Sneha	5

CONCAT()

Combines two or more values.

SELECT
    emp_name,
    CONCAT(emp_name, ' - ', department) AS employee_info
FROM employees;

Result:

emp_name	employee_info
Rahul	Rahul - IT
Priya	Priya - HR
Amit	Amit - IT


4. Numeric Functions

ROUND()

Rounds a numeric value.

SELECT
    emp_name,
    salary,
    ROUND(salary / 12, 2) AS monthly_salary
FROM employees;

CEIL()

Returns the smallest integer greater than or equal to the value.

SELECT CEIL(45.3) AS result;

Result:

result
46

FLOOR()

Returns the largest integer less than or equal to the value.

SELECT FLOOR(45.8) AS result;

Result:

result
45
ABS()

Returns the absolute value.

SELECT ABS(-500) AS result;

Result:

result
500

5. Date Functions

Assume an employees table also has:

joining_date
Current Date

SELECT CURRENT_DATE;

Extract Year

SELECT
    emp_name,
    YEAR(joining_date) AS joining_year
FROM employees;

Extract Month

SELECT
    emp_name,
    MONTH(joining_date) AS joining_month
FROM employees;

Date functions vary slightly between MySQL, 
PostgreSQL, Oracle, and SQL Server.

6. Conditional Function – CASE

CASE is used to implement conditional logic in SQL.

Example

Classify employees based on salary.

SELECT
    emp_name,
    salary,
    CASE
        WHEN salary >= 70000 THEN 'High'
        WHEN salary >= 50000 THEN 'Medium'
        ELSE 'Low'
    END AS salary_level
FROM employees;

Example Result
emp_name	salary	salary_level
Rahul	60000	Medium
Priya	45000	Low
Amit	75000	High
Sneha	55000	Medium
Arjun	70000	High


Multi-Row Functions / Aggregate Functions

Multi-row functions operate on multiple records 
and return a single result.

Also called Aggregate Functions.

Important Aggregate Functions

Function	Purpose
COUNT()	Count records
SUM()	Calculate total
AVG()	Calculate average
MIN()	Find minimum
MAX()	Find maximum

8. COUNT()

Find total number of employees.

SELECT COUNT(*) AS total_employees
FROM employees;

Result:

total_employees
8

Count Employees with Salary

SELECT COUNT(salary) AS employees_with_salary
FROM employees;

9. SUM()

Calculate total salary.

SELECT SUM(salary) AS total_salary
FROM employees;

Result:

total_salary
500000
10. AVG()

Calculate average salary.

SELECT AVG(salary) AS average_salary
FROM employees;
11. MIN()

Find the lowest salary.

SELECT MIN(salary) AS minimum_salary
FROM employees;
12. MAX()

Find the highest salary.

SELECT MAX(salary) AS maximum_salary
FROM employees;
13. Using Multiple Aggregate Functions

SELECT
    COUNT(*) AS total_employees,
    SUM(salary) AS total_salary,
    AVG(salary) AS average_salary,
    MIN(salary) AS minimum_salary,
    MAX(salary) AS maximum_salary
FROM employees;

Example Result
total_employees	total_salary	average_salary	minimum_salary	maximum_salary
8	500000	62500	45000	80000


14. GROUP BY

GROUP BY is used to divide records 
into groups based on one or more columns.

It is commonly used with aggregate functions.

Example

Find the number of employees in each department.

SELECT
    department,
    COUNT(*) AS employee_count
FROM employees

GROUP BY department;
Result
department	employee_count
Finance	2
HR	2
IT	4

15. GROUP BY with SUM()
Requirement

Find total salary paid by each department.

SELECT
    department,
    SUM(salary) AS total_salary
FROM employees
GROUP BY department;
Result
department	total_salary
Finance	125000
HR	95000
IT	280000

16. GROUP BY with AVG()
Requirement

Find the average salary for each department.

SELECT
    department,
    AVG(salary) AS average_salary
FROM employees
GROUP BY department;
Result
department	average_salary
Finance	62500
HR	47500
IT	70000

17. GROUP BY with MIN() and MAX()
Requirement

Find the minimum and maximum salary in each department.

SELECT
    department,
    MIN(salary) AS minimum_salary,
    MAX(salary) AS maximum_salary
FROM employees
GROUP BY department;
Result
department	minimum_salary	maximum_salary
Finance	55000	70000
HR	45000	50000
IT	60000	80000

18. GROUP BY Multiple Columns

We can group using more than one column.

Example

Find the number of employees in each city within each department.

SELECT
    department,
    city,
    COUNT(*) AS employee_count
FROM employees
GROUP BY department, city;

Example result:

department	city	employee_count
Finance	Delhi	1
Finance	Mumbai	1
HR	Bengaluru	1
HR	Mumbai	1
IT	Bengaluru	2
IT	Chennai	1
IT	Hyderabad	1

19. WHERE + GROUP BY

WHERE filters individual rows before grouping.

Requirement

Find the number of IT employees in Bengaluru.

SELECT
    department,
    COUNT(*) AS employee_count
FROM employees
WHERE department = 'IT'
AND city = 'Bengaluru'
GROUP BY department;
Flow
FROM
 ↓
WHERE
 ↓
GROUP BY
 ↓
Aggregate Function

Where clause 
1. both is use to filter the records. 
2. it is use to apply condition for individual records 
3. it can use with or without group by but before group by. 

having clause 
1. both is use to filter the records. 
2. it is use to apply the condition for group of records. 
3. it must be with group by clause and after group by. 

20. HAVING

HAVING is used to filter groups after GROUP BY.

Requirement

Show departments having more than 2 employees.

SELECT
    department,
    COUNT(*) AS employee_count
FROM employees
GROUP BY department
HAVING COUNT(*) > 2;
Result
department	employee_count
IT	4
21. HAVING with SUM()
Requirement

Show departments where total salary is greater than ₹1,00,000.

SELECT
    department,
    SUM(salary) AS total_salary
FROM employees
GROUP BY department
HAVING SUM(salary) > 100000;
Result
department	total_salary
Finance	125000
IT	280000
22. HAVING with AVG()
Requirement

Show departments where average salary is greater than ₹60,000.

SELECT
    department,
    AVG(salary) AS average_salary
FROM employees
GROUP BY department
HAVING AVG(salary) > 60000;
Result
department	average_salary
Finance	62500
IT	70000
23. WHERE vs HAVING

This is an important interview concept.

WHERE	HAVING
Filters individual rows	Filters groups
Applied before grouping	Applied after grouping
Normally used with regular columns	Commonly used with aggregate conditions
WHERE salary > 50000	HAVING AVG(salary) > 60000
Example

WHERE:

SELECT *
FROM employees
WHERE salary > 50000;

HAVING:

SELECT department, AVG(salary)
FROM employees
GROUP BY department
HAVING AVG(salary) > 60000;
Easy Memory

WHERE → Filter Rows

GROUP BY → Create Groups

HAVING → Filter Groups


select department,sum(salary) total_salary from employees group by department;
select department,sum(salary) total_salary,count(*) total_employee from employees group by department;
select department,sum(salary) total_salary,count(*) total_employee from employees where department is not null group by department;

You 10:14
select department,sum(salary) total_salary,count(*) total_employee from employees where department is not null group by department having sum(salary) > 50000;
select department,sum(salary) total_salary,count(*) total_employee from employees where department is not null group by department having sum(salary) > 50000 order by total_employee asc;

24. WHERE + GROUP BY + HAVING + ORDER BY
Business Requirement

Find departments whose employees earn an average salary above ₹50,000, considering only employees earning more than ₹45,000, and display the highest average salary first.

SELECT
    department,
    COUNT(*) AS employee_count,
    AVG(salary) AS average_salary
FROM employees
WHERE salary > 45000
GROUP BY department
HAVING AVG(salary) > 50000
ORDER BY average_salary DESC;
Query Concept
WHERE
 ↓
Filter employees
 ↓
GROUP BY
 ↓
Create department groups
 ↓
AVG()
 ↓
HAVING
 ↓
Filter departments
 ↓
ORDER BY
 ↓
Sort result
25. Single-Row vs Multi-Row Functions
Single-Row Function	Multi-Row / Aggregate Function
Works on one row at a time	Works on multiple rows
Returns one result per row	Usually returns one result per group
UPPER()	COUNT()
LOWER()	SUM()
LENGTH()	AVG()
CONCAT()	MIN()
ROUND()	MAX()
CASE	Used with GROUP BY
Simple Example

Single-row:

SELECT emp_name, UPPER(emp_name)
FROM employees;

→ One result for each employee.

Multi-row:

SELECT AVG(salary)
FROM employees;

→ One result for all employees.

26. Important Query Patterns
Total Employees
SELECT COUNT(*)
FROM employees;
Total Salary
SELECT SUM(salary)
FROM employees;
Average Salary
SELECT AVG(salary)
FROM employees;
Highest Salary
SELECT MAX(salary)
FROM employees;
Lowest Salary
SELECT MIN(salary)
FROM employees;
Employees Per Department
SELECT department, COUNT(*)
FROM employees
GROUP BY department;
Salary Per Department
SELECT department, SUM(salary)
FROM employees
GROUP BY department;
Departments with More Than 2 Employees
SELECT department, COUNT(*)
FROM employees
GROUP BY department
HAVING COUNT(*) > 2;


1. What is HTML?
Concept

HTML (HyperText Markup Language) is the standard markup language used to create the structure of web pages.

HTML defines what content appears on a webpage, such as:

Heading
Paragraph
Image
Link
List
Table
Form
Navigation
Sections

HTML is not a programming language because it does not contain programming logic such as loops, conditions, or functions.

Example
<h1>College Student Management System</h1>

<p>
    Welcome to the Student Management Portal.
</p>
Output

College Student Management System

Welcome to the Student Management Portal.

2. HTML Document Structure
Concept

Every HTML5 page normally starts with a standard document structure.

Syntax
<!DOCTYPE html>

<html>

<head>

    <title>Page Title</title>

</head>

<body>

    Page Content

</body>

</html>
Meaning of each tag
Tag	Meaning
<!DOCTYPE html>	Tells browser that document uses HTML5
<html>	Root element
<head>	Contains page information/configuration
<title>	Browser tab title
<body>	Visible webpage content
Meaningful Example
<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">

    <title>Student Portal</title>

</head>

<body>

    <h1>College Student Management System</h1>

    <p>
        Manage student information and courses.
    </p>

</body>

</html>
3. <head> and <body>
<head>

The <head> contains information about the webpage, rather than the main visible content.

Common elements:

<head>

    <meta charset="UTF-8">

    <meta
        name="viewport"
        content="width=device-width, initial-scale=1.0"
    >

    <title>Student Portal</title>

</head>
Important tags inside <head>
<title>
<meta>
<link>
<style>
<script>
<body>

Contains the content displayed to users.

<body>

    <h1>Student Portal</h1>

    <p>Welcome students.</p>

</body>
4. Heading Tags
Concept

HTML provides six levels of headings.

<h1>College</h1>
<h2>Departments</h2>
<h3>Computer Science</h3>
<h4>Courses</h4>
<h5>Subjects</h5>
<h6>Topics</h6>
Hierarchy
h1
 ├── h2
 │    ├── h3
 │    └── h3
 │
 └── h2
Meaningful Example
<h1>Acharya College</h1>

<h2>Departments</h2>

<h3>Computer Science</h3>

<h3>Information Science</h3>

<h2>Courses</h2>

<h3>BCA</h3>

<h3>B.Tech</h3>
Key point

<h1> is the highest-level heading and <h6> is the lowest.

5. Paragraph <p>
Concept

The <p> tag is used to represent a paragraph.

Example
<h2>About the College</h2>

<p>
    Our college provides undergraduate and postgraduate
    programs in computer science, engineering and management.
</p>
Key point

Use <p> for normal textual content instead of using headings for paragraphs.

6. Line Break <br>
Concept

<br> moves content to the next line.

Example
<p>
    Student Name: Rahul Kumar<br>
    Course: B.Tech Computer Science<br>
    Semester: First Semester
</p>

Output:

Student Name: Rahul Kumar
Course: B.Tech Computer Science
Semester: First Semester
Key point

<br> is useful for a line break, but should not normally be used to create page spacing.

7. Horizontal Line <hr>
Concept

<hr> represents a thematic break between sections.

Example
<h2>Student Details</h2>

<p>Rahul Kumar - B.Tech</p>

<hr>

<h2>Course Details</h2>

<p>Computer Science Engineering</p>
8. Text Formatting Tags

HTML provides several tags for emphasizing or formatting content.

Tag	Purpose
<b>	Bold appearance
<strong>	Important content
<i>	Italic appearance
<em>	Emphasized content
<u>	Underlined text
<mark>	Highlighted text
<del>	Deleted text
<small>	Smaller text
<sub>	Subscript
<sup>	Superscript
Meaningful Example
<p>
    Student Name:
    <strong>Rahul Kumar</strong>
</p>

<p>
    Course:
    <em>Computer Science</em>
</p>

<p>
    Status:
    <mark>Active</mark>
</p>

<p>
    Previous Fee:
    <del>₹50,000</del>
    Current Fee:
    <strong>₹45,000</strong>
</p>
<sub> Example

Used for chemical formulas.

<p>
    Water = H<sub>2</sub>O
</p>

Output:

Water = H₂O

<sup> Example

Used for mathematical expressions.

<p>
    Area = x<sup>2</sup>
</p>

Output:

Area = x²

9. HTML Links – <a>
Concept

The <a> tag creates a hyperlink.

Basic syntax:

<a href="URL">
    Link Text
</a>
Meaningful Example
<a href="https://www.google.com">
    Search Student Information
</a>
Open Link in New Tab
<a
    href="https://www.google.com"
    target="_blank"
>
    Open Google
</a>
Important attributes
Attribute	Purpose
href	Destination
target	Where to open link
10. Internal Links
Concept

An internal link takes the user to another section of the same page.

Example
<a href="#registration">
    Register Student
</a>

Target:

<section id="registration">

    <h2>Student Registration</h2>

</section>
Flow
Click "Register Student"
          ↓
href="#registration"
          ↓
Find id="registration"
          ↓
Move to registration section

This is very useful for:

Navigation menus
Single-page websites
Long webpages
11. Email and Telephone Links
Email
<a href="mailto:admissions@college.com">
    Email Admissions
</a>
Telephone
<a href="tel:+919876543210">
    Call Admissions
</a>

These are commonly used on Contact Us pages.

12. Images – <img>
Concept

The <img> tag displays an image.

Syntax
<img
    src="image.jpg"
    alt="Description"
>
Meaningful Example
<img
    src="college-campus.jpg"
    alt="College Campus"
    width="500"
>
Important attributes
Attribute	Purpose
src	Image location
alt	Alternative text
width	Image width
height	Image height
Important point

<img> does not have a closing tag.

<img src="student.jpg">

Not:

<img src="student.jpg"></img>
13. Unordered List – <ul>
Concept

Used when the order of items does not matter.

Example
<h2>Available Courses</h2>

<ul>

    <li>Java Full Stack</li>

    <li>Python Full Stack</li>

    <li>MERN Stack</li>

    <li>Data Science</li>

</ul>

Output:

Java Full Stack
Python Full Stack
MERN Stack
Data Science
14. Ordered List – <ol>
Concept

Used when the order/sequence is important.

Example
<h2>Student Admission Process</h2>

<ol>

    <li>Submit Application</li>

    <li>Upload Documents</li>

    <li>Attend Counselling</li>

    <li>Pay Admission Fee</li>

    <li>Confirm Admission</li>

</ol>

Output:

Submit Application
Upload Documents
Attend Counselling
Pay Admission Fee
Confirm Admission
15. Description List – <dl>
Concept

Used for terms and their descriptions.

Example
<dl>

    <dt>HTML</dt>

    <dd>
        Used to create webpage structure.
    </dd>


    <dt>CSS</dt>

    <dd>
        Used to style webpages.
    </dd>


    <dt>JavaScript</dt>

    <dd>
        Used to add webpage behavior.
    </dd>

</dl>
Tags
<dl> → Description List
<dt> → Description Term
<dd> → Description Details
16. HTML Tables
Concept

Tables are used to display structured information in rows and columns.

Basic structure
<table>
    <tr>
        <th>Header</th>
    </tr>

    <tr>
        <td>Data</td>
    </tr>
</table>
Meaningful Example
<h2>Student Information</h2>

<table border="1">

    <tr>

        <th>Student ID</th>
        <th>Name</th>
        <th>Course</th>
        <th>Marks</th>

    </tr>

    <tr>

        <td>101</td>
        <td>Rahul</td>
        <td>B.Tech</td>
        <td>85</td>

    </tr>

    <tr>

        <td>102</td>
        <td>Priya</td>
        <td>BCA</td>
        <td>91</td>

    </tr>

</table>
Tags
Tag	Meaning
<table>	Creates table
<tr>	Table row
<th>	Table heading
<td>	Table data
17. Table Sections

For professional HTML, tables can be divided into:

<table>

    <thead>
        Table headings
    </thead>

    <tbody>
        Table data
    </tbody>

    <tfoot>
        Summary
    </tfoot>

</table>
Meaningful Example
<table border="1">

    <thead>

        <tr>

            <th>ID</th>
            <th>Name</th>
            <th>Marks</th>

        </tr>

    </thead>


    <tbody>

        <tr>

            <td>101</td>
            <td>Rahul</td>
            <td>85</td>

        </tr>

        <tr>

            <td>102</td>
            <td>Priya</td>
            <td>91</td>

        </tr>

    </tbody>


    <tfoot>

        <tr>

            <td colspan="2">
                Average
            </td>

            <td>
                88
            </td>

        </tr>

    </tfoot>

</table>
18. colspan
Concept

colspan combines multiple columns into one cell.

Example
<table border="1">

    <tr>

        <th colspan="3">
            Student Details
        </th>

    </tr>

    <tr>

        <th>ID</th>
        <th>Name</th>
        <th>Course</th>

    </tr>

</table>

Here:

Student Details
────────────────────────
       3 columns
19. rowspan
Concept

rowspan combines multiple rows.

Example
<table border="1">

    <tr>

        <th>Day</th>
        <th>Subject</th>

    </tr>

    <tr>

        <td rowspan="2">
            Monday
        </td>

        <td>HTML</td>

    </tr>

    <tr>

        <td>CSS</td>

    </tr>

</table>

Monday occupies two rows.

20. Forms
Concept

HTML forms collect information from users.

Common applications:

Student registration
Login
Admission
Contact form
Feedback
Job application
Online payment information

Basic structure:

<form>

    Form Controls

</form>
21. <label> and <input>
Example
<label for="studentName">
    Student Name:
</label>

<input
    type="text"
    id="studentName"
    name="studentName"
>
Important relationship
label for="studentName"
          ↓
input id="studentName"

The for and id values are connected.

22. Text Input
<label for="name">
    Student Name:
</label>

<input
    type="text"
    id="name"
    name="name"
    placeholder="Enter student name"
>

Used for:

Name
Username
City
Course name
23. Email Input
<label for="email">
    Email:
</label>

<input
    type="email"
    id="email"
    name="email"
    placeholder="student@example.com"
>

The browser can perform basic email-format validation.

24. Password Input
<label for="password">
    Password:
</label>

<input
    type="password"
    id="password"
    name="password"
>

Characters are hidden while typing.

25. Number Input
<label for="age">
    Age:
</label>

<input
    type="number"
    id="age"
    name="age"
    min="17"
    max="60"
>

Useful for:

Age
Quantity
Marks
Experience
26. Date Input
<label for="dob">
    Date of Birth:
</label>

<input
    type="date"
    id="dob"
    name="dob"
>

Browser provides a date-selection interface.

27. Radio Buttons
Concept

Radio buttons are used when the user should select one option from a group.

Example
<p>Gender:</p>

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
Important concept

Both options have:

name="gender"

Therefore, they belong to the same group.

28. Checkboxes
Concept

Checkboxes allow the user to select multiple options.

Example
<p>Programming Skills:</p>

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

A student can select more than one skill.

29. Dropdown – <select>
Concept

Used when users need to select an option from a list.

Example
<label for="course">
    Select Course:
</label>

<select
    id="course"
    name="course"
>

    <option value="">
        -- Select Course --
    </option>

    <option value="btech">
        B.Tech
    </option>

    <option value="bca">
        BCA
    </option>

    <option value="mca">
        MCA
    </option>

</select>

Structure:

<select>
    |
    +--- <option>
    +--- <option>
    +--- <option>
30. Textarea
Concept

<textarea> is used for multi-line input.

Example
<label for="address">
    Address:
</label>

<br>

<textarea
    id="address"
    name="address"
    rows="5"
    cols="40"
    placeholder="Enter your complete address"
></textarea>

Useful for:

Address
Feedback
Comments
Description
Message
31. File Upload
<label for="resume">
    Upload Resume:
</label>

<input
    type="file"
    id="resume"
    name="resume"
>

Commonly used for:

Resume
Student photo
Certificates
Documents
32. Submit and Reset
Submit
<input
    type="submit"
    value="Register Student"
>
Reset
<input
    type="reset"
    value="Clear Form"
>

Or use the <button> element:

<button type="submit">
    Register Student
</button>
33. Important Form Attributes

Example:

<input
    type="text"
    id="name"
    name="name"
    placeholder="Enter your name"
    required
>
Attribute	Meaning
type	Type of input
id	Unique identifier
name	Field name sent with form data
value	Default/current value
placeholder	Hint shown inside input
required	Field must be filled
readonly	Cannot be edited
disabled	Control is disabled
min	Minimum value
max	Maximum value
34. <form> action and method
Concept

The <form> element defines how form data is submitted.

<form
    action="/register"
    method="post"
>
action

Defines where form data is sent.

method

Common methods:

GET
POST
Example
<form
    action="/students/register"
    method="post"
>

    <input
        type="text"
        name="studentName"
    >

    <button type="submit">
        Register
    </button>

</form>

For a real application, the backend would process /students/register.

35. div
Concept

<div> is a generic block-level container used to group content.

Example
<div>

    <h2>Student Information</h2>

    <p>Name: Rahul Kumar</p>

    <p>Course: B.Tech</p>

</div>

div is commonly used when creating layouts and grouping elements.

36. span
Concept

<span> is an inline container used to identify or style a small portion of content.

Example
<p>
    Student Status:
    <span>Active</span>
</p>

Difference:

<div>  → Block-level grouping
<span> → Inline grouping
37. Semantic HTML
Concept

Semantic tags clearly describe the purpose of their content.

Instead of:

<div>
    Header
</div>

we can use:

<header>
    Header
</header>
Important semantic tags
Tag	Purpose
<header>	Header area
<nav>	Navigation
<main>	Main content
<section>	Logical section
<article>	Independent content
<aside>	Related/sidebar content
<footer>	Footer
<address>	Contact information
38. Semantic HTML Example
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

        <h2>Student Information</h2>

        <p>
            Student details are maintained here.
        </p>

    </section>


    <section id="courses">

        <h2>Courses</h2>

        <p>
            Available courses are displayed here.
        </p>

    </section>

</main>


<footer>

    <p>
        © 2026 College Student Portal
    </p>

</footer>
39. HTML Comments
Concept

Comments are used to explain code.

They are not displayed on the webpage.

<!-- Student Registration Section -->

<section>

    <h2>Student Registration</h2>

</section>

Comments are especially useful in corporate projects for explaining sections of HTML.

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



CSS Training Notes

What is CSS?
Concept

CSS – Cascading Style Sheets is used to control the appearance, layout, spacing, and presentation of HTML elements.

HTML vs CSS
HTML	CSS
Defines structure	Defines appearance
Heading	Heading color/size
Table	Table borders/layout
Form	Form styling
Cards	Card design
Navigation	Navigation layout
Example
<h1 class="title">Student Portal</h1>
.title {
    color: navy;
    text-align: center;
    font-size: 32px;
}

HTML: creates the heading.
CSS: makes the heading look the way we want.

2. Types of CSS

There are three main ways to apply CSS.

2.1 Inline CSS

CSS is written directly in the HTML element.

<h1 style="color: blue;">
    Student Portal
</h1>
Use

Good for quick testing, but generally not preferred for larger applications.

2.2 Internal CSS

CSS is written inside <style>.

<head>

    <style>

        .title {
            color: blue;
            text-align: center;
        }

    </style>

</head>
Use

Useful for small/single-page examples.

2.3 External CSS

CSS is maintained in a separate file.

HTML
<link rel="stylesheet" href="style.css">
style.css
.title {
    color: blue;
    text-align: center;
}
Recommended

For professional applications:

student-portal/
│
├── index.html
│
└── style.css

External CSS is the preferred approach for maintainability and reuse.

3. CSS Syntax
selector {
    property: value;
}

Example:

.student-name {
    color: blue;
    font-size: 20px;
}
Part	Meaning
.student-name	Selector
color	Property
blue	Value
font-size	Property
20px	Value
4. CSS Selectors

Selectors determine which HTML elements receive the CSS.

Element Selector
p {
    color: gray;
}

Applies to all <p> elements.

Class Selector
<p class="student-name">Rahul Kumar</p>
.student-name {
    color: blue;
}

Class is reusable.

ID Selector
<h1 id="page-title">
    Student Portal
</h1>
#page-title {
    text-align: center;
}

ID is intended for a unique element.

Group Selector
h1,
h2,
h3 {
    font-family: Arial;
}

Applies the same style to multiple selectors.

5. Colors

CSS provides different ways to specify colors.

.title {
    color: blue;
}

HEX:

.title {
    color: #1e3a8a;
}

RGB:

.title {
    color: rgb(30, 58, 138);
}
Meaningful example
.header {
    background-color: #1e3a8a;
    color: white;
}
6. Background Properties

Important properties:

background-color
background-image
background-size
background-position
background-repeat
Example
.header {
    background-color: #1e3a8a;
    color: white;
    padding: 25px;
}

A college portal header can therefore have a distinct background and readable text.

7. Font Properties

Important properties:

font-family
font-size
font-weight
font-style
line-height
Example
.student-name {
    font-family: Arial, sans-serif;
    font-size: 22px;
    font-weight: bold;
}
Common values
font-weight: normal;
font-weight: bold;

or numeric:

font-weight: 400;
font-weight: 700;
8. Text Properties

Important properties:

color
text-align
text-decoration
text-transform
letter-spacing
line-height
Meaningful example
.page-title {
    color: #1e3a8a;
    text-align: center;
    text-transform: uppercase;
    letter-spacing: 1px;
}
9. Width and Height

Controls the size of an element.

.student-card {
    width: 300px;
    min-height: 200px;
}

Useful units include:

px
%
rem
em
vw
vh
Example
.container {
    width: 80%;
    max-width: 1100px;
    margin: auto;
}

This is more practical than simply assigning a fixed width to the whole page.

10. CSS Box Model

One of the most important CSS concepts.

Every element can be understood as a box:

        Margin
 ┌───────────────────────┐
 │       Border          │
 │  ┌─────────────────┐  │
 │  │    Padding      │  │
 │  │  ┌───────────┐  │  │
 │  │  │  Content  │  │  │
 │  │  └───────────┘  │  │
 │  └─────────────────┘  │
 └───────────────────────┘

The four parts are:

Content
Padding
Border
Margin
11. Padding

Space inside the element.

.student-card {
    padding: 20px;
}

Example:

<div class="student-card">
    <h2>Rahul Kumar</h2>
    <p>B.Tech Computer Science</p>
</div>
.student-card {
    padding: 20px;
    border: 1px solid #ccc;
}

Padding prevents the content from touching the border.

12. Margin

Space outside the element.

.student-card {
    margin: 20px;
}
Center a container
.container {
    width: 80%;
    margin: 20px auto;
}

auto can distribute the available horizontal space and center a fixed/max-width block.

13. Border
.student-card {
    border: 1px solid #ddd;
}

Individual properties:

border-width: 1px;
border-style: solid;
border-color: #ddd;
Rounded corners
.student-card {
    border-radius: 10px;
}
14. Box Shadow

Creates depth around an element.

.student-card {
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
}

Useful for:

Cards
Panels
Modals
Dashboard components
15. box-sizing

A useful project-wide setting:

* {
    box-sizing: border-box;
}

With border-box, the declared width/height includes the element's padding and border.

This makes layout calculations easier and more predictable.

16. Display Property

display controls how an element participates in layout.

Important values:

block
inline
inline-block
none
flex
grid
17. display: block

A block element normally starts on a new line and takes the available width.

.student-card {
    display: block;
}

Common block-level elements:

div
p
h1-h6
section
header
footer
18. display: inline

Inline elements generally remain in the same line and take only the space they need.

<span>Java</span>
<span>Python</span>
<span>SQL</span>
span {
    display: inline;
}

Conceptually:

Java Python SQL

Common inline elements:

span
a
strong
em
19. display: inline-block

Provides inline positioning while allowing box dimensions such as width and height.

.course {
    display: inline-block;
    width: 200px;
    padding: 20px;
    margin: 10px;
}

Useful for simple horizontal cards/buttons, although Flexbox is usually preferred for modern layouts.

20. display: none

Removes the element from the layout.

.notification {
    display: none;
}

Useful for:

Hide/show UI sections
Menus
Conditional content
Modal components
21. Flexbox
Concept

Flexbox is a one-dimensional layout system used to arrange elements in:

Row
Column

Example:

┌────────┬────────┬────────┐
│ Rahul  │ Priya  │ Amit   │
└────────┴────────┴────────┘

Instead of manually positioning each card, Flexbox handles the layout.

22. Creating a Flex Container
.student-container {
    display: flex;
}

HTML:

<div class="student-container">

    <div>Rahul</div>

    <div>Priya</div>

    <div>Amit</div>

</div>

The direct children become flex items.

23. flex-direction

Controls the direction of flex items.

Row
.student-container {
    display: flex;
    flex-direction: row;
}
Rahul → Priya → Amit
Column
.student-container {
    display: flex;
    flex-direction: column;
}
Rahul
  ↓
Priya
  ↓
Amit

Other values:

row
row-reverse
column
column-reverse
24. justify-content

Controls alignment along the main axis.

Center
.student-container {
    display: flex;
    justify-content: center;
}
Space between
.student-container {
    display: flex;
    justify-content: space-between;
}

Conceptually:

Rahul              Priya              Amit

Important values:

flex-start
flex-end
center
space-between
space-around
space-evenly
25. align-items

Controls alignment on the cross axis.

.student-container {
    display: flex;
    align-items: center;
}

Common values:

stretch
flex-start
flex-end
center
baseline
Important relationship

For:

flex-direction: row;

typically:

justify-content → horizontal/main-axis alignment
align-items     → vertical/cross-axis alignment

For:

flex-direction: column;

the axes effectively switch.

26. gap

Creates space between flex items.

.student-container {
    display: flex;
    gap: 20px;
}

This is a clean way to maintain consistent spacing between cards.

27. flex-wrap

Allows items to move to another line.

.student-container {
    display: flex;
    flex-wrap: wrap;
}

Example:

Rahul | Priya | Amit
Sneha | Kiran | Neha

Very useful when displaying multiple student/course cards.

28. flex Property

The flex shorthand controls how a flex item grows, shrinks, and determines its basis.

.student-card {
    flex: 1;
}

Three equal cards can share available space.

A practical example:

.student-card {
    flex: 1 1 250px;
}

Meaning conceptually:

grow   = 1
shrink = 1
basis  = 250px

This is very useful for responsive card layouts.

29. flex-grow

Controls how an item can grow relative to other flex items.

.student-card {
    flex-grow: 1;
}

If one item has a larger grow value, it can receive more available space.

30. flex-shrink

Controls how an item can shrink when there isn't enough space.

.student-card {
    flex-shrink: 1;
}

The default flex-shrink value is generally 1.

31. flex-basis

Defines the initial main-axis size of a flex item.

.student-card {
    flex-basis: 250px;
}

It is often used through:

.student-card {
    flex: 1 1 250px;
}
32. align-self

Allows one flex item to have different cross-axis alignment.

.student-card.highlighted {
    align-self: flex-end;
}

It overrides the container's align-items for that particular item.

33. order

Changes the visual order of flex items.

.first {
    order: 3;
}

.second {
    order: 1;
}

.third {
    order: 2;
}

Visual order:

Second → Third → First

Use carefully because changing visual order can create accessibility/usability issues if it differs from the logical content order.

34. Flexbox Practical Example
HTML
<section class="students">

    <div class="student-card">
        <h3>Rahul Kumar</h3>
        <p>B.Tech Computer Science</p>
        <p>Bengaluru</p>
    </div>

    <div class="student-card">
        <h3>Priya Sharma</h3>
        <p>BCA</p>
        <p>Mumbai</p>
    </div>

    <div class="student-card">
        <h3>Amit Singh</h3>
        <p>MCA</p>
        <p>Delhi</p>
    </div>

</section>
CSS
.students {
    display: flex;
    justify-content: center;
    align-items: stretch;
    gap: 20px;
    flex-wrap: wrap;
}

.student-card {
    flex: 1 1 250px;
    max-width: 300px;

    padding: 20px;

    border: 1px solid #ddd;
    border-radius: 10px;

    background-color: white;

    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.08);
}
What happens?
                .students
                    │
             display: flex
                    │
       ┌────────────┼────────────┐
       ↓            ↓            ↓
    Rahul          Priya        Amit
       │            │            │
 flex: 1 1       flex: 1 1     flex: 1 1
  250px           250px         250px

When there is insufficient horizontal space, flex-wrap: wrap allows cards to move to the next line.

35. Position Property

Important values:

static
relative
absolute
fixed
sticky
relative

Keeps the element in normal flow but establishes a positioning context and allows offsets.

.student-card {
    position: relative;
}
absolute

Useful for positioning an element relative to a positioned ancestor.

.student-card {
    position: relative;
}

.status {
    position: absolute;
    top: 10px;
    right: 10px;
}

HTML:

<div class="student-card">

    <span class="status">
        Active
    </span>

    <h3>Rahul Kumar</h3>

</div>

The status badge appears in the top-right of the card.

36. fixed

Keeps an element fixed relative to the viewport.

.help-button {
    position: fixed;
    right: 20px;
    bottom: 20px;
}

Useful for:

Chat buttons
Help buttons
Floating actions
37. sticky

The element behaves normally until a scroll threshold is reached.

.navbar {
    position: sticky;
    top: 0;
}

Useful for sticky navigation bars.

38. z-index

Controls stacking order when elements overlap.

.navbar {
    position: sticky;
    top: 0;
    z-index: 100;
}

A larger appropriate z-index generally places the element above another overlapping element in the same stacking context.

39. Border Radius

Used to create rounded corners.

.student-card {
    border-radius: 12px;
}

Circle:

.profile-image {
    border-radius: 50%;
}
40. Opacity

Controls transparency.

.disabled-card {
    opacity: 0.5;
}

0 = completely transparent
1 = fully opaque

41. Pseudo-classes

Pseudo-classes represent an element's state.

Hover
button:hover {
    background-color: #162d6b;
}
Focus
input:focus {
    outline: 2px solid #1e3a8a;
}
Checked
input:checked {
    accent-color: #1e3a8a;
}

Common pseudo-classes:

:hover
:focus
:active
:checked
:disabled
:first-child
:last-child
:nth-child()
42. Transition

Creates a smooth change between CSS states.

button {
    background-color: #1e3a8a;
    transition: 0.3s;
}

button:hover {
    background-color: #162d6b;
}

Without transition:

Normal → Immediate change

With transition:

Normal → Smooth change → Hover
43. Complete Basic-to-Intermediate CSS Example
HTML
<!DOCTYPE html>

<html>

<head>

    <title>Student Portal</title>

    <link rel="stylesheet" href="style.css">

</head>

<body>

    <header class="header">

        <h1>College Student Portal</h1>

        <p>Student Management System</p>

    </header>


    <nav class="navbar">

        <a href="#">Home</a>
        <a href="#">Students</a>
        <a href="#">Courses</a>
        <a href="#">Contact</a>

    </nav>


    <main class="container">

        <h2 class="section-title">
            Student Information
        </h2>


        <section class="students">

            <div class="student-card">

                <span class="status">
                    Active
                </span>

                <h3>Rahul Kumar</h3>

                <p>B.Tech Computer Science</p>

                <p>Bengaluru</p>

                <button>
                    View Profile
                </button>

            </div>


            <div class="student-card">

                <span class="status">
                    Active
                </span>

                <h3>Priya Sharma</h3>

                <p>BCA</p>

                <p>Mumbai</p>

                <button>
                    View Profile
                </button>

            </div>


            <div class="student-card">

                <span class="status">
                    Active
                </span>

                <h3>Amit Singh</h3>

                <p>MCA</p>

                <p>Delhi</p>

                <button>
                    View Profile
                </button>

            </div>

        </section>

    </main>


    <footer class="footer">

        <p>
            © 2026 College Student Portal
        </p>

    </footer>

</body>

</html>
CSS
/* =========================
   Reset
========================= */

* {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
}


/* =========================
   Body
========================= */

body {
    font-family: Arial, sans-serif;
    background-color: #f4f6f8;
    color: #222;
    line-height: 1.6;
}


/* =========================
   Header
========================= */

.header {
    background-color: #1e3a8a;
    color: white;
    text-align: center;
    padding: 30px;
}


/* =========================
   Navigation
========================= */

.navbar {
    display: flex;
    justify-content: center;
    gap: 25px;
    padding: 15px;
    background-color: white;
}

.navbar a {
    color: #1e3a8a;
    text-decoration: none;
    font-weight: bold;
}

.navbar a:hover {
    text-decoration: underline;
}


/* =========================
   Main Container
========================= */

.container {
    width: 90%;
    max-width: 1100px;
    margin: 40px auto;
}


/* =========================
   Heading
========================= */

.section-title {
    text-align: center;
    color: #1e3a8a;
    margin-bottom: 30px;
}


/* =========================
   Flexbox
========================= */

.students {
    display: flex;
    justify-content: center;
    align-items: stretch;
    gap: 20px;
    flex-wrap: wrap;
}


/* =========================
   Student Card
========================= */

.student-card {
    position: relative;

    flex: 1 1 250px;
    max-width: 300px;

    padding: 25px;

    background-color: white;

    border: 1px solid #ddd;
    border-radius: 12px;

    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.08);
}


/* =========================
   Student Name
========================= */

.student-card h3 {
    margin-bottom: 10px;
}


/* =========================
   Status Badge
========================= */

.status {
    position: absolute;

    top: 12px;
    right: 12px;

    padding: 4px 8px;

    border-radius: 10px;

    font-size: 12px;
}


/* =========================
   Button
========================= */

button {
    margin-top: 15px;

    padding: 10px 15px;

    border: none;
    border-radius: 6px;

    background-color: #1e3a8a;
    color: white;

    cursor: pointer;

    transition: 0.3s;
}

button:hover {
    background-color: #162d6b;
}


/* =========================
   Footer
========================= */

.footer {
    text-align: center;

    padding: 20px;

    background-color: #222;

    color: white;
}