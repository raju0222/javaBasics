package com.learn.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Sorting {

	public static void main(String[] args) {
		int a[]= {1,2,4,8,9,3};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int ar[] = new int[5]; // arrays should declare and instantiate
		ar[0]=1;
		ar[1]=2;
		ar[2]=7;
		ar[3]=9;
		ar[4]=0;
		Arrays.sort(ar);
		
		
		
		System.out.println(Arrays.toString(ar));
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(0);
		al.add(4);
		al.add(9);

		Collections.sort(al);
		Collections.reverse(al);
		
		System.out.println(al);
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(2);
		v.addAll(al);
		System.out.println(v);
		
		
		
		
	
	}
}
