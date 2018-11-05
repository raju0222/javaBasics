package com.learn;

public class ObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class<?> a = Class.forName("com.learn.A"); // class.forName will load the class but not create the class.
			System.out.println(a);
			A a2= (A) a.newInstance(); // newInstace will create the class
			System.out.println(a2.getCount());
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
