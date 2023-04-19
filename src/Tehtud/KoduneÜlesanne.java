package Tehtud;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KoduneÜlesanne {
	private LocalDate tähtaeg;

	public KoduneÜlesanne(LocalDate tahtaeg) {
		setTähtaeg(tahtaeg);
	}

	public LocalDate getTähtaeg() {
		return tähtaeg;
	}

	public void setTähtaeg(LocalDate tahtaeg) {
		if (tahtaeg.getDayOfWeek() == DayOfWeek.SATURDAY || tahtaeg.getDayOfWeek() == DayOfWeek.SUNDAY){
			DateTimeFormatter form = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			throw new IllegalArgumentException(tahtaeg.format(form));
		}
		this.tähtaeg = tahtaeg;
	}

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 4, 19);
		KoduneÜlesanne kd = new KoduneÜlesanne(date);

		System.out.println(kd.getTähtaeg());

		date = LocalDate.of(2023, 4, 23);
		kd = new KoduneÜlesanne(date);
	}
}
