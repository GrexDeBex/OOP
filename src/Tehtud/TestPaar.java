package Tehtud;

import Tehtud.Paar;

public class TestPaar {
	public static void main(String[] args) {
		Paar<String, Integer> paar1 = new Paar<>("Gregor", 19);
		Paar<String, String> paar2 = new Paar<>("Gregor", "Tartu");

		paar1.setEsimene("karl");
		paar2.setEsimene("Muri");
		paar1.setTeine(10);
		paar2.setTeine("Tallinn");

		System.out.println(paar1.getEsimene());
		System.out.println(paar1.getTeine());
		System.out.println(paar2.getEsimene());
		System.out.println(paar2.getTeine());
	}
}
