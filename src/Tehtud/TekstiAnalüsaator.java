package Tehtud;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TekstiAnalüsaator {
	private final String tekst;

	public TekstiAnalüsaator(String tekst) {
		this.tekst = tekst;
	}

	public TekstiAnalüsaator(File fail, String cs) throws IOException {
		this.tekst = Files.readString(fail.toPath(), Charset.forName(cs));
	}


	public HashMap<String, Integer> sõnadeSagedus(){
		HashMap<String, Integer> map = new HashMap<>();
		String[] sonad = tekst.replace("\n", " ").split(" ");

		for (String elem : sonad) {
			if (sonad.length == 1 && elem.equals("")){
				break;
			}

			if (!map.containsKey(elem)){
				map.put(elem, 1);
			}else {
				map.put(elem, map.get(elem)+1);
			}
		}

		return map;

	}

	public HashMap<String, HashMap<String, Integer>> sõnadeJärgnevus(){
		HashMap<String, HashMap<String, Integer>> map = new HashMap<>();
		String[] sonad = tekst.replace("\n", " ").split(" ");

		for (int i = 0; i < sonad.length-1; i++){
			if (!map.containsKey(sonad[i])){
				HashMap<String, Integer> map2 = new HashMap<>();
				map2.put(sonad[i+1], 1);
				map.put(sonad[i], map2);
			}else {
				HashMap<String, Integer> map2 = map.get(sonad[i]);
				if (!map2.containsKey(sonad[i+1])){
					map2.put(sonad[i+1], 1);
				}else {
					map2.put(sonad[i+1], map2.get(sonad[i+1]) + 1);
				}
			}
		}

		return map;
	}
}
