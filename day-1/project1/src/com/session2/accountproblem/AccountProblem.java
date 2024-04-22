package com.session2.accountproblem;

/*
 * name of variable should use camel notation
 * 
 */
abstract class Account {
	private int accountId;
	private String name;

	public Account(int accountId, String name) {
		this.accountId = accountId;
		this.name = name;
	}

	public void print() {
		System.out.println("accId "+ accountId+" name: "+ name);
	}
	public abstract double getAmount();
}

class SavingAccount extends Account {
	private int balance;
	public int term;
	public double rate;

	public SavingAccount(int accountId, String name, int balance, int term, double rate) {
		super(accountId, name);
		this.balance = balance;
		this.term = term;
		this.rate = rate;
	}

	public void print() {
			super.print();
			System.out.println("balance: "+ balance+" term: "+ term+" rate: "+ rate);
	}

	@Override
	public double getAmount() {
		double value = balance + (rate / 12) * term;
		return value;
	}
}

class CurrentAccount extends Account {
	private int balance;
	private int overdraft;
	
	public CurrentAccount(int accountId, String name, int balance, int overdraft) {
		super(accountId, name);
		this.balance = balance;
		this.overdraft = overdraft;
	}


	public void print() {
		super.print();
		System.out.println("value of account: " + (balance - overdraft));
	}


	@Override
	public double getAmount() {
		 int value = balance-overdraft;
		return value;
	}
}

public class AccountProblem {
	public static void main(String[] args) {
		Account account=new CurrentAccount(12, "amit", 1000, 57);
		account.print();
	}
}
