package fr.ensim;

import java.math.BigDecimal;

public class Voyage {

	Porte entree, sortie;
	BigDecimal tarif;
	CompagnieAutoroute autoroute;
	
	public Porte getEntree() {
		return entree;
	}
	public void setEntree(Porte entree) {
		this.entree = entree;
	}
	public Porte getSortie() {
		return sortie;
	}
	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}
	public BigDecimal getTarif() {
		return tarif;
	}
	public void setTarif(BigDecimal tarif) {
		this.tarif = tarif;
	}
	public CompagnieAutoroute getAutoroute() {
		return autoroute;
	}
	public void setAutoroute(CompagnieAutoroute autoroute) {
		this.autoroute = autoroute;
	}
	public Voyage(Porte entree, Porte sortie, CompagnieAutoroute autoroute) {
		super();
		this.entree = entree;
		this.sortie = sortie;
		this.autoroute = autoroute;
	}
	public Voyage(Porte entree, Porte sortie, BigDecimal tarif, CompagnieAutoroute autoroute) {
		super();
		this.entree = entree;
		this.sortie = sortie;
		this.tarif = tarif;
		this.autoroute = autoroute;
	}
	
	
	
}
