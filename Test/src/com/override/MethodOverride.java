package com.override;

class Vehicle{
	public static void getDetails(){
		System.out.println("In vehicle method");
	}
}

class Car extends Vehicle{
	public static void getDetails() {
		System.out.println("In car method");
	}
}

public class MethodOverride {
	public static void main(String[] args) {
		Vehicle v= new Vehicle();
		//Car c = new Vehicle(); // It will compile time error like : "cannot convert from vehicle to car"
		Vehicle v2 = new Car();
		v.getDetails();
		v2.getDetails(); // Method Hiding is happening it will ignore the override concept and hide the car class execution
		// and executes the parent class method this is called method hiding. 
		//Car.getDetails(); // Direct calling for the static methods.
	}
}
