package com.learn;

import java.util.ArrayList;
import java.util.HashMap;

public class MovingTotal {
    /**
     * Adds/appends list of integers at the end of internal list.
     */
	static HashMap<Integer,int[]> hm = new HashMap<Integer,int[]>();
	static ArrayList<Integer> arraylist = new ArrayList<Integer>();
	
    public void append(int[] list) {
    	System.out.println(list);
    	int total = 0;
    	if(arraylist.isEmpty())
    		
    	for(int i=0;i<list.length;i++) {
    		arraylist.add(i);
    		total = total+list[i];
    		hm.put(total, list);
    		System.out.println(hm);
    	}else {
    		arraylist.add(list[0]);
    		int arraylistSize = arraylist.size();
    		total=total+arraylist.get(arraylistSize-1)+arraylist.get(arraylistSize-2)+ list[0];
    		hm.put(total, list);
    	}
    	System.out.println(hm);
       // throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    public boolean contains(int total) {
        if(hm.containsKey(total)) {
        	return true;
        }else {
        	return false;
        }
           
    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[] { 1, 2, 3 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));

        movingTotal.append(new int[] { 4 });

        System.out.println(movingTotal.contains(9));
    }
}