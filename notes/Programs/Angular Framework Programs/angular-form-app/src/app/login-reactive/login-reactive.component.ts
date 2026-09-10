import { Component } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';

@Component({
  selector: 'app-login-reactive',
  templateUrl: './login-reactive.component.html',
  styleUrls: ['./login-reactive.component.css']
})
export class LoginReactiveComponent {
loginRef = new FormGroup({
  email:new FormControl(),
  pass:new FormControl()
});
msg:string =""
checkLoginDetails() : void {
  let emailId = this.loginRef.value.email;
  let password = this.loginRef.value.pass;
  if(emailId=="admin@gmail.com" && password=="admin@123"){
      this.msg="successfully login"
  }else {
      this.msg = "Failure try once again"
  }
}
}
