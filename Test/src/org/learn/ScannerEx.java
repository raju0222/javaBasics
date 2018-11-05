package org.learn;

import java.util.Scanner;

public class ScannerEx {

	/*
	 ** Scanner is used to get the inputs for the standalone program.
	scannerObj.next(); // checks the string untill the space.
	scannerObj.nextInt()// checks int 
	scannerObj.nextDouble()// double nextLong for the long inputs
	To get the string with spaces use next.nextLine()
	
	*/
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String s2 = scan.next();
		s2+=scan.nextLine();
		
		String s3 = scan.next();
		s3+=scan.nextLine();
		int cordinatesArray[]  ;
		scan.close();
		System.out.println("String s : "+s2);
		System.out.println("String s : "+s3);

		/*int i = scan.nextInt();
        double d = scan.nextDouble();
        String  s= scan.nextLine();
        s += scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
		 */
   }
}
