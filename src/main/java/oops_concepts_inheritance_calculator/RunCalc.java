package oops_concepts_inheritance_calculator;

//Runner class for BasicCalculator, AdvancedCalculator and LogCalculator classes
public class RunCalc {

	public static void main(String[] args) {

		double firstNum = 15.0;
		double secondNum = 23.5;

		// AdvancedCalculator class inherits the properties of BasicCalculator.
		AdvancedCalculator advCalculator = new AdvancedCalculator();
		System.out.println(advCalculator.add(firstNum, secondNum));
		System.out.println(advCalculator.subtract(firstNum, secondNum));
		System.out.println(advCalculator.multiply(firstNum, secondNum));
		System.out.println(advCalculator.divide(firstNum, secondNum));
		System.out.println(advCalculator.remainder(firstNum, secondNum));
		System.out.println(advCalculator.percentage(firstNum, secondNum));
		System.out.println(advCalculator.sqrRoot(firstNum));
		System.out.println("======================================");
		
		
		/*
		 * // If LogCalculator class inherits the properties of BasicCalculator.
		 * LogCalculator logCalculator = new LogCalculator();
		 * System.out.println(logCalculator.add(firstNum, secondNum));
		 * System.out.println(logCalculator.divide(firstNum, secondNum));
		 * System.out.println(logCalculator.log(firstNum));
		 */
		
		//As LogCalculator doesn't inherit properties of BasicCalculator
		LogCalculator logCalculator = new LogCalculator();
		logCalculator.addLogCalc(firstNum, secondNum);
		logCalculator.log(firstNum);
	}
}
