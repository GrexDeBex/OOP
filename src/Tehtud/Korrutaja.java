package Tehtud;

import java.util.Scanner;

public class Korrutaja {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			while (true){
				try {
					String sisend = sc.nextLine();
					int nr = Integer.parseInt(sisend);
					System.out.println(nr*2);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Tähti ei tohi sisestada");
				}
			}
		}


	}
}
