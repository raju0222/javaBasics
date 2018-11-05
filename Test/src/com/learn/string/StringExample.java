package com.learn.string;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		String s = "raju";
		String s1 = "raju";
		String s2 = new String("raju");
		String s3 = new String("raju");
		String reverse ="";
		char ch[] = new char[5];
		System.out.println(s==s1);
		System.out.println(s2==s3);
		System.out.println(s.equals(s1));
		System.out.println(s2.equals(s3));
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse+ s.charAt(i);
		}
		for(int i=s.length()-1;i>=0;i--) {
		  ch[i] = s.charAt(i);
		}
		System.out.println("reverse : "+reverse + "char string : " + ch.toString()+Arrays.toString(ch));
		
		StringBuilder  sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sbr = new StringBuffer();
		sbr.append(s);
		System.out.println(sbr);

	}

}
