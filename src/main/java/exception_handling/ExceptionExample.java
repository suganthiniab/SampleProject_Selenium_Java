package exception_handling;

import java.util.Scanner;

// when data type is double and divisor is zero, no exception thrown at the run time and working fine

public class ExceptionExample {

	public static void main(String[] args) {

		System.out.print("Enter the first number:" + "\t");
		Scanner in = new Scanner(System.in);
		double firstNumber = in.nextInt();
		System.out.print("Enter the second number:" + "\t");
		double secondNumber = in.nextInt();
		double result = firstNumber / secondNumber;

		System.out.println("Result:" + result);
	}
}
