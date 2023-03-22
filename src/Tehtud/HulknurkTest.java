package Tehtud;

public class HulknurkTest {
	public static void main(String[] args) {
		Rööpkülik rööpkülik = new Rööpkülik(10, 0.5);
		Kolmnurk kolmnurk = new Kolmnurk(6,3);
		Ristkülik ristkülik = new Ristkülik(10,7.5);
		Ruut1 ruut = new Ruut1(10);

		Hulknurk[] kujundid = {rööpkülik, kolmnurk, ristkülik, ruut};

		for (Hulknurk hulknurk : kujundid) { // polümorfismi
			System.out.println(hulknurk.pindala()); // dünaamiline seostamine
		}

		System.out.println(ruut.diagonaaliPikkus()); // Ülekatmine
		System.out.println(ristkülik.diagonaaliPikkus());
	}
}
