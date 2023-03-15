public class AutodeParandamine {
	public static void main(String[] args) {
		Autoteenindus teenindus = new Autoteenindus();

		Auto sõiduauto = new Auto("Gregor", "Polo", false);
		Veoauto veoauto = new Veoauto("Kaspar", "Honda kaubik", false, true);
		Luksusauto luksusauto = new Luksusauto("Malle", "Saphire", false, 1968);
		Limusiin limusiin = new Limusiin("Urmas", "valge", true, 1500);

		Auto[] autod = {sõiduauto, veoauto, luksusauto, limusiin};

		for (Auto auto : autod) {
			teenindus.paranda(auto, (int) (Math.random()*20+1) / 2.0);
		}

		System.out.println(teenindus);
	}
}
