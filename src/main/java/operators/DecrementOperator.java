package operators;

public class DecrementOperator {
	
	int x = 15;
	int y = 20;
	
	public int testDecrementOperator() {
		x--;		
		return x;		
	}
	
	public int testCompoundOperator() {
		y-=1;
		return y;
	}

	public static void main(String[] args) {
		DecrementOperator dOperator = new DecrementOperator();
		System.out.println("After Decrement: " + dOperator.testDecrementOperator());
		System.out.println("After Decrement: " + dOperator.testCompoundOperator());
	}

}
