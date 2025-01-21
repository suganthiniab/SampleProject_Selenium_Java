package string;

public class RetrieveCharacterFromSpecifiedIndex {
	
	String course = "Selenium Java Advanced Course";
	
	public void retrieveCharacterFromSpecifiedIndex() {
		char fifthIndex = course.charAt(5);
		System.out.println("Sixth Letter of the String:" + "\t" + fifthIndex);
	}

	public static void main(String[] args) {
		RetrieveCharacterFromSpecifiedIndex rCharacterFromSpecifiedIndex = new RetrieveCharacterFromSpecifiedIndex();
		rCharacterFromSpecifiedIndex.retrieveCharacterFromSpecifiedIndex();
	}
}
