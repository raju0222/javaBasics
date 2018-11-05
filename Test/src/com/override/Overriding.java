package com.override;

/*
 * Whenever there's Method Overloading, the JVM will search for the method from the most specific type to least specific type
 * 
 * In this case either of the methods can be called when passing null, since the "null type" is assignable 
 * to both Object and to ArrayList. The method that takes ArrayList is more specific so it will be picked.
 * 
 * If u specify String then it will call String . 
 * If u write both String and ArrayList then it will throw ambiguity error.
 * 
 * */
import java.util.ArrayList;

public class Overriding {
	public void fun(Object o) {
		System.out.println("In method object : "+o);
		System.out.println("this : "+this ==o);
		
	}
	/*public void fun(ArrayList a) {
		System.out.println("In method arraylist : "+a);
	}*/
	public Overriding() {
		System.out.println("in overriding : "+this);
	}
	/*public void fun(String s) {
		System.out.println("In method String : "+s);
		System.out.println("this : "+this ==s);
	}*/
	public void fun(int i) {
		System.out.println("In method int : "+i);
	}
	
	public static void main(String[] args) {	
		Overriding obj = new Overriding();
		obj.fun(null);
	}
}
