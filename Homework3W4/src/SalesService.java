
public interface SalesService {
	
	public void addSale(User user, Games game, Sales sale);
	public void removeSale(User user, Games game, Sales sale);
	public void returnSale(User user, Games game, Sales sale);
	public void getAllSale(Sales[] sales);
}
