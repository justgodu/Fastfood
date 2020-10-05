package ge.edu.btu.fastfood.product;

public class Burger extends Product{
	
	private static final int AMOUNT_COEFFICIENT = 1;
	
	
	public Burger() {}
	public Burger(String name, String description, double price ) {
		super(name, description, price);
		
	
		
	}
	
	
	@Override
	public double getPrice() {
		return AMOUNT_COEFFICIENT * price;
	}
}
