package string;

public class IndexOfExample {

	public static void main(String[] args) {
		
		String text = "Hello World";
		
		// Find the first occurrence of a character
		System.out.println("The position of o:" + "\t" + text.indexOf('o'));
		
		//Find the first occurrence of a character from a specific index
		System.out.println("The position of 'o' is from fifth index" + "\t" + text.indexOf('o', 5));
		
		 // Find the first occurrence of a substring
		System.out.println("Find the occurence of the substring:" + "\t" + text.indexOf("Wor"));
		
		 // Find the first occurrence of a substring from a specific index
		System.out.println("Find the occurrence of the substring from the specified index:" + "\t" + text.indexOf("ld", 7));
		
		//find the last occurrence of the specified character
		System.out.println("Find the last occurrence of the string:" + "\t" + text.lastIndexOf('o'));
		
		//find the last occurrence of the specified substring
		System.out.println("Find the last occurrence of the substring:" + "\t" + text.lastIndexOf("lo"));
		
		
	}

}
