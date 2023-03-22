package Tehtud;

public class Ruut1 extends Ristkülik {
	private double külg;

	public Ruut1(double külg) {
		super(külg, külg);
		this.külg = külg;
	}

	public double diagonaaliPikkus(){ // ülekatmine
		return Math.sqrt(2*külg*külg);
	}
}
