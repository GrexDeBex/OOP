package Tehtud;

public class AineHinne {
	private String nimetus;
	private char hinne;

	public AineHinne(String nimetus, char hinne) {
		this.nimetus = nimetus;
		this.hinne = hinne;
	}

	public AineHinne(String nimetus, String[] massiiv) {
		this.nimetus = nimetus;
		this.hinne = hinnePunktideMassiivist(massiiv);
	}

	public String getNimetus() {
		return nimetus;
	}

	public char getHinne() {
		return hinne;
	}

	@Override
	public String toString() {
		return "Tehtud.AineHinne{" +
				"nimetus='" + nimetus + '\'' +
				", hinne=" + hinne +
				'}';
	}

	private char hinnePunktideMassiivist(String[] massiiv){
		double sum = 0;
		for (String s : massiiv)
			sum += Double.parseDouble(s);


		if (sum > 90)
			return 'A';
		if (sum > 80)
			return 'B';
		if (sum > 70)
			return 'C';
		if (sum > 60)
			return 'D';
		if (sum >= 50)
			return 'E';

		return 'F';
	}


}
