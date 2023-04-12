package Tehtud;

import java.util.ArrayList;
import java.util.List;

abstract public class Koristusmasin {
	private String registrinr;
	private List<Tee> koristatudTeed;
	private double labisoit;
	abstract void korista(Tee tee);

	public Koristusmasin(String registrinr) {
		this.registrinr = registrinr;
		koristatudTeed = new ArrayList<>();
	}

	public String getRegistrinr() {
		return registrinr;
	}


	public void setKoristatudTeed(Tee tee) {
		koristatudTeed.add(tee);
	}

	public double getLabisoit() {
		return labisoit;
	}

	public void setLabisoit(double labisoit) {
		this.labisoit = labisoit;
	}


	@Override
	public String toString() {
		return "registrinr='" + registrinr + '\'' +
				", koristatudTeed=" + koristatudTeed.size() +
				", labisoit=" + labisoit;
	}
}
