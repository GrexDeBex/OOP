package Tehtud;

import java.util.ArrayList;

public class Tegelane {
	private ArrayList<String> esemed;

	public Tegelane() {
		esemed = new ArrayList<>();
	}

	void lisaEse(String ese){
		esemed.add(ese);
	}

	void eemaldaEse(String ese){
		if (omabEset(ese)){
			esemed.remove(ese);
		}else {
			throw new RuntimeException("Eset, mida soovitakse eemaldada, ei eksisteeri");
		}
	}

	boolean omabEset(String ese){
		return esemed.contains(ese);
	}

	void joonista(int x, int y){
		System.out.printf("(%d, %d) tegelane.png\n", x, y);
	}
}
