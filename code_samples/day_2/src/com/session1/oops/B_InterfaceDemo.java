package com.session1.oops;
/*
 * 	*interface can not have instance variable , only hv class varaible
 *  * it is 100% abs
 *  * u can declare the method can not define it till java 7
 */
interface Foo{
	public static final int i=10;// data is always public static and final
	public abstract void foof();// only declare the method till java 7
	
//	public default void foof2() {
//		System.out.println("it is default method ");
//	}
//	public static void fooStatic() {
//		System.out.println("foostatic method");
//	}
}
class FooImpl implements Foo{

	@Override
	public void foof() {
		System.out.println("foof method is defined");
	}
	
}
public class B_InterfaceDemo {
	
	public static void main(String[] args) {
		Foo f=new FooImpl();
		f.foof();
	}

}
