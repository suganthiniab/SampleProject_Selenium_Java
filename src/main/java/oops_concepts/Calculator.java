package oops_concepts;

public class Calculator {

	public int firstNumber;
	public int secondNumber;
	public String operator;
	public int result;

	public void addition() {
		result = firstNumber + secondNumber;
	}

	public void subtraction() {
		result = firstNumber - secondNumber;
	}

	public void multiplication() {
		result = firstNumber * secondNumber;
	}

	public void division() {
		result = firstNumber / secondNumber;
	}

	public void showResult() {
		System.out.println("Result of " + firstNumber + " " + operator + " " + secondNumber + " " + "=" + " " + result);
	}

}
