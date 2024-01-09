package revija;

import java.util.Locale;

public class Model {
	static {
		Locale.setDefault(Locale.US);
	}
	private static int poslId=0;
	private int id=poslId++;
	private Velicina velicina;
	public Model(Velicina velicina) {
		this.velicina = velicina;
	}
	public int dohvId() {
		return id;
	}
	public Velicina dohvVelicinu() {
		return velicina;
	}
	@Override
	public String toString() {
		return "Model " + id + " (" + velicina + ")";
	}
	
}
