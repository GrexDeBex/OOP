package Tehtud;

import java.io.*;

public class fail {
	public static void main(String[] args) throws IOException {
		try (Writer  fstream = new OutputStreamWriter(new FileOutputStream(args[0]),"UTF-8");
		BufferedWriter bw = new BufferedWriter(fstream);){
			bw.write("Hello world!");
		}

		// Kui faili mitte sulgeda, siis puhverdatud andmeid ei kanta sisse

	}
}
