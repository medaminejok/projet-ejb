package ma.jok.dao;

import java.util.List;

import javax.ejb.Local;

import ma.jok.entities.Smartphone;

@Local
public interface SmartphoneLocal {
	public Smartphone addSmartphone(Smartphone s);
	public Smartphone updateSmartphone(Smartphone s);
	public int deleteSmartphone(Smartphone s);
	public Smartphone getSmartphone(int id);
	public List<Smartphone> listSmartphones();
	public boolean AffecterSmartphone2Utilisateur();
}
