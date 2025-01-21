package loops;

import java.util.Scanner;

/* Print the text 'Advanced Multiplication Table'
 * Print the text 'Enter the number for the multiplication table'
 * Read the number by user input for the multiplication table
 * Print the text 'The times to be started with'
 * Read the number by user input for the times table to be started with
 * Print the text 'The times to be ended with'
 * Read the number by user input for the times table to be ended with
 * validate whether one of these numbers is greater than 100
 * If any of the number greater than 100, display proper validation message and stops the execution
 * If all the numbers are less than 100, rest of code will be executed to print the 
 * multiplication table as per user inputs
 */

public class MultiplyTableAdvancedByUserInput {

	public static void main(String[] args) {		

			System.out.println("Advanced Multiplication Table");
			System.out.println("===============================");
			
			System.out.print("Enter the number for the multiplication table:" + "\t");
			Scanner in = new Scanner(System.in);
			int number = in.nextInt();
			System.out.print("The times to be started with:" + "\t");
			int startTimes = in.nextInt();
			System.out.print("The times to be ended with:" + "\t");
			int endTimes = in.nextInt();
			
			
			if(number>100 || startTimes>100 || endTimes>100){
				System.out.println("Given inputs are too big.. Please provide the number less than 100");
				return; //immediately stops the execution of the current method
			}
						
			for(int i=startTimes; i<=endTimes; i++) {
				System.out.println(number + "\t" + "X" + "\t" + i + "\t" + "=" + "\t" + (number*i));
			}
			
		}

	}


	


