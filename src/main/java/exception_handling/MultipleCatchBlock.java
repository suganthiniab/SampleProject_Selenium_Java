package exception_handling;

public class MultipleCatchBlock {

	// ArrayIndexOutOfBoundException and Exception class
	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40 };
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(numbers[i]);
			}
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
		}
		System.out.println("Try catch block ended");

	}

}
