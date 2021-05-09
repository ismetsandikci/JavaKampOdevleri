package Ders5Odev1.business.validationRules.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Ders5Odev1.business.validationRules.abstracts.Validation;

public class AuthValidator implements Validation {
	
	public static boolean checkName(String firstName, String lastName) {
		
		if(firstName.length() < 2 || lastName.length() < 2) {
			System.out.println("Ad ve Soyad bilgileri en az 2 karakterden olusmalidir : " + firstName + " " + lastName );
			return false;
		}
		return true;
	}
	
	public static boolean checkEmail(String email) {
		
		if (email.isEmpty()) {
			System.out.println("E-mail bilgisi bos olamaz.");
			return false;
		}
		
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches() == false) {
			System.out.println("E-mail bilgisi istenilen kosullari saglamiyor : " + email);
			return false;
		}
		return true;
	}
	
	public static boolean checkPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Sifre bilgisi en az 6 karakterden olusmalidir.");
			return false;
		}
		return true;
	}
}
