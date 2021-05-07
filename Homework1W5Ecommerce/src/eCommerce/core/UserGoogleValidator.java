package eCommerce.core;

import java.util.regex.*;

import eCommerce.entity.concretes.User;

public class UserGoogleValidator implements UserValidatorService{

	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().length()>=2) {
			System.out.println("Kullan�c�n�n ismi do�ruland� ... ");
			return true;
		}
		else {
			System.out.println("Kullan�c�n�n ismi do�rulanamad� (�sminiz en az 2 karakterden olu�mal�d�r.) ... ");
			return false;
		}
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().length()>=2) {
			System.out.println("Kullan�c�n�n soyismi do�ruland� ... ");
			return true;
		}
		else {
			System.out.println("Kullan�c�n�n soyismi do�rulanamad� (Soyisminiz en az 2 karakterden olu�mal�d�r.) ... ");
			return false;
		}
	}

	@Override
	public boolean checkEmailName(User user) {
		String regex="^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$";
		Pattern pattern= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher= pattern.matcher(user.getEmail());

		if (matcher.matches()) {
			System.out.println("Kullan�c�n�n emaili Gmail ile do�ruland� ... ");
			return true;
		} else {
			System.out.println("Kullan�c�n�n emaili Gmail ile do�rulanamad� (Ge�erli bir email adresi giriniz.) ... ");
			return false;
		}
	}

	@Override
	public boolean checkPasswordName(User user) {
		if(user.getPassword().length()>=6) {
			System.out.println("Kullan�c�n�n parolas� do�ruland� ... ");
			return true;
		}
		else {
			System.out.println("Kullan�c�n�n parolas� do�rulanamad� (Parolan�z en az 6 karakterden olu�mal�d�r.) ... ");
			return false;
		}
	}

}
