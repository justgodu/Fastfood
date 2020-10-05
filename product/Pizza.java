package ge.edu.btu.fastfood.product;

public class Pizza extends Product{
	
	
	public static final double PIZZA_PIECE_COEFFICIENT = 0.2;
	
	public Pizza() {}
	public Pizza(String name, String description, double price) {
		super(name, description, price);
		
		
	}		
	
	
	@Override
	public double getPrice() {
		return PIZZA_PIECE_COEFFICIENT * price;
	}
}
