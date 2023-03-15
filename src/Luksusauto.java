import java.time.Year;

public class Luksusauto extends Auto{
	private int aasta;

	public Luksusauto(String nimi, String mudel, boolean elektriAuto, int aasta) {
		super(nimi, mudel, elektriAuto);
		this.aasta = aasta;
	}

	public double arvutaParanduseMaksumus(double aeg){
		if (Year.now().getValue() - aasta > 70){
			return super.arvutaParanduseMaksumus(aeg)*15;
		}else {
			return super.arvutaParanduseMaksumus(aeg)*10;
		}
	}

	public String autoliik(){
		return "Luksusauto";
	}
}
