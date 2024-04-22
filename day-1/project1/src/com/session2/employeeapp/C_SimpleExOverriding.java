package com.session2.employeeapp;
//run time polymorphism
//which method is going to be call is decided at run time
//it is not decided by the type of pointer it is decided by type of object
class Foo{
	void work() {
		System.out.println("foo work");
	}
}

class Bar extends Foo{
	//i can say that method of Foo class is overriden in Bar class
	
	void work(int i) {
		System.out.println("foo work");
	}
}

public class C_SimpleExOverriding {
	public static void main(String[] args) {
		//u must have min 2 classes base class one is drived class
		Foo foo=new Bar();
		foo.work();
	}

}
