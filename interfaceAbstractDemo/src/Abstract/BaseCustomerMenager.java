package Abstract;


import Entities.Customer;

public abstract class  BaseCustomerMenager implements CustomerService {

	@Override
	public void Save(Customer customer) {

		
		System.out.println("veritabanưna kaydedildi: "+customer.getFirstName());
	}

}
