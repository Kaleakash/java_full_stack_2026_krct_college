// ES5 (Old Version JS)

let obj1 = new Promise(function(resolve,reject){
    let success = false;

    if (success) {
        resolve("Task completed");
    } else {
        reject("Task failed");
    }
    
});

// to handle the promise 
obj1.then(function(data){
    console.log("In Then "+data)
}).catch(function(error) {
    console.log("In catch "+error)
}).finally(function() {
    console.log("finally block")
})

console.log("1st task")
console.log("2nd task")
console.log("3rd task")