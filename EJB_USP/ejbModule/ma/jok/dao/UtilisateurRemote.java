package ma.jok.dao;

import java.util.List;

import javax.ejb.Remote;

import ma.jok.entities.Utilisateur;

@Remote
public interface UtilisateurRemote {
	public Utilisateur addUtilisateur(Utilisateur u);
	public Utilisateur updateUtilisateur(Utilisateur u);
	public int deleteUtilisateur(Utilisateur u);
	public Utilisateur getUtilisateur(int id);
	public List<Utilisateur> listUtilisateurs();
}
