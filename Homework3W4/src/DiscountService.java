
public interface DiscountService {
	
	public void addDiscount(User user, Discount discount, Games games);
	public void removeDiscount(User user, Discount discount, Games games);
	public void updateDiscount(User user, Discount discount, Games games);
	public void getAllDiscount(Discount[] discounts);
}
