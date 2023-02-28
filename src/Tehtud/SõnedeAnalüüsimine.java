package Tehtud;

import Tehtud.SõnedeAnalüsaator;

public class SõnedeAnalüüsimine {
	public static void main(String[] args) {
		SõnedeAnalüsaator tekst = new SõnedeAnalüsaator(
				"Mul on suur koer, kellest ma ei taha loobuda ega taha teda süüa");
		tekst.väljastaSõne();
		System.out.println("Tekstis keskmine sõna pikkus on " + tekst.leiaKeskminePikkus());
		System.out.println("Tekstis pikim sõna on \"" + tekst.leiaPikimSõna() + "\"");
	}
}
