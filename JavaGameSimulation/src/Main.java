import java.util.Date;

import Abstract.CampaignService;
import Abstract.CustomerService;
import Abstract.GameService;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.ValidationManager;
import Entities.Campaign;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerService customer = new CustomerManager(new ValidationManager());
		customer.add(new Customer(1, "Oðuzhan", "Öztürk", new Date(1999, 9, 9), "99999999999"));
		
		System.out.println("-------------------------------------\n");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "Kýþ kampanyasý", 12));
		
		
		
	}

}
