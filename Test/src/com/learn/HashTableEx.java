package com.learn;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {
public static void main(String a[]) {
	Hashtable ht = new Hashtable();
	
	ht.put(1,1);
	ht.put(2, 2);
	Iterator it = ht.entrySet().iterator();
	while (it.hasNext())
		System.out.println(it.next());
	}
}
