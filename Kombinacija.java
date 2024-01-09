package revija;

import java.util.ArrayList;

public class Kombinacija {
	private ArrayList<Nosivo> stvari;
	private int kap;
	public Kombinacija(int n) {
		this.stvari = new ArrayList<>(kap=n);
	}
	public void dodaj(Nosivo n) throws GDodavanje {
		if(kap==stvari.size()) throw new GDodavanje();
		stvari.add(n);

	}
	public int dohvBrStvari() {
		return stvari.size();
	}
	public int dohvMaxBrStvari() {
		return kap;
		}
	public Nosivo dohvStvar(int i) throws GIndeks {
		try {
			Nosivo n=null;
			n = stvari.get(i);
			if(n==null) throw new GIndeks();
			return n;
		}
		catch(IndexOutOfBoundsException e) {
			throw new GIndeks();
		}
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append('[');
		for( int i=0;i<stvari.size();i++) {
			try {
				sb.append(dohvStvar(i));
				if(i!=stvari.size()-1) {
					sb.append(',');
				}
			} catch (GIndeks e) {
			}
		}
		sb.append(']');
		return sb.toString();
	}
}
