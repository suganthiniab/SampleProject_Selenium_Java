package oops_concepts;

//Runner class by referring Students class
public class RegisterGrade {

	public static void main(String[] args) {
		Students tara = new Students();
		tara.name = "Tara";
		tara.age = 14;
		tara.grade = "A+";
		tara.getName();
		tara.getAge();
		tara.getGrade();
		
		
		Students melani = new Students();
		melani.name = "Melani";
		melani.age = 15;
		melani.grade = "A";
		melani.getName();
		melani.getAge();
		melani.getGrade();
		
		
		Students harry = new Students();
		harry.name = "Harry";
		harry.age = 13;
		harry.grade = "B";
		harry.getName();
		harry.getAge();
		harry.getGrade();
	}

}
