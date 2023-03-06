package Tehtud;

import java.io.File;
import java.util.Scanner;

public class TestTaara {
	static double tagatisA = 0.04;
	static double tagatisB = 0.08;
	static double tagatisC = 0.08;
	static double tagatisD = 0.08;

	public static void loeAndmed(String nimi) throws Exception{
		File fail = new File(nimi);



		try (Scanner sc = new Scanner(fail, "UTF-8")){
			String[] jook = new String[0];
			while (sc.hasNextLine()){
				String rida = sc.nextLine();
				String[] mass = rida.split(" ");

			}
		}
	}
}
