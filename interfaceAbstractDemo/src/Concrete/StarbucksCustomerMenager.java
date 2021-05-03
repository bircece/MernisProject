package Concrete;

import Abstract.BaseCustomerMenager;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerMenager extends BaseCustomerMenager{

	private CustomerCheckService customerCheckService;
	

	public StarbucksCustomerMenager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			
			super.Save(customer);
		}

		else{
			System.out.println("Geçersiz kiþi girildi.");
		}
	}

	

	

	

}
