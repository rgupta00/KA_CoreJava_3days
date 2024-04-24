package com.session4.misctopics;
import java.util.*;
//annotation :aka meta data : data about data
//why annotation: i can give some instution to compile or to jvm
class Foo{
	void foo() {
		System.out.println("foo method of class Foo");
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Deprecated
	public void oldCode() {
		List l=new ArrayList();	//2008
		l.add("foo");
		//
		///
	}
}
class Bar extends Foo{
	
	//i want that it should be confirm from the compiler that i doing correct overriding
	@Override
	void foo() {
		System.out.println("foo method of class Bar");
	}
}
public class A_Annotations {

	public static void main(String[] args) {
		Foo f=new Bar();
		f.foo();
		f.oldCode();
		
//		Date  date=new Date();
//		date.setDate(12);
	}
}















