package Tehtud;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Pakkija {
	public static void main(String[] args) throws IOException{
		File lähtefail = new File(args[0]);
		File zipFail = new File(args[1]);

		paki(lähtefail, zipFail);
		System.out.println("Varukoopia tehtud.");

		lähtefail.delete();
		System.out.println("Algne Tehtud.fail kustutatud.");

		System.out.println("Kena päeva!");
	}

	private static void paki(File lähtefail, File zipFail) throws IOException{
		try (FileInputStream sisendvoog = new FileInputStream(lähtefail);
			 ZipOutputStream zipvoog = new ZipOutputStream(
					 new BufferedOutputStream(new FileOutputStream(zipFail)));){


			zipvoog.putNextEntry(new ZipEntry(lähtefail.getName()));
			byte[] buffer = new byte[1024];
			int length;
			while ((length = sisendvoog.read(buffer)) > 0) {
				zipvoog.write(buffer, 0, length);
			}
		}
	}
}