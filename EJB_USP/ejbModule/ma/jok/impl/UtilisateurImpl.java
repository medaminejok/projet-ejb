package ma.jok.impl;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jok.dao.UtilisateurLocal;
import ma.jok.dao.UtilisateurRemote;
import ma.jok.entities.Utilisateur;

@Stateless(name="USER")
public class UtilisateurImpl implements UtilisateurLocal,UtilisateurRemote{
	//@PersistenceContext(unitName = "EJB_USP")
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@PermitAll
	public Utilisateur addUtilisateur(Utilisateur u) {
		em.persist(u);
		return u;
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur u) {
		em.merge(u);
		return u;
	}

	@Override
	public int deleteUtilisateur(Utilisateur u) {
		if (em.contains(u)) {
			em.remove(u);
		} else {
			em.remove(em.merge(u));
		}
		return 1;
	}

	@Override
	public Utilisateur getUtilisateur(int id) {
		Utilisateur u = em.find(Utilisateur.class, id);
		if (u == null)
			throw new RuntimeException("Vehicule introvable");
		return u;
	}

	@Override
	@PermitAll
	public List<Utilisateur> listUtilisateurs() {
		Query query = em.createQuery("from Utilisateur");
		return query.getResultList();
	}
}
