package com.session2.ex;
//java defined readymade
//user define ex : 1. checked ex vs unchecked ex
//						Exception		RuntimeException

//user defined checked ex
class AccountCreationException extends Exception{
	private static final long serialVersionUID = 1825616456008488982L;

	public AccountCreationException(String message) {
		super(message);
	}
}

//NotSufficientFundException
class NotSufficientFundException extends Exception{
	private static final long serialVersionUID = 1825616456008488982L;

	public NotSufficientFundException(String message) {
		super(message);
	}
}

//OverFundEcxception
class OverFundEcxception extends RuntimeException{
	private static final long serialVersionUID = 1825616456008488982L;

	public OverFundEcxception(String message) {
		super(message);
	}
}


class Account{
	private int id;
	private String name;
	private double balance;
	
	public Account(int id, String name, double balance) throws AccountCreationException{
		if(balance<1000) {
			throw new AccountCreationException("account can not be created min bal must be 1000 usd");
		}else {
			this.id = id;
			this.name = name;
			this.balance = balance;
		}
	}
	
	public void withdraw(double amount)throws NotSufficientFundException {
		double temp=balance-amount;
		if(temp<1000) {
			throw new NotSufficientFundException("transaction is not possible min bal should be 1000 usd");
		}
		else
			balance=temp;
	}
	//1L
	public void depsit(double amount)throws OverFundEcxception {
		double temp=balance+amount;
		if(temp>=10_00_00) {
			throw new OverFundEcxception("transaction is not possible max bal should be less then 10_00_00 usd");
		}
		else
			balance=temp;
	}
	public void print() {
		System.out.println("id: "+ id +" name: "+ name +" balance: "+balance);
	}
}
public class A_UserDefineEx {
	
	public static void main(String[] args) {
		Account account;
		try {
			account = new Account(1, "pol", 90000);
			account.depsit(5000);
			account.withdraw(94500);
			
			account.print();
		} catch (AccountCreationException e) {
			System.out.println(e.getMessage());
		}catch(OverFundEcxception e) {
			System.out.println(e.getMessage());
		} catch (NotSufficientFundException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("code end");
		
	}

}













