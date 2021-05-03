import Abstract.BaseCustomerMenager;
import Adapters.MernisServiceAdapters;
import Concrete.NeroCustomerMenager;
import Concrete.StarbucksCustomerMenager;
import Entities.Customer;

public class main {

	public static void main(String[] args) {

		/*BaseCustomerMenager customerMenager= new NeroCustomerMenager();
		customerMenager.Save(new Customer(1, "FÝLÝZ BÝRCE ", "ÇETÝN", 1998, "63190268094"));
		System.out.println();*/
		
		BaseCustomerMenager customerMenager= new StarbucksCustomerMenager(new MernisServiceAdapters());
		customerMenager.Save(new Customer(1, "FÝLÝZ BÝRCE ", "ÇETÝN", 1997, "63190268094"));
		System.out.println();	}

}
