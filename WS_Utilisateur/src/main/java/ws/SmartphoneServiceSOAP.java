package ws;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ma.jok.dao.SmartphoneLocal;
import ma.jok.entities.Smartphone;

@WebService
public class SmartphoneServiceSOAP {
	
	@EJB
	private SmartphoneLocal metier;

	@WebMethod
	public Smartphone addSmartphone(Smartphone s) {
		return metier.addSmartphone(s);
	}
	@WebMethod
	public Smartphone updateSmartphone(Smartphone s) {
		return metier.updateSmartphone(s);
	}
	
	public int deleteSmartphone(Smartphone s) {
		return metier.deleteSmartphone(s);
	}
	@WebMethod
	public Smartphone getSmartphone(@WebParam(name="id") int id) {
		return metier.getSmartphone(id);
	}
	
	@WebMethod
	public List<Smartphone> listSmartphones() {
		return metier.listSmartphones();
	}

	public boolean AffecterSmartphone2Utilisateur() {
		return metier.AffecterSmartphone2Utilisateur();
	}
}
