package Tehtud;

import Tehtud.Taara;

public class Tagastaja {
	private String nimi;

	public Tagastaja(String nimi) {
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public double maksumus(Taara[] mass){
		double sum = 0;
		for (Taara taara : mass) {
			sum += taara.maksumus();
		}
		return sum;
	}

	public int joonud(Taara[] mass){
		int count = 0;
		for (Taara taara : mass) {
			if (nimi.equals(taara.getNimi())){
				count ++;
			}
		}
		return count;
	}

	@Override
	public String toString() {
		return nimi;
	}
}
