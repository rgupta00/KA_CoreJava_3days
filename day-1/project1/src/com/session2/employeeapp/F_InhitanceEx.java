package com.session2.employeeapp;
/*
 * 		
				Employee (id name and salary)
					|
		--------------------------------
		|								|
	PartTimeEmployee			FullTimeEmployee
	noOfHr, payPerHr			ppfAccNo, tax
	
		payment()				payment()
 */
/*
 * 	I dont want to allow to crate object of employee : abstraction
 *  Logic of getSalary() dont make sence
 *  Abs class can have abstract method it is the responsibity of drived class to "override" the method ("orverring and overloading")
 *  Polymorphism: run time polymorphism
 */
abstract class Employee{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.println("id : "+ id +" name: "+name);
	}
	public abstract double getSalary();
}
class PartTimeEmployee extends Employee{
	private int noOfHr;
	private int payPerHr;
	
	public PartTimeEmployee(int id , String name, int noOfHr,int payPerHr) {
		super(id, name);
		this.noOfHr=noOfHr;
		this.payPerHr=payPerHr;
	}
	public void print() {
		super.print();
		System.out.println("noOfHr : "+ noOfHr +" payPerHr: "+payPerHr);
	}
	//this method have overriden the base method
	public double getSalary() {
		return noOfHr*payPerHr*0.8;
	}
	
}

class FullTimeEmployee extends  Employee{
	private String ppfNo;
	private int baseSalary;
	
	public FullTimeEmployee(int id, String name, String ppfNo, int baseSalary) {
		super(id, name);
		this.ppfNo = ppfNo;
		this.baseSalary = baseSalary;
	}
	
	public void print() {
		System.out.println("***********************************************");
		super.print();
		System.out.println("ppfNo : "+ ppfNo +" baseSalary: "+baseSalary);
		System.out.println("***********************************************");
	}
	
	public double getSalary() {
		return baseSalary *10*0.8;
	}
	
}

public class F_InhitanceEx {
	
	public static void main(String[] args) {
		Employee employee1=new FullTimeEmployee(12, "raja", "ASB555", 1000);
		
		Employee employee2=new PartTimeEmployee(12, "raja", 95, 80);
		
		System.out.println("salray of employee 1 :"+ employee1.getSalary());

		System.out.println("salray of employee 2 :"+ employee2.getSalary());
		
//		Employee employee3=new Employee(1, "ekta");
//		System.out.println(employee3.getSalary());
		
		employee1.print();
		employee2.print();
	}

}












