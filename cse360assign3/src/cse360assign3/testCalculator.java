package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCalculator {

	@Test
	public void test() {
		Calculator constructor = new Calculator();
		if (constructor == null)
			fail("Constructor returns null");
	}

}
