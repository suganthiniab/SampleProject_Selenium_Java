package string;

public class UpperCaseAndLowerCaseConversion {
	
	String training1  = "selenium java advanced course";
	String training2 = "SELENIUM JAVA ADVANCED COURSE";
	
	public void upperAndLowerCaseConversion() {
		System.out.println("After converting to upper case: " +  "\t" + training1.toUpperCase());
		System.out.println("After converting to lower case: " + "\t" + training2.toLowerCase());
	}	

	public static void main(String[] args) {
		UpperCaseAndLowerCaseConversion uLCaseConversion = new UpperCaseAndLowerCaseConversion();
		uLCaseConversion.upperAndLowerCaseConversion();		
	}
}
