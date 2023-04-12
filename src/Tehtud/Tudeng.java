package Tehtud;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Tudeng {
	private String nimi;
	private List<AineHinne> hinded;

	public Tudeng(String nimi, List<AineHinne> hinded) {
		this.nimi = nimi;
		this.hinded = hinded;
	}

	@Override
	public String toString() {
		return "Tehtud.Tudeng{" +
				"nimi='" + nimi + '\'' +
				", hinded=" + hinded.toString() +
				'}';
	}

	void salvestaBinaarfaili(String failiNimi) throws IOException {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(failiNimi))){
			dos.writeUTF(nimi);
			dos.writeInt(hinded.size());
			for (AineHinne hinne : hinded) {
				dos.writeUTF(hinne.getNimetus());
				dos.writeChar(hinne.getHinne());
			}
		}
	}

	static Tudeng loeBinaarfailist(String failiNimi) throws IOException {
		try(DataInputStream dis = new DataInputStream(new FileInputStream(failiNimi))){
			String nimi = dis.readUTF();
			int hindeid = dis.readInt();
			ArrayList<AineHinne> hinded = new ArrayList<>();
			for (int i = 0; i < hindeid; i++) {
				AineHinne hinne = new AineHinne(dis.readUTF(), dis.readChar());
				hinded.add(hinne);
			}

			return new Tudeng(nimi, hinded);
		}
	}
}
