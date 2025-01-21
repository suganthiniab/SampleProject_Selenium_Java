package string;

public class ManyStringVariables {
	
	public static void main(String[] args) {
		String name = "Java Selenium Operators & Data Types";
		String day = "Sunday";
		String date = "8th Dec 2024";
		String placeOfTraining = "Teams Virtual";
		
		//print the text
		System.out.println("=====================Tab space between each data===================");
		//"\t" command will create tab space between 2words
		System.out.println(name + "\t" + day + "\t" + date + "\t" + placeOfTraining );
		
		//print the text
		System.out.println("======================Each data on separate line====================");		
		//"\n" command will make a new line 
		System.out.println(name + "\n" + day + "\n" + date + "\n" + placeOfTraining);
	}

}
