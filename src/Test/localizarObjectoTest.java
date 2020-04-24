package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.AntiAir;

class localizarObjectoTest {

	@Test
	void testLocalizarObje() {
		AntiAir aa=new AntiAir("40mm Gesher", "1121A", "bajo", 2,"SS George", 4, 5, 600);
		aa.localizarObje();
		assertEquals(10,aa.localizarObje());
	}

	

}
