import { Component } from '@angular/core';

@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent {
  buttonValue:string = "show";
  flag : boolean = false;

  std_names:string[]=["Ravi","Raj"]
  toggle(): void {
      //this.flag = !this.flag;
      if(this.flag){
          this.flag = false;
          this.buttonValue= "Show";
      }else {
          this.flag = true;
          this.buttonValue= "Hide";
      }
  }
  addNames(nameRef:any): void {
        this.std_names.push(nameRef.value)
        nameRef.value="";
  }
}
