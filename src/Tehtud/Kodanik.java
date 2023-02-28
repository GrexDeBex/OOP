package Tehtud;

public class Kodanik {
	private String eesnimi;
	private String perenimi;
	private String isikukood;
	private boolean juhiluba;

	public Kodanik(String eesnimi, String perenimi, String isikukood, boolean juhiluba) {
		this.eesnimi = eesnimi;
		this.perenimi = perenimi;
		this.isikukood = isikukood;
		this.juhiluba = juhiluba;
	}

	public String getIsikukood() {return isikukood;}

	public boolean kasJuhilubaOnOlemas(){
		return juhiluba;
	}

	public boolean kasOnTäiskasvanuAastal2018(){
		int sünniaasta = Integer.parseInt(isikukood.substring(1,3));
		return sünniaasta > 18 || sünniaasta < 1 ;
	}

	@Override
	public String toString() {
		return eesnimi + " " + perenimi;
	}
}
