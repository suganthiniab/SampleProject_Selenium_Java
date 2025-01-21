package loops;

import java.util.Scanner;

public class MultiplicationTableForUserInputtedNumber {

	public static void main(String[] args) {
		
		System.out.print("Please enter the number:" + "\t");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println("MULTIPLICATION TABLE");
		System.out.println("==========================");
		
		for(int i=1; i<=12; i++) {
			System.out.println(number + " " + "*" + " " + i + " " + "=" + " " + number*i);
		}
	}

}
