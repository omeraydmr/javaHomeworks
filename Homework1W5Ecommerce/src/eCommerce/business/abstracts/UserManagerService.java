package eCommerce.business.abstracts;

import eCommerce.entity.concretes.User;

public interface UserManagerService {
	
	void addToSys(User user);
	void updateToSys(User user);
	void deleteToSys(User user);
}
