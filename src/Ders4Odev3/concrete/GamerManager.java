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
			System.out.println("Oyuncu Eklenemedi : " + gamer.getFirstName() + " " + gamer.getLastName() + " için Mernis doðrulama baþarýsýz!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(userValidationService.CheckIfRealPerson(gamer)) {
			System.out.println("Oyuncu Güncellendi  : " + gamer.getFirstName() + " " + gamer.getLastName());
		}
		else {
			System.out.println("Oyuncu Güncellenemedi : " + gamer.getFirstName() + " " + gamer.getLastName() + " için Mernis doðrulama baþarýsýz!");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi : " + gamer.getFirstName() + " " + gamer.getLastName());
	}

}
