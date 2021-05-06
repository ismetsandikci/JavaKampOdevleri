package Ders4Odev3.abstracts;

import Ders4Odev3.entities.Campaign;
import Ders4Odev3.entities.Game;
import Ders4Odev3.entities.Gamer;

public interface SalesService {

    void sales(Game game, Gamer gamer);
    
    void campaignSales(Game game, Gamer gamer, Campaign campaign);
}
