package dao;

import java.util.List;

import javax.ejb.Remote;

import entities.Position;

@Remote
public interface IPosition {
    
	public boolean ajouter(Position obj);
	public boolean modifier(Position obj);
	public boolean supprimer(Position obj);
	public Position findById(int id);
	public List<Position> findAll();
	
	
}
