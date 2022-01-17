package ma.jok.impl;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jok.dao.SmartphoneLocal;
import ma.jok.dao.SmartphoneRemote;
import ma.jok.entities.Smartphone;

@Stateless(name="PHONE")
public class SmartphoneImpl implements SmartphoneLocal,SmartphoneRemote{

	//@PersistenceContext(unitName = "EJB_USP")
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@PermitAll
	public Smartphone addSmartphone(Smartphone s) {
		em.persist(s);
		return s;
	}

	@Override
	@PermitAll
	public Smartphone updateSmartphone(Smartphone s) {
		em.merge(s);
		return s;
	}

	@Override
	@PermitAll
	public int deleteSmartphone(Smartphone s) {
		if (em.contains(s)) {
			em.remove(s);
		} else {
			em.remove(em.merge(s));
		}
		return 1;
	}

	@Override
	@PermitAll
	public Smartphone getSmartphone(int id) {
		Smartphone s = em.find(Smartphone.class, id);
		return s;
	}

	@Override
	@PermitAll
	public List<Smartphone> listSmartphones() {
		Query query = em.createQuery("from Smartphone");
		return query.getResultList();
	}

	@Override
	public boolean AffecterSmartphone2Utilisateur() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
