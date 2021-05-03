
public class Sales {
	
	private int id;
	private String saleType;
	private String paymentMethod;
	private int saleAmount;
	
	public Sales() {
		
	}
	
	public Sales(int id, String saleType, String paymentMethod, int saleAmount) {
		super();
		this.id = id;
		this.saleType = saleType;
		this.paymentMethod = paymentMethod;
		this.saleAmount = saleAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSaleType() {
		return saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(int saleAmount) {
		this.saleAmount = saleAmount;
	}
	
	
	
	
}
