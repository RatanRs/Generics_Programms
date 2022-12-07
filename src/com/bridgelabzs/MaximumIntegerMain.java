package com.bridgelabzs;

/***
 * 
 * @author Admin
 *
 */
public class MaximumIntegerMain {
	/***
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		/*
		 * Creating object of maximumInteger and calling the method
		 */
		MaximumInteger output = new MaximumInteger();
		int number = output.maximumInteger(88, 44, 443);
		System.out.println("Maximum Number is="+ number);
	}
}
