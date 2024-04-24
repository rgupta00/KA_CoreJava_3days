package com.session1.collection_adv;
//u need to help java to tell how to sort emp ie user define data type

import java.util.Comparator;

//Comparator: used to define extra sort seq
class EmpNameSorter implements Comparator<Emp>{
	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class SalarySorter implements Comparator<Emp>{
	@Override
	public int compare(Emp o1, Emp o2) {
		return Double.compare(o2.getSalary(), o1.getSalary());
	}
	
}

public class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	private double salary;
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	//java will call this method 
	// e1.compareTo(e2)
	@Override
	public int compareTo(Emp o) {
		return Integer.compare(this.id, o.id);
	}
	
	

}
