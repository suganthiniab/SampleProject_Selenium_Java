package loops;

public class ForLoopDemo {

	// Print the number pattern: 30, 20, 10, 0 , -10, -20
	public void decreaseNumberPattern() {
		System.out.println("Decreasing Number Pattern:");
		for (int i = 30; i >= -20; i -= 10) {
			System.out.println(i);
		}
	}

	// Print the number pattern: -7, -3, 1, 5, 9, 13
	public void increaseNumberPattern() {
		System.out.println("Increasing Number Pattern:");
		for (int i = -7; i <= 13; i += 4) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ForLoopDemo fLoopDemo = new ForLoopDemo();
		fLoopDemo.decreaseNumberPattern();
		fLoopDemo.increaseNumberPattern();
	}

}
