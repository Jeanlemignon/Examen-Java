package fr.ensim;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAutoroute {

	List<Route> routes ;
	List<Tarif> tarifs;
	
	CompagnieAutoroute(){
		 routes = new ArrayList<>();
		 tarifs = new ArrayList<>();
	}
	
	
	
	public List<Route> getRoutes() {
		return routes;
	}



	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}



	public List<Tarif> getTarifs() {
		return tarifs;
	}



	public void setTarifs(List<Tarif> tarifs) {
		this.tarifs = tarifs;
	}



	public BigDecimal obtenirTarif(Porte entree, Porte sortie) {
		
		Tarif tarif = new Tarif();
		for(Tarif t : tarifs) {
			
			if(t.getEntree().equals(entree) && t.getSortie().equals(sortie)) 
				tarif= t;
			else
				tarif = getTarifCalcule(entree, sortie);
		}
		return tarif.getPrix();
	}
	
	private Tarif getTarifCalcule(Porte entree, Porte sortie) {
		
		Tarif tarif = new Tarif();
		BigDecimal prix = new BigDecimal("0");
		for(Tarif t: tarifs) {
			if((entree.getNumeroDePorte() <= t.getEntree().getNumeroDePorte() ) &&
					(t.getEntree().getNumeroDePorte() <= sortie.getNumeroDePorte()) &&
					(sortie.getNumeroDePorte() >= t.getSortie().getNumeroDePorte()) &&
					(t.getSortie().getNumeroDePorte() >= entree.getNumeroDePorte())) {
				
				prix = prix.add(t.getPrix());
			}
				
		}
		
		tarif.setEntree(entree);
		tarif.setSortie(sortie);
		tarif.setPrix(prix);
		return tarif;
	}
	
	public Tarif getTarif(Porte entree,Porte sortie) {
		
		Tarif tarif = new Tarif();
		
		for(Tarif t : tarifs) {
		if(t.getEntree().equals(entree) && t.getSortie().equals(sortie)) 
			tarif= getTarifCalcule(entree, sortie);
		
	}
	return tarif;
	}
	
	
	private Tarif getTarifExacte(Porte p1, Porte p2) {
		
		Tarif tarif = new Tarif();
		for(Tarif t : tarifs) {
			
			if(t.getEntree().equals(p1) && t.getSortie().equals(p2)) 
				tarif= t;
			
		}
		return tarif;
	}
	
	public void ajouterTarif(Tarif t) {
		tarifs.add(t);
	}
	
	public void ajouterRoute(Route r) {
		routes.add(r);
	}
	
}
