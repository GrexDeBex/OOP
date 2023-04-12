package Tehtud;

import java.io.*;
import java.util.Scanner;

public class SalafraasiLeidmine {
	static String leiaEluUniversumiJaKõigeSalafraas(String failiNimi) throws IOException {

		try (RandomAccessFile raf = new RandomAccessFile(failiNimi, "rw")){

			StringBuilder sb = new StringBuilder();
			raf.seek(42);
			long pikkus = raf.length() - 42;
			char c = (char) raf.read();

			for (int i = 0; i < pikkus && c != 0; i++) {
				sb.append(c);
				c = (char) raf.read();
			}

			if (c == 0){
				return sb.toString();
			}


		}

		return null;
	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Fail");
		String sisend = sc.nextLine();
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter("salafraasid.txt"))){
			while (!sisend.equals("")){
				String fraas = leiaEluUniversumiJaKõigeSalafraas(sisend);
				if (fraas == null){
					System.out.println("Salafraasi ei leidnud");
				} else
					buffer.write(fraas + "\n");

				System.out.println("Fail");
				sisend = sc.nextLine();
			}
		}

	}
}
