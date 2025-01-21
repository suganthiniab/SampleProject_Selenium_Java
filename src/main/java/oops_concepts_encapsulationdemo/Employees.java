package oops_concepts_encapsulationdemo;

public class Employees {

	private String empName;
	private String empCode;
	private double salary;
	private String designation;
	String workingLocation; //this is default access modifier
	
	public String getEmpName() {
		return empName;	
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
