package com.session1;

import java.util.Scanner;

public class Hello {

	public static void main(String args[]) {
		System.out.println("printing 5 star");
		// looping
		// Nested looping:
		// technally there is not limit
		// GPP: nested loop bad in peformance
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// GPP: nested loop bad in peformance
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Pls enter no of stars row");
		
		int no=scanner.nextInt();
		
		for (int i = 0; i < no; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}













