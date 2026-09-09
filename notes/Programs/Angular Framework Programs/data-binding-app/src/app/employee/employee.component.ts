import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
id:number = 100;
name:string = "Raj Deep";
salary:number = 12000;
isActive:boolean = true;
result : string =""
  updateSalary(): void {
    //alert("event fired")
    this.salary = this.salary + this.salary *0.20;
  }
  addNumber(num1Ref:any,num2Ref:any): void {
      let a = parseInt(num1Ref.value);
      let b = parseInt(num2Ref.value);
      num1Ref.value="";
      num2Ref.value=""
      this.result = "Sum of two number is "+(a+b);
  }
}
