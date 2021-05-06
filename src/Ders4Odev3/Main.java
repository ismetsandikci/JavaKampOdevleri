package Ders4Odev3;

import java.time.LocalDate;

import Ders4Odev3.adapters.MernisServiceAdapter;
import Ders4Odev3.concrete.*;
import Ders4Odev3.entities.*;

public class Main {

	public static void main(String[] args) {
		
		//Oyuncu Olu�turma
		Gamer gamer1 = new Gamer(1, "�smet", "Sand�k��", LocalDate.of(y�l, ay, g�n), "tc");
		
		Gamer gamer2 = new Gamer();
		gamer2.setId(1);
		gamer2.setFirstName("Gamer");
		gamer2.setLastName("2");
		gamer2.setDateOfBirth(LocalDate.of(2021, 5, 6));
		gamer2.setNationalityId("12345678902");
        //Oyuncu Olu�turma Sonu
		
		//Oyun Olu�turma
		Game game1 = new Game(1, "Pes 2021", 219);
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Fifa 2021");
		game2.setGamePrice(279);
		//Oyun Olu�turma Sonu
		
		//Kampanya Olu�turma
		Campaign campaign1 = new Campaign(1, "Sepette �ndirim", 15);
		//Kampanya Olu�turma Sonu
		
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SalesManager salesManager = new SalesManager();
		
		//Oyuncu Ekleme
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		//Oyuncu Ekleme Sonu
		
		//Oyun Ekleme
		gameManager.add(game1);
		gameManager.add(game2);
		//Oyun Ekleme Sonu
		
		//Kampanya Ekleme
		campaignManager.add(campaign1);
		//Kampanya Ekleme Sonu
		
		//Sat��
		salesManager.sales(game1, gamer1);
		salesManager.campaignSales(game2, gamer1, campaign1);
		//Sat�� sonu
		
		
		//G�ncelleme ve Silme ��lemleri
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);
		
		gameManager.update(game1);
		gameManager.delete(game1);
		
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
	}

}
