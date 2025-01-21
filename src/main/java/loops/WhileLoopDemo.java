package loops;

//Print the number from 1 to 10 using while loop
public class WhileLoopDemo {

	public void printNumberPatternUsingWhileLoop() {
		int i = 1;
		while (i <= 10) {
			System.out.println("Number:" + "\t" + i);
			i++;
		}
		System.out.println("===============================");
	}
	
	//Find sum of element elements
	public int calculateSumOfMarks(int[] marks) {
		int i = 0;
		int sum = 0;

		while (i < marks.length) {
			sum += marks[i];
			i++;
		}

		return sum;
	}

	public static void main(String[] args) {

		int[] marks = { 56, 67, 90, 87, 65, 86, 77, 94, 82, 92 };
		WhileLoopDemo wLoopDemo = new WhileLoopDemo();
		wLoopDemo.printNumberPatternUsingWhileLoop();
		System.out.println("Total Marks:" + "\t" + wLoopDemo.calculateSumOfMarks(marks));
	}
}
