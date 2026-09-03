
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


html, css, js, ts and angular framework/react js  


https://www.google.com ---> URL 
http : hyper text transfer protocol : set of rules 
www : world wide web 
google : domain 
com : commercial 

                http/https---> request 
Client                                              Server 

                response <-----http/https 
                                        
                                        HTML: hyper text mark up language 
                                        1,2,3,4,5 etc. 
                                        CSS : Cascading style sheet 
                                        1,2,3 etc. 

                                        css library as well as framework 
                                        bootstrap 
                                        tail wind css 

                                        JS : JavaScript 
                                        validation: required, min, max etc 

                                        today we can 
                                        do validation using 
                                        html5
                                        js or any other library or 
                                        framework. 

                                        basic JS
                                        event 
                                        DOM Operation 
                                      document object model 
                want to read, write and update html contents 
                dynamically (using coding)

                TypeScript.
                JS library and framework. 
                Angular framework 
                React JS library 
                Vue JS 
                D3 JS 

                it is use to read, write and update dom effectively. 


1. What is HTML?
Concept

HTML (HyperText Markup Language) is the standard markup 
language used to create the structure of web pages.

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

HTML is not a programming language 
because it does not contain programming logic such as loops, 
conditions, or functions.

html provided lot of pre defined tags or elements 
syntax 

<tagName>       opening tag 

</tagName>      closing tag 

<tagName/>      self closing tag 

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
from html 5 onwards. 

Syntax

<!DOCTYPE html>     providing instruction to browser writing the code using htm 5 

<html>
<head>

    <title>Page Title</title>

</head>
<body>

    Page Content

</body>

</html>

Pagename with any name with extension .html or .htm 


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

The <head> contains information about the webpage,
 rather than the main visible content.

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

<h1>College</h1>        largest 
<h2>Departments</h2>
<h3>Computer Science</h3>
<h4>Courses</h4>
<h5>Subjects</h5>
<h6>Topics</h6>         smallest 

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

<br> is useful for a line break, 
but should not normally be used to create page spacing.

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

Unordered List – <ul>
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

Ordered List – <ol>
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

HTML Tables
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






S