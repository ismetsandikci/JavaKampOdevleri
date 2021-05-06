package Ders4Odev3.concrete;

import Ders4Odev3.abstracts.SalesService;
import Ders4Odev3.entities.Campaign;
import Ders4Odev3.entities.Game;
import Ders4Odev3.entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void sales(Game game, Gamer gamer) {
		System.out.println("Oyun Sat��� : " + gamer.getFirstName() + " " + gamer.getLastName() +", " + game.getGameName() + " oyununu " +game.getGamePrice()+ " TL'ye sat�n ald�.");
	}

	@Override
	public void campaignSales(Game game, Gamer gamer, Campaign campaign) {
        double hesap = game.getGamePrice() - ((game.getGamePrice() * campaign.getDiscountRate()) / 100);
		System.out.println("Oyun Sat��� : " + gamer.getFirstName() + " " + gamer.getLastName() + ", " + game.getGameName() + " oyununu " + campaign.getCampaignName() + " kampanyas� ile %" + campaign.getDiscountRate() + " indirimle " + hesap + " TL'ye sat�n ald�.");
	}

}
