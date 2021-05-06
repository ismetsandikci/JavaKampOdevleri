package Ders4Odev3.concrete;

import Ders4Odev3.abstracts.GamerService;
import Ders4Odev3.abstracts.UserValidationService;
import Ders4Odev3.entities.Gamer;

public class GamerManager implements GamerService {
	
	private UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if(userValidationService.CheckIfRealPerson(gamer)) {
			System.out.println("Oyuncu Eklendi : " + gamer.getFirstName() + " " + gamer.getLastName());
		}
		else {
			System.out.println("Oyuncu Eklenemedi : " + gamer.getFirstName() + " " + gamer.getLastName() + " i�in Mernis do�rulama ba�ar�s�z!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(userValidationService.CheckIfRealPerson(gamer)) {
			System.out.println("Oyuncu G�ncellendi  : " + gamer.getFirstName() + " " + gamer.getLastName());
		}
		else {
			System.out.println("Oyuncu G�ncellenemedi : " + gamer.getFirstName() + " " + gamer.getLastName() + " i�in Mernis do�rulama ba�ar�s�z!");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi : " + gamer.getFirstName() + " " + gamer.getLastName());
	}

}
