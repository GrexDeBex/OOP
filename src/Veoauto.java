public class Veoauto extends Auto{
	private boolean füüsilineIsik;

	public Veoauto(String nimi, String mudel, boolean elektriAuto, boolean füüsilineIsik) {
		super(nimi, mudel, elektriAuto);
		this.füüsilineIsik = füüsilineIsik;
	}

	public double arvutaParanduseMaksumus(double aeg){
		if (füüsilineIsik){
			return super.arvutaParanduseMaksumus(aeg)*2;
		}else {
			return super.arvutaParanduseMaksumus(aeg)*3;
		}
	}

	public String autoliik(){
		return "Veoauto";
	}
}
