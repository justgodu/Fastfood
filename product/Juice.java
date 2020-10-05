package ge.edu.btu.fastfood.product;

public class Juice extends Product{
	
	
	
	
	public Juice() {}
	public Juice(String name, String description, double price , double liters) {
		super(name, description,price* liters);
		
		
	}
	
	@Override
	public double getPrice() {
		return price;
	}
}
