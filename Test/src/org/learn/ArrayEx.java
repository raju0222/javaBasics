package org.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//  Collection is a base interface for most collection classes,
//  whereas Collections is a utility class.
public class ArrayEx {

	public static void main(String[] args) {
		
		int[] a = new int[3];
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		
		System.out.println(Arrays.toString(a));
		
		LinkedList l1= new LinkedList();
		l1.add(10);
		ArrayList a1 = new ArrayList();
		a1.add(11);
		a1.add(12);
		a1.add(13);
		a1.add(2);
		a1.add(5);
		
		Map m1 = new HashMap();
		m1.put(1, 1);
		System.out.println(m1.get(1));
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
		
		Collections.reverseOrder();
		
	}

}
