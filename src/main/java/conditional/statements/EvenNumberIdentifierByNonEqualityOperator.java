package conditional.statements;

import java.util.Scanner;

public class EvenNumberIdentifierByNonEqualityOperator {

	public static void main(String[] args) {
		
		System.out.print("Enter the number:" + "\t");
		
		Scanner in  = new Scanner(System.in);
		int number = in.nextInt();
		
		if(number%2!=0) {
			System.out.println("The number is odd number");
		} else {
			System.out.println("The number is even number");
		}	
		

	}

}
