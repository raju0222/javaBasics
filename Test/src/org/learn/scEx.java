package org.learn;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class scEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter number of rows"); 
			int rows = sc.nextInt();
	        int sum=0;
	        int count = 0;
	        
	        int[][] data = new int[rows][2]; 
			System.out.println("Please enter array elements row by row"); 
	        for (int i = 0; i < rows; i++) { 
				for (int j = 0; j < 2; j++) { 
	                int value = sc.nextInt();
	                data[i][j] = value;
	            } 
	        } 
	        sc.close();       
	        if(data.length >0){
	            for (int i=0;i<rows;i++){
	                sum= data[i][0]+data[i][1];
	                System.out.println(sum);
	                if(sum%2 == 0 ){
	                    count++;
	                }
	            }
	        }
	        System.out.println("The no of coordinates in diagonal position is : "+count);
	}
}