package Tehtud;

public class SuurKivi implements Ruut {
	private int mõra;
	private boolean tegelaneRuudul;


	public SuurKivi() {
		mõra = 0;
		tegelaneRuudul = false;
	}

	public boolean võtaVastu(Tegelane tegelane){
		if (mõra > 8){
			tegelaneRuudul = true;
			return true;
		}
		if (tegelane.omabEset("kirka")){
			mõra++;
			if (mõra > 8){
				tegelane.eemaldaEse("kirka");
			}
		}
		return false;
	}

	public boolean tegelaneVõibLahkuda(){
		return true;
	}

	public void joonista(int x, int y){
		if (mõra > 0 && mõra < 9){
			System.out.printf("(%d, %d) suur_kivi_%d_mõra.png\n", x, y, mõra);
		}else if (mõra == 0){
			System.out.printf("(%d, %d) suur_kivi.png\n", x, y);
		}else {
			System.out.printf("(%d, %d) suur_kivi_puru.png\n", x, y);
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
