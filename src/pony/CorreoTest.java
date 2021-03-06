package pony;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CorreoTest {

	@Test
	void test() {
		
		assertEquals(1, Correo.jinetes(new int[] {18, 15}));
		assertEquals(2, Correo.jinetes(new int[] {43, 23, 40, 13}));
		assertEquals(3, Correo.jinetes(new int[] {33, 8, 16, 47, 30, 30, 46}));
		assertEquals(3, Correo.jinetes(new int[] {51, 51, 51}));
		assertEquals(4, Correo.jinetes(new int[] {6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49}));
	}

	
}
