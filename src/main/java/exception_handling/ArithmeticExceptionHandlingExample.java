package exception_handling;

import java.util.Scanner;

public class ArithmeticExceptionHandlingExample {

	public static void main(String[] args) {

		System.out.print("Enter the first number:" + "\t");
		Scanner in = new Scanner(System.in);
		int firstNumber = in.nextInt();
		System.out.print("Enter the second number:" + "\t");
		int secondNumber = in.nextInt();

		try {
			int result = firstNumber / secondNumber;
			System.out.println("Result:" + result);
			
		} catch (ArithmeticException ae) {
			//JVM will come here if exception is occurred			
			System.out.println("Result is infinity");
		}

	}
}
