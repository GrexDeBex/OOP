package Tehtud;

import java.util.ArrayList;
import java.util.List;

public class Atraktsioon {
	private String nimi;
	private int vanus;

	public Atraktsioon(String nimi, int vanus) {
		this.nimi = nimi;
		this.vanus = vanus;
	}

	@Override
	public String toString() {
		return String.format("%s vanus: %d", nimi, vanus);
	}

	public List<Dokument> ebasobivadDokumendid(Dokument[] dokumendid){
		ArrayList<Dokument> sobimatud = new ArrayList<>();
		for (Dokument dokument : dokumendid) {
			if (!dokument.vanusOnVähemalt(vanus)){
				sobimatud.add(dokument);
			}
		}
		return sobimatud;
	}

	public boolean vanusedSobivad(Dokument[] dokumendid) {


		List<Dokument> sobimatud = ebasobivadDokumendid(dokumendid);
		for (Dokument dokument : sobimatud) {
			System.out.println(nimi + " " +dokument);
		}
		if (sobimatud.size() > 0){
			return false;
		}
		return true;
	}
}