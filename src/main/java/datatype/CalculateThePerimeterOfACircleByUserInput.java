package datatype;

import java.util.Scanner;

public class CalculateThePerimeterOfACircleByUserInput {
	
	final static float pi = 22/7;

	public static void main(String[] args) {
		
		System.out.println("Welcome to Perimeter Calculator for Circle");
		System.out.println("==========================================");
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter radius of the reactangle: ");
		int radius = in.nextInt();
		
		double perimeter = 2*pi*radius;
		
		System.out.println("Perimeter of the circle is: " + perimeter);
		
	}

}
