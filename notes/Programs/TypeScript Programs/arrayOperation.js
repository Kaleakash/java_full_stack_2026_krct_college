"use strict";
let num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(num);
num.forEach((n) => console.log(n));
// map : it modified each element like add, sub, mul and div one by one 
console.log("square of each elements");
num.map((n) => n * n).forEach((v) => console.log(v));
console.log("display only even numbers");
// filter 
num.filter((n) => n % 2 == 0).forEach((v) => console.log(v));
