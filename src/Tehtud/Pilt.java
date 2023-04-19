package Tehtud;

public class Pilt {
	private int[][] pikslid;

	public Pilt(int korgus, int laius) {
		this.pikslid = new int[korgus][laius];
	}

	public void määraPiksel(int x, int y, int vaartus){
		if (vaartus < 0 || vaartus > 255){
			throw new VigaseVärviErind("Vale värv");
		}
		if (x < 0 || x >= pikslid.length || y < 0 || y >= pikslid[x].length){
			throw new VigaseKoordinaadiErind("Valed kordinaadid");
		}


		pikslid[x][y] = vaartus;
	}

	public int annaPiksel(int x, int y){
		if (x < 0 || x >= pikslid.length || y < 0 || y >= pikslid[x].length){
			throw new VigaseKoordinaadiErind("Valed kordinaadid");
		}
		return pikslid[x][y];
	}
}
