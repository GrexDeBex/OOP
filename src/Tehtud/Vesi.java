package Tehtud;

public class Vesi implements Ruut {
	private boolean tegelaneRuudul;

	public Vesi() {
		tegelaneRuudul = false;
	}

	public boolean võtaVastu(Tegelane tegelane){
		tegelaneRuudul = true;
		return true;
	}

	public boolean tegelaneVõibLahkuda(){
		return false;
	}

	public void joonista(int x, int y){
		if (tegelaneRuudul){
			System.out.printf("(%d, %d) mullid.png\n", x, y);
		}else {
			System.out.printf("(%d, %d) vesi.png\n", x, y);
		}
	}

	public void saadaTegelaneMinema(){
		if (tegelaneRuudul){
			tegelaneRuudul = false;
		}else {
			throw new RuntimeException("Tegelast pole ruudul");
		}
	}
}
