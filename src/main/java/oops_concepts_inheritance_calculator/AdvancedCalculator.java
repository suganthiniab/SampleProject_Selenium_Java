package oops_concepts_inheritance_calculator;

/*
 * This class inherits the methods/actions/processes of Base Calculator
 * BasicCalculator becomes parent class or super class
 * AdvancedCalculator becomes child or sub class
 * AdvancedCalculator inherits methods from BasicCalculator
 */

public class AdvancedCalculator extends BasicCalculator {

	public double percentage(double firstNumber, double secondNumber) {
		return secondNumber / (firstNumber + secondNumber) * 100;
	}

	public double sqrRoot(double firstNumber) {
		return Math.sqrt(firstNumber);
	}

	/*
	 * We need add method which should add the given two numbers and print as 'The numbers are added successfully' 
	 * add method is over-ridden in the class
	 */
	public double add(double firstNumber, double secondNumber) {
		System.out.println("The numbers are added successfully");
		return firstNumber + secondNumber;
	}

}
