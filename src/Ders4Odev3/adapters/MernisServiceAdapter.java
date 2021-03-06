package Ders4Odev3.adapters;

import java.rmi.RemoteException;

import Ders4Odev3.abstracts.UserValidationService;
import Ders4Odev3.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserValidationService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(
					  Long.parseLong(gamer.getNationalityId()), 
					  gamer.getFirstName().toUpperCase(), 
					  gamer.getLastName().toUpperCase(), 
					  gamer.getDateOfBirth().getYear()
				);
		  } 
		  catch (NumberFormatException e) {
			   e.printStackTrace();
		  } 
		  catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}

}
