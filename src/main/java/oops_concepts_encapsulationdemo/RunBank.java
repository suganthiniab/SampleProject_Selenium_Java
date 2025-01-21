package oops_concepts_encapsulationdemo;

public class RunBank {

	public static void main(String[] args) {
		
		Employees mythili = new Employees();
		mythili.setEmpCode("E100");
		mythili.setEmpName("Mythili");
		mythili.setSalary(100000.0);
		mythili.setDesignation("Assistant Manager");
		
		System.out.println(mythili.getEmpCode());
		System.out.println(mythili.getEmpName());
		System.out.println(mythili.getDesignation());
		System.out.println(mythili.getSalary());
		
		
		Accounts philip =new Accounts();
		philip.setAccountNumber(12567000);
		philip.setAccountHolderName("Philip Mark");
		philip.setAccountType("Savings Account");
		philip.setBranch("Jaffna");
		philip.setAccountBalance(12000);
		
		System.out.println("==========================");
		System.out.println(philip.getAccountNumber());
		System.out.println(philip.getAccountHolderName());
		System.out.println(philip.getAccountType());
		System.out.println(philip.getBranch());
		System.out.println(philip.getAccountBalance());
		philip.depositMoney(4000);
		System.out.println(philip.getAccountBalance());
		System.out.println("==========================");
		
		Accounts smith = new Accounts();
		smith.setAccountNumber(456754);
		smith.setAccountHolderName("Smith Silva");
		smith.setAccountType("Current Account");
		smith.setAccountBalance(12000);
		smith.depositMoney(2500);
		smith.withdrawMoney(3500);
		smith.creditInterestRate(2);
		System.out.println(smith.getAccountNumber());
		System.out.println(smith.getAccountHolderName());
		System.out.println(smith.getAccountType());
		System.out.println(smith.getAccountBalance());
	}

}
