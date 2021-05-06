package Ders4Odev3.concrete;

import Ders4Odev3.abstracts.CampaignService;
import Ders4Odev3.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Eklendi : Kampanya Ad�: " + campaign.getCampaignName() + "  / �ndirim Oran�: %" + campaign.getDiscountRate());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya G�ncellendi : Kampanya Ad�: " + campaign.getCampaignName() + " / �ndirim Oran�: %" + campaign.getDiscountRate());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi : " + campaign.getCampaignName() );
	}

}
