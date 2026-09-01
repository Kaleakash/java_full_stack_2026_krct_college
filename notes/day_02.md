
Git Repository

A repository (repo) is a location where Git tracks 
project files and their history.

Two Types
Local Repository Exists on developer's computer.

Remote Repository Hosted on platforms such as GitHub or Bitbucket.

Creating a Local Repository


Navigate to the project directory:

cd my-project

Initialize Git:

git init        this command is use to create the local repository 

Git creates a hidden:

.git

directory.

Important

.git contains the information Git needs to track 
the repository and its history.

Common Git Commands

Example

git status

Stage a file:

git add index.html

Or stage everything:

git add .

Commit:

git commit -m "Add login page"

Git Log

View commit history:

git log

Short version:

git log --oneline

Example:

a12bc34 Add login functionality
b45de67 Add registration page
c78ef90 Initial commit





Git Branch – Basic Concept

A branch allows developers to work on a feature or functionality 
independently.
or brach is like a pointer which hold more than one commit. 

Example:

main
 │
 ├── feature/login
 │
 ├── feature/payment
 │
 └── bugfix/cart

View the branch 
-->git branch 

creating new branch 
--> git branch branch_name 

switch to new branch (make sure current branch task must be commit)
--> git switch branch_name 

(create/modify/delete file, then add and commit in new or features branch)
then switch to master/main branch 
--> git switch master

if you need features or user defined branch code to merge to master 
--> git merge branch_name 

delete user defined or features branch 
--> git branch -D branch_name 


Git Clone

Used to copy an existing remote repository(public) to your local machine.

git clone <repository-url>

Example:

git clone https://github.com/user/project.git

git clone https://github.com/Kaleakash/java_full_stack_2026_krct_college.git


Difference

git init

→ Create a new local repository.

git clone

→ Copy an existing repository.

14. Remote Repository

A remote repository is the online/shared version of the project.

Common platforms:

GitHub
Bitbucket
GitLab
Add Remote
git remote add origin <repository-url>

Check remote:

git remote -v
origin
Standard name given to the primary remote repository.
It is a name/alias, not a Git command.

15. Git Push & Pull

Push
git push origin main

Uploads local commits to the remote repository.

Think:

Push = Local → Remote

Pull
git pull origin main

Gets remote changes and integrates them into the current local branch.

Think:

Pull = Remote → Local


17. GitHub Account Setup – Demo
Objective

Create a GitHub account and connect a local Git project to GitHub.

Demo Flow
Install Git
    ↓
Create GitHub Account
    ↓
Configure Git
    ↓
Create GitHub Repository
    ↓
Create Local Project
    ↓
git init
    ↓
git add .
    ↓
git commit
    ↓
Connect Remote
    ↓
git push
    ↓
Verify Repository on GitHub

18. Demo – Configure Git with GitHub

Step 1 – Create GitHub Account
Open GitHub.
Create/sign in to an account.
Verify email if required.
Configure profile.

Step 2 – Create Repository

Example:

Repository Name:
student-git-demo

Choose appropriate visibility:

Public
Private
Step 3 – Create Local Project
mkdir student-git-demo
cd student-git-demo

Create a file:

README.md
Step 4 – Initialize Git
git init
Step 5 – Configure Git
git config --global user.name "Student Name"
git config --global user.email "student@example.com"
Step 6 – Check Status
git status
Step 7 – Stage Files
git add .
Step 8 – Commit
git commit -m "Initial commit"
Step 9 – Connect GitHub Repository
git remote add origin <repository-url>

Verify:

git remote -v
Step 10 – Push Code

For a repository using main:

git branch -M main
git push -u origin main


Basic Git Workflow

The most important workflow for beginners:

Modify Files
     ↓
git status
     ↓
git add
     ↓
Staging Area
     ↓
git commit
     ↓
Local Repository
     ↓
git push
     ↓
GitHub


Git commands 


git --version	Check Git version
git config	Configure Git
git init	Create repository
git clone	Copy remote repository
git status	Check repository status
git commit	Save changes to Git history
git log	View commit history
git diff	View changes
git branch	Manage branches
git switch	Switch branches
git merge	Merge branches
git pull	Get and integrate remote changes
git push	Upload local commits
git remote	Manage remote repositories




SQL & Database – High-Level Training Notes
1. Introduction to Database
Database → Organized collection of related data.
DBMS → Software used to create, store, retrieve, and manage data.
Examples:
MySQL
PostgreSQL
Oracle
SQL Server
Table → Stores data in rows and columns.
Row → Individual record.
Column → Attribute/field.
Primary Key → Uniquely identifies each record.
Foreign Key → Connects related tables.
Example – E-Commerce Application
E-Commerce Database
       │
       ├── Customers
       ├── Products
       └── Orders
2. Sample Database Design

