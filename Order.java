package ge.edu.btu.fastfood;

import ge.edu.btu.fastfood.product.*;
public class Order {
	
	private int id;
	
	private Product[] products = new Product[0];
	
	public Order() {}
	public Order(int id, Product orderproducts[]) {
		
		this.id = id;
		
		this.products = orderproducts;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Product[] getProducts() {
		return this.products;
	}
	
	public void setProducts(Product orderproducts[]) {
		this.products = orderproducts;
	}
	
	public void addProduct(Product product) {
		
		
		int i; 
		
		int prodsLength = this.products.length; 
        Product tempArray[] = new Product[prodsLength + 1]; 
  
      
        for (i = 0; i < prodsLength; i++) 
        	tempArray[i] = this.products[i]; 
  
        tempArray[prodsLength] = product; 
  
        this.products = tempArray; 
	}
	
	public void removeProduct(int index) {
		if (this.products == null || index < 0 || index >= this.products.length) { 
	  
	            return; 
	        } 
	   
	        Product[] tempArray = new Product[this.products.length - 1]; 
	  
	        for (int i = 0, k = 0; i < this.products.length; i++) { 
	  
	            if (i == index) { 
	                continue; 
	            } 
	  
	            tempArray[k++] = this.products[i]; 
	        }
	        
	        this.products = tempArray;
	        
	}
	
	public void removeProduct(String name) {
		if (this.products == null || name == null || name == "") { 
	  
	            return; 
	        } 
	   
	        Product[] tempArray = new Product[this.products.length - 1]; 
	  
	        for (int i = 0, k = 0; i < this.products.length; i++) { 
	  
	            if (this.products[i].getName() == name) { 
	                continue; 
	            } 
	  
	            tempArray[k++] = this.products[i]; 
	        }
	        this.products = tempArray;
	}
	
	public double getTotalPrice() {
		double orderprice = 0;
		for(int i = 0; i< this.products.length; i++) {
			orderprice += this.products[i].getPrice();
		}
		return orderprice;
	}
	
	
}
