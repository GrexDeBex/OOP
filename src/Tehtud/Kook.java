package Tehtud;

import java.time.LocalDate;

abstract public class Kook implements Comparable<Kook>{
	private String nimetus;
	private LocalDate parimEnne;
	private double hind;

	public Kook(String nimetus, LocalDate parimEnne, double hind) {
		if (nimetus.equals("")){
			this.nimetus = "The cake is a lie";
		}else{
			this.nimetus = nimetus;
		}
		this.parimEnne = parimEnne;
		this.hind = hind;
	}

	abstract double pindala();

	public double koogiHind(){
		double temp = Math.round(hind*pindala()*100);
		return temp/100;
	}

	public String toString(){
		return String.format("Nimetus: %s  Hind: %.2f  Parim enne: %s", nimetus, koogiHind(), parimEnne);
	}

	public int compareTo(Kook o){
		return parimEnne.compareTo(o.parimEnne);
	}
}
