package ge.edu.btu.fastfood.product;

public class Juice extends Product{
	
	private double litres;
	
	
	public Juice() {}
	public Juice(String name, String description) {
		super(name, description);
		
	}
	
	@Override
	public double getPrice() {
		return this.litres * price;
	}
}
