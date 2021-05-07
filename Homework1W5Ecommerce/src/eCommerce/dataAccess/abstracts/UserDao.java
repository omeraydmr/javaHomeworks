package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entity.concretes.User;

public interface UserDao {
	
	void addToDb(User user);
	void updateToDb(User user);
	void deleteToDb(User user);
}
