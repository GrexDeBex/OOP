package Tehtud;

import Tehtud.Luksusauto;

public class Limusiin extends Luksusauto {

	public Limusiin(String nimi, String mudel, boolean elektriAuto, int aasta) {
		super(nimi, mudel, elektriAuto, aasta);
	}


	public double arvutaParanduseMaksumus(double aeg){

		return super.arvutaParanduseMaksumus(aeg)*1.5;

	}

	public String autoliik(){
		return "Tehtud.Limusiin";
	}
}
