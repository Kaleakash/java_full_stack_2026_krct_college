import { Component } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import {LoginService} from '../login.service'

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
constructor(private ls:LoginService){} // DI constructor base means pull object of service 
                                        // from container 
checkLoginDetails() : void {
  let emailId = this.loginRef.value.email;
  let password = this.loginRef.value.pass;
  // if(emailId=="admin@gmail.com" && password=="admin@123"){
  //     this.msg="successfully login"
  // }else {
  //     this.msg = "Failure try once again"
  // }
  //let ls = new LoginService();
  this.msg = this.ls.checkLoginDetails(emailId,password);
}
}
