package string;

import java.util.Scanner;

public class ContainsFunction {

	public static void main(String[] args) {

		// find a given word whether it exists in the sentence
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the word to search:" + "\t");
		String word = in.nextLine();

		System.out.print("Enter the sentence:" + "\t");
		String sentence = in.nextLine();

		if (sentence.contains(word)) {
			System.out.println("Yes, it contains the word");
		} else {
			System.out.println("No, the word couldn't be found in the given sentence");
		}

	}

}
