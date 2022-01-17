package ma.jok.entities;

import java.io.Serializable;
import java.lang.Double;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Position
 *
 */
@Entity
public class Position implements Serializable {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Double latitude;
	private Double longitude;
	private Date date;
	
	@ManyToOne 
	@JoinColumn(name="smartphone_id", nullable=false)
    private Smartphone smartphone;
	
	private static final long serialVersionUID = 1L;

	public Position() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}   
	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Smartphone getSmartphone() {
		return smartphone;
	}

	public void setSmartphone(Smartphone smartphone) {
		this.smartphone = smartphone;
	}
   
}
