package Tehtud;

public class VäikeKivi implements Ruut {
	private int mõra;
	private boolean tegelaneRuudul;


	public VäikeKivi() {
		mõra = 0;
		tegelaneRuudul = false;
	}

	public boolean võtaVastu(Tegelane tegelane){
		if (mõra > 2){
			tegelaneRuudul = true;
			return true;
		}
		if (tegelane.omabEset("kirka")){
			mõra++;
		}
		return false;
	}

	public boolean tegelaneVõibLahkuda(){
		return true;
	}

	public void joonista(int x, int y){
		switch (mõra) {
			case 0 -> System.out.printf("(%d, %d) väike_kivi.png\n", x, y);
			case 1 -> System.out.printf("(%d, %d) väike_kivi_1_mõra.png\n", x, y);
			case 2 -> System.out.printf("(%d, %d) väike_kivi_2_mõra.png\n", x, y);
			default -> System.out.printf("(%d, %d) väike_kivi_puru.png\n", x, y);
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
