package com.learn;

public class ObjectsCount {

	public static void main(String[] args) {
		A a = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
				
		System.out.println("Total count of created objects : "+ a.getCount());
		System.out.println("Total count of created objects : "+ a2.getCount());
		System.out.println("Total count of created objects : "+ a3.getCount());
		System.out.println("Total count of created objects : "+ a4.getCount());
		System.out.println("Total count of created objects : "+ a5.getCount());

	}

}
