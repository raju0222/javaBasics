package com.learn.exception;

/* Creating custom exception is very easy by using the Exception class which is a sub class of Throwable. 
 * we need to provide the constructor of the custom exception class with super keyword like below. 
 * 
 * USing Exception class we can create Checked exception or compile time exception .
 * USing RuntimeException class we can create unchecked or runtime exception. 
 * The exception need to handle based on their type . 
 * If it is Checked exception : 
 * 			we need to call them from the user class using the keyword "throw".
 * 			And the throw need to handle the exception by using try-catch or throws exception on method level.
 * 
 * If it is Unchecked Exception : 
 * 			At runtime it will call and throw the exception , so we need to handle the exception at runtime by
 * 			either try-catch or throws exception.
 * */

/*class ValidNameException extends RuntimeException{
	ValidNameException(String s){
		super(s);
	}
}
public class CustomException {

	public static void main(String[] args) {
		
		String s = "";
		if(s == "") { 
			throw new ValidNameException(" InValid Name is entered");
		}
		System.out.println("After exception :)");
	}

}*/
class ValidNameException extends Exception{
	ValidNameException(String s){
		super(s);
	}
}
public class CustomException {

	public static void main(String[] args)  {
		try {
		String s = "";
		if(s == "") { 
			throw new ValidNameException(" InValid Name is entered");
		}
		System.out.println("After exception :)");
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
}
