import java.time.LocalDate;

public class RistkülikukujulineKook extends Kook{
	private double laius;
	private double kõrgus;

	public RistkülikukujulineKook(String nimetus, LocalDate parimEnne, double hind, double laius, double kõrgus) {
		super(nimetus, parimEnne, hind);
		this.laius = laius;
		this.kõrgus = kõrgus;
	}

	public double pindala(){
		return laius*kõrgus;
	}

}
