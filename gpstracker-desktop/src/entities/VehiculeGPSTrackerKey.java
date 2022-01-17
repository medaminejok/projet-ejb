package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VehiculeGPSTrackerKey implements Serializable {
	
	/**
	 * 
	 * 
	 */
	
	private static final long serialVersionUID = -4743625472005847772L;

	@Column(name = "Vehicule_id")
	int vehiculeId;

	@Column(name = "GPSTracker_id")
	int gpsTrackerId;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gpsTrackerId;
		result = prime * result + vehiculeId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehiculeGPSTrackerKey other = (VehiculeGPSTrackerKey) obj;
		if (gpsTrackerId != other.gpsTrackerId)
			return false;
		if (vehiculeId != other.vehiculeId)
			return false;
		return true;
	}
	
	
	
	// standard constructors, getters, and setters
    // hashcode and equals implementation
	
	
}
