// handle promise using ES5 style 
// fetch("https://dummyjson.com/products").then(function(response){
//     console.log("1st then")
//     console.log(response)
//     return response.json();   // we return json data part body
// }).then(function(result){
//     console.log("2nd then")
//     console.log(result.products)
// }).catch(function(error){
//     console.log("in catch")
//     console.log(error)
// }).finally(function() {
//     console.log("finally block - Task done")
// })

// to handle fetch using ES6 style 
async function loadData(){
    // await keyword make asynchronous to synchronous it is a replacement of then 
try{
let response =  await fetch("https://dummyjson.com/products")
//console.log(response)
let result = await response.json();
console.log(result.products)
}catch(error){
    console.log(error)
}finally{
    console.log("finally block - task done")
}
console.log("1st task")
console.log("2nd task")
}
loadData();