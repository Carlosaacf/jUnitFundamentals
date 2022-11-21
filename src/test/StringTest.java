package test;



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
}


