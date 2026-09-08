let num:number[]=[1,2,3,4,5,6,7,8,9,10];
console.log(num);
num.forEach((n:number)=>console.log(n));
// map : it modified each element like add, sub, mul and div one by one 
console.log("square of each elements")
num.map((n:number)=>n*n).forEach((v:number)=>console.log(v))
console.log("display only even numbers")
// filter 
num.filter((n:number)=>n%2==0).forEach((v:number)=>console.log(v))
