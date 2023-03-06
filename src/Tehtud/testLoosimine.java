package Tehtud;

import Tehtud.Külastaja;
import Tehtud.Loosiratas;

public class testLoosimine {
	public static void main(String[] args) {
		Loosiratas loos = new Loosiratas();
		Külastaja k1 = new Külastaja("Tõnu", 1);
		Külastaja k2 = new Külastaja("Madis", 0);
		Külastaja k3 = new Külastaja("Kadi", 4);
		Külastaja k4 = new Külastaja("Karl", 15);
		Külastaja k5 = new Külastaja("Mari", 2);
		loos.lisaKülastaja(k1);
		loos.lisaKülastaja(k2);
		loos.lisaKülastaja(k3);
//		loos.lisaKülastaja(k4);
//		loos.lisaKülastaja(k5);

		System.out.println(loos.kõigeAktiivsemad(4));
	}
}
