package ma.jok.dao;

import java.util.List;

import javax.ejb.Local;

import ma.jok.entities.Utilisateur;

@Local
public interface UtilisateurLocal {
	public Utilisateur addUtilisateur(Utilisateur u);
	public Utilisateur updateUtilisateur(Utilisateur u);
	public int deleteUtilisateur(Utilisateur u);
	public Utilisateur getUtilisateur(int id);
	public List<Utilisateur> listUtilisateurs();
}
