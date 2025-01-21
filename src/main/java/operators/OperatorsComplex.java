package operators;

public class OperatorsComplex {
	
	float a = 3.4f;
	float b = 5.4f;
	
	public void testOperatorsComplex() {
		a = a + 4; // can achieve by a+=4 [Compound Assignment Operators]
		System.out.println("Value of a: " + a);
		
		b = b - 0.4f;
		System.out.println("Value of b: " + b); // can achieve by b-=0.4f [Compound Assignment Operators]
	}

	public static void main(String[] args) {
		OperatorsComplex oComplex = new OperatorsComplex();
		oComplex.testOperatorsComplex();
	}

}
