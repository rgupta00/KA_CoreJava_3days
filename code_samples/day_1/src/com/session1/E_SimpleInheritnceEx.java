package com.session1;
class A{
	private int i;
	public A(int i) {
		this.i=i;
	}
	public void print() {
		System.out.println("value of i: "+ i);
	}
		
}
class B extends A{
	private int j;
	public B(int i, int j) {
		super(i);// it can only compes in the ctr
		this.j=j;
	}
	public void print() {
		super.print();
		System.out.println("value of j: "+ j);
	}
}

public class E_SimpleInheritnceEx {
	
	public static void main(String[] args) {
		B b=new B(4,5);
		b.print();
	}
}
