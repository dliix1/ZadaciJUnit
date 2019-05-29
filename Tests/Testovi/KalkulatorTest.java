package Testovi;

import static org.junit.Assert.*;
import org.junit.Test;

import Zadaci.Kalkulator;

public class KalkulatorTest {

	@Test
	public void testSabiranje() {
		int rezultat = Kalkulator.sabiranje(2, 3);
		assertEquals(rezultat, 5);
	}

	@Test
	public void testOduzimanje() {
		int rezultat = Kalkulator.oduzimanje(5, 2);
		assertEquals(rezultat, 3);
	}

	@Test
	public void testMnozenje() {
		int rezultat = Kalkulator.mnozenje(3, 2);
		assertEquals(rezultat, 6);
	}

	@Test
	public void testDijeljenje() {
		int rezultat = Kalkulator.dijeljenje(10, 2);
		assertEquals(rezultat, 5);
	}

}
