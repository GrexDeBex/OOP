package Tehtud;

import Tehtud.Atraktsioon;
import Tehtud.Dokument;

public class testAtraktsioon {
	public static void main(String[] args) {
		Atraktsioon karusell = new Atraktsioon("karusell", 14);
		Atraktsioon maed = new Atraktsioon("maed", 12);
		Õpilaspilet pilet = new Õpilaspilet(2010);
		IdKaart kaart = new IdKaart("50801012764");
		Dokument[] dokumendid = {pilet, kaart};

		karusell.vanusedSobivad(dokumendid);
		maed.vanusedSobivad(dokumendid);

	}
}
