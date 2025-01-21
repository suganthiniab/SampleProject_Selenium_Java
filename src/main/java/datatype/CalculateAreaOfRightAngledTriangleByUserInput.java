package datatype;

import java.util.Scanner;

public class CalculateAreaOfRightAngledTriangleByUserInput {

	public static void main(String[] args) {
		
		System.out.println("Calculate the area of Right angled triangle");
		System.out.println("==========================================");
		System.out.print("Enter the base of the Right angled triangle: ");
		
		Scanner in = new Scanner(System.in);
		int base = in.nextInt();
		
		System.out.print("Enter the height of the Right angled triangle: ");
		int height = in.nextInt();
		
		int area = (base*height)/2;
		System.out.println("Area of Right angled triangle is: " + area);

	}
}
