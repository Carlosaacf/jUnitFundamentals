package test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		
		assertEquals(actualLength, expectedLength);
		
	}
}