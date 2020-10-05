package ge.edu.btu.fastfood;

import ge.edu.btu.fastfood.product.*;
import ge.edu.btu.fastfood.Order;


public class Runner {
	private static Product bigmack = new Burger("Big Mack", "Big burger with 2 story Burger", 8);
	
	private static Product pizzaMargherita = new Pizza("Big Pizza Margherita", "Big Pizza Margherita is a typical Neapolitan pizza, made with San Marzano tomatoes, mozzarella cheese, fresh basil, salt and extra-virgin olive oil.", 80);
	
	private static Product orangeJuice = new Juice("Orange Juice" , "Fresh Naturally made orange juice for healthy people", 8, 2);
	
	private static Product eveningMenu = new Combo("Evening Menu", "Kind of healthy menu for you evening", 20, new Product[] {bigmack, pizzaMargherita, orangeJuice});
	
	private static Order order = new Order();
	private static Order newOrder = new Order();
    public static void main(String[] args) {
        addProductsToOrder();
    	
        System.out.println("New order added, order ID: " + order.getId());
        try {
        for(Product product : order.getProducts()) {
        	System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() );
        }
        }catch(Exception ex) {
    		System.out.println("Couldnt print about products " + ex);
    	}
        
        System.out.println("New order added, order ID: " + newOrder.getId());
        try {
        for(Product product : newOrder.getProducts()) {
        	System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() );
        }
        }catch(Exception ex) {
    		System.out.println("Couldnt print about products " + ex);
    	}
        
    }
    
    public static void addProductsToOrder() {
    	
    	
    	try {
    	order.setId(1);
    	
    	order.addProduct(bigmack);
    	
    	order.addProduct(orangeJuice);
    	
    	order.addProduct(pizzaMargherita);
    	}catch(Exception ex) {
    		System.out.println("Couldnt add new order " + ex);
    	}
    	try {
    	newOrder.setId(2);
    	
    	newOrder.addProduct(eveningMenu);
    	}catch(Exception ex) {
    		System.out.println("Couldnt add new order " + ex);
    	}
    	
    	
    	
    }
}