package loops;

import java.util.Scanner;

/*
 * Read a number by user input
 * evaluate the number is multiple of three
 * If the number is multiple of three, print all the multiple of three below the entered number until zero
 * Ask the user 'Do you want to continue the programme' 
 * If 'yes', the programme will execute again. 
 * Else, the programme will terminate
 */

public class PrintMultipleOfThreeBelowUserInput {

	public static void main(String[] args) {

		String condition = "";

		System.out.println("Print multiple of three");
		System.out.println("==========================");
		do {
			System.out.print("Enter the number:" + "\t");

			Scanner in = new Scanner(System.in);
			int number = in.nextInt();

			if (number % 3 == 0) {
				for (int i = number; i >= 0; i -= 3) {
					System.out.println(i);
				}
			}

			else {
				System.out.println("Invalid number!! Enter multiple of three");
			}

			System.out.print("Do you want to continue the programme:(yes/no)" + "\t");
			condition = in.next();

		} while (condition.equalsIgnoreCase("yes"));
		
		System.out.println("Exiting the programme now!!");
	}

}
