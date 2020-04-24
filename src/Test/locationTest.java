package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Barco;

class locationTest {

	@Test
	void testLocationInformation() {
		Barco b=new Barco("iokese", "LlenoDeTexto", "Hola", 5, "Panzer", 6, "Push");
		b.locationInformation();
		
		assertEquals("Ese barquito está en el agua xD",b);
	}

}
