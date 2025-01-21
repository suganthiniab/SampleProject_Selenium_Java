package exception_handling;

public class NullPointerException {

	public static void main(String[] args) {

		String name = "";
		String grade = null;

		System.out.println("Name's length: " + name.length());

		try {
			System.out.println("Grade's length: " + grade.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
