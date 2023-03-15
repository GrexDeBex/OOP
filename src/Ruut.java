public class Ruut extends Ristkülik{
	private double külg;

	public Ruut( double külg) {
		super(külg, külg);
		this.külg = külg;
	}

	public double diagonaaliPikkus(){ // ülekatmine
		return Math.sqrt(2*külg*külg);
	}
}
