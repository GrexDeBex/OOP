package Tehtud;

import java.time.LocalDate;

public class KolmnurkneKook extends Kook {
	private double a;
	private double b;
	private double c;

	public KolmnurkneKook(String nimetus, LocalDate parimEnne, double hind, double a, double b, double c) {
		super(nimetus, parimEnne, hind);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double pindala(){
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
