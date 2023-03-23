package Tehtud;

public class Tee implements Comparable<Tee>{
	private String nimi;
	private double pikkus;
	private int prioriteet;

	public Tee(String nimi, double pikkus, int prioriteet) {
		this.nimi = nimi;
		this.pikkus = pikkus;
		this.prioriteet = prioriteet;
	}

	public String getNimi() {
		return nimi;
	}

	public double getPikkus() {
		return pikkus;
	}



	@Override
	public String toString() {
		return "Tehtud.Tee " +
				"nimi='" + nimi + '\'' +
				", pikkus=" + pikkus +
				", prioriteet=" + prioriteet;
	}

	public int compareTo(Tee o){
		return this.prioriteet - o.prioriteet;
	}
}
