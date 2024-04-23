package com.session1.oops;

//inheritance ex
interface Payable {
	public abstract double getPayment();
}

abstract class Employee implements Payable {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void print() {
		System.out.println("id : " + id + " name : " + name);
	}
}

class Freelancer implements Payable {
	private String name;
	private String companyReg;
	private int payPerDay;
	private int noOfDay;

	public Freelancer(String name, String companyReg, int payPerDay, int noOfDay) {
		super();
		this.name = name;
		this.companyReg = companyReg;
		this.payPerDay = payPerDay;
		this.noOfDay = noOfDay;
	}

	@Override
	public double getPayment() {
		return payPerDay*noOfDay*0.7;
	}

	public void print() {
		System.out.println("name: "+ name+" companyReg:"+companyReg+" payPerDay:"+payPerDay+" noOfDay: "+noOfDay);
	}
}

class PartTimeEmployee extends Employee {
	private int noOfHr;
	private int payPerHr;

	public PartTimeEmployee(int id, String name, int noOfHr, int payPerHr) {
		super(id, name);
		this.noOfHr = noOfHr;
		this.payPerHr = payPerHr;
	}

	@Override
	public double getPayment() {
		return noOfHr * payPerHr * 0.8;
	}

	public void print() {
		super.print();
		System.out.println("noOfHr: " + noOfHr + " payPerHr: " + payPerHr);
	}
}

class FullTimeEmployee extends Employee {
	private String ppfNumber;
	private double baseSalary;

	public FullTimeEmployee(int id, String name, String ppfNumber, double baseSalary) {
		super(id, name);
		this.ppfNumber = ppfNumber;
		this.baseSalary = baseSalary;
	}

	@Override
	public double getPayment() {
		return baseSalary * 5;
	}

	public void print() {
		super.print();
		System.out.println("ppfNumber: " + ppfNumber + " baseSalary: " + baseSalary);
	}

}

//class ProcessPayment {
//	public static void process(Employee employee) {
//		// start the db... result into this
//		double payment = employee.getPayment();
//		// store into db
//		System.out.println("payment is process :" + payment);
//	}
//}

class ProcessPayment {
	public static void process(Payable payable) {
		// start the db... result into this
		double payment = payable.getPayment();
		// store into db
		System.out.println("payment is process :" + payment);
	}
}

public class A_DemoClass {
	public static void main(String[] args) {
		Employee employee1 = new PartTimeEmployee(1, "pol", 40, 200);
		Employee employee2 = new FullTimeEmployee(1, "raj", "ASB12323", 2000);

		Freelancer freelancer=new Freelancer("raja", "AS23", 6700, 20);
		ProcessPayment.process(employee1);
		ProcessPayment.process(employee2);
		ProcessPayment.process(freelancer);

//		System.out.println("employee1"+  employee1.getPayment());
//		System.out.println("employee2"+  employee2.getPayment());
//		employee1.print();
//		employee2.print();
	}

}
