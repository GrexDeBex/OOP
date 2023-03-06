package Tehtud;

import Tehtud.Külastaja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loosiratas {
	private ArrayList<Külastaja> osalejad = new ArrayList<>();

	public void lisaKülastaja(Külastaja külastaja){
		osalejad.add(külastaja);
	}

	public ArrayList<Külastaja> getOsalejad() {
		return osalejad;
	}

	public void lisaKülastaja(String nimi, int külastused){
		Külastaja külastaja = new Külastaja(nimi, külastused);
		osalejad.add(külastaja);
	}

	public List<Külastaja> kõigeAktiivsemad(int n){
		ArrayList<Külastaja> valitud = new ArrayList<>();
		if (n >= osalejad.size()){
			return osalejad;
		}

		Collections.sort(osalejad);

		for (int i = 0; i < n; i++) {
			valitud.add(osalejad.get(osalejad.size() - i - 1));
		}
		return valitud;
	}


	public Külastaja loosiVõitja(){
		int indeks = (int) (Math.random()*3);
		return kõigeAktiivsemad(3).get(indeks);
	}
}
