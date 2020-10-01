package ge.edu.btu.fastfood.product;

public class Pizza extends Product{
	
	private int piece;
	
	
	public Pizza() {}
	public Pizza(String name, String description, int piece) {
		super(name, description);
		this.piece = piece;
		
	}		
	
	public int getPiece() {
		return this.piece;
	}
	
	public void setPiece(int piece) {
		this.piece = piece;
	}
	
	@Override
	public double getPrice() {
		return this.piece * price;
	}
}
