Introduction to Angular
What is Angular?

Angular is a TypeScript-based front-end framework developed by 
Google for building single-page applications (SPAs) and large-scale web applications or enterprise application. 

SPA vs MPA
SPA — Single Page Application

SPA (Single Page Application) is a web application where 
the browser loads the main HTML page once(index.html), 
and subsequent content is updated dynamically 
without completely reloading the page.

Examples: Angular, React, Vue applications.

MPA — Multi Page Application

MPA (Multi Page Application) consists of multiple HTML pages. When the user navigates to another page, the browser typically requests a new page from the server. so whole web page (DOM loaded once again)

index.html                                    welcome.html 
its own DOM                                   Its own DOM
<a href="welcome.html">Click here</a>

Framework vs Library

The easiest way to understand the difference is:

Library = You call it.
Framework = It calls your code.

1. Library

A library is a collection of reusable 
code/functions that you can use when you need them.

Examples of libraries:

jQuery
React
Lodash
Axios


2. Framework

A framework provides the overall 
structure and rules for building an application.

The framework controls the application flow and calls your code at appropriate points.
Example 

Angular framework 

Key Difference
| Library                           | Framework                               |
| --------------------------------- | --------------------------------------- |
| You control the flow              | Framework controls the flow             |
| You call the library              | Framework calls your code               |
| Usually solves a specific problem | Provides application structure          |
| Can use only what you need        | Often provides an ecosystem of features |
| More flexible                     | More opinionated                        |
| Example: React                    | Example: Angular                        |


Angular CLI

Angular CLI (Command Line Interface) is a command-line tool provided by the Angular 
team that helps developers create, develop, build, test, and manage Angular applications.

In simple words:

Angular CLI is a set of commands that automates common Angular development tasks.

Install Angular CLI

Angular CLI is installed using npm.

First check Node.js and npm:

node --version
npm --version

Install Angular CLI globally:

npm install -g @angular/cli@16.0.1

Check Angular CLI:

ng version

Create an Angular Application

The most important command:

ng new my-app (project name ie my-app)
routing-->no
styling -->css
Angular CLI asks some configuration questions 
depending on the Angular version and options.
then it will create the angular project Run Angular Application
Go inside the project:
cd my-app
Start the development server:
ng serve --open 
it will automatically open in default browser with below url as 
http://localhost:4200

Angular Components

A component is the basic building block of an Angular application.

In simple words:

A component controls one part of the application's user interface (UI).

For example, an Employee Management application can be divided into:

using angular component with help of 
selector we create user defined tags. 

What does a Component contain?

A component mainly consists of:

             Component
                 |
       ┌─────────┼─────────┐
       ↓         ↓         ↓
 TypeScript     HTML      CSS
   (Logic)      (UI)    (Style)
    .ts          .html   .css 

   Angular App Component

The App Component is the root component of an Angular application.

AppComponent is the starting/root component from which the Angular application's UI is built.

1. App Component Structure

In a modern Angular application, you may see:

src/
└── app/
    ├── app.component.ts
    ├── app.component.html
    ├── app.component.css
    └── app.component.spec.ts

The important files are:

app.component.ts
        ↓
Component logic

app.component.html
        ↓
Component UI

app.component.css
        ↓
Component styling

app.component.ts

A simple App Component:

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  title = 'Employee Management System';

}

Here:

@Component
@Component({...})

tells Angular that AppComponent is an Angular component.

selector
selector: 'app-root'

defines the HTML tag for the root component.

Class
export class AppComponent

contains the component's data and logic.

3. app.component.html

The template can use the data from AppComponent.

<h1>{{ title }}</h1>

<p>Welcome to Angular Application</p>

Output:

Employee Management System

Welcome to Angular Application

Here:

{{ title }}

gets the value from:

title = 'Employee Management System';

This is interpolation.

4. app.component.css

You can style the App Component:

h1 {
  font-size: 30px;
}

p {
  font-size: 18px;
}

5. How does AppComponent start?

One important file is:

src/main.ts

It bootstraps the root component.

In a modern standalone Angular application, it typically looks similar to:

import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';

bootstrapApplication(AppComponent);

The important line is:

bootstrapApplication(AppComponent);

This tells Angular:

Start the application using AppComponent as the root component.

