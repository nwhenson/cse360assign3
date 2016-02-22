package cse360assign3;
/**
 * This class is a programmed calculator that will add, subtract, multiply, divide, and get the history
 * of the inputs
 * @author Nick Henson
 * @version 2/21/16
 */

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
	}
	
	public void subtract (int value) {
		total = total - value;
	}
	
	public void multiply (int value) {
		total = total * value;
	}
	
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else if (value != 0)
			total = total / value;
	}
	
	public String getHistory () {
		return "";
	}
}