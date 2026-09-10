Angular Forms — Basic Concept

<input type="text" #nameRef> : template reference. 

What is a Form?

A form is a user interface used to collect information from the user.

For example, an Employee Registration form may collect:

Angular Forms

Angular provides two approaches for creating forms:

                 Angular Forms
                      |
              ┌───────┴───────┐
              ↓               ↓
       Template-Driven     Reactive
           Forms             Forms or Model Driven Form 


1. Template-Driven Forms

The form is primarily controlled through the HTML template.
view ---> component 

HTML Template
     ↓
Form
     ↓
User Input
     ↓
Angular

It is generally suitable for simple forms.

2. Reactive Forms

The form structure and behavior are primarily defined in TypeScript.

component -----> view 

TypeScript
     ↓
Form Model
     ↓
HTML Template
     ↓
User Input

It is generally suitable for complex forms.


ng new angular-form-app


1. Template-Driven Login Form

Here, most of the form definition is written in the HTML template.

Create component
ng g c login-template

login-template.component.ts

```ts
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login-template',
  imports: [FormsModule],
  templateUrl: './login-template.component.html'
})
export class LoginTemplateComponent {

  message = '';

  login(form: any) {

    console.log('Form Value:', form.value);
    console.log('Form Valid:', form.valid);

    const username = form.value.username;
    const password = form.value.password;

    if (username === 'admin@gmail.com' &&
        password === 'admin123') {

      this.message = 'Login successful';

    } else {

      this.message = 'Invalid email ID or password';

    }
  }
}
```

html code 

```html
<h2>Template-Driven Login</h2>

<div>
    <h2>Login page using tdf</h2>
    <span style="color:red">{{msg}}</span>
    <form #loginForm="ngForm" (ngSubmit)="checkUserDetails(loginForm)">
        <label>EmailId</label>
        <input type="email" name="email" ngModel/><br>
        <label>Password</label>
        <input type="password" name="pass" ngModel/><br/>
        <input type="submit" value="SignIn"/>
        <input type="reset" value="reset"/>
    </form>
</div>

```


import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
@Component({
  selector: 'app-login-template',
  templateUrl: './login-template.component.html',
  styleUrls: ['./login-template.component.css']
})
export class LoginTemplateComponent {

  msg:string =""
  checkUserDetails(loginRef:any): void {
    
    let emailId = loginRef.value.email;
    let password = loginRef.value.pass;

    if(emailId==="admin@gmail.com" && password==="admin@123"){
        this.msg = "Successfully login"
    }else {
        this.msg = "Failure try once again"
    }
    
    loginRef.value=""
  }
}



Reactive Login Form

Now create another component:

ng g c login-reactive

Here, the form structure is defined mainly in TypeScript.

login-reactive.component.ts



```ts
import { Component } from '@angular/core';
import {
  FormControl,
  FormGroup,
  ReactiveFormsModule
} from '@angular/forms';

@Component({
  selector: 'app-login-reactive',
  imports: [ReactiveFormsModule],
  templateUrl: './login-reactive.component.html'
})
export class LoginReactiveComponent {

  message = '';

  loginForm = new FormGroup({

    username: new FormControl(''),

    password: new FormControl('')

  });

  login() {

    console.log(this.loginForm.value);

    const username = this.loginForm.value.username;
    const password = this.loginForm.value.password;

    if (username === 'admin@gmail.com' &&
        password === 'admin123') {

      this.message = 'Login successful';

    } else {

      this.message = 'Invalid email ID or password';

    }
  }
}
```


html page 


```html
<h2>Reactive Login</h2>

<form [formGroup]="loginForm" (ngSubmit)="login()">

  <div>
    <label>Email ID:</label>

    <input
      type="email"
      formControlName="username">
  </div>

  <br>

  <div>
    <label>Password:</label>

    <input
      type="password"
      formControlName="password">
  </div>

  <br>

  <button type="submit">
    Login
  </button>

</form>

<br>

<span>{{ message }}</span>
```



Angular Service

An Angular Service is a TypeScript class used to contain reusable logic 
and data-related operations that can be shared by multiple components.

Simple definition:

A service is a reusable class that contains application logic that should not be tightly coupled to a component.