The flow is:

main.ts
   |
   ↓
bootstrapApplication(AppComponent)
   |
   ↓
AppComponent
   |
   ↓
app.component.html
   |
   ↓
Browser UI
6. What is app-root?

The selector:

selector: 'app-root'

means Angular can use:

<app-root></app-root>

This is normally present in:

src/index.html

For example:

<!doctype html>
<html>
<head>
  <title>My Angular App</title>
</head>

<body>

  <app-root></app-root>

</body>
</html>

So the complete flow is:

index.html
    |
    ↓
<app-root>
    |
    ↓
AppComponent
    |
    ↓
app.component.html
    |
    ↓
Browser

Angular Module and Root Module

There is an important point here because modern Angular and older Angular applications handle modules differently.

Angular originally used NgModules as the main way to organize applications. Modern Angular applications commonly use standalone components, so you may create an Angular application without an AppModule.

1. What is a Module?

In Angular, an NgModule is a mechanism for grouping 
related Angular components, directives, pipes, 
and services into a logical unit.

3. Important Properties of @NgModule

An NgModule commonly contains:

@NgModule
   |
   ├── declarations
   ├── imports
   ├── exports
   └── providers
declarations

Components, directives and pipes belonging to that module.

declarations: [
  EmployeeComponent,
  EmployeeListComponent
]
imports

Other modules whose functionality this module needs.

imports: [
  CommonModule
]
exports

Makes selected declarations available to other modules.

exports: [
  EmployeeComponent
]
providers

Services provided by the module.

providers: [
  EmployeeService
]

App Component as Parent

In a real application, AppComponent generally acts as the root/parent component.

For example:

                    AppComponent (html page)
 <app-header></app-header> <app-dashboard></app-dashboard><app-footer></app-footer>
        ┌────────────────┼────────────────┐
        ↓                ↓                ↓
 HeaderComponent   DashboardComponent   FooterComponent
                         |<app-employee></app-employee>
                         ↓
                  EmployeeComponent

ng g c Header 
ng g c Dashboard 
ng g c Footer 
ng g c Employee 


Angular Data Binding

Data binding is the mechanism used by Angular to connect the component's 
TypeScript data/logic with the HTML template (UI).

In simple words:

Data binding connects the Component and the View.

┌──────────────────────┐
│   Component (.ts)    │
│                      │
│ name = "Raj"         │
│ salary = 50000       │
└──────────┬───────────┘
           │
      Data Binding
           │
           ↓
┌──────────────────────┐
│   Template (.html)   │
│                      │
│ Raj                  │
│ ₹50,000              │
└──────────────────────┘
Types of Data Binding

Angular has four main types of data binding:

1. Interpolation or String interpolation : {{}} 
     component to view --->ts--> html page 
2. Property Binding : [] 
     component to view ---> ts --> html page 
3. Event Binding    : ()
     template or view to component --> html --> ts 
4. Two-Way Binding  : [()]
  Component <-------> View 

1. Interpolation

Interpolation is used to display component data in HTML.

Syntax:

{{ expression }}
Example

app.component.ts

export class AppComponent {

  name = 'Raj';
  salary = 50000;

}

app.component.html

<h2>Employee Details</h2>

<p>Name: {{ name }}</p>

<p>Salary: {{ salary }}</p>

Output:

Employee Details

Name: Raj
Salary: 50000

Event Binding

Event binding is used when we want to capture 
an event from the HTML element and execute a method in the component.

Syntax:

(event)="method()"

Example:

TypeScript:

export class AppComponent {

  name = 'Raj';

  showMessage() {
    alert('Hello ' + this.name);
  }

}

Angular use all JS event. But all event pre-fix ie on removed 
and event wrap with ()
HTML:

<button (click)="showMessage()">
    Click Me
</button>

Data Binding assignment example 
Problem Statement

Create an Angular application that displays an employee's details.

The application should:

Display employee name
Display employee ID
Display department
Display salary
Display a welcome message using string interpolation
Provide a "Show Employee Details" button
When the user clicks the button, display a message using event binding

Expected UI
----------------------------------------
       Employee Management System
----------------------------------------

Employee Name : Raj
Employee ID   : 101
Department    : IT
Salary        : ₹50000

Welcome Raj!

[ Show Employee Details ]

