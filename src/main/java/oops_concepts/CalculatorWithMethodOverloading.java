package oops_concepts;

public class CalculatorWithMethodOverloading {

	private int result;
	private double resultOfDouble;
	
	/*
	 * Method overloading achieved by 
	 * adding addional parameters or
	 * changing return type or
	 * changing data types of parameters
	 * but, method name should be same
	 */

	public int add(int firstNumber, int secondNumber) {
		 result = firstNumber + secondNumber;
		 return result;
	}

	public int add(int firstNumber, int secondNumber, int thirdNumber) {
		result = firstNumber + secondNumber + thirdNumber;
		return result;
	}
	
	public double add(double firstNumber, double secondNumber ) {
		resultOfDouble = firstNumber + secondNumber;
		return resultOfDouble;
	}
}
