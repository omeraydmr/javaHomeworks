package eCommerce.core;

import java.util.regex.*;

import eCommerce.entity.concretes.User;

public class UserValidator implements UserValidatorService{

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
		String regex = "^[a-zA-Z0-9_!#$%&*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());

		if (matcher.matches()) {
			System.out.println("Kullanıcının emaili doğrulandı ... ");
			return true;
		} else {
			System.out.println("Kullanıcının emaili doğrulanamadı (Geçerli bir email adresi giriniz.) ... ");
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
