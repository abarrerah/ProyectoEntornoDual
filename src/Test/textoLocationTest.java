package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.AntiAir;

class textoLocationTest {

	@Test
	void testTextoLocalizacion() {
		AntiAir aa=new AntiAir("40mm Gesher", "1121A", "bajo", 2,"SS George", 4, 5, 600);
		aa.textoLocalizacion();
		assertEquals("Se supone que estoy en un punto alto ",aa.textoLocalizacion());
	}

}