----------------------------------------

When the user clicks the button:

Employee Raj is working in the IT department.
Employee ID: 101
Salary: ₹50000
Step 1: Create Angular Application

ng new employee-app

Go inside the project:

cd employee-app

Run the application:

ng serve
Step 2: Create Component
ng generate component employee

or:

ng g c employee
Step 3: Component TypeScript

Open:

employee.component.ts

Write:

import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent {

  employeeName = 'Raj';

  employeeId = 101;

  department = 'IT';

  salary = 50000;

  showEmployeeDetails() {

    alert(
      'Employee ' + this.employeeName +
      ' is working in the ' + this.department +
      ' department.\nEmployee ID: ' + this.employeeId +
      '\nSalary: ₹' + this.salary
    );

  }

}
Step 4: HTML Template

Open:

employee.component.html

Write:

<h1>Employee Management System</h1>

<h2>Employee Details</h2>

<p>Employee Name: {{ employeeName }}</p>

<p>Employee ID: {{ employeeId }}</p>

<p>Department: {{ department }}</p>

<p>Salary: ₹{{ salary }}</p>

<h3>Welcome {{ employeeName }}!</h3>

<button (click)="showEmployeeDetails()">
    Show Employee Details
</button>
Step 5: Display Employee Component

Open:

app.component.html

Add:

<app-employee></app-employee>

Now the application displays the Employee component.

Understanding String Interpolation

These statements:

<p>Employee Name: {{ employeeName }}</p>

<p>Employee ID: {{ employeeId }}</p>

<p>Department: {{ department }}</p>

<p>Salary: ₹{{ salary }}</p>

use String Interpolation.

The data comes from:

employeeName = 'Raj';
employeeId = 101;
department = 'IT';
salary = 50000;

The flow is:

employee.component.ts
        |
        | employeeName = "Raj"
        ↓
{{ employeeName }}
        ↓
HTML
        ↓
Employee Name: Raj
Another meaningful example
<h3>
    Welcome {{ employeeName }} to the {{ department }} department!
</h3>

Output:

Welcome Raj to the IT department!

So interpolation is useful when we want to display component data inside HTML.

Understanding Event Binding

This button:

<button (click)="showEmployeeDetails()">
    Show Employee Details
</button>

uses Event Binding.

The flow is:

User clicks button
        ↓
(click)
        ↓
showEmployeeDetails()
        ↓
EmployeeComponent
        ↓
alert()

The method is defined in TypeScript:

showEmployeeDetails() {

    alert(
      'Employee ' + this.employeeName +
      ' is working in the ' + this.department +
      ' department.'
    );

}


Angular Directives
Simple Definition

An Angular Directive is a class that adds behavior or 
changes the appearance/structure of an HTML element.

In simple words:

Directive = 
instruction to Angular about how an HTML element should behave.

With help of Angular directive we can add extra behavior 
for existing DOM elements. 

Types of Angular Directives

Angular directives are mainly divided into 3 types:

                 Angular Directives
                        |
          ┌─────────────┼─────────────┐
          ↓             ↓             ↓
     Component     Attribute      Structural
                    Directive       Directive

1. Component Directive

Technically, an Angular component is also a directive with a template.

Example:

@Component({
  selector: 'app-employee',
  template: '<h2>Employee</h2>'
})
export class EmployeeComponent {
}

Used as:

<app-employee></app-employee>

2. Attribute Directive

Changes the appearance or behavior of an existing HTML element.

Examples:

ngClass
ngStyle

Example:

<p [ngStyle]="{'color': 'red'}">
  Employee Name
</p>
<p style="color:red;">Welcome to Simple HTML Web Page</p>

The <p> element remains there, but its style changes.

Another example:

<p [ngClass]="isActive ? 'active' : 'inactive'">
  Employee
</p>
<p class="myClass">Welcome to html web page style with class selector </p>

3. Structural Directive

Changes the structure of the DOM by adding or removing HTML elements.

Traditional examples:

*ngIf
*ngFor
*ngSwitch

Example:

<p *ngIf="isLoggedIn">
  Welcome User
</p>

If isLoggedIn is true:

Welcome User

is displayed.

If it is false, the element is not displayed.

Another example:

<ul>
  <li *ngFor="let employee of employees">
    {{ employee }}
  </li>
