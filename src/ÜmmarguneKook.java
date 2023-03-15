import java.time.LocalDate;

public class ÜmmarguneKook extends Kook{
	private double läbimõõt;

	public ÜmmarguneKook(String nimetus, LocalDate parimEnne, double hind, double läbimõõt) {
		super(nimetus, parimEnne, hind);
		this.läbimõõt = läbimõõt;
	}

	public double pindala(){
		return Math.PI * läbimõõt*läbimõõt/4;
	}
}
