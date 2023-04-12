package Tehtud;

import Tehtud.Koristusmasin;
import Tehtud.Tee;

public class Traktor extends Koristusmasin {

	public Traktor(String registrinr) {
		super(registrinr);
	}

	public void korista(Tee tee){
		System.out.println(tee + "         Traktori registrinr = " + this.getRegistrinr());
		this.setLabisoit(tee.getPikkus()*2+this.getLabisoit());
		this.setKoristatudTeed(tee);
	}
}
