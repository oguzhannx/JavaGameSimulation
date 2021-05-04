package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SaleService {
	void buy(Customer customer, Game game, Campaign campaign);
	void gameRefund(Customer customer, Game game, Campaign campaign); 
}