We will use a simple E-Commerce Database throughout the training.

Customers
customer_id	customer_name	email	city
101	Rahul	rahul@gmail.com	Bengaluru
102	Priya	priya@gmail.com	Mumbai
103	Amit	amit@gmail.com	Delhi
104	Sneha	sneha@gmail.com	Bengaluru
105	Kiran	kiran@gmail.com	Chennai
106	Neha	neha@gmail.com	Bengaluru
Products
product_id	product_name	category	price
201	Laptop	Electronics	60000
202	Mouse	Electronics	800
203	Keyboard	Electronics	1500
204	Office Chair	Furniture	7500
205	Headphones	Electronics	2500
206	Desk	Furniture	10000
Orders
order_id	customer_id	product_id	quantity	order_date
5001	101	201	1	2026-08-01
5002	102	204	2	2026-08-02
5003	101	202	1	2026-08-03
5004	103	205	1	2026-08-04
5005	104	203	2	2026-08-05
5006	106	206	1	2026-08-06
Relationships
Customers
    │
    │ customer_id
    ↓
Orders
    │
    │ product_id
    ↓
Products
3. DDL – Data Definition Language

DDL is used to create and modify the structure of database objects.

Important DDL Commands
Command	Purpose
CREATE	Create database/table
ALTER	Modify table structure
DROP	Remove database/table
TRUNCATE	Remove all records while keeping table structure
CREATE DATABASE
CREATE DATABASE ecommerce;

Select the database:

USE ecommerce;
CREATE TABLE – Customers
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100),
    email VARCHAR(100),
    city VARCHAR(50)
);
CREATE TABLE – Products
CREATE TABLE products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    category VARCHAR(50),
    price DECIMAL(10,2)
);
CREATE TABLE – Orders
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    product_id INT,
    quantity INT,
    order_date DATE,
    FOREIGN KEY (customer_id)
        REFERENCES customers(customer_id),
    FOREIGN KEY (product_id)
        REFERENCES products(product_id)
);
Important
PRIMARY KEY
    ↓
Uniquely identifies a record

FOREIGN KEY
    ↓
Creates relationship between tables
4. ALTER TABLE

Used to modify an existing table structure.

Add a Column
ALTER TABLE customers
ADD phone VARCHAR(15);
Meaning

The existing customers table now has an additional phone column.

5. DROP TABLE

Used to remove a table completely.

DROP TABLE customers;
Removes the table structure.
Removes the data stored in the table.
6. TRUNCATE TABLE

Used to remove all records while keeping the table structure.

TRUNCATE TABLE customers;
Difference
Command	Result
DROP	Removes table + data
TRUNCATE	Removes data, keeps table
7. DML – Data Manipulation Language

DML is used to add, modify, and remove records.

Main Commands
INSERT
UPDATE
DELETE
8. INSERT – Add Records
Insert Customers
INSERT INTO customers
(customer_id, customer_name, email, city)
VALUES
(101, 'Rahul', 'rahul@gmail.com', 'Bengaluru'),
(102, 'Priya', 'priya@gmail.com', 'Mumbai'),
(103, 'Amit', 'amit@gmail.com', 'Delhi'),
(104, 'Sneha', 'sneha@gmail.com', 'Bengaluru'),
(105, 'Kiran', 'kiran@gmail.com', 'Chennai'),
(106, 'Neha', 'neha@gmail.com', 'Bengaluru');
Insert Products
INSERT INTO products
(product_id, product_name, category, price)
VALUES
(201, 'Laptop', 'Electronics', 60000),
(202, 'Mouse', 'Electronics', 800),
(203, 'Keyboard', 'Electronics', 1500),
(204, 'Office Chair', 'Furniture', 7500),
(205, 'Headphones', 'Electronics', 2500),
(206, 'Desk', 'Furniture', 10000);
Insert Orders
INSERT INTO orders
(order_id, customer_id, product_id, quantity, order_date)
VALUES
(5001, 101, 201, 1, '2026-08-01'),
(5002, 102, 204, 2, '2026-08-02'),
(5003, 101, 202, 1, '2026-08-03'),
(5004, 103, 205, 1, '2026-08-04'),
(5005, 104, 203, 2, '2026-08-05'),
(5006, 106, 206, 1, '2026-08-06');
9. UPDATE – Modify Records

Example:

Change Rahul's city to Hyderabad.

UPDATE customers
SET city = 'Hyderabad'
WHERE customer_id = 101;
Important

Always use a suitable WHERE condition.

UPDATE customers
SET city = 'Hyderabad';

This may update all customers.

10. DELETE – Remove Records

Example:

DELETE FROM customers
WHERE customer_id = 105;
Important

Without WHERE:

DELETE FROM customers;

This may delete all records.

11. DQL / DRL – Data Retrieval

DQL/DRL is used to retrieve data from the database.

