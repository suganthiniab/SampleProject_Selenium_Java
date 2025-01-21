package conditional.statements;

import java.util.Scanner;

public class RainbowColorFinderUsingIfElseStatement {

	public static void main(String[] args) {
		
		//Read colour from user
		//if the colour is red / orange / yellow / green / blue / indigo / violet 
		//Print 'This is rainbow colour'
		//If not print 'This is not rainbow colour'
		
		System.out.print("Enter the colour: " + "\t");
		
		Scanner in = new Scanner(System.in);
		String colour = in.next();
		
		if(colour.equalsIgnoreCase("Violet")) {
			System.out.println("This is rainbow colour");
		} else if(colour.equalsIgnoreCase("Red")) {
			System.out.println("This is rainbow colour");
		} else if(colour.equalsIgnoreCase("orange")) {
			System.out.println("This is rainbow colour");
		} else if(colour.equalsIgnoreCase("Yellow")) {
			System.out.println("This is rainbow colour");
		} else if(colour.equalsIgnoreCase("Green")) {
			System.out.println("This is rainbow colour");
		} else if((colour.equalsIgnoreCase("Blue"))) {
			System.out.println("This is rainbow colour");
		} else if ((colour.equalsIgnoreCase("Indigo"))) {
			System.out.println("This is rainbow colour");
		} else {
			System.out.println("This is not rainbow colour");
		}	
		

	}

}
