package string;

public class CompareStrings {
	
	//Compare Strings by considering case
	public void compareStrings(String firstString, String secondString) {
		boolean result;
		result = firstString.equals(secondString);
		System.out.println("Are these strings are same: " + result);
	}
	
	//Compare Strings without considering case
	public void compareStringsByIgnoringCase(String course1, String course2) {
		boolean result;
		result = course1.equalsIgnoreCase(course2);
		System.out.println("Are the Strings are same by ignoring case:" + "\t" + result);
	}

	public static void main(String[] args) {
		String firstString = "This is test";
		String secondString = "This is demo";
		String course1 = "Java Selenium Course";
		String course2 = "java selenium course";

		CompareStrings cStrings = new CompareStrings();
		cStrings.compareStrings(firstString, secondString);
		cStrings.compareStringsByIgnoringCase(course1, course2);
	}

}
