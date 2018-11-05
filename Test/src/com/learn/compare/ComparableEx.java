package com.learn.compare;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>{
	private String name;
	private int year;
	
	public Movie(String name,int year){
		this.name=name;
		this.year=year;
	}
	public int getYear() {return year;}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {return name;}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Movie o) {
		//return o.year-this.year;
		return this.year-o.year;
	}
	
}

public class ComparableEx {
	public static void main(String[] args) {
		//List<Movie> a= new LinkedList<Movie>();
		ArrayList<Movie> a= new ArrayList<Movie>();
		a.add(new Movie("Rabasa",5));
		a.add(new Movie("Badsha",8));
		a.add(new Movie("Jai Lava Kusa",9));
		a.add(new Movie("Temper",8));
		a.add(new Movie("Janatha Garage",9));
		
		System.out.println("Movies Before Sorting :");
		for(Movie m:a) {
			System.out.println(m.getName() + " with Rating : "+m.getYear());
		}
		
		Collections.sort(a);
		Collections.reverse(a);
		
		System.out.println("Movies After Sorting :");
		for(Movie m:a) {
			System.out.println(m.getName() + " with Rating : "+m.getYear());
		}
		
	}

}
