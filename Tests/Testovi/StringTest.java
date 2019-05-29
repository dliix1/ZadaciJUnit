package Testovi;

import static org.junit.Assert.*;

import org.junit.Test;

import Zadaci.StringMetode;

public class StringTest {

	@Test
	public void duzinaStringa (){
		StringMetode metode = new StringMetode();
		int rezultat = metode.duzinaStringa("bezveze");
		assertEquals(rezultat, 7);
	}

}
