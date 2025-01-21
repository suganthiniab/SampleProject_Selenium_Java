package datatype;

public class ArithmeticOperatiorDemo {

	public int addIntegerNumbers(int firstNumberInt, int secondNumberInt) {
		int result = firstNumberInt + secondNumberInt;
		return result;
	}

	public float addDecimalNumbers(float firstDecimalNum, float secondDecimalNum ) {
		float result = firstDecimalNum + secondDecimalNum;
		return result;
	}

	public double divideDecimalByInteger(double firstNumberDouble, int secondNumberInt) {
		double result = 0;
		result = firstNumberDouble / secondNumberInt;
		return result;
	}

	public double divideIntegerByDecimal(int secondNumberInt, double firstNumberDouble) {
		double result = 0;
		result = secondNumberInt / firstNumberDouble;
		return result;
	}

	public float divideDecimalNumbers(float firstDecimalNum, float secondDecimalNum) {
		float result = 0.0f;
		result = firstDecimalNum / secondDecimalNum;
		return result;
	}

	public static void main(String[] args) {

		double firstNumberDouble = 25.25;
		int firstNumberInt = 26;
		int secondNumberInt = 24;
		float firstDecimalNum = 16.9f;
		float secondDecimalNum = 17.7f;

		ArithmeticOperatiorDemo aOperatorDemo = new ArithmeticOperatiorDemo();
		
		System.out.println(aOperatorDemo.addIntegerNumbers(firstNumberInt, secondNumberInt));
		System.out.println(aOperatorDemo.addDecimalNumbers(firstDecimalNum, secondDecimalNum));
		System.out.println(aOperatorDemo.divideDecimalByInteger(firstNumberDouble, secondNumberInt));
		System.out.println(aOperatorDemo.divideIntegerByDecimal(secondNumberInt, firstNumberDouble));
		System.out.println(aOperatorDemo.divideDecimalNumbers(firstDecimalNum, secondDecimalNum));
	}

}
