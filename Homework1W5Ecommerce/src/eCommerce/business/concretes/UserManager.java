package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserManagerService;
import eCommerce.core.UserValidatorService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entity.concretes.User;

public class UserManager implements UserManagerService{
	
	private UserDao userDao;
	private UserValidatorService userValidator;

	public UserManager(UserDao userDao, UserValidatorService userValidator) {
		super();
		this.userDao = userDao;
		this.userValidator = userValidator;
	}
	
	@Override
	public void addToSys(User user) {
		if (userValidator.checkFirstName(user) && userValidator.checkLastName(user) && userValidator.checkEmailName(user) && userValidator.checkPasswordName(user)) {
			userDao.addToDb(user);
		} 
		else {
			System.out.println("Sisteme ekleme yapýlamadý. ");
		}	
	}

	@Override
	public void updateToSys(User user) {
		if (userValidator.checkFirstName(user) && userValidator.checkLastName(user) && userValidator.checkEmailName(user) && userValidator.checkPasswordName(user)) {
			userDao.updateToDb(user);
		} 
		else {
			System.out.println("Sistemde güncelleme yapýlamadý. ");
		}	
		
	}

	@Override
	public void deleteToSys(User user) {
		if (userValidator.checkFirstName(user) && userValidator.checkLastName(user) && userValidator.checkEmailName(user) && userValidator.checkPasswordName(user)) {
			userDao.deleteToDb(user);
		} 
		else {
			System.out.println("Sistemden silme yapýlamadý. ");
		}	
		
	}

}
