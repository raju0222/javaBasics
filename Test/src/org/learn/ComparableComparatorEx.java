package org.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*  Sorting can be done to both primitive types and objects .
 * 	Arrays.sort() methods and sollcetions.sort() method can do the sorting without any implementation.
 *  while to sort the array of objects we need to implement comparable or comparator.
 *  
 *  */

/*  To summarize, if sorting of objects needs to be based on natural order then use Comparable 
 *  whereas if you sorting needs to be done on attributes of different objects, then use Comparator in Java.*/

/*  In real life scenarios, we want sorting based on different parameters.
 *  For example, as a CEO, I would like to sort the employees based on Salary, an HR would like to sort them based on the age.
 *  This is the situation where we need to use Java Comparator interface because Comparable.compareTo(Object o) method implementation 
 *  can sort based on one field only and we can’t chose the field on which we want to sort the Object. Where the comparator interface 
 *  uses compare method to compare two or more fields of the object at a time. like we can compare the salary with age of an employee in one method.
*/

/*
 *  comparable and comparator both are use for sorting the collection of objects.
   
    Comparable : 
	A comparable object is capable of comparing itself with another object. 
	The class itself must implements the java.lang.Comparable interface in order to be able to compare its instances.

	Comparator
	A comparator object is capable of comparing two different objects. 
	The class is not comparing its instances, but some other class’s instances. This comparator class must implement the java.util.Comparator interface.
	
 *  
 *  */ 


class nameCompare implements Comparable<nameCompare>{

	private double  rating;
	private String movieName;
	private int year;
	
	nameCompare(String mn,double r, int y){
		this.year=y;
		this.movieName=mn;
		this.rating=r;
		
	}
	public double getRating()    { return rating; 		}
	public String getMovieName() {  return movieName; 	}
	public int getYear()         {  return year;  		}
	
	public int compareTo(nameCompare nc) {
		
		return this.getMovieName().compareTo(nc.getMovieName());
		//return this.year-nc.year;
	}
	
}

class nameComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class ComparableComparatorEx {

	public static void main(String[] args) {
		nameCompare m1= new nameCompare("Force Awakens", 8.3, 2015);
		nameCompare m2= new nameCompare("Star Wars", 8.7, 1977);
		nameCompare m3= new nameCompare("Empire Strikes Back", 8.8, 1980);
		nameCompare m4= new nameCompare("Return of the Jedi", 8.4, 1983);
		
		ArrayList<nameCompare> list = new ArrayList<nameCompare>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        System.out.println("Movies before sorting : ");
        for (nameCompare movie: list)
        {
            System.out.println(movie.getMovieName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
        Collections.sort(list);
        
        System.out.println("Movies after sorting : ");
        for (nameCompare movie: list)
        {
            System.out.println(movie.getMovieName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
	}
	
}
