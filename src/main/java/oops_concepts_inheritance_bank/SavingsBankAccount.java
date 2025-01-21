package oops_concepts_inheritance_bank;

public class SavingsBankAccount extends BankAccount {

	public double calculateInterest(double interestRate) {
		double interest = getAccountBalance() * interestRate / 100;
		return interest;
	}

}
