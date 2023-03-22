package Tehtud;

public class Auto {
	private String nimi;
	private String mudel;
	private boolean elektriAuto;

	public Auto(String nimi, String mudel, boolean elektriAuto) {
		this.nimi = nimi;
		this.mudel = mudel;
		this.elektriAuto = elektriAuto;
	}

	public double arvutaParanduseMaksumus(double aeg){
		if (elektriAuto){
			return 36*aeg;
		}else{
			return 40*aeg;
		}
	}

	public String autoliik(){
		return "Sõiduauto";
	}

	public String toString(){
		return String.format("%s. Mudel: %s; omanik: %s", autoliik(), mudel, nimi);
	}
}
