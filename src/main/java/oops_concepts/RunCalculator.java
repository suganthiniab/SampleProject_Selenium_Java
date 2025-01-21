package oops_concepts;

//Runner class by referring Calculator class
public class RunCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.firstNumber = 19;
		calc.secondNumber = 30;
		calc.operator = "+";
		calc.addition();
		calc.showResult();
		
		Calculator calcx = new Calculator();
		calcx.firstNumber = 32;
		calcx.secondNumber = 2;
		calcx.operator = "/";
		calcx.division();
		calcx.showResult();
		
		Calculator calcy = new Calculator();
		calcx.firstNumber = 12;
		calcx.secondNumber = 11;
		calcx.operator = "*";
		calcx.multiplication();
		calcx.showResult();
		
		//Runner class by referring CalculatorWithMethodOverloading class too
		CalculatorWithMethodOverloading obj = new CalculatorWithMethodOverloading();
		System.out.println(obj.add(23, 87));
		System.out.println(obj.add(17, 28, 76));
		System.out.println(obj.add(3.8, 9.0));
	}

}
