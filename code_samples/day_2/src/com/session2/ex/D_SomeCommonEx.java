package com.session2.ex;

class Emp {
	private int id;
	private String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void print() {
		print();
		System.out.println("id: " + id + " name: " + name);
	}
}

public class D_SomeCommonEx {

	public static void main(String[] args) {
		Emp emp1=new Emp(1, "foo");
		emp1.print();
		
		
		
		//1. null pe 
//		Emp emp = null;
//		if (emp != null)
//			emp.print();
//		else
//			System.out.println("emp is not found");
		
		//2. array
//		Emp[] emps=new Emp[5];
//		//c/c++/java --> 0
//		emps[0]=new Emp(1, "foo");
//		emps[1]=new Emp(1, "foo");
//		emps[2]=new Emp(1, "foo");
//		emps[3]=new Emp(1, "foo");
//		emps[4]=new Emp(1, "foo");
//		
//		emps[5]=new Emp(1, "foo");
//		
//		for(Emp e: emps) {
//			e.print();
//		}
		
	}
}





