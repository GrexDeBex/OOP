public class Seade {
	private int kood;
	private String nimetus;
	private double hind;
	static double protsent = 20;

	public Seade(int kood, String nimetus, double hind){
		this.kood = kood;
		this.nimetus = nimetus;
		this.hind = (double) Math.round(hind*100) / 100;
	}

	public int getKood() {return kood;}
	public void setKood(int kood) {this.kood = kood;}

	public String getNimetus() {return nimetus;}
	public void setNimetus(String nimetus) {this.nimetus = nimetus;}

	public double getHind() {return hind;}
	public void setHind(double hind) {this.hind = hind;}

	public double kmhind(){
		return (double) Math.round(hind * (100+protsent)) / 100;
	}

	@Override
	public String toString() {
		return "Nimetus: " + nimetus + "\n" +
				"Hind (käibemaksuga): " + kmhind() + "\n" +
				"Tootekood: " + kood;
	}

	public static void main(String[] args) {
		Seade telefon = new Seade(543, "Iphone", 100.666);
		Seade telekas = new Seade(233, "LG SmartTV", 550);
		System.out.println(telefon);
		System.out.println();

		Seade.protsent = 30;
		System.out.println(telefon);
		System.out.println();

		telefon.setHind(telefon.getHind()*2);
		System.out.println(telefon);
		System.out.println();

		System.out.println("Teleka kood: " + telekas.getKood());


	}
}
