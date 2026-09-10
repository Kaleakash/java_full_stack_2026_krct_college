import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
   URL:string ="https://dummyjson.com/products";
  constructor(private httpClient:HttpClient) { }  // DI for HttpClient 
  // which help to call rest api develop using any language 


  loadProducts() : Observable<Product[]>{
    // it call rest api and return observable and with type case as JS object of Product 
      return this.httpClient.get<Product[]>(this.URL);
  }

  // post : store 
  // delete : delete 
  // put / patch : update 
}
