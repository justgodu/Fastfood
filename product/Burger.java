package ge.edu.btu.fastfood.product;

public class Burger extends Product{
	
	private double amount;
	
	
	public Burger() {}
	public Burger(String name, String description) {
		super(name, description);
		
	}
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public double getPrice() {
		return this.amount * price;
	}
}
