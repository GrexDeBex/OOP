package Tehtud;

import Tehtud.Hulknurk;

public class Kolmnurk extends Hulknurk {
	private double alus;
	private double kõrgus;

	public Kolmnurk(double alus, double kõrgus) {
		super(3);
		this.alus = alus;
		this.kõrgus = kõrgus;
	}

	public double pindala(){
		return alus*kõrgus/2;
	}


}
