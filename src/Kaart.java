import java.util.Arrays;

class Kaart {
	private String tugevus;
	private char mast;

	public Kaart(String tugevus, char mast) {
		if (!kaardiKontroll(tugevus, mast)) {
			throw new RuntimeException("Kaarti ei eksisteeri");
		}
		this.tugevus = tugevus;
		this.mast = mast;
	}

	public Kaart(String kaart) {
		int pikkus = kaart.length();
		String tugevus = kaart.substring(0, pikkus-1);
		char mast = kaart.charAt(pikkus-1);

		if (!kaardiKontroll(tugevus, mast)) {
			throw new RuntimeException("Kaarti ei eksisteeri");
		}
		this.tugevus = tugevus;
		this.mast = mast;
	}

	public static boolean kaardiKontroll(String tugevus, char mast){
		String[] tugevused = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] mastid = {'♣', '♦', '♠' , '♥'};

		for (String s : tugevused) {
			if (tugevus.equals(s)){
				for (char c : mastid) {
					if (c == mast)
						return true;
				}
			}
		}

		return false;
	}

	public String getTugevus() {
		return tugevus;
	}

	public char getMast() {
		return mast;
	}

	@Override
	public String toString() {
		return tugevus+mast;
	}
}
