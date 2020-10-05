package ge.edu.btu.fastfood.product;

public class Combo extends Product{
	
	private double salePercentage;
	
	private Product[] products = new Product[0];
	
	public static final int AMOUNT_COEFFICIENT = 1;
	
	
	public Combo() {}	
	
	public Combo(String name, String description, double salePercentage, Product products[]) {
		super(name,description, 0);
		this.salePercentage = salePercentage;
		this.products = products;
		
		this.getPrice();
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
	
	@Override
	public double getPrice() {
		double price = 0;
		for(Product product : products) {
			price += product.getPrice();
		}
		
		super.setPrice(price);
		return (price / 100) * (100 - this.salePercentage) * AMOUNT_COEFFICIENT;
		
		
	}
}
