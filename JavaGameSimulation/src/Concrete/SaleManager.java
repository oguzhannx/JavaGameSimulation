package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleService{

	@Override
	public void buy(Customer customer, Game game, Campaign campaign) {
		System.out.println(customer.getFirstName() + ", " + game.getGameName() + " oyununu " +
				(game.getPrice()-(game.getPrice() * campaign.getDiscount()/100))+ " tl'ye aldý." + " Ýndirim : %" + campaign.getDiscount());
	}

	@Override
	public void gameRefund(Customer customer, Game game, Campaign campaign) {
		System.out.println(customer.getFirstName() + ", " + campaign.getCampaignName() +
				" ile aldýðý "+ game.getGameName() + " oyununu iade etti.");
	}

}
