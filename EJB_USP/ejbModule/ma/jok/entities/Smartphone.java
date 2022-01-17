package ma.jok.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Smartphone
 *
 */
@Entity
public class Smartphone implements Serializable {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String imei;
	
	@ManyToOne 
	@JoinColumn(name="utilisateur_id", nullable=true)
    private Utilisateur utilisateur;
	
	@OneToMany(targetEntity = Position.class, mappedBy="smartphone" )
	private List<Position> positions = new ArrayList<>();
	
	private static final long serialVersionUID = 1L;

	public Smartphone() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
   
}
