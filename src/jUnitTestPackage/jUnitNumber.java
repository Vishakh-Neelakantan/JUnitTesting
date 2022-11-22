package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class jUnitNumber {

	@Test
	void test() {
//		fail("Not yet implemented");
		jUnitFunctions jUnitNum = new jUnitFunctions();
		
		int result = jUnitNum.addNumbers(100, 300);
		
		assertEquals(400,result);
	}

}
