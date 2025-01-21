package string;

public class ConcatFunction {

	String name = "Java selenium operators and data types";
	String day = "Sunday";
	char space = ' ';

	// Amalgamate strings using plus operator
	public void concatFunctionByPlus() {
		String concatenatedStr = name + space + day;
		System.out.println(concatenatedStr);
	}

	// Amalgamate strings using concat() method
	public void concatFunctionByConcatMethod() {
		System.out.println(name.concat(day));
	}

	public static void main(String[] args) {
		ConcatFunction cFunction = new ConcatFunction();
		cFunction.concatFunctionByPlus();
		cFunction.concatFunctionByConcatMethod();
	}

}
