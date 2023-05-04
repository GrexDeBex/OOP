package Tehtud;

import Tehtud.KahtlaneKestusErind;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Rendifirma {
	private static List<Retk> loeRetked(String failiNimi) throws IOException {
		try (DataInputStream dis = new DataInputStream(new FileInputStream(failiNimi))) {
			int retkeid = dis.readInt();
			ArrayList<Retk> retked = new ArrayList<>();

			for (int i = 0; i < retkeid; i++) {

				String laenutaja = dis.readUTF();
				double distants = dis.readDouble();
				int kestus = dis.readInt();

				try {
					Retk retk = new Retk(laenutaja, distants, kestus);
					retked.add(retk);
				} catch (KahtlaneKestusErind e) {
					System.out.println(e.getMessage());
				}
			}

			return retked;
		}
	}


	private static Map<String, List<Retk>> pikkuseKaupa(List<Retk> retked) {
		HashMap<String, List<Retk>> jaotus = new HashMap<>();

		for (Retk retk : retked) {

			String voti;
			if (retk.getDistants() <= 1.5) voti = "lühike";
			else if (retk.getDistants() <= 5) voti = "keskmine";
			else voti = "pikk";

			if (jaotus.containsKey(voti)) {
				List<Retk> grupp = jaotus.get(voti);
				grupp.add(retk);
			} else {
				ArrayList<Retk> grupp = new ArrayList<>();
				grupp.add(retk);
				jaotus.put(voti, grupp);
			}
		}

		return jaotus;
	}

	public static void main(String[] args) throws IOException {
		List<Retk> retked = loeRetked("retked.dat");

		try (Scanner sc = new Scanner(System.in)) {
			sys:
			while (true) {
				System.out.println("Kas soovid lisada retke (L), vaadata statistikat (V) või lõpetada (S)?");
				String sisend = sc.nextLine();


				switch (sisend) {
					case "L":
						System.out.println("Sisesta laenutaja: ");
						String laenutaja = sc.nextLine();
						System.out.println("Sisesta distants: ");
						double distants = sc.nextDouble();
						System.out.println("Sisesta kestus: ");
						int kestus = sc.nextInt();


						try {
							Retk retk = new Retk(laenutaja, distants, kestus);
							retked.add(retk);
						} catch (KahtlaneKestusErind e) {
							System.out.println(e.getMessage() + " Retke ei lisatud");
						} finally {
							sc.nextLine();    // Määrab, et järgmine sisend ei oleks tühi
						}

						break;


					case "V":
						Map<String, List<Retk>> jaotus = pikkuseKaupa(retked);

						while (true) {
							System.out.println("Millise distantsi kohta statistikat soovid? " + jaotus.keySet());
							String voti = sc.nextLine();
							if (jaotus.containsKey(voti)) {
								int arv = 0;
								int sum = 0;

								for (Retk retk : jaotus.get(voti)) {
									arv++;
									sum += retk.getKestus();
								}

								System.out.println("Retkete arv: " + arv + "    Keskmine kestus: " + (double) sum / arv);
								break;
							}

							System.out.println("Sellist kategooriat ei ole");
						}

						break;


					case "S":
						Collections.sort(retked);

						try (OutputStream valja = new FileOutputStream("statistika.txt");
							 OutputStreamWriter tekstValja = new OutputStreamWriter(valja, StandardCharsets.UTF_8)) {

							for (Retk retk : retked) {
								sisend = retk.getLaenutaja() + ";" + retk.getDistants() + ";" + retk.getKestus() + '\n';
								tekstValja.write(sisend);
							}
						}

						System.out.println("Salvestatud");

						break sys;
				}
			}
		}
	}
}
