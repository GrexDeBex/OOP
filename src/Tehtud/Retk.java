package Tehtud;

public class Retk implements Comparable<Retk> {
	private String laenutaja;
	private double distants;
	private int kestus;

	public Retk(String laenutaja, double distants, int kestus) {

		if (kestus > 60)
			throw new KahtlaneKestusErind("Retke kestus on liiga pikk");

		this.laenutaja = laenutaja;
		this.distants = distants;
		this.kestus = kestus;
	}

	public String getLaenutaja() {
		return laenutaja;
	}

	public double getDistants() {
		return distants;
	}

	public int getKestus() {
		return kestus;
	}


	@Override
	public int compareTo(Retk o) {
		return kestus - o.getKestus();
	}
}
