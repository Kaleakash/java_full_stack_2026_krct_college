"use strict";
// function with any types values 
function add(a, b) {
    let sum = a + b;
    console.log("sum is " + sum);
}
add(10, 20);
add("A", "B");
// add(100)
// add()
// function with number types 
function square(a) {
    let result = a * a;
    console.log("result is " + result);
}
square(2);
square(10.10);
//square("A")
// function no return type 
function hello() {
    console.log("this function no return type");
    //return 100;
}
hello();
// function with return type as string 
function sayHello(name) {
    return "Welcome user " + name;
}
console.log(sayHello("Raj"));
// function with optional parameter ?
// default value if user doesn't pass
function empInfo(id, name = "UnKnown", tech) {
    console.log("employee details");
    console.log("id is " + id + " name is " + name + " tech " + tech);
}
empInfo(100, "Raj", "Java");
empInfo(101, "Raju");
empInfo(102);
// arrow function 
let addNumber = (a, b) => "Sum of two number is " + (a + b);
console.log("Sum of two number is " + addNumber(100, 200));
