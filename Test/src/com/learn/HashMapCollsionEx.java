package com.learn;

import java.util.HashMap;
import java.util.Iterator;

/* 
 * The hashmap collision will happen when the same hashcode is available for two or more keys.
 * The limit of the hashmap collision is not defined , so we can add n number of fields but the performance will decrease.
 * The hashmap internal uses linked list to handle the collision , the linked list doesn't have the default initial value.
 * So u can add n no of values . 
 * If any error comes in that operation that operation is the unsupportedexception OR classcastEception OR NullpointerException but not the limit related exception.
 * 
 * public class UnsupportedOperationException extends RuntimeException {}
 *  
 * */


public class HashMapCollsionEx {
	public String name;
	public int id;
	
	public HashMapCollsionEx(String name, int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public int hashCode() {
		System.out.println("in my code");
		return 1;
	}
	
	public static void main(String[] args) {
		
		HashMapCollsionEx hx = new HashMapCollsionEx("name",1);
		HashMapCollsionEx hx2 = new HashMapCollsionEx("name2",2);
		System.out.println("hx1:"+hx.hashCode());
		System.out.println("hx2:"+hx2.hashCode());
		
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	for(int i=0;i<10;i++) {
			hm.put(i, i);
		}
	System.out.println("Hm size : "+hm.size());

	/*HashMap<String,String> hm2 = new HashMap<String,String>();
	for(int i=0;i<2;i++) {
		hm2.put("Aa", "Aa");
		hm2.put("BB","BB");
			//System.out.println(hm2.entrySet().iterator());
		
		Iterator it = hm2.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.hashCode());
			System.out.println(it.next());
		}
		
			hm2.remove("Aa");
		}
		System.out.println("Hm2 size : "+hm2.size());*/
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
