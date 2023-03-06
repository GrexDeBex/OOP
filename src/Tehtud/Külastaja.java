package Tehtud;

public class Külastaja implements Comparable<Külastaja>{
	private String nimi;
	private int külastused;

	public Külastaja(String nimi, int külastused) {
		this.nimi = nimi;
		this.külastused = külastused;
	}

	public String getNimi() {
		return nimi;
	}

	public int getKülastused() {
		return külastused;
	}

	@Override
	public String toString() {
		return nimi;
	}

	public int compareTo(Külastaja o){
		return this.külastused - o.külastused;
	}


}
