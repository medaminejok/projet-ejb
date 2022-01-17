package ws;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ma.jok.dao.SmartphoneLocal;
import ma.jok.entities.Smartphone;

@Stateless
@Path("/")
public class SmartphoneRestService {

	@EJB
	private SmartphoneLocal metier;

	@POST
	@Path("/phone/")
	@Produces(MediaType.APPLICATION_JSON)
	public Smartphone addSmartphone(Smartphone s) {
		return metier.addSmartphone(s);
	}

	@PUT
	@Path("/phone/{id}")
	public Smartphone updateSmartphone(Smartphone s) {
		return metier.updateSmartphone(s);
	}

	@DELETE
	@Path("/phone/{id}")
	public int deleteSmartphone(Smartphone s) {
		return metier.deleteSmartphone(s);
	}
	
	@GET
	@Path("/phone/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Smartphone getSmartphone(@PathParam(value = "id") int id) {
		return metier.getSmartphone(id);
	}

	@GET
	@Path("/phone/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Smartphone> listSmartphones() {
		return metier.listSmartphones();
	}

	public boolean AffecterSmartphone2Utilisateur() {
		return metier.AffecterSmartphone2Utilisateur();
	}
}