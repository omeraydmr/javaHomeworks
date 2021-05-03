
public class SalesManager implements SalesService{

	@Override
	public void addSale(User user, Games game, Sales sale) {
		System.out.println(user.getUserName() + " is bought " + game.getGameName() + " Total : " +(game.getGameValue()*sale.getSaleAmount()) + "TL by using "  + sale.getPaymentMethod() + ", Amount : " + sale.getSaleAmount());
		
	}

	@Override
	public void removeSale(User user, Games game, Sales sale) {
		System.out.println(user.getUserName() + " is removed " + game.getGameName() + " Total : " +(game.getGameValue()*sale.getSaleAmount()) + "TL by using "  + sale.getPaymentMethod() + ", Amount : " + sale.getSaleAmount());
		
	}

	@Override
	public void returnSale(User user, Games game, Sales sale) {
		System.out.println(user.getUserName() + " is returned " + game.getGameName() + " Total : " +(game.getGameValue()*sale.getSaleAmount()) + "TL by using "  + sale.getPaymentMethod() + ", Amount : " + sale.getSaleAmount());
		
	}

	@Override
	public void getAllSale(Sales[] sales) {
			for(Sales sale : sales) {
				System.out.println("Id : " + sale.getId() + " Sale Type : " + sale.getSaleType());
			}
		
	}

	
	
	
	
}
