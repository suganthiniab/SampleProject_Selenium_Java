package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {

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
			
			System.out.println("Exception message: " + ae.getMessage());			
			System.out.println("Invalid second number! Enter the second number again");
			System.out.print("Enter the second number:" + "\t");
			secondNumber = in.nextInt();
			System.out.println("Result: " + firstNumber / secondNumber);
			
		} catch(InputMismatchException ime) {
			System.out.println("Enter numbers only!");
			System.out.println("Exception message: " + ime.getMessage());			
		}
		 
		System.out.println("Ending the programme now!!");

	}

}
