package Tehtud;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class SõnuFailis {
	public static void main(String[] args) throws IOException {
		TekstiAnalüsaator ta = new TekstiAnalüsaator(new File("sonuFailis.txt"), "UTF-8");

		HashMap<String, Integer> map = ta.sõnadeSagedus();

		System.out.println(map.entrySet());
	}
}
