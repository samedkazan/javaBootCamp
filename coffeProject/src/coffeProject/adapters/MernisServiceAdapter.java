package coffeProject.adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import coffeProject.entities.Customer;
import coffeProject.interfaces.RealPersonService;
import coffeProject.interfaces.Result;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements RealPersonService {

	public Result CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;

		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getIdentityNumber()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (result) {
			return new coffeProject.utils.Result(true);
		} else {
			return new coffeProject.utils.Result(false, "kimlik doðrulama baþarýsýz.");
		}

	}
}
