import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pakk {
	private List<Kaart> kaardid;

	public Pakk(List<Kaart> kaardid) {
		for (Kaart kaart1 : kaardid) {
			int loendur = 0;
			for (Kaart kaart2 : kaardid) {
				if (kaart1.toString().equals(kaart2.toString())){
					loendur++;
					if (loendur == 2){
						throw new RuntimeException("Ühte kaarti on mitu");
					}
				}
			}
		}

		this.kaardid = new ArrayList<>(kaardid);
	}

	public Pakk(){
		List<Kaart> kaardid = new ArrayList<>(52);

		String[] tugevused = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] mastid = {'♣', '♦', '♠' , '♥'};

		for (String s : tugevused) {
			for (char c : mastid) {
				kaardid.add(new Kaart(s, c));
			}
		}

		this.kaardid = kaardid;
	}

	public List<Kaart> getKaardid() {
		return new ArrayList<>(kaardid);
	}

	public void sega(){
		Collections.shuffle(kaardid);
	}

	public Kaart võtaKaart(){
		if (kaardid.size() == 0){
			throw new RuntimeException("Kaarte pole");
		}
		Kaart kaart = kaardid.get(0);
		kaardid.remove(0);
		return kaart;
	}

}
