package Tehtud;

public class IDKaart1 {
	private String number;
	private String omanik;
	private String isikukood;

	public IDKaart1(String number, String omanik, String isikukood) {
		this.number = number;
		this.omanik = omanik;
		this.isikukood = isikukood;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOmanik() {
		return omanik;
	}

	public void setOmanik(String omanik) {
		this.omanik = omanik;
	}

	public String getIsikukood() {
		return isikukood;
	}

	public void setIsikukood(String isikukood) {
		this.isikukood = isikukood;
	}

	public String sugu(){
		int sugu = Integer.parseInt(String.valueOf(isikukood.charAt(0)));
		if (sugu % 2 == 1){
			return "mees";
		}else {
			return "naine";
		}
	}

	public String sünnikuupäev(){
		int sugu = Integer.parseInt(String.valueOf(isikukood.charAt(0)));
		String kuupaev = isikukood.substring(1,7);
		if (sugu < 5){
			return kuupaev.substring(4)+"."+kuupaev.substring(2,4)+".19" + kuupaev.substring(0,2);
		}else {
			return kuupaev.substring(4)+"."+kuupaev.substring(2,4)+".20" + kuupaev.substring(0,2);
		}
	}

	@Override
	public String toString() {
		return String.format("Nimi: %s \nKaardinumber: %s \nIsikukood: %s \nSugu: %s \nSünnikuupäev: %s", omanik, number, isikukood, sugu(), sünnikuupäev());
	}

	public static void main(String[] args) {
		IDKaart1 kaart = new IDKaart1("AB32r2f2", "Gregor Rämmal", "50306012764");
		System.out.println(kaart);
	}
}
