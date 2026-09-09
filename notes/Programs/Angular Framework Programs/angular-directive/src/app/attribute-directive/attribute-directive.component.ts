import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-directive',
  templateUrl: './attribute-directive.component.html',
  styleUrls: ['./attribute-directive.component.css']
})
export class AttributeDirectiveComponent {
  styleVariable = {"color":"blue","background-color":"yellow"}
  flag:boolean = false;
  fun1(): void {
      this.flag = true;
  }
  fun2(): void {
      this.flag = false;
  }
}
