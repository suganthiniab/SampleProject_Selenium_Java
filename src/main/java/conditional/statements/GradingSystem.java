package conditional.statements;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {

		// read or get the percentage, which student got scored
		// If student scored greater than or equal 80 , grade will be 'A'
		// If student scored less than 80 and greater or equal 60 , grade will be 'B'
		// If student scored less than 60 and greater or equal 40 , grade will be 'C'
		// If student scored less than 40 , grade will be 'Fail'

		System.out.print("Enter the student mark:" + "\t");

		Scanner in = new Scanner(System.in);
		int mark = in.nextInt();

		if (mark > 100 || mark < 0) {
			System.out.println("Enter valid mark!");
		} else if (mark >= 80) {
			System.out.println("Grade:" + "\t" + "A");
		} else if (mark >= 60 && mark < 80) {
			System.out.println("Grade:" + "\t" + "B");
		} else if (mark >= 40 && mark < 60) {
			System.out.println("Grade:" + "\t" + "C");
		} else if (mark < 40) {
			System.out.println("Grade:" + "\t" + "Fail");
		}

	}

}