Yes. A Login Service is a good example to teach how Angular services handle authentication/business logic separately from the component.

1. Create Login Service

Using Angular CLI:

ng generate service login

Login Service
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  login(username: string, password: string): boolean {

    if (username === 'admin' && password === 'admin123') {
      return true;
    }

    return false;
  }
}

Here:

@Injectable() → tells Angular that this class can be used as a service.
providedIn: 'root' → makes the service available throughout the application.
login() → contains the login/business logic.
The service returns true for valid credentials and false for invalid credentials.

IoC and DI in Simple Terms

IoC (Inversion of Control) and DI (Dependency Injection) are closely related concepts.

1. IoC — Inversion of Control

Simple definition:

IoC means the responsibility of creating and managing objects is given to the framework instead of being handled manually by the developer.

Normally, we create objects ourselves:

const loginService = new LoginService();

Here, we are controlling object creation.

With Angular, we don't normally create the service manually. Angular creates and provides it for us.

constructor(private loginService: LoginService) {}

So:

Without IoC
Developer → creates object → uses object

With IoC
Angular → creates object → provides object → Developer uses object

2. DI — Dependency Injection

Simple definition:

DI is a technique used to provide an object (dependency) to another object that needs it.

For example, LoginComponent needs LoginService.

So:

LoginComponent
       |
       | needs
       ↓
 LoginService

Instead of doing:

export class LoginComponent {

  loginService = new LoginService();

}

we use Angular DI:

export class LoginComponent {

  constructor(private loginService: LoginService) {}

}

Angular sees:

LoginService

and provides an instance of it to LoginComponent.

3. What is the Dependency?

In this example:

constructor(private loginService: LoginService) {}

LoginComponent depends on LoginService.

Therefore:

LoginComponent → LoginService
                  ↑
               Dependency

The LoginService is called a dependency of LoginComponent.






Angular HTTP Service — Employee Example

What is Angular HTTP Service?

Angular HttpClient is used to communicate with a backend server or REST API using HTTP requests.

HttpClient part of angular and return type of HttpClient is Observable. 
Observable — Simple Definition

Observable is an object that produces and sends data over time.

In very simple words:

Observable = a data provider that can give values when they become available.

Observable is a mechanism for handling asynchronous data that can be received over time using subscribe().

Main Difference

| Feature        | Promise                         | Observable                           |
| -------------- | ------------------------------- | ------------------------------------ |
| Represents     | Single value                    | Multiple values over time            |
| Execution      | Starts immediately when created | Usually starts when subscribed       |
| Values         | One result                      | Zero, one, or many results           |
| Consumption    | `.then()`                       | `.subscribe()`                       |
| Error handling | `.catch()`                      | `error` callback / operators         |
| Cancellation   | Not straightforward             | Can unsubscribe                      |
| Operators      | Limited                         | Many operators                       |
| Lazy           | No                              | Yes, generally                       |
| Suitable for   | One-time async operation        | Streams/events/multiple async values |




Typical flow:

EmployeeComponent
       |
       ↓
EmployeeService
       |
       ↓
HttpClient
       |
       ↓
Fake REST API
       |
       ↓
JSON Data
       |
       ↓
EmployeeComponent
       |
       ↓
HTML Table

Instead of putting HTTP code directly inside the component, we normally put it inside a service.

2. Fake REST API

For our example, use:

https://jsonplaceholder.typicode.com/users

It returns employee-like data such as:

[
  {
    "id": 1,
    "name": "Leanne Graham",
    "email": "Sincere@april.biz",
    "phone": "1-770-736-8031",
    "website": "hildegard.org"
  }
]
3. Create Angular Project

For Angular 16:

ng new employee-app

Go to the project:

cd employee-app

Run:

ng serve
4. Create Employee Component
ng g c employee
5. Create Employee Service
ng g s employee

You will get:

src/app/
   employee/
      employee.component.ts
      employee.component.html
      employee.component.css

   employee.service.ts

6. Configure HttpClient

Since this is an Angular 16 NgModule-style application, open:

app.module.ts

Add HttpClientModule.

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent
  ],

  imports: [
    BrowserModule,
    HttpClientModule
  ],

  providers: [],

  bootstrap: [AppComponent]
})
export class AppModule {
}
Why HttpClientModule?

