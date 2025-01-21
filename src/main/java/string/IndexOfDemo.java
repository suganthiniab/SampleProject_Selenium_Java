package string;

public class IndexOfDemo {

	public static void main(String[] args) {
		
		String str = "String objects are immutable";
		System.out.println(str);
		System.out.println("==========================");
		System.out.println("The first occurrence of 't':" +"\t" + str.indexOf('t'));
		System.out.println("The last occurrence of 't':" +"\t" + str.lastIndexOf('t'));
		System.out.println("The first occurrence of 'the':" +"\t" + str.indexOf("the"));
		System.out.println("The last occurrence of 'the':" +"\t" + str.lastIndexOf("the"));
		System.out.println("The index of 't' from 10th index:" + "\t" + str.indexOf('t', 10));
			

	}

}