Main command:

SELECT
SELECT – All Records
SELECT *
FROM customers;
SELECT – Specific Columns
SELECT customer_name, city
FROM customers;

Result:

customer_name	city
Rahul	Bengaluru
Priya	Mumbai
Amit	Delhi
Sneha	Bengaluru
Kiran	Chennai
Neha	Bengaluru
12. WHERE – Filter Records

WHERE is used to retrieve records based on a condition.

Find Bengaluru Customers
SELECT *
FROM customers
WHERE city = 'Bengaluru';

Result:

customer_id	customer_name	city
101	Rahul	Bengaluru
104	Sneha	Bengaluru
106	Neha	Bengaluru
Find Products Above ₹5,000
SELECT product_name, price
FROM products
WHERE price > 5000;
13. WHERE with AND / OR
AND
SELECT *
FROM products
WHERE category = 'Electronics'
AND price > 1000;

AND → Both conditions must be true.

OR
SELECT *
FROM customers
WHERE city = 'Bengaluru'
OR city = 'Mumbai';

OR → At least one condition must be true.

14. DISTINCT

DISTINCT is used to retrieve unique values.

Example
SELECT DISTINCT city
FROM customers;

Result:

city
Bengaluru
Mumbai
Delhi
Chennai
Another Example
SELECT DISTINCT category
FROM products;

Result:

category
Electronics
Furniture
15. ORDER BY

ORDER BY is used to sort the result.

Ascending
SELECT product_name, price
FROM products
ORDER BY price ASC;
Descending
SELECT product_name, price
FROM products
ORDER BY price DESC;

Result:

product_name	price
Laptop	60000
Desk	10000
Office Chair	7500
Headphones	2500
Keyboard	1500
Mouse	800
16. Combining SELECT + WHERE + ORDER BY
Requirement

Find Electronics products costing more than ₹1,000 and display the highest-priced product first.

SELECT product_name, price
FROM products
WHERE category = 'Electronics'
AND price > 1000
ORDER BY price DESC;
Concepts Used
SELECT
   ↓
Choose columns

WHERE
   ↓
Filter records

ORDER BY
   ↓
Sort results
17. JOIN – Combining Tables

Applications normally store related information in different tables.

For example:

Customers
customer_id	customer_name
101	Rahul
102	Priya
103	Amit
Orders
order_id	customer_id	product_id
5001	101	201
5002	102	204
5003	101	202

To display:

Customer Name + Order ID

we need a JOIN.

18. INNER JOIN

Returns records where a matching record exists in both tables.

SELECT
    c.customer_name,
    o.order_id,
    o.quantity
FROM customers c
INNER JOIN orders o
ON c.customer_id = o.customer_id;

Result:

customer_name	order_id	quantity
Rahul	5001	1
Priya	5002	2
Rahul	5003	1
Amit	5004	1
Sneha	5005	2
Neha	5006	1
Remember

INNER JOIN → Matching records from both tables

19. JOIN – Three Tables
Requirement

Display customer name, product name, quantity, and order date.

SELECT
    c.customer_name,
    p.product_name,
    o.quantity,
    o.order_date
FROM orders o
INNER JOIN customers c
    ON o.customer_id = c.customer_id
INNER JOIN products p
    ON o.product_id = p.product_id;
Result
Customer	Product	Quantity	Order Date
Rahul	Laptop	1	2026-08-01
Priya	Office Chair	2	2026-08-02
Rahul	Mouse	1	2026-08-03
Amit	Headphones	1	2026-08-04
Sneha	Keyboard	2	2026-08-05
Neha	Desk	1	2026-08-06
Corporate Meaning

A single business report often requires information from multiple related tables, so JOIN is one of the most important SQL concepts for application developers.

20. LEFT JOIN

Returns all records from the left table and matching records from the right table.

SELECT
    c.customer_name,
    o.order_id
FROM customers c
LEFT JOIN orders o
ON c.customer_id = o.customer_id;
Simple Difference
JOIN	Meaning
INNER JOIN	Only matching records
LEFT JOIN	All left records + matching right records
21. SQL Command Classification
Category	Purpose	Commands
DDL	Define database structure	CREATE, ALTER, DROP, TRUNCATE
DML	Modify data	INSERT, UPDATE, DELETE
DQL / DRL	Retrieve data	SELECT
22. Quick Revision
Concept	Meaning
Database	Collection of related data
Table	Data organized into rows and columns
Primary Key	Unique record identifier
Foreign Key	Connects related tables
DDL	Defines database structure
DML	Modifies data
DQL/DRL	Retrieves data
SELECT	Read data
WHERE	Filter records
DISTINCT	Get unique values
ORDER BY	Sort results
INSERT	Add records
UPDATE	Modify records
DELETE	Remove records
JOIN	Combine related tables