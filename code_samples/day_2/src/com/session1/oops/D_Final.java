package com.session1.oops;
class A{
	int i=6;
}
//final method 
final class X{
	public final void review() {
		System.out.println("review method");
	}
}

//final class can not be extended
//class Y extends X{
	//final method is inherited but can not be overriden
//	public  void review() {
//		System.out.println("review method");
//	}
//}

public class D_Final {
	
	public static void main(String[] args) {
		final int i=8;//const
		//i=i+1;
		final A a=new A();//u can change the state of the object but u can not change object itself
		
		a.i=77;
		//a=null;
	}

}
