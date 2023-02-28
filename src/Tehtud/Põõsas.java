package Tehtud;

public class Põõsas {
	private double kõrgus;
	private double laius;

	public Põõsas(double kõrgus, double laius){
		this.kõrgus = kõrgus;
		this.laius = laius;
	}

	public double getKõrgus() {return kõrgus;}
	public void setKõrgus(double kõrgus) {this.kõrgus = kõrgus;}

	public double getLaius() {return laius;}
	public void setLaius(double laius) {this.laius = laius;}

	public double juurdekasv(){
		return Math.random()*0.1*kõrgus;
	}

	@Override
	public String toString() {
		return "Kõrgus: " + kõrgus + "\n" +
				"Laius: " + laius + "\n" +
				"Juurdekasv: " +  juurdekasv();
	}
}
