package eCommerce.core;

import java.util.regex.*;

import eCommerce.entity.concretes.User;

public class UserValidator implements UserValidatorService{

	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().length()>=2) {
			System.out.println("Kullanýcýnýn ismi doðrulandý ... ");
			return true;
		}
		else {
			System.out.println("Kullanýcýnýn ismi doðrulanamadý (Ýsminiz en az 2 karakterden oluþmalýdýr.) ... ");
			return false;
		}
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().length()>=2) {
			System.out.println("Kullanýcýnýn soyismi doðrulandý ... ");
			return true;
		}
		else {
			System.out.println("Kullanýcýnýn soyismi doðrulanamadý (Soyisminiz en az 2 karakterden oluþmalýdýr.) ... ");
			return false;
		}
	}

	@Override
	public boolean checkEmailName(User user) {
		String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());

		if (matcher.matches()) {
			System.out.println("Kullanýcýnýn emaili doðrulandý ... ");
			return true;
		} else {
			System.out.println("Kullanýcýnýn emaili doðrulanamadý (Geçerli bir email adresi giriniz.) ... ");
			return false;
		}
	}

	@Override
	public boolean checkPasswordName(User user) {
		if(user.getPassword().length()>=6) {
			System.out.println("Kullanýcýnýn parolasý doðrulandý ... ");
			return true;
		}
		else {
			System.out.println("Kullanýcýnýn parolasý doðrulanamadý (Parolanýz en az 6 karakterden oluþmalýdýr.) ... ");
			return false;
		}
	}

}
