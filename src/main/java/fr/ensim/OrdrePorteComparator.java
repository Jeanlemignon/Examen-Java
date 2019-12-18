package fr.ensim;

import java.util.Comparator;

public class OrdrePorteComparator implements Comparator<Porte> {

	@Override
	public int compare(Porte arg0, Porte arg1) {
		// TODO Auto-generated method stub
		return arg0.getNumeroDePorte()-arg1.getNumeroDePorte();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
}
