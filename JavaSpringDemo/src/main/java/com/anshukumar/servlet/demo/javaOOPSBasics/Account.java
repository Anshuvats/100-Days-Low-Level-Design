package javaOOPSBasics;

public class Account {

	private String name;
	private String accountNumber;
	private Double balance;
	
	public Account(String name,String accountNumber,Double balance) {
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public void deposit(Double amount) {
		balance+=amount;
	}
	
	public void withdraw(Double amount) {
		balance-=amount;
		if(balance<100) {
			System.out.println("Insufficient Balance in your account...Please add more money to save!!!");
		}
	}
	
	public void accountDetails() {
		System.out.println("Account Holder name "+name);
		System.out.println("Account Number "+accountNumber);
		System.out.println("Balance "+balance);
	}
}
