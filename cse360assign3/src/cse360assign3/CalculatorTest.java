package cse360assign3;
/**
 * This contains test cases for all the methods in Calculator
 * @author Nick Henson
 * @version 2/22/16
 * Github URL: https://github.com/nwhenson/cse360assign3.git
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	/**
	 * testCalculator() will make sure the constructor is not null
	 */
	@Test
	public void testCalculator() {
		Calculator total = new Calculator();
		assertNotNull(total);
	}

	/**
	 * testGetTotal() will make sure getTotal() has the proper return value
	 */
	@Test
	public void testGetTotal() {
		Calculator total = new Calculator();
		assertEquals(total.getTotal(), 0);
		total.add(2);
		assertEquals(total.getTotal(), 2);
		total.subtract(2);
		assertEquals(total.getTotal(), 0);
	}

	/**
	 * testAdd() will make sure the add() function works properly
	 */
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

	/**
	 * testSubtract() will make sure the subtract() function works properly
	 */
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

	/**
	 * testMultiply() will make sure the multiply() function works properly
	 */
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

	/**
	 * testDivide() will make sure the divide() function works properly
	 */
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

	/**
	 * testGetHistory() will make sure the getHistory() returns the proper String
	 */
	@Test
	public void testGetHistory() {
		Calculator total = new Calculator();
		total.add(3);
		total.multiply(5);
		total.subtract(2);
		total.divide(0);
		assertEquals(total.getHistory(), "0 + 3 + 5 + 2 + 0");
	}

}
