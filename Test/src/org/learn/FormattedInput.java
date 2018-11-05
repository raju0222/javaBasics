package org.learn;

import java.util.Scanner;

/* 
 * The formatted output can be done using the printf function.
 * for decimal format we can use the decimal format method.
 * DecimalFormat myFormatter = new DecimalFormat(pattern);
 * here pattern is the pattern u want.
 * ex : 
 *    customFormat("###,###.###", 123456.789);
      customFormat("###.##", 123456.789);
      customFormat("000000.000", 123.78);
      
      The output is : 
      	123456.789  ###,###.###  123,456.789
		123456.789  ###.##  123456.79
		123.78  000000.000  000123.780
		
		
 * */
public class FormattedInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
            
        }
        System.out.println("================================");

	}

}
