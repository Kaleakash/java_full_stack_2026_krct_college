package com.pms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pms.bean.Product;

public class ProductService {

	List<Product> listOfProducts = new ArrayList<Product>();

	public String addProduct(Product product) {
		int temp = 0;
		if(listOfProducts.size()==0) {
			listOfProducts.add(product);
			return "product added successfully";
		}
		
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==product.getPid()) {
				temp++;
				break;
			}
		}
		if(temp==0) {
			listOfProducts.add(product);
			temp=0;
			return "product added successfully";
		}else {
			return "product id must be unique";
		}
	}
	
	public List<Product> listOfProducts() {
		return listOfProducts;
	}
	
	public String deleteProduct(int pid) {
		int temp = 0;
		
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==pid) {
				li.remove();
				temp++;
				break;
			}
		}
		if(temp==0) {
			return "Product not present";
		}else {
			temp =0;
			return "product deleted successfully";
		}
	}
}
