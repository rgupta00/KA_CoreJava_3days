package com.session1.oops;
//class Monkey{
//	public void jump() {
//		System.out.println("jump of monkey");
//	}
//	
//	public void stayOnTree() {
//		System.out.println("stayOnTree of monkey");
//	}
//	
//	public void bite() {
//		System.out.println("bite of monkey");
//	}
//}
//
//class Kid extends Monkey{
//	
//	public void school() {
//		System.out.println("going school :)");
//	}
//	
//	public void homeWork() {
//		System.out.println("homeWork :(");
//	}
//}

interface Jumpable{
	public void jump();
}
class Monkey implements Jumpable{
	public void jump() {
		System.out.println("jump of monkey");
	}
	
	public void stayOnTree() {
		System.out.println("stayOnTree of monkey");
	}
	
	public void bite() {
		System.out.println("bite of monkey");
	}
}

class Kid implements Jumpable{
	
	public void school() {
		System.out.println("going school :)");
	}
	
	public void homeWork() {
		System.out.println("homeWork :(");
	}

	@Override
	public void jump() {
		System.out.println("jump better then monkey");
	}
}
public class C_WhenToUseWhat {
	
	public static void main(String[] args) {
		
	}

}
