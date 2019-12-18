package fr.ensim;


import java.util.ArrayList;
import java.util.List;

public class Route {

	List<Porte> portes;
	
	Route(){
		portes = new ArrayList<>();
	}
	
	
	public List<Porte> getPortes() {
		return portes;
	}


	public void setPortes(List<Porte> portes) {
		this.portes = portes;
	}


	public void addPorte(Porte p) {
		portes.add(p);
	}

	@Override
	public String toString() {
		return "Route [portes=" + portes + "]";
	}
	
	
}
