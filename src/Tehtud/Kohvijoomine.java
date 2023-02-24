package Tehtud;

class Kohvijoomine {
	public static void main(String[] args) {
		Kohv kohv1 = new Kohv("belgia", 5.4);
		Kohv kohv2 = new Kohv("rootsi", 3.3);

		Programmeerija prog1 = new Programmeerija("Artur",
				1200, 4, kohv1);
		Programmeerija prog2 = new Programmeerija("Kaspar",
				2399, 9, kohv2);
		Programmeerija prog3 = new Programmeerija("Gregor",
				5063);

		System.out.println(prog1);
		System.out.println(prog2);
		System.out.println(prog3);

		prog1.setTasseKohvi(prog1.getTasseKohvi() + 3);
		prog2.setTasseKohvi(prog2.getTasseKohvi() + 3);
		prog1.setRiduKoodi(prog1.getRiduKoodi()*2);
		prog2.setRiduKoodi(prog2.getRiduKoodi()*2);
		prog3.setRiduKoodi(prog3.getRiduKoodi()+100);

		System.out.println(prog1);
		System.out.println(prog2);
		System.out.println(prog3);

	}
}