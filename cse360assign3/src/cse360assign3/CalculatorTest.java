package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator total = new Calculator();
		if (total == null)
			fail("Constructor is null");
	}

	@Test
	public void testGetTotal() {
		Calculator total = new Calculator();
		assertEquals(total.getTotal(), 0);
		total.add(2);
		assertEquals(total.getTotal(), 2);
		total.subtract(2);
		assertEquals(total.getTotal(), 0);
	}

	@Test
	public void testAdd() {
		Calculator total = new Calculator();
		total.add(2);
		assertEquals(total.getTotal(), 2);
		total.add(5);
		total.add(9);
		total.add(11);
		assertEquals(total.getTotal(), 27);
	}

	@Test
	public void testSubtract() {
		Calculator total = new Calculator();
		total.add(100);
		assertEquals(total.getTotal(), 100);
		total.subtract(9);
		assertEquals(total.getTotal(), 91);
		total.subtract(10);
		total.subtract(3);
		total.subtract(77);
		assertEquals(total.getTotal(), 1);
	}

	@Test
	public void testMultiply() {
		Calculator total = new Calculator();
		total.multiply(9);
		assertEquals(total.getTotal(), 0);
		total.add(3);
		total.multiply(3);
		assertEquals(total.getTotal(), 9);
		total.multiply(1);
		total.multiply(2);
		assertEquals(total.getTotal(), 18);
		total.multiply(0);
		assertEquals(total.getTotal(), 0);
	}

	@Test
	public void testDivide() {
		Calculator total = new Calculator();
		total.divide(8);
		assertEquals(total.getTotal(), 0);
		total.add(16);
		total.multiply(4);
		total.divide(2);
		assertEquals(total.getTotal(), 32);
		total.divide(8);
		total.divide(4);
		assertEquals(total.getTotal(), 1);
		total.divide(0);
		assertEquals(total.getTotal(), 0);
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
