package org.learn;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		char[] ch = {'a','e','i','o','u','A','E','I','O','U'};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your char to check as vowel.");
		String ip=sc.next();
		char input=ip.charAt(0);
		boolean isVowel= false;
		//System.out.println("input: "+input );
		if(ch.length>0){
			for(int i=0;i<ch.length;i++) {
				if(input==ch[i]) {
					//System.out.println("Yes");
					isVowel=true;
					//return;						
				}
			}
		}
		//System.out.println("isVowel"+isVowel);
		if(isVowel) {
			System.out.println(input + " is Vowel");	
		}else {
			System.out.println(input + " is not Vowel");
		}
	}

}


