package com.session2.employeeapp;
//function overloading: compile time polymorphism...: static binding: less flexible but faster
//name of function is same only no of parameter or there order or datatype is changing

class Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	//java 5: variable argument method ...a means a array
	public int add(int ...a) {
		int sum=0;
		
		for(int temp: a) {
			sum=sum+temp;
		}
		return sum;
	}
}
public class A_FunctionOverlading {

	public static void main(String[] args) {
		
		Calculator calculator=new Calculator();
		int val=calculator.add(3, 2,9);
		System.out.println(val);
		
		int val2=calculator.add(4,6,7,8);
		System.out.println(val2);
	}
}
