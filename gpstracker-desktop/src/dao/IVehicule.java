package dao;

import java.util.List;

import javax.ejb.Remote;

import entities.Vehicule;


@Remote
public interface IVehicule  {
	public boolean ajouter(Vehicule obj);
	public boolean modifier(Vehicule obj);
	public boolean supprimer(Vehicule obj);
	public Vehicule findById(int id);
	public List<Vehicule> findAll();
}
