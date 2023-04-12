package Tehtud;

import Tehtud.Koristusmasin;

public class Maastur extends Koristusmasin {
	private String haagisnr;

	public Maastur(String registrinr, String haagisnr) {
		super(registrinr);
		this.haagisnr = haagisnr;
	}

	public void korista(Tee tee){
		System.out.println(tee + "         Maasturi registrinr = " + this.getRegistrinr());
		this.setLabisoit(tee.getPikkus()*3+this.getLabisoit());
		this.setKoristatudTeed(tee);
	}

	@Override
	public String toString() {
		return super.toString() + " haagise registrinr=" + haagisnr;
	}
}
