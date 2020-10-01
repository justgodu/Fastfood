package ge.edu.btu.fastfood.product;

public class Combo extends Product{
	
	private double salePercentage;
	
	private Product products[];
	
	
	public Combo() {}
	public Combo(String name, String description, double salePercentage, Product products[]) {
		super(name,description);
		this.salePercentage = salePercentage;
		this.products = products;
	}		
	
	public double getSalePercentage	() {
		return this.salePercentage;
	}
	
	public void setSalePercentage(double salePercentage) {
		this.salePercentage = salePercentage;
	}
	
	public Product[] getProductsFromCombo() {
		return products;
	}
	
	
	@Override
	public double getPrice() {
		double price = 0;
		for(Product product : products) {
			price += product.getPrice();
		}
		return (price / 100) * (100 - this.salePercentage);
	}
}
