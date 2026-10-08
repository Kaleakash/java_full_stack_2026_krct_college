package com.pms.service;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

public class ProductService {

	ProductDao pd = new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getPrice()<1000) {
			return "Product price must be >=1000";
		}else if(pd.storeProduct(product)>0) {
			return "Product stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	
	public String deleteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String updateProductPrice(Product product) {
		// before all dao method we can apply any condition base upon application requirements. 
		if(pd.updateProductPrice(product)>0) {
			return "Product updated successfully";
		}else {
			return "Product not present";
		}
	}
}
 


