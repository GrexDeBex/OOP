package Tehtud;

import Tehtud.Auto;

public class Autoteenindus {
	private int parandatudAutosid;
	private double teenitudTulu;


	public void paranda(Auto auto, double aeg){
		System.out.println(auto.toString() + " Paranduskulud: " + auto.arvutaParanduseMaksumus(aeg));
		parandatudAutosid++;
		teenitudTulu += auto.arvutaParanduseMaksumus(aeg);
	}

	public String toString(){
		return String.format("Parandatud autosid: %d Teenitud tulu: %f", parandatudAutosid, teenitudTulu);
	}
}
