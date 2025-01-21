package exception_handling;

import java.util.Scanner;

public class ArithmeticExceptionHandlingByReenteringSecondNumber {

	public static void main(String[] args) {

		int firstNumber = 0;
		int secondNumber;
		int result;
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.print("Enter the first number:" + "\t");		
			firstNumber = in.nextInt();
			System.out.print("Enter the second number:" + "\t" );
			secondNumber = in.nextInt();
			result = firstNumber / secondNumber;
			System.out.println("Result:" + result);

		} catch (ArithmeticException ae) {
			// JVM will come here if exception is occurred

			System.out.println("Invalid second number! Enter the second number again");
			System.out.print("Enter the second number:" + "\t");
			secondNumber = in.nextInt();
			System.out.println("Result: " + firstNumber / secondNumber);
		}
		
		System.out.println("Ending the programme now!!");
	}
}