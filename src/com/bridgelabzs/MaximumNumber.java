package com.bridgelabzs;

/***
 * 
 * @author Admin
 *
 */
class MaximumNumber<E> {
	E number1;
	E number2;
	E number3;
	E number4;

	/***
	 * 
	 * @param number1
	 * @param number2
	 * @param number3
	 * @param number4
	 */
	/*
	 * Used parameterized Constractor
	 */
	public MaximumNumber(E number1, E number2, E number3, E number4) {
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
		this.number4 = number4;

	}

	public static <E extends Comparable<E>> E maximumAmong3Number(E number1, E number2, E number3, E number4) {
		E maximum = number1;
		/*
		 * Used if else condition To check the Maximum number among 4 
		 */
		if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0 && number1.compareTo(number4) > 0)
			maximum = number1;
		else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0 && number2.compareTo(number4) > 0)
			maximum = number2;
		else if (number3.compareTo(number4) > 0)
			maximum = number3;
		else
			maximum = number4;
		return maximum;
	}

	public static void main(String[] args) {
		/*
		 * Program execution starts from main method
		 */
		System.out.println("The maximum Number Among 3 Integer numbers is: " + maximumAmong3Number(22, 52, 88, 78));
		System.out.println(
				"The maximum Number Among 3 Float numbers is: " + maximumAmong3Number(32.5f, 56.98f, 78.99f, 65.23f));
		System.out.println("The maximum Number Among 3 String numbers is: "
				+ maximumAmong3Number("Khol", "Rohit", "Dhav", "Chal"));
	}

}
