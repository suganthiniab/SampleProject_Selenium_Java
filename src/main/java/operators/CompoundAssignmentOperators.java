package operators;

public class CompoundAssignmentOperators {
	
	int p = 25;
	int q = 27;
	int r = 30;
	int s = 99;
	int t = 95;
	
	public void testCompoundAssignmentOperators() {
		//Add and Assign
		p+=5;
		System.out.println("Add and Assign: " + "p = " + p );
		
		//Subtract and Assign
		q-=4;
		System.out.println("Subtract and Assign: " + "q = " + q);
		
		//Multiply and Assign
		r*=3;
		System.out.println("Multiply and Assign: " + "r = " + r);
		
		//Divide and Assign
		s/=3;
		System.out.println("Multiply and Assign: " + "s = " + s);
		
		//Modulus and Assign
		t%=3;
		System.out.println("Modulus and Assign: " + "t = " + t);
		
	}

	public static void main(String[] args) {
		CompoundAssignmentOperators cAssignmentOperators = new CompoundAssignmentOperators();
		cAssignmentOperators.testCompoundAssignmentOperators();
	}

}
