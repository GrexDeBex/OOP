public class Rööpkülik extends Hulknurk{
	private double alus;
	private double kõrgus;

	public Rööpkülik(double alus, double kõrgus) {
		super(4);
		this.alus = alus;
		this.kõrgus = kõrgus;
	}

	public double pindala(){ // dünaamilist seostamist kasutatud klassi Ruut ja Ristkülik poolt
		return alus*kõrgus;
	}
}
