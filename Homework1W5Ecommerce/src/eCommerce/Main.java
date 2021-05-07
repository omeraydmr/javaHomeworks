package eCommerce;

import eCommerce.business.concretes.UserManager;
import eCommerce.core.UserGoogleValidator;
import eCommerce.core.UserValidator;
import eCommerce.core.UserValidatorService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.dataAccess.concretes.HibernateService;
import eCommerce.entity.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Ömer", "Aydemir", "omer@gmail.com", "1234567");
		User user2 = new User(2, "Ömer", "Aydemir", "omer@hotmail.com", "1234567");
		User user3 = new User(3, "Ömer", "Aydemir", "omer@mail.com", "123");
		User user4 = new User(4, "Ö", "Aydemir", "omer@gmail.com", "1234567");
		User user5 = new User(5, "Ömer", "A", "omer@gmail.com", "1234567");

		//UserManager userManager = new UserManager(new HibernateService(), new UserValidator(), new UserGoogleValidator());
		//	userManager1.addToSys(user1);
		//  System.out.println("======================================");
		//  userManager1.addToSys(user2);
		//  System.out.println("======================================");
		//	userManager1.addToSys(user3);
		//	System.out.println("======================================");
		//	userManager1.addToSys(user4);
		//	System.out.println("======================================");
		//	userManager1.addToSys(user5);
		//  System.out.println("======================================");
		
			
		UserManager userManager1 = new UserManager(new HibernateService(), new UserValidator());
		userManager1.addToSys(user1);
		System.out.println("======================================");
		userManager1.addToSys(user2);
		System.out.println("======================================");
		userManager1.addToSys(user3);
		System.out.println("======================================");
		userManager1.addToSys(user4);
		System.out.println("======================================");
		userManager1.addToSys(user5);
		System.out.println("======================================");
	}

}
