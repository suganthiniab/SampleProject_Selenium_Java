package string;

public class CaseConversionUsingReplaceMethod {
	
	String institution = "Techcanvass Academy";
	
	public void caseConversion() {
		String institution1 = institution.replace('e', 'E');
		System.out.println("After all e replaced with E:" + '\t' + institution1 );
		
		String institution2 = institution.replaceAll("ca", "CA");
		System.out.println("After all ca replaced with CA:" + '\t' + institution2);
		
		String institution3 = institution.replaceFirst("ca", "CA");
		System.out.println("After first ca replaced with CA:" + '\t' + institution3);
		
		String institution4 = institution.replace("ech", "ECH");
		System.out.println(institution4);
		
	}

	public static void main(String[] args) {
		CaseConversionUsingReplaceMethod cConversion = new CaseConversionUsingReplaceMethod();
		cConversion.caseConversion();
	}
	
}
