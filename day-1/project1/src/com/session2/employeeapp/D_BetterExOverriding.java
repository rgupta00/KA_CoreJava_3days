package com.session2.employeeapp;

import java.util.Scanner;

abstract class Shape{
	abstract void  showArea();
}
class Circle extends Shape{
	void showArea() {
		System.out.println("pi * r * r");
	}

}

class Square extends Shape{
	void showArea() {
		System.out.println("l * b");
	}
}

class Triangle extends Shape{
	void showArea() {
		System.out.println("0.5 * b * h");
	}
}
public class D_BetterExOverriding {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE 1 for Circle 2. for Sq 3.for Triangle");
		Shape shape=null;
		int choice= scanner.nextInt();//decision is taken at run time
		if(choice==1)
			shape=new Circle();
		else if (choice==2)
			shape=new Square();
		else if (choice==3)
			shape=new Triangle();
		
		shape.showArea();
		
		
		
		
	}

}