</ul>

If:

employees = ['Raj', 'Ravi', 'Amit'];

Angular generates:

Raj
Ravi
Amit

Step 1: Create the Angular Project

If you are starting from scratch:

ng new product-app

Go inside the project:

cd product-app

Run the application:

ng serve

Open:

http://localhost:4200
Step 2: Create Product Component

Create a component:

ng generate component product

or:

ng g c product

Angular creates:

src
 └── app
      └── product
           ├── product.component.ts
           ├── product.component.html
           ├── product.component.css
           └── product.component.spec.ts
Step 3: Create Product Data
product.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

  products = [
    {
      id: 101,
      name: 'Laptop',
      price: 55000,
      available: true
    },
    {
      id: 102,
      name: 'Mobile',
      price: 25000,
      available: true
    },
    {
      id: 103,
      name: 'Keyboard',
      price: 1500,
      available: false
    },
    {
      id: 104,
      name: 'Mouse',
      price: 800,
      available: true
    }
  ];

}

Here we have an array containing four products.

For example:

Laptop
Mobile
Keyboard
Mouse
Step 4: Display Products Using *ngFor
product.component.html
<h2>Product List</h2>

<div *ngFor="let product of products">

  <h3>{{ product.name }}</h3>

  <p>Product ID: {{ product.id }}</p>

  <p>Price: ₹{{ product.price }}</p>

  <hr>

</div>
How *ngFor works
<div *ngFor="let product of products">

means:

Take each product from the products array and create this <div>.

So Angular effectively displays:

Laptop
Product ID: 101
Price: ₹55000

Mobile
Product ID: 102
Price: ₹25000

Keyboard
Product ID: 103
Price: ₹1500

Mouse
Product ID: 104
Price: ₹800
Step 5: Use *ngIf

Now we want to show:

Available

when the product is available.

Otherwise:

Out of Stock

Update the HTML:

<h2>Product List</h2>

<div *ngFor="let product of products">

  <h3>{{ product.name }}</h3>

  <p>Product ID: {{ product.id }}</p>

  <p>Price: ₹{{ product.price }}</p>

  <p *ngIf="product.available">
    Available
  </p>

  <p *ngIf="!product.available">
    Out of Stock
  </p>

  <hr>

</div>

Now Angular checks:

product.available

If it is:

true

Angular displays:

Available

If it is:

false

Angular displays:

Out of Stock
Step 6: Add "No Products" Message

Suppose the array becomes:

products = [];

We want to display:

No products available.

Add:

<p *ngIf="products.length === 0">
  No products available.
</p>

Complete HTML:

<h2>Product Shopping List</h2>

<!-- Display products -->

<div *ngFor="let product of products">

  <h3>{{ product.name }}</h3>

  <p>
    Product ID: {{ product.id }}
  </p>

  <p>
    Price: ₹{{ product.price }}
  </p>

  <!-- Check product availability -->

  <p *ngIf="product.available">
    Available
  </p>

  <p *ngIf="!product.available">
    Out of Stock
  </p>

  <hr>

</div>

<!-- Display when product list is empty -->

<p *ngIf="products.length === 0">
  No products available.
</p>
Step 7: Add Product Component to App

In Angular 16, if you are using the traditional NgModule approach, make sure the component is declared in app.module.ts.

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}

Then in:

app.component.html
<h1>My Shopping Application</h1>

<app-product></app-product>
Final Output

The browser will show something like:

My Shopping Application

Product Shopping List

Laptop
Product ID: 101
Price: ₹55000
Available
----------------------------

Mobile
Product ID: 102
Price: ₹25000
Available
----------------------------

Keyboard
Product ID: 103
Price: ₹1500
Out of Stock
----------------------------

Mouse
Product ID: 104
Price: ₹800
Available
----------------------------
What students learn

This single example introduces several important Angular concepts:

Component
   ↓
TypeScript Data
   ↓
products[]
   ↓
Interpolation
{{ product.name }}
   ↓
*ngFor
Display multiple products
   ↓
*ngIf
Conditionally display information
The two main directives

*ngFor

<div *ngFor="let product of products">

Used to repeat HTML for every item in an array.

*ngIf

<p *ngIf="product.available">

Used to conditionally display an HTML element.




