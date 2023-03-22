package Tehtud;

public class Ruudumäng {
	private Ruut[][] mängulaud;
	private Tegelane tegelane;
	private int tegelaneRida;
	private int tegelaneVeerg;

	public Ruudumäng(int x, int y) {
		mängulaud = new Ruut[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				mängulaud[i][j] = new Tee();
			}
		}
	}

	void paigutaTegelane(int x, int y){
		if (mängulaud[x][y] instanceof SuurKivi || mängulaud[x][y] instanceof VäikeKivi){
			throw new RuntimeException("Tegelast ei sa kivile paigutada");
		}
		if (tegelane != null){
			throw new RuntimeException("Tehtud.Tegelane on juba olemas");
		}
		tegelane = new Tegelane();
		tegelaneRida = x;
		tegelaneVeerg = y;
		mängulaud[x][y].võtaVastu(tegelane);
	}

	void paigutaRuut(int x, int y, Ruut ruut){
		mängulaud[x][y] = ruut;
	}

	void reageeriSündmusele(String sündmus){
		if (mängulaud[tegelaneRida][tegelaneVeerg].tegelaneVõibLahkuda()){
			switch (sündmus) {
				case "alla":
					if (tegelaneVeerg + 1 < mängulaud[0].length) {
						if (mängulaud[tegelaneRida][tegelaneVeerg + 1].võtaVastu(tegelane)) {
							mängulaud[tegelaneRida][tegelaneVeerg].saadaTegelaneMinema();
							tegelaneVeerg++;
						}
					}
					break;

				case "üles":
					if (tegelaneVeerg - 1 >= 0) {
						if (mängulaud[tegelaneRida][tegelaneVeerg - 1].võtaVastu(tegelane)) {
							mängulaud[tegelaneRida][tegelaneVeerg].saadaTegelaneMinema();
							tegelaneVeerg--;
						}
					}
					break;

				case "paremale":
					if (tegelaneRida + 1 < mängulaud.length) {
						if (mängulaud[tegelaneRida + 1][tegelaneVeerg].võtaVastu(tegelane)) {
							mängulaud[tegelaneRida][tegelaneVeerg].saadaTegelaneMinema();
							tegelaneRida++;
						}
					}
					break;
				case "vasakule":
					if (tegelaneRida - 1 >= 0) {
						if (mängulaud[tegelaneRida - 1][tegelaneVeerg].võtaVastu(tegelane)) {
							mängulaud[tegelaneRida][tegelaneVeerg].saadaTegelaneMinema();
							tegelaneRida--;
						}
					}
					break;
			}
		}
	}

	void joonista(){
		for (int i = 0; i < mängulaud.length; i++) {
			for (int j = 0; j < mängulaud[0].length; j++) {
				mängulaud[i][j].joonista(i,j);
			}
		}
	}

	Tegelane getTegelane(){
		return tegelane;
	}
}
