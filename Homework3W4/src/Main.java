
public class Main {

	public static void main(String[] args) {
		
		System.out.println("-----------USERS-----------------");
		
		User user1 = new User();
		user1.setId(1);
		user1.setUserName("cavanar");
		user1.setFirstName("Ömer");
		user1.setLastName("Aydemir");
		user1.setNationalId("12345678911");
		user1.setAge(19);
		user1.setGender("Male");
		
		User user2 = new User();
		user2.setId(2);
		user2.setUserName("masware");
		user2.setFirstName("Alp");
		user2.setLastName("Taþkýran");
		user2.setNationalId("12345678910");
		user2.setAge(17);
		user2.setGender("Male");
		
		User user3 = new User();
		user3.setId(3);
		user3.setUserName("jester");
		user3.setFirstName("Berkay");
		user3.setLastName("Kýymaz");
		user3.setNationalId("12345678912");
		user3.setAge(20);
		user3.setGender("Male");
		
		User[] users = {user1, user2, user3};
		
		UserManager userManager = new UserManager();
		userManager.addUser(user1);
		userManager.removeUser(user2);
		userManager.updateUser(user3);
		userManager.getAll(users);
		
		System.out.println("-----------AUTHENTICATION-----------------");
		
		AuthenticationValue user1Value = new AuthenticationValue();
		user1Value.setUserFirstName("Ömer");
		user1Value.setUserLastName("Aydemir");
		user1Value.setUserNationalId("12345678911");
		user1Value.setUserAge(19);
		user1Value.setUserGender("Male");
		
		AuthenticationValue user2Value = new AuthenticationValue();
		user2Value.setUserFirstName("Alp");
		user2Value.setUserLastName("Taþkýran");
		user2Value.setUserNationalId("12345678910");
		user2Value.setUserAge(17);
		user2Value.setUserGender("Male");
		
		AuthenticationValue user3Value = new AuthenticationValue();
		user3Value.setUserFirstName("Berkay");
		user3Value.setUserLastName("Kýymaz");
		user3Value.setUserNationalId("12345678933");
		user3Value.setUserAge(20);
		user3Value.setUserGender("Male");
	
		Authenticator authentication = new Authenticator();
		authentication.Authentication(user1,user1Value);
		authentication.Authentication(user2,user2Value);
		authentication.Authentication(user3,user3Value);
		
		
		
		System.out.println("---------GAMES-------------------");
		
		Games games1 = new Games(1, "Outlast", "Korku", 32.99);
		Games games2 = new Games(2, "R6", "FPS", 139.99);
		Games games3 = new Games(3, "Europa Universalis 4", "Strateji", 55);
		
		Games[] games = {games1, games2, games3};
		
		GamesManager gamesManager = new GamesManager();
		gamesManager.addGame(games1);
		gamesManager.removeGame(games2);
		gamesManager.updateGame(games3);
		gamesManager.getAllGame(games);
		
		System.out.println("-------------SALES---------------");
		
		Sales sales1 = new Sales(1,"Code", "Credit Card", 1);
		Sales sales2 = new Sales(2,"Account", "Cash", 2);
		Sales sales3 = new Sales(3,"Gift", "Transfer", 3);
		
		Sales[] sales = {sales1, sales2, sales3};
		
		SalesManager salesManager = new SalesManager();
		salesManager.addSale(user2, games2, sales2);
		salesManager.removeSale(user1, games3, sales1);
		salesManager.returnSale(user3, games1, sales3);
		salesManager.getAllSale(sales);
		
		System.out.println("------------DISCOUNTS----------------");
		
		Discount discount1 = new Discount(1,"Kýþ Ýndirimi", 15);
		Discount discount2 = new Discount(2,"Yaz Ýndirimi", 30);
		Discount discount3 = new Discount(3,"Sonbahar Ýndirimi", 20);
		
		Discount[] discounts = {discount1, discount2, discount3};
		
		DiscountManager discountManager = new DiscountManager();
		discountManager.addDiscount(user3, discount2, games1);
		discountManager.addDiscount(user2, discount1, games3);
		discountManager.addDiscount(user1, discount3, games2);
		discountManager.getAllDiscount(discounts);
		

	}

}
