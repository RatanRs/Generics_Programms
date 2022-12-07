package com.bridgelabzs;

/***
 * 
 * @param args
 */
public class MaximumFloatNumber {
	/***
	 * 
	 * @param number1
	 * @param number2
	 * @param number3
	 * @return
	 */
	public static Float maximumFloatNumber(Float number1, Float number2, Float number3) {
		Float maximumNumber = number1;
		if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
			maximumNumber = number1;
		else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
			maximumNumber = number2;
		else
			maximumNumber = number3;
		return maximumNumber;
	}
}
