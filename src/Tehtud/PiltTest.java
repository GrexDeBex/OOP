package Tehtud;

import Tehtud.Pilt;

import java.util.Scanner;

public class PiltTest {
	public static void main(String[] args) {
		Pilt pilt = new Pilt(10, 10);

		try (Scanner sc = new Scanner(System.in)){
			main:
			while (true){
				System.out.println("Sisesta 1, kui tahad pikslit lugeda");
				System.out.println("Sisesta 2, kui tahad pikslit muuta");
				String sisend = sc.nextLine();

				if (sisend.equals("1")){
					while (true){
						System.out.println("Sisesta kordinaatide väärtused eraldades need tühikuga");
						sisend = sc.nextLine();
						int x =Integer.parseInt(sisend.split(" ")[0]);
						int y =Integer.parseInt(sisend.split(" ")[1]);

						try {
							System.out.println(pilt.annaPiksel(x, y));
						}catch (VigaseKoordinaadiErind e){
							System.out.println("Valed kordinaadid");
							continue;
						}

						break;
					}
				}else {
					while (true) {
						System.out.println("Sisesta kordinaatide väärtused ja värvi number eraldades need tühikuga");
						sisend = sc.nextLine();
						int x = Integer.parseInt(sisend.split(" ")[0]);
						int y = Integer.parseInt(sisend.split(" ")[1]);
						int vaartus = Integer.parseInt(sisend.split(" ")[2]);

						try {
							pilt.määraPiksel(x, y, vaartus);
						} catch (VigaseKoordinaadiErind e) {
							System.out.println("Valed kordinaadid");
							continue;
						} catch (VigaseVärviErind e){
							System.out.println("Väga lappes");
						}

						break main;
					}
				}
			}
		}
	}
}
