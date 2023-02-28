package Tehtud;

import java.io.File;
import java.util.Scanner;

public class Võistlused {
	static String lühenda(String rida){
		String[] massiiv = rida.split(" ");
		StringBuilder sõne = new StringBuilder();

		for (int i = 0; i < massiiv.length-1; i++) {
			sõne.append(Character.toUpperCase(massiiv[i].charAt(0)));
		}

		sõne.append('\'');
		sõne.append(massiiv[massiiv.length-1].charAt(2));
		sõne.append(massiiv[massiiv.length-1].charAt(3));

		return sõne.toString();
	}

	public static void main(String[] args) throws Exception{
		File fail = new File("Tehtud/võistlused.txt");

		try (Scanner sc = new Scanner(fail, "UTF-8")){
			while (sc.hasNextLine()){
				String rida = sc.nextLine();
				System.out.println(lühenda(rida));
			}
		}
	}
}
