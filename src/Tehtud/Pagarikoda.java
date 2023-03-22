package Tehtud;

import Tehtud.KolmnurkneKook;
import Tehtud.Kook;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;

public class Pagarikoda {
	public static List<Kook> loeKoogid(String failiNimi) throws FileNotFoundException {
		File fail = new File(failiNimi);
		
		try (Scanner sc = new Scanner(fail, "UTF-8")){
			ArrayList<Kook> koogid = new ArrayList<>();
			
			while (sc.hasNextLine()){
				String rida = sc.nextLine();
				String[] andmed = rida.split("; ");
				
				if (andmed.length == 4){
					koogid.add(new ÜmmarguneKook(andmed[0], LocalDate.parse(andmed[1]), 
							Double.parseDouble(andmed[2]), Double.parseDouble(andmed[3])));
				} else if (andmed.length == 5) {
					koogid.add(new RistkülikukujulineKook(andmed[0], LocalDate.parse(andmed[1]),
							Double.parseDouble(andmed[2]), Double.parseDouble(andmed[3]),Double.parseDouble(andmed[4])));
				} else if (andmed.length == 6) {
					koogid.add(new KolmnurkneKook(andmed[0], LocalDate.parse(andmed[1]),
							Double.parseDouble(andmed[2]), Double.parseDouble(andmed[3]),
							Double.parseDouble(andmed[4]), Double.parseDouble(andmed[5])));
				}

			}
			return koogid;
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		List<Kook> koogid = loeKoogid("koogid.txt");
		Collections.sort(koogid);

		for (Kook kook : koogid) {
			System.out.println(kook);
		}
	}
}
