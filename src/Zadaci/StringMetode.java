package Zadaci;

public class StringMetode {
	
	static int rezultat; 

	public int duzinaStringa(String bezveze) {
		return rezultat = bezveze.length();
	}

	public void karakteriNaParnimPozicijama(String bezveze) {
		for (int i = 0; i < bezveze.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(bezveze.charAt(i) + " ");
			}
		}
		return rezultat = 
	}

	public void karakteriNaNeparnimPozicijama() {
		System.out.println("Karakteri na neparnim pozicijama su: ");

		for (int i = 0; i < bezveze.length(); i++) {
			if (i % 2 != 0) {
				System.out.println(bezveze.charAt(i) + " ");
			}
		}
	}

	public void brojUppercaseKaraktera() {
		int brojac = 0;
		for (int i = 0; i < bezveze.length(); i++) {
			if (Character.isUpperCase(bezveze.charAt(i))) {
				brojac++;
			}
		}
		if (brojac > 0) {
			System.out.println("Vas string ima " + brojac + " uppercase karaktera.");
		} else {
			System.out.println("Vas string nema uppercase karaktera.");
		}
	}

	public void brojLowercaseKaraktera() {
		int brojac = 0;
		for (int i = 0; i < bezveze.length(); i++) {
			if (Character.isLowerCase(bezveze.charAt(i))) {
				brojac++;
			}
		}
		if (brojac > 0) {
			System.out.println("Vas string ima " + brojac + " lowercase karaktera.");
		} else {
			System.out.println("Vas string nema lowercase karaktera.");
		}
	}

	public void sviKojiNisuSlova() {
		for (int i = 0; i < bezveze.length(); i++) {
			if (!Character.isAlphabetic(bezveze.charAt(i))
					&& Character.isWhitespace(bezveze.charAt(i))
					&& Character.isDigit(bezveze.charAt(i))) {
				System.out.println(bezveze.charAt(i) + " ");
			}
		}
	}

}
