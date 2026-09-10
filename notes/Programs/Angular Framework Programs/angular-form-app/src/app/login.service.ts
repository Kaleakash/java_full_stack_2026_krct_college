import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

  checkLoginDetails(email:any,password:any):string {
    if(email=="admin@gmail.com" && password=="admin@123"){
        return "Successfully login from service layer"
    }else {
        return "Failure try once again from service layer"
    }
  }
}
