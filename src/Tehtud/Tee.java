package Tehtud;

public class Tee implements Ruut {
	private String ese;
	private boolean tegelaneRuudul;

	public Tee(String ese) {
		this.ese = ese;
		tegelaneRuudul = false;
	}

	public Tee() {
		ese = null;
		tegelaneRuudul = false;
	}

	public boolean võtaVastu(Tegelane tegelane){
		tegelane.lisaEse(ese);
		ese = null;
		tegelaneRuudul = true;
		return true;
	}

	public boolean tegelaneVõibLahkuda(){
		return true;
	}

	public void joonista(int x, int y){
		System.out.printf("(%d, %d) tee.png\n", x, y);
		if (ese != null){
			System.out.printf("(%d, %d) %s.png\n", x, y, ese);
		}
		if (tegelaneRuudul){
			System.out.printf("(%d, %d) tegelane.png\n", x, y);
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
