import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

products:Array<Product>=[];
 flag:boolean = false;
  constructor(private ps:ProductService){}    // DI for Product Service 


  loadFakeProducts() : void {
    this.flag= true;
    this.ps.loadProducts().subscribe((data:any)=> {
      //console.log(data?.products)
      this.products= data.products;   // call huge data store in product array 
    },(error)=> {
      console.log(error)
    },()=> {
      console.log("Task done")
    })
  }
}
