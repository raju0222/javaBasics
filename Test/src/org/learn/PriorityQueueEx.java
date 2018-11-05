package org.learn;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>(5);
		pq.add(100);
		pq.add(28);
		pq.add(49);
		pq.add(12);
		pq.add(0);

		Iterator<Integer> i = pq.iterator();
		while(i.hasNext()) {
			//System.out.println("i hashcode:"+pq.hashCode() + "i value : "+i);
			System.out.println(i.next());
		}
		
		System.out.println("Priority queue elements : "+pq);
//System.out.println(pq.poll());
//pq.remove();

	Iterator i2 = pq.iterator();
	while(i2.hasNext()) {
		System.out.println("i hashcode:"+pq.hashCode() + "i value : "+i);
		//System.out.println(i2.next());
		i2.next();
	}
	}

}
