package dao;

import java.util.List;

import javax.ejb.Remote;

import entities.GPSTracker;

@Remote
public interface IGPSTracker  {
	public boolean ajouter(GPSTracker obj);
	public boolean modifier(GPSTracker obj);
	public boolean supprimer(GPSTracker obj);
	public GPSTracker findById(int id);
	public List<GPSTracker> findAll();
}
