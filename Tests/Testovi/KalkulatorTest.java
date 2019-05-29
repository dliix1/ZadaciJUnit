package Testovi;

import static org.junit.Assert.*;
import org.junit.Test;

import Zadaci.Kalkulator;

public class KalkulatorTest {
	
	@Test
	public void testSabiranje(){
		int rezultat = Kalkulator.sabiranje(2, 3);
		assertEquals(5, rezultat);
	}
	
	@Test
	public void testOduzimanje(){
		int rezultat = Kalkulator.oduzimanje(5, 2);
		assertEquals(3, rezultat);
	}
	
	@Test
	public void testMnozenje(){
		int rezultat = Kalkulator.mnozenje(3, 2);
		assertEquals(6, rezultat);
	}
	
	@Test
	public void testDijeljenje(){
		int rezultat = Kalkulator.dijeljenje(10, 2);
		assertEquals(5, rezultat);
	}

}
