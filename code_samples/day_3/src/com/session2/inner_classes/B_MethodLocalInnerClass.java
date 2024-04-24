package com.session2.inner_classes;
//method local inner class
class A{
	
	public void foo() {
		class B{
			void bar() {
				System.out.println("bar method inside class B");
			}
		}
		B b=new B();
		b.bar();
	}
}
public class B_MethodLocalInnerClass {

	public static void main(String[] args) {
		A a=new A();
		a.foo();
	}
}
