package fr.ensim;

import java.math.BigDecimal;
import java.util.Collections;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 CompagnieAutoroute compagnieAutoroute = new CompagnieAutoroute();
	        Route r1 = new Route();
	        Porte p1 = new PorteEntree(1), p2 = new PorteSortie(2), p3 = new PorteEntree(3), p4 = new PorteSortie(4);

	        r1.addPorte(p4);
	        r1.addPorte(p3);
	        r1.addPorte(p1);
	        r1.addPorte(p2);

	        compagnieAutoroute.ajouterRoute(r1);
	        Collections.sort(r1.portes, new OrdrePorteComparator());

	        Tarif
	                t12 = new Tarif(p1, p2, new BigDecimal("1E+1")),
	                t23 = new Tarif(p2, p3, new BigDecimal("2E+1")),
	                t34 = new Tarif(p3, p4, new BigDecimal("3E+1"));

	        compagnieAutoroute.ajouterTarif(t12);
	        compagnieAutoroute.ajouterTarif(t23);
	        compagnieAutoroute.ajouterTarif(t34);
	        
	        System.out.println("mon jar fonctionne");
	}

}
