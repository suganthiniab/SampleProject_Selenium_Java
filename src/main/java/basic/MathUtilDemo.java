package basic;

import java.util.Scanner;
/*
 * Read the number by user input
 * Validate whether the number is less than or equal zero
 * If the condition is true, display proper validation message and terminate the program
 * If the condition is false, rest of the code will be executed
 * Square root of the given number will be found out
 */

public class MathUtilDemo {

	public static void main(String[] args) {
		//find out square root value
		
		System.out.print("Enter the number:" + "\t");		
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		if(number<=0) {
			System.out.println("Invalid number! Please enter the number greater than 0");
			return;
		}
		
		System.out.println("Square Root:" + "\t" + Math.sqrt(number));		
	}

}
