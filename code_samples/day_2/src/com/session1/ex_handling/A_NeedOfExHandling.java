package com.session1.ex_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_NeedOfExHandling {

	public static void main(String[] args) {
		// risky code

//		Scanner scanner = null;
//		try {
//			int x, y;
//			scanner = new Scanner(System.in);
//
//			System.out.println("PE 2 nos");
//			x = scanner.nextInt();
//			y = scanner.nextInt();
//
//			int z = x / y;
//
//			System.out.println("Z:" + z);
//
//			System.out.println("end");
//	
//		} catch (ArithmeticException e) {
//			System.out.println("dont do divide by zero");
//			
//		} catch (InputMismatchException e) {
//			System.out.println("input must be ints");
//			
//		}finally {
//			scanner.close();
//		}
		
		//java 7: automatic resouce mgt
		
		
		try(Scanner scanner = new Scanner(System.in)) {
			int x, y;
			
			System.out.println("PE 2 nos");
			x = scanner.nextInt();
			y = scanner.nextInt();

			int z = x / y;

			System.out.println("Z:" + z);

			System.out.println("end");
	
		} catch (ArithmeticException e) {
			System.out.println("dont do divide by zero");
			
		} catch (InputMismatchException e) {
			System.out.println("input must be ints");	
		}
		
	//ArithmeticException, InputMismatchException are ex of UnchekedEx, logic problem
//			int x, y;
//			Scanner scanner = new Scanner(System.in);
//
//			System.out.println("PE 2 nos");
//			x = scanner.nextInt();
//			y = scanner.nextInt();
//
//			int z = x / y;
//
//			System.out.println("Z:" + z);
//
//			System.out.println("end");
	
		
	}
}



