package Zadaci;

public class Konverter {
	
	static double rezultat1;

	public Konverter() {

	}

	public static double izKilogramaUFunte(double rezultat) {
		return rezultat1 = rezultat * 2.0462;
	}

	public static double izFunteUKilogram(double rezultat) {
		return rezultat1 = rezultat * 0.45392;
	}

	public static double izCentimetaraUInce(double rezultat) {
		return rezultat1 = rezultat * 0.3937;
	}

	public static double izIncaUCentimetre(double rezultat) {
		return rezultat1 = rezultat * 2.54;
	}

	public static double izCelzijusaUFarenhajte(double rezultat) {
		return rezultat1 = rezultat * 1.8 + 32;
	}

	public static double izFarenhajtiUCelzijuse(double rezultat) {
		return rezultat1 = (rezultat - 32) / 1.8;
	}
}
