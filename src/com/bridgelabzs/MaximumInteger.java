package com.bridgelabzs;

/***
 * 
 * @author Admin
 *
 */
public class MaximumInteger {
	/***
	 * 
	 * @param number1
	 * @param number2
	 * @param number3
	 * @return
	 */

	public static Integer maximumInteger(Integer number1, Integer number2, Integer number3) {
		Integer maximumNumber = number1;
		/*
		 * Used if-else-if condition To check the condition.
		 */
		if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
			maximumNumber = number1;
		else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
			maximumNumber = number2;
		else
			maximumNumber = number3;
		
		    return maximumNumber;
	}

}