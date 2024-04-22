package com.session1;
//i want to create employee class
class Employee{
	private int id;
	private String name;
	private double salary;
	private static int counter=0;//static  variable: class variable
	
	//ctr: defualt ctr of the class
	public Employee() {
		this(101,"foo",4000);
		//counter++;
	}
	//Parameterized ctr
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		counter++;
	}
	//BL method
	public void changeSalary(double increment) {
		if(increment<=salary)
		salary=salary+increment;
	}
	
	
	public void print() {
		System.out.println("id : "+ id +" name: "+ name +" salary: "+ salary);
	}
	
	//normally to access static data we write static method
	public static int getCounter() {
		return counter;
	}
	
}
public class D_EmployeeExample {
	public static void main(String[] args) {
		Employee employee1=new Employee(12,"bob",8000);
		employee1.id=666;
		employee1.salary=8000000;
		
		
		
//		Employee employee2=new Employee(23,"raj",8900);
		
//		
//		employee1.print();
//		employee2.print();
//		
//		//static method can be called without object of that class
//		System.out.println(Employee.getCounter());
//		
//		Employee employee3=new Employee(23,"pinky",8900);
//		System.out.println(Employee.getCounter());
//		
//		Employee employee4=new Employee();
//		employee4.print();
//		System.out.println(Employee.getCounter());
		
		
	}
}




