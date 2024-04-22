package com.session2.passangerproblem;

//a passanger whose name is raj is moving from    Delhi	to Taj Mahal using Train
//u can use abs using : abs class vs interface
//abstract class Vehicle {
//	public abstract void move(String s, String d);
//}

interface Vehicle {
	public abstract void move(String s, String d);
}

class Train extends Vehicle {
	public void move(String s, String d) {
		System.out.println("moving from " + s + " to " + d + " using Train");
	}
}

class Car extends Vehicle {
	public void move(String s, String d) {
		System.out.println("moving from " + s + " to " + d + " using Car");
	}
}

class Bus extends Vehicle {
	public void move(String s, String d) {
		System.out.println("moving from " + s + " to " + d + " using Bus");
	}
}

class Passenger {

	private String name;

	public Passenger(String name) {
		this.name = name;
	}

	// u dont want to change the code too frequently
	public void travel(String s, String d, Vehicle vehicle) {
		System.out.println("passanger name: " + name);
		vehicle.move(s, d);
	}
}

//if one req change u have to change code at many location:
public class A_PassangerProblem {
	public static void main(String[] args) {
		// Train train=new Train();
		Vehicle car = new Bus();
		Passenger passenger = new Passenger("raj");
		passenger.travel("Delhi", "TajMahal", car);

	}
}
