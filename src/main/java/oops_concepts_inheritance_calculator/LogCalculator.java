package oops_concepts_inheritance_calculator;

/*
 * By some reason, LogCalculator class isn't inherited BasicCalculator class
 * In this case, how LogCalculator class can access the methods of baseCalculator as a workaround
 */

public class LogCalculator {

	public double log(double firstNumber) {
		return Math.log(firstNumber);
	}
	
	public double addLogCalc(double firstNumber, double secondNumber) {
		BasicCalculator bCalculator = new BasicCalculator();
		return bCalculator.add(firstNumber, secondNumber);		
	}

}
