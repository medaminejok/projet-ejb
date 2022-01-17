package ma.jok.dao;

import java.util.List;

import javax.ejb.Remote;

import ma.jok.entities.Position;

@Remote
public interface PositionRemote {
	public Position addPosition(Position p);
	public Position updatePosition(Position p);
	public int deletePosition(Position p);
	public Position getPosition(int id);
	public List<Position> listPositions();
}
