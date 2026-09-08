// normal employee class 
// class Employee {
//     private id:number = 100;
//     private name:string = "Raj";
//     private isActive:boolean = true;
//     public display(): void {
//         console.log(" id is "+this.id)
//         console.log(" name is "+this.name)
//         console.log(" is active "+this.isActive)
//     }
// }
// let emp1 = new Employee();
// emp1.display();
//emp1.id = -200;
//console.log(" id is "+emp1.id)

// constructor with short-cut initialization 
class Employee {
    // these all variable consider as instance variable because private or public 
    // inside a constructor 
    constructor(private id:number,private name:string,private isActive:boolean){
    }
    public display(): void {
        console.log(" id is "+this.id)
        console.log(" name is "+this.name)
        console.log(" is active "+this.isActive)
    }
}
let emp1 = new Employee(100,"Raju",false);
emp1.display();