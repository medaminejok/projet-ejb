package dao;

import java.util.List;

import javax.ejb.Remote;

import entities.VehiculeGPSTracker;

@Remote
public interface IVehiculeGPSTracker {
	public boolean ajouter(VehiculeGPSTracker obj);
	public boolean modifier(VehiculeGPSTracker obj);
	public boolean supprimer(VehiculeGPSTracker obj);
	public VehiculeGPSTracker findById(int id);
	public List<VehiculeGPSTracker> findAll();
    
}
