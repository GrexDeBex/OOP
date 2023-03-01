package Tehtud;

import Tehtud.Kodanik;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TranspordiametiKampaania {
	static ArrayList<Kodanik> loeKodanikud(String faili_nimi) throws Exception{
		File fail = new File(faili_nimi);
		ArrayList<Kodanik> kodanikud = new ArrayList<>();

		try (Scanner sc = new Scanner(fail, "UTF-8")){
			while (sc.hasNextLine()){
				String rida = sc.nextLine();
				String[] massiiv = rida.split(",");

				boolean juhiluba = massiiv[3].equals("Olemas");

				Kodanik isik = new Kodanik(massiiv[1], massiiv[0], massiiv[2], juhiluba);
				kodanikud.add(isik);
			}
		}
		return kodanikud;
	}

	public static void main(String[] args) throws Exception{
		ArrayList<Kodanik> kodanikud = loeKodanikud("src\\Tehtud\\kodanikud.txt");
		ArrayList<Kodanik> kingitus = new ArrayList<>();

		for (Kodanik kodanik : kodanikud) {
			if (kodanik.kasJuhilubaOnOlemas()) {
				System.out.println(kodanik +
						" juhiluba kingituseks ei saanud, põhjus: juhiluba on juba olemas.");
				kingitus.add(kodanik);
			} else if (kodanik.kasOnTäiskasvanuAastal2018()) {
				System.out.println(kodanik + " sai juhiloa kingituseks.");

			} else {
				System.out.println(kodanik +
						" juhiluba kingituseks ei saanud, põhjus: pole täiskasvanu.");
				kingitus.add(kodanik);
			}
		}

		System.out.println("\nKodanikud, kes jäid kingitusest ilma:");
		for (Kodanik kodanik : kingitus) {
			System.out.println(kodanik.getIsikukood());
		}
	}
}
