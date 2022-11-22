package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class jUnitStrings {

	@Test
	void test() {
//		fail("Not yet implemented");
		jUnitFunctions jUnitStr = new jUnitFunctions();
		
		String result = jUnitStr.addStrings("Hello ", "World");
		
		assertEquals("Hello World",result);
	}

}
