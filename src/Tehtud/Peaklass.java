package Tehtud;

import Tehtud.Koristusmasin;
import Tehtud.Maastur;

import java.io.File;
import java.util.*;

public class Peaklass {
	public static List<Tee> loeTeed(String failiNimi) throws Exception {
		File fail = new File(failiNimi);



		try (Scanner sc = new Scanner(fail, "UTF-8")){
			List<Tee> teeAndmed = new ArrayList<>();
			while (sc.hasNextLine()){
				String rida = sc.nextLine();
				String[] tee = rida.split("/");

				teeAndmed.add(new Tee(tee[0], Double.parseDouble(tee[1]), Integer.parseInt(tee[2])));

			}
			return teeAndmed;
		}

	}

	public static void main(String[] args) throws Exception{
		List<Tee> teed = loeTeed("teed.txt");

		Traktor t1 = new Traktor("124");
		Traktor t2 = new Traktor("125");
		Traktor t3 = new Traktor("126");
		Maastur m1 = new Maastur("234", "12");
		Maastur m2 = new Maastur("245", "13");

		Koristusmasin[] masinad = {t1, t2, t3, m1, m2};

		Collections.sort(teed);

		for (Tee tee : teed) {
			int indeks = (int) (Math.random()*masinad.length);

			Koristusmasin masin = masinad[indeks];
			masin.korista(tee);
		}

		for (Koristusmasin koristusmasin : masinad) {
			System.out.println(koristusmasin);
		}



	}
}
