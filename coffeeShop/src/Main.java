import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Muhammed","Sedef",LocalDate.of(1998, 12, 25),"23912621736"));

	}

}
