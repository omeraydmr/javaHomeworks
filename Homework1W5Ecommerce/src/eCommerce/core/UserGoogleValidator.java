package eCommerce.core;

import java.util.regex.*;

import eCommerce.entity.concretes.User;

public class UserGoogleValidator implements UserValidatorService{

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
		String regex="^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$";
		Pattern pattern= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher= pattern.matcher(user.getEmail());

		if (matcher.matches()) {
			System.out.println("Kullanýcýnýn emaili Gmail ile doðrulandý ... ");
			return true;
		} else {
			System.out.println("Kullanýcýnýn emaili Gmail ile doðrulanamadý (Geçerli bir email adresi giriniz.) ... ");
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
