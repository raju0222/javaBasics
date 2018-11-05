package com.learn;
/*
 * We can have multiple main methods in JAVA those main methods will be overloaded because it is in the same class,
 * But the default main method will be the main(String args[]) called by the JVM.
 *  
 * */
public class MultipleMain{

	   public static void main(String args[]){
		   System.out.println("In main ");
		   main(122);
	       main('r');
	       main("hello java");
	   }

	   public static void main(int i){
	       System.out.println("Overloaded main()"+i);
	   }

	   public static void main(char i){
	       System.out.println("Overloaded main()"+i);
	   }

	   public static void main(String str){
	       System.out.println("Overloaded main()"+str);
	   }
	}
