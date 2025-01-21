package string;

public class SubStringDemo {

	public static void main(String[] args) {
		
		String text = "String objects are immutable";		
		System.out.println("Sub String from 7th index: " + text.substring(7));
		System.out.println(text.substring(7, 13));		
	}
}
