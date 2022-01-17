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

import ma.jok.dao.PositionLocal;
import ma.jok.entities.Position;


@Stateless
@Path("/")
public class PositionRestService {
	@EJB
	public PositionLocal metier;

	@POST
	@Path("/pos/")
	@Produces(MediaType.APPLICATION_JSON)
	public Position addPosition(Position p) {
		return metier.addPosition(p);
	}
	
	@PUT
	@Path("/pos/{id}")
	public Position updatePosition(Position p) {
		return metier.updatePosition(p);
	}
	
	@DELETE
	@Path("/pos/{id}")
	public int deletePosition(Position p) {
		return metier.deletePosition(p);
	}
	
	@GET
	@Path("/pos/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Position getPosition(@PathParam(value = "id") int id) {
		return metier.getPosition(id);
	}

	@GET
	@Path("/pos/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Position> listPositions() {
		return metier.listPositions();
	} 
}
