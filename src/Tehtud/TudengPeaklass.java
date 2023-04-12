package Tehtud;

import Tehtud.AineHinne;
import Tehtud.Tudeng;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TudengPeaklass {
	static List<AineHinne> loePunktideFail(String failiNimi) throws IOException {
		try (InputStream baidid = new FileInputStream(failiNimi);
			 InputStreamReader tekst = new InputStreamReader(baidid, "UTF-8");
			 BufferedReader puhverdatud = new BufferedReader(tekst)){
			String rida = puhverdatud.readLine();
			ArrayList<AineHinne> hinded = new ArrayList<>();
			while (rida != null) {
				String nimetus = rida.split(":")[0];
				String[] massiiv = rida.split(":")[1].split(",");
				AineHinne hinne = new AineHinne(nimetus, massiiv);
				hinded.add(hinne);
				rida = puhverdatud.readLine();
			}

			return hinded;
		}
	}

	public static void main(String[] args) throws IOException {
		Tudeng tudeng = new Tudeng("Marta", loePunktideFail("punktid.txt"));
		tudeng.salvestaBinaarfaili("binaar.bin");
		Tudeng tudeng1 = Tudeng.loeBinaarfailist("binaar.bin");

		System.out.println(tudeng1);
	}
}
