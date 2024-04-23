package com.session2.employeeapp;

public class B_OpOverloading {

	public static void main(String[] args) {
		
		int a, b;
		a=2;
		b=23;
		int c=a+b;// + is used to add two no
		
		String x="foo";
		String y="bar";
		String z=x+y;//+ op is overloaded in java : operator overloading
		//is is readymade feature or i have done it? ==> Explict op overloading
		System.out.println(z);
		
		//u can not to explicit op overloading, c++ we can do that
	}
}
