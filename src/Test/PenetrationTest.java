package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.AntiAir;

class PenetrationTest {

	@Test
	void testDamagePenetration() {
		AntiAir aa=new AntiAir("40mm Gesher", "1121A", "bajo", 2,"SS George", 4, 5, 600);
		aa.damagePenetration();
		assertEquals(72,aa.damagePenetration());
		
		
	}

}
