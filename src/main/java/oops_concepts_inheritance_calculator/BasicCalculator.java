package oops_concepts_inheritance_calculator;

public class BasicCalculator {
	
	//protected ensures that the method is accessible to the same class and its child classes only
	protected double add(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;		
	}
	
	public double subtract(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;		
	}
	
	public double multiply(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;		
	}
	
	public double divide(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;		
	}
	
	public double remainder(double firstNumber, double secondNumber) {
		return firstNumber % secondNumber;		
	}

}
