package oops_concepts_encapsulationdemo;

public class Accounts {

	private int accountNumber;
	private String accountHolderName;
	private String branch;
	private String accountType;
	private int accountBalance;
	
	
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public void depositMoney(int moneyToBeDeposited) {
		this.accountBalance = this.accountBalance + moneyToBeDeposited;
	}
	public void creditInterestRate(int interestRate) {
		interestRate = this.accountBalance * interestRate / 100;
		this.accountBalance = this.accountBalance + interestRate;		
	}
	public void withdrawMoney(int moneyToBewithdrawn) {
		this.accountBalance = this.accountBalance - moneyToBewithdrawn;
	}		
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
		
}
