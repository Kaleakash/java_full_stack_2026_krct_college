import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
@Component({
  selector: 'app-login-template',
  templateUrl: './login-template.component.html',
  styleUrls: ['./login-template.component.css']
})
export class LoginTemplateComponent {

  msg:string =""
  checkUserDetails(loginRef:any): void {
    
    let emailId = loginRef.value.email;
    let password = loginRef.value.pass;

    if(emailId==="admin@gmail.com" && password==="admin@123"){
        this.msg = "Successfully login"
    }else {
        this.msg = "Failure try once again"
    }
    
    loginRef.value=""
  }
}
