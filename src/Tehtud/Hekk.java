package Tehtud;

public class Hekk {
	private String nimi;
	private Põõsas[] põõsad;

	public Hekk(String nimi, Põõsas[] põõsad) {
		this.nimi = nimi;
		this.põõsad = põõsad;
	}

	public double kõrgeimPõõsas(){
		double max = 0;
		for (int i = 0; i < põõsad.length; i++) {
			if (põõsad[i].getKõrgus() > max){
				max = põõsad[i].getKõrgus();
			}
		}
		return max;
	}

	public double pikkus(){
		double sum = 0;
		for (int i = 0; i < põõsad.length; i++) {
			sum += põõsad[i].getLaius();
		}
		return sum;
	}

	public String toString() {
		return "Nimi: " + nimi + "\n" +
				"Kõrgeim põõsas: " + kõrgeimPõõsas() + "\n" +
				"Heki pikkus: " +  pikkus();
	}

	public static void main(String[] args) {
		Põõsas põõsas1 = new Põõsas(14, 30);
		Põõsas põõsas2 = new Põõsas(17, 27);
		Põõsas põõsas3 = new Põõsas(12, 19);
		Põõsas põõsas4 = new Põõsas(15, 25);
		Põõsas põõsas5 = new Põõsas(15, 23);

		Põõsas[] põõsad = {põõsas1, põõsas2, põõsas3, põõsas4, põõsas5};

		Hekk hekk = new Hekk("Belgia", põõsad);

		System.out.println(hekk + "\n");
		for (int i = 0; i < põõsad.length; i++) {
			System.out.println(põõsad[i] + "\n");
		}
	}
}
