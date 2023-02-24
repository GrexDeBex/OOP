package Tehtud;

class Isik {
	private String nimi;
	private double pikkus;
	private String isikukood;
	private double mass;



	Isik(String nimi, double pikkus, String isikukood, double mass) {
		this.nimi = nimi;
		this.pikkus = pikkus;
		this.isikukood = isikukood;
		this.mass = mass;
	}



	public String getNimi() {return nimi;}
	public void setNimi(String nimi) {this.nimi = nimi;}

	public double getPikkus() {return pikkus;}
	public void setPikkus(double pikkus) {
		if (pikkus > 0){
			this.pikkus = pikkus;
		}
	}

	public String getIsikukood() {return isikukood;}

	public double getMass() {return mass;}
	public void setMass(double mass) {
		if (mass > 0){
			this.mass = mass;
		}
	}


	public String toString() {
		return  nimi + "; " + isikukood;
	}

	public double KMI(){
		return mass / (pikkus*pikkus/10000);
	}


	public boolean onPikemKui(double pikkus){
		return pikkus < this.pikkus;
	}

}