It makes Angular's HttpClient available to your application.

7. Employee Service
employee.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private apiUrl =
    'https://jsonplaceholder.typicode.com/users';

  constructor(private http: HttpClient) {
  }

  getEmployees() {

    return this.http.get<any[]>(this.apiUrl);

  }
}
Understand the code

This:

constructor(private http: HttpClient) {
}

is Dependency Injection.

Angular creates the HttpClient object and gives it to EmployeeService.

This:

return this.http.get<any[]>(this.apiUrl);

means:

Send an HTTP GET request to the API and return the response.

8. Employee Component

Now we need to call the service.

employee.component.ts
import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  employees: any[] = [];

  loading = false;

  errorMessage = '';

  constructor(
    private employeeService: EmployeeService
  ) {
  }

  ngOnInit(): void {

    this.getEmployees();

  }

  getEmployees(): void {

    this.loading = true;

    this.employeeService.getEmployees()
      .subscribe({

        next: (data) => {

          this.employees = data;

          this.loading = false;

        },

        error: (error) => {

          console.log(error);

          this.errorMessage =
            'Unable to load employee data';

          this.loading = false;

        }

      });

  }
}
9. Why ngOnInit()?
ngOnInit(): void {

  this.getEmployees();

}

ngOnInit() is an Angular lifecycle hook.

It runs when the component is initialized.

So the flow is:

Component Created
       ↓
ngOnInit()
       ↓
getEmployees()
       ↓
EmployeeService
       ↓
HttpClient
       ↓
Fake API
10. Why subscribe()?

HttpClient returns an Observable.

this.employeeService.getEmployees()

does not directly give us the employee array.

We subscribe to receive the response:

.subscribe({
  next: (data) => {
    this.employees = data;
  }
});

Think of it simply as:

HTTP Request
     ↓
Observable
     ↓
subscribe()
     ↓
Response Data
11. Employee HTML

Now display the data.

employee.component.html
<div class="employee-container">

  <div class="header">

    <div>
      <h1>Employee Dashboard</h1>
      <p>Employee information from REST API</p>
    </div>

    <button
      class="refresh-button"
      (click)="getEmployees()">
      Refresh
    </button>

  </div>


  <!-- Loading -->

  <div
    class="loading"
    *ngIf="loading">

    Loading employee data...

  </div>


  <!-- Error -->

  <div
    class="error"
    *ngIf="errorMessage">

    {{ errorMessage }}

  </div>


  <!-- Employee Table -->

  <div
    class="table-card"
    *ngIf="!loading && employees.length > 0">

    <table>

      <thead>

        <tr>
          <th>ID</th>
          <th>Employee Name</th>
          <th>Email</th>
          <th>Phone</th>
          <th>Website</th>
        </tr>

      </thead>

      <tbody>

        <tr
          *ngFor="let employee of employees">

          <td>
            <span class="id-badge">
              {{ employee.id }}
            </span>
          </td>

          <td>
            <strong>
              {{ employee.name }}
            </strong>
          </td>

          <td>
            {{ employee.email }}
          </td>

          <td>
            {{ employee.phone }}
          </td>

          <td>
            {{ employee.website }}
          </td>

        </tr>

      </tbody>

    </table>

  </div>


  <!-- No Data -->

  <div
    class="no-data"
    *ngIf="!loading && employees.length === 0">

    No employee data available.

  </div>

</div>
12. CSS Styling
employee.component.css
.employee-container {
  width: 90%;
  margin: 40px auto;
  font-family: Arial, sans-serif;
}

.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 25px;
}

.header h1 {
  margin: 0;
  font-size: 30px;
}

.header p {
  color: #666;
  margin-top: 8px;
}

.refresh-button {
  padding: 10px 20px;
  border: none;
  border-radius: 6px;
  background: #1976d2;
  color: white;
  font-size: 15px;
  cursor: pointer;
}

.refresh-button:hover {
  background: #125ca1;
}

.table-card {
  background: white;
  border-radius: 10px;
  overflow: hidden;
  box-shadow: 0 4px 15px rgba(0, 0, 0, 0.12);
}

table {
  width: 100%;
  border-collapse: collapse;
}

