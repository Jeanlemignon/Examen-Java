package fr.ensim;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Tarif {

	Porte entree;
	Porte sortie;
	LocalDateTime dateValidite;
	BigDecimal prix;
	
	public Tarif(){};
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

	public LocalDateTime getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(LocalDateTime dateValidite) {
		this.dateValidite = dateValidite;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public Tarif(Porte entree, Porte sortie, BigDecimal prix) {
		super();
		this.entree = entree;
		this.sortie = sortie;
		this.prix = prix;
	}

	public Tarif(Porte entree, Porte sortie, LocalDateTime dateValidite, BigDecimal prix) {
		super();
		this.entree = entree;
		this.sortie = sortie;
		this.dateValidite = dateValidite;
		this.prix = prix;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateValidite == null) ? 0 : dateValidite.hashCode());
		result = prime * result + ((entree == null) ? 0 : entree.hashCode());
		result = prime * result + ((prix == null) ? 0 : prix.hashCode());
		result = prime * result + ((sortie == null) ? 0 : sortie.hashCode());
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
		Tarif other = (Tarif) obj;
		if (dateValidite == null) {
			if (other.dateValidite != null)
				return false;
		} else if (!dateValidite.equals(other.dateValidite))
			return false;
		if (entree == null) {
			if (other.entree != null)
				return false;
		} else if (!entree.equals(other.entree))
			return false;
		if (prix == null) {
			if (other.prix != null)
				return false;
		} else if (!prix.equals(other.prix))
			return false;
		if (sortie == null) {
			if (other.sortie != null)
				return false;
		} else if (!sortie.equals(other.sortie))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tarif [entree=" + entree + ", sortie=" + sortie + ", dateValidite=" + dateValidite + ", prix=" + prix
				+ "]";
	}
	
	
}
