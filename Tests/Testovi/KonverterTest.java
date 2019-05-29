package Testovi;

import static org.junit.Assert.*;
import org.junit.Test;
import Zadaci.Konverter;

public class KonverterTest {

	@Test
	public void testKilogramUFunte(){
		double rezultat = Konverter.izKilogramaUFunte(1.0);
		assertEquals(rezultat, 2.046, 0.1);
	}
	
	@Test
	public void testFuntaUKilogram(){
		double rezultat = Konverter.izFunteUKilogram(2.046);
		assertEquals(rezultat, 1.0, 0.1);
	}
	
	@Test
	public void testCentimetriUInce(){
		double rezultat = Konverter.izCentimetaraUInce(1.0);
		assertEquals(rezultat, 0.39, 0.1);
	}
	
	@Test
	public void testInciUCentimetre(){
		double rezultat = Konverter.izIncaUCentimetre(0.39);
		assertEquals(rezultat, 1.0, 0.1);
	}
	
	@Test
	public void testCelzijusUFarenhajt(){
		double rezultat = Konverter.izCelzijusaUFarenhajte(1.0);
		assertEquals(rezultat, 33.8, 0.1);
	}
	
	@Test
	public void testFarenhajtUCelzijus(){
		double rezultat = Konverter.izFarenhajtiUCelzijuse(33.8);
		assertEquals(rezultat, 1.0, 0.1);
	}

}
