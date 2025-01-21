package conditional.statements;

import java.util.Scanner;

public class RainbowColourFinderUsingSwitchStatement {

	public static void main(String[] args) {
		
		//Read colour from user
				//if the colour is red / orange / yellow / green / blue / indigo / violet 
				//Print 'This is rainbow colour'
				//If not print 'This is not rainbow colour'
				
				System.out.print("Enter the colour: " + "\t");
				
				Scanner in = new Scanner(System.in);
				String colour = in.next();
				
				switch(colour.toLowerCase()) {
				case "red" : 
					System.out.println("This is rainbow colour");		
					break;
				case "orange" :
					System.out.println("This is rainbow colour");	
					break;
				case "yellow" :
					System.out.println("This is rainbow colour");	
					break;
				case "green" :
					System.out.println("This is rainbow colour");
					break;
				case "blue":
					System.out.println("This is rainbow colour");
					break;
				case "indigo" :
					System.out.println("This is rainbow colour");
					break;
				case "violet" :
					System.out.println("This is rainbow colour");
					break;
				default:
					System.out.println("This is not rainbow colour");
					
				}		
			

	}

}
