package eCommerce.core;

import eCommerce.entity.concretes.User;

public interface UserValidatorService {
	
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkEmailName(User user);
	boolean checkPasswordName(User user);
}
