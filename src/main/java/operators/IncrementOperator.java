package operators;

public class IncrementOperator {
	
	int a = 10;
	int b = 20;
	
	public int doIncrementOperator() {
		a++;
		return a;
	}
	
	public int doCompoundOperators() {
		b+=1;
		return b;
	}

	public static void main(String[] args) {
		IncrementOperator iOperator = new IncrementOperator();
		System.out.println("After Increment: "+ iOperator.doIncrementOperator());
		System.out.println("After Increment: " + iOperator.doCompoundOperators());
	}

}
