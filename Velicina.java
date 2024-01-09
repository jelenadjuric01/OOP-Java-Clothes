package revija;

import java.util.Locale;

public class Velicina {
	public enum Oznaka{S,M,L};
	private Oznaka o;
	public Velicina(Oznaka o) {
		this.o = o;
	}
	public Oznaka dohvOznaku() {
		return o;
	}
	public boolean manja(Velicina v) {
		return (o.compareTo(v.o)<0);
	}
	@Override
	public String toString() {
		return o.toString();
	}
	
}
