package Ders4Odev3.concrete;

import Ders4Odev3.abstracts.GameService;
import Ders4Odev3.entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Eklendi : Oyun Adý: " + game.getGameName() + " / Ücret: " + game.getGamePrice() + " TL");
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Güncellendi : Oyun Adý: " + game.getGameName() + " / Ücret: " + game.getGamePrice() + " TL");
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi : " + game.getGameName());
	}

}
