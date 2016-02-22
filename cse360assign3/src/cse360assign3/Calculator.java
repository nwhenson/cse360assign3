package cse360assign3;
/**
 * This class is a programmed calculator that will add, subtract, multiply, divide, and get the history
 * of the inputs
 * @author Nick Henson Pin: 405
 * @version 2/21/16
 * Github URL: https://github.com/nwhenson/cse360assign3.git
 */

public class Calculator {
	
	/**	This private int represents the total value after each operation */
	private int total;
	
	/**	This private String represents the operation history that total has undergone */
	private String history = "0";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal() will return the value of int total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add() will add the parameter value to int total
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		history += " + " + value;
	}
	
	/**
	 * subtract() will subtract the parameter value from int total
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history += " - " + value;
	}
	
	/**
	 * multiply() will multiply the parameter value to int total
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		history += " * " + value;
	}
	
	/**
	 * divide() will divide the parameter value from int total
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else if (value != 0)
			total = total / value;
		
		history += " / " + value;
	}
	
	/**
	 * getHistory() will return String history
	 * @return history
	 */
	public String getHistory () {
		return history;
	}
}