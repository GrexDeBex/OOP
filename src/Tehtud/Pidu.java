package Tehtud;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class Pidu {
	public static void main(String[] args) throws IOException {
		String tekst = Files.readString(Path.of(args[0]));
		String[] read = tekst.split("\n");
		HashMap<String, String> map = new HashMap<>();
		for (String rida : read) {
			String[] nimed = rida.split(" ");
			map.put(nimed[1], nimed[0]);
		}

		String nimi = args[1];

		while (map.containsKey(nimi)){
			nimi = map.get(nimi);
		}

		System.out.println(nimi);
	}
}
