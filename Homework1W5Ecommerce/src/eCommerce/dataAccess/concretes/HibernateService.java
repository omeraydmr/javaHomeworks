package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entity.concretes.User;

public class HibernateService implements UserDao{

	@Override
	public void addToDb(User user) {
		System.out.println(user.getFirstName() + " is recorded by Hibernate.");
		
	}

	@Override
	public void updateToDb(User user) {
		System.out.println(user.getFirstName() + " is joined by Hibernate.");
		
	}

	@Override
	public void deleteToDb(User user) {
		System.out.println(user.getFirstName() + " is deleted by Hibernate.");
		
	}

}
