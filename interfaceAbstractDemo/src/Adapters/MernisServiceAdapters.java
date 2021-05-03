package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
		KPSPublicSoap mernisValidation= new KPSPublicSoapProxy();
		
			
			try {
				if (mernisValidation.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()),
						customer.getFirstName(), customer.getLastName(), customer.getYearsOfBirth())) { 
					return true;
				}
				else {
					return false;
				}
			} catch (NumberFormatException | RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
}}