package string;

public class TrimFunction {

	public static void main(String[] args) {
		
		String day = "Saturday";
		String emptyString = " ";
		String month = "december";
		String date = " 14 December 2024 ";
		
		System.out.println("Third letter of the month:" + "\t" + month.charAt(4));
		boolean result = date.toLowerCase().contains(month);
		System.out.println("Does 'december' exist on date string:" + "\t" + result);
		System.out.println("Length of date:" + "\t" + date.length());
		System.out.println("Length of date after trimming:" + "\t" + date.trim().length());
		
	}

}
