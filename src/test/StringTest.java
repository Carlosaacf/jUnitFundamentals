package test;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void length_basic() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		
		assertEquals(actualLength, expectedLength);
		
	}
	
	@Test
	void toUpperCase_basic() {
		String str = "abcd";
		String result = str.toUpperCase();
		assertEquals("ABCD", result);
		assertNotNull(result);
	}
	
	@Test
	void contains_basic() {
		String str = "abcdefgh";
		boolean result = str.contains("ijk");
		assertEquals(false, result);
		assertFalse(result);
	}
	
	@Test
	void contains_int() {
		int a = 3;
		int b = 2;
		int soma = a + b;
		int soma2 = 5;
		assertEquals(soma, soma2);
	}
}


