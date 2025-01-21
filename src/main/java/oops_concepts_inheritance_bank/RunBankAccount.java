package oops_concepts_inheritance_bank;

public class RunBankAccount {

	public static void main(String[] args) {

		SavingsBankAccount karol = new SavingsBankAccount();

		karol.setAccountNumber(638132139);
		karol.setAccountName("Karol James");
		karol.setAccountBalance(35000.00);

		System.out.println("Account Number: " + "\t" + karol.getAccountNumber());
		System.out.println("Account Name: " + "\t" + karol.getAccountName());
		System.out.println("Account Balance: " + "\t" + karol.getAccountBalance());
		karol.depositMoney(25500.00);
		System.out.println("Latest Account Balance after deposit: " + "\t" + karol.getAccountBalance());
		System.out.println("Interest: " + karol.calculateInterest(4));
		karol.withdrawMoney(24500);
		System.out.println("Latest Account Balance after withdraw: " + "\t" + karol.getAccountBalance());

	}
}
