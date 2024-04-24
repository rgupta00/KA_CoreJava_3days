package com.session2.inner_classes;
/*
 * 	top level inner class
 * 	collection, ur ds
 * 	https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
 
	method local inner class
	annonymous inner classes
	Examples
	
	
 */
class Outer{
	private int i=55;
	class Inner{
		private int i=505;
		public void printInner() {
			System.out.println("printInner method: "+ i+" "+Outer.this.i);
		}
	}
	public void foo() {
		Inner inner=new Inner();
		inner.printInner();
	}
}
public class A_TopLevelInnerClass {
	
	public static void main(String[] args) {
		
		Outer outer=new Outer();
		outer.foo();
		
//		Outer.Inner inner=new Outer().new Inner();
//		inner.printInner();
		
	}

}
