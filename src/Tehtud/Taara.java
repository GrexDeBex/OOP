package Tehtud;

public class Taara {
	private String jook;
	private char tahis;
	private String nimi;

	public Taara(String jook, char tahis, String nimi) {
		this.jook = jook;
		this.tahis = tahis;
		this.nimi = nimi;
	}

	public String getJook() {
		return jook;
	}

	public char getTahis() {
		return tahis;
	}

	public String getNimi() {
		return nimi;
	}

	public static double raha(char tahis){
		if (tahis == 'A'){
			return TestTaara.tagatisA;
		}
		if (tahis == 'B' || tahis == 'C' || tahis == 'D'){
			return TestTaara.tagatisB;
		}
		return 0;
	}

	public double maksumus(){
		return raha(tahis);
	}

	@Override
	public String toString() {
		return String.format("Jook: %s \nTähis: %c \n Nimi: %s", jook, tahis, nimi);
	}
}
