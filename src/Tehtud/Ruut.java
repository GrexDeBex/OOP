package Tehtud;

import Tehtud.Tegelane;

public interface Ruut {
	boolean võtaVastu(Tegelane tegelane);
	boolean tegelaneVõibLahkuda();
	void saadaTegelaneMinema();
	void joonista(int x, int y);
}
