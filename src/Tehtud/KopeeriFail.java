package Tehtud;//Programm, mis teeb koopia etteantud failist:
import java.io.*;
import java.util.Date;

public class KopeeriFail {

	private static void kopeeri(String algne, String koopia) throws Exception {
		// sulgudes semikoolonit kasutades saab mitu faili avada
		File f1 = new File(algne);
		try (InputStream sisse = new FileInputStream(f1);
			 OutputStream välja = new FileOutputStream(koopia)) {
			if (f1.isDirectory()){
				System.out.println("Tegemist on kaustaga");
				return;
			}

			System.out.println(f1.length());
			System.out.println(new Date(f1.lastModified()));


			byte[] puhver = new byte[1024];
			int loetud = sisse.read(puhver);
			while (loetud > 0) {
				välja.write(puhver, 0, loetud); // ainult andmetega täidetud osa!
				loetud = sisse.read(puhver); // loeme järgmise tüki
			}
		}
	}

	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Kas sa andsid käsurealt faili nime?");
			return;
		}
		kopeeri(args[0], args[0] + ".copy");
	}
}
