import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {LoginService} from '../login.service'
@Component({
  selector: 'app-login-template',
  templateUrl: './login-template.component.html',
  styleUrls: ['./login-template.component.css']
})
export class LoginTemplateComponent {

  msg:string =""
  constructor(private ls:LoginService){}    // DI 

  checkUserDetails(loginRef:any): void {
    
    let emailId = loginRef.value.email;
    let password = loginRef.value.pass;

    // if(emailId==="admin@gmail.com" && password==="admin@123"){
    //     this.msg = "Successfully login"
    // }else {
    //     this.msg = "Failure try once again"
    // }
    //let ls = new LoginService();
    this.msg = this.ls.checkLoginDetails(emailId,password);
    loginRef.value=""
  }
}
