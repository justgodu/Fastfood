package ge.edu.btu.fastfood.product;

public abstract class Product {

	private String name;
	
	private String description;
	
	protected double price;
	
	
	
	public Product() {}
	public Product(String name, String description, double price) {
		this.name = name;
		this.price = price;
		this.description = description;
		
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract double getPrice();
}
