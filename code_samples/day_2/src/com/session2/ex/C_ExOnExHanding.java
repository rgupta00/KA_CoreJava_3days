package com.session2.ex;
//what is bad prog practice around finally
//never return something from finally block
//......throws ex	    ....................
public class C_ExOnExHanding {
	
	public static void main(String[] args) {
		
//		int val=foo();
//		System.out.println(val);
		try {
			bar();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	private static int bar() {
		try {
			throw new NullPointerException();
		}finally {
			//throw new ArithmeticException();
		}
	}
	
	
//	private static int foo() {
//		try {
//			//Logic
//			return 1;
//		}finally {
//			//close the resouce
//			//return 2;
//		}
//	}

}
