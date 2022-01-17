package ma.jok.impl;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jok.dao.PositionLocal;
import ma.jok.dao.PositionRemote;
import ma.jok.entities.Position;
import ma.jok.entities.Smartphone;
import ma.jok.entities.Utilisateur;

@Stateless(name = "POS")
public class PositionImpl implements PositionLocal,PositionRemote{

	//@PersistenceContext(unitName = "EJB_USP")
	@PersistenceContext
	private EntityManager em;
		
	@Override
	@PermitAll
	public Position addPosition(Position p) {
		em.persist(p);
		return p;
	}

	@Override
	@PermitAll
	public Position updatePosition(Position p) {
		em.merge(p);
		return p;
	}

	@Override
	@PermitAll
	public int deletePosition(Position p) {
		if (em.contains(p)) {
			em.remove(p);
		} else {
			em.remove(em.merge(p));
		}
		return 1;
	}

	@Override
	@PermitAll
	public Position getPosition(int id) {
		Position p = em.find(Position.class, id);
		return p;
	}

	@Override
	@PermitAll
	public List<Position> listPositions() {
		Query query = em.createQuery("from Position");
		return query.getResultList();
	}

}