thead {
  background: #1976d2;
  color: white;
}

th,
td {
  padding: 15px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

tbody tr:hover {
  background: #f5f9ff;
}

.id-badge {
  display: inline-block;
  padding: 5px 10px;
  border-radius: 15px;
  background: #e3f2fd;
  color: #1976d2;
  font-weight: bold;
}

.loading {
  padding: 20px;
  text-align: center;
  font-size: 18px;
}

.error {
  padding: 15px;
  background: #ffebee;
  color: #c62828;
  border-radius: 6px;
}

.no-data {
  padding: 30px;
  text-align: center;
  color: #777;
}

13. Add Component to App
app.component.html
<app-employee></app-employee>
14. Complete Application Flow
                    Angular Application
                           |
                           ↓
                  EmployeeComponent
                           |
                           | getEmployees()
                           ↓
                  EmployeeService
                           |
                           | http.get()
                           ↓
                       HttpClient
                           |
                           | HTTP GET
                           ↓
             JSONPlaceholder Fake API
                           |
                           | JSON Response
                           ↓
                       HttpClient
                           |
                           ↓
                  EmployeeService
                           |
                           ↓
                  EmployeeComponent
                           |
                           ↓
                    employees[]
                           |
                           ↓
                       *ngFor
                           |
                           ↓
                    HTML Table
15. Important Concepts Covered

This one example teaches several Angular concepts together:

Concept	Example
| Concept              | Example                                   |
| -------------------- | ----------------------------------------- |
| Component            | `EmployeeComponent`                       |
| Service              | `EmployeeService`                         |
| Dependency Injection | `constructor(private employeeService...)` |
| HttpClient           | `this.http.get()`                         |
| REST API             | JSONPlaceholder                           |
| Observable           | Return value of `http.get()`              |
| `subscribe()`        | Receive API response                      |
| `ngOnInit()`         | Load data when component starts           |
| `*ngFor`             | Display employees                         |
| `*ngIf`              | Loading/error/no-data messages            |
| Event Binding        | Refresh button                            |
| Interpolation        | `{{ employee.name }}`                     |

Avoid:

Component
   ↓
HttpClient
   ↓
API

Instead teach:

Recommended:

Component
    ↓
Service
    ↓
HttpClient
    ↓
REST API

The Component handles the UI, while the Service handles API communication.

Later, when you move from a fake API to Spring Boot, you only need to change the API URL:

private apiUrl =
  'http://localhost:8080/api/employees';

The overall Angular architecture remains the same.


Bootstrap

Definition:
Bootstrap is a popular CSS framework used to build responsive, attractive, and mobile-friendly web pages quickly. It provides ready-made CSS classes and UI components.

Why use Bootstrap?

Instead of writing CSS from scratch, we can use predefined classes.

For example:

<button class="btn btn-primary">Save</button>

Bootstrap automatically provides the button styling.

Main Bootstrap concepts

| Concept       | Purpose                                |
| ------------- | -------------------------------------- |
| **Container** | Controls page width and alignment      |
| **Grid**      | Creates responsive rows and columns    |
| **Buttons**   | Ready-made button styles               |
| **Forms**     | Styled input fields, labels, etc.      |
| **Cards**     | Display information in card format     |
| **Navbar**    | Navigation menu                        |
| **Tables**    | Styled tables                          |
| **Alerts**    | Success/error/warning messages         |
| **Modal**     | Popup dialog                           |
| **Utilities** | Margin, padding, colors, display, etc. |


From below CDN URL you need to add the bootstrap external css file link 

https://getbootstrap.com/docs/5.0/getting-started/introduction/

then use all pre defined classes. In simple terms:

CSS → We write styling ourselves.
Bootstrap → We use ready-made CSS classes/components to build the UI faster.

Bootstrap is especially useful with Angular, React, Vue, and plain HTML/JavaScript applications.

Java

Definition:
Java is a high-level, object-oriented, platform-independent programming language developed by Sun Microsystems. It is widely used for backend applications, web applications, enterprise software, Android development, and distributed systems.

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
     javac
       ↓
Bytecode (.class)
       ↓
      JVM
       ↓
Operating System

The key idea is:

Write Once, Run Anywhere

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




