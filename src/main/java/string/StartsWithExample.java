package string;

public class StartsWithExample {

	public static void main(String[] args) {
		String institution = "Techcanvass";
		System.out.println("Does the institution start with Tech: " + "\t" + institution.startsWith("Tech"));
		System.out.println("Does the institution start with canvass from 5th letter: " +  "\t"  + institution.startsWith("canvass", 4));
		System.out.println("Does the institution ends with Tech: " + "\t"  + institution.endsWith("tech"));
		System.out.println("Does the institution ends with canvass: " +  "\t"  + institution.endsWith("canvass"));
	}

}

