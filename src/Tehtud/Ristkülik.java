package Tehtud;

public class Ristkülik extends Rööpkülik {
	private double alus;
	private double kõrgus;

	public Ristkülik(double alus, double kõrgus) {
		super(alus, kõrgus);
		this.alus = alus;
		this.kõrgus = kõrgus;
	}

	public double diagonaaliPikkus(){
		return Math.sqrt(alus*alus+kõrgus*kõrgus);
	}
}
