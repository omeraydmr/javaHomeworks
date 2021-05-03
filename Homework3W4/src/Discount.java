
public class Discount {
	
	private int id;
	private String discountName;
	private double discountAmount;
	
	public Discount() {
		
	}

	public Discount(int id, String discountName, double discountAmount) {
		super();
		this.id = id;
		this.discountName = discountName;
		this.discountAmount = discountAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

}
