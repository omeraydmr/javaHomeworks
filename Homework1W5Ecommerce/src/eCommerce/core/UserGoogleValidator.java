package eCommerce.core;

import java.util.regex.*;

import eCommerce.entity.concretes.User;

public class UserGoogleValidator implements UserValidatorService{

	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().length()>=2) {
			System.out.println("Kullanıcının ismi doğrulandı ... ");
			return true;
		}
		else {
			System.out.println("Kullanıcının ismi doğrulanamadı (İsminiz en az 2 karakterden oluşmalıdır.) ... ");
			return false;
		}
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().length()>=2) {
			System.out.println("Kullanıcının soyismi doğrulandı ... ");
			return true;
		}
		else {
			System.out.println("Kullanıcının soyismi doğrulanamadı (Soyisminiz en az 2 karakterden oluşmalıdır.) ... ");
			return false;
		}
	}

	@Override
	public boolean checkEmailName(User user) {
		String regex="^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$";
		Pattern pattern= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher= pattern.matcher(user.getEmail());

		if (matcher.matches()) {
			System.out.println("Kullanıcının emaili Gmail ile doğrulandı ... ");
			return true;
		} else {
			System.out.println("Kullanıcının emaili Gmail ile doğrulanamadı (Geçerli bir email adresi giriniz.) ... ");
			return false;
		}
	}

	@Override
	public boolean checkPasswordName(User user) {
		if(user.getPassword().length()>=6) {
			System.out.println("Kullanıcının parolası doğrulandı ... ");
			return true;
		}
		else {
			System.out.println("Kullanıcının parolası doğrulanamadı (Parolanız en az 6 karakterden oluşmalıdır.) ... ");
			return false;
		}
	}

}
