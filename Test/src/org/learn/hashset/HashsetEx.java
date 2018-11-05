package org.learn.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {

	public static void main(String[] args) {
		Employee e1= new Employee();
		Employee e2= new Employee();
		
		e1.setId(1);
		e1.setName("raju");
		e2.setId(1);
		e2.setName("raju");
		
		HashSet<Employee> hs= new HashSet<Employee>();
		hs.add(e1);
		hs.add(e2);
		// Hashset wont allow the duplicates.
		// So the above employee class has the same values in each object but the hashing technique provides different 
		// hashcode for the above objects so it treat as the different values and it will place in the Hashset.
		/* 
		 * OUTPUT : 
			false
			366712642 --- 1829164700
			2
			org.learn.hashset.Employee@15db9742
			org.learn.hashset.Employee@6d06d69c
			
		*/
		System.out.println(e1==e2);
		System.out.println(e1.hashCode() + " --- "+e2.hashCode());
		
		System.out.println(hs.size());
		
		Iterator<Employee> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}

