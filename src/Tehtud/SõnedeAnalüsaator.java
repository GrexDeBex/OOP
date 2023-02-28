package Tehtud;

import java.util.Arrays;

public class SõnedeAnalüsaator {
	private String analüüsitavSõne;

	public SõnedeAnalüsaator(String analüüsitavSõne) {
		this.analüüsitavSõne = analüüsitavSõne;
	}

	public void väljastaSõne(){
		System.out.println("Analüüsitav sõne on '" + analüüsitavSõne + "'");
	}

	public double leiaKeskminePikkus(){
		String[] sõnad = analüüsitavSõne.split(" ");
		double sum = 0;
		for (String s : sõnad) {
			sum += s.length();
		}
		return sum/sõnad.length;
	}

	public String leiaPikimSõna(){
		String[] sõnad = analüüsitavSõne.split(" ");
		String max_sõna = "";
		int max_pikkus = 0;
		for (String s : sõnad) {
			if (s.length() > max_pikkus){
				max_sõna = s;
				max_pikkus = s.length();
			}
		}
		return max_sõna;
	}
}
