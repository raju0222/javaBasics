package org.learn.hashset;

import java.util.HashSet;

public class HashTest {
    
    private String str;
    
    public HashTest(String str) {
        this.str = str;
    }
        
    @Override
    public int hashCode() {             
        return this.str.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) { 
        return this.str.equals(obj);
    }
    
    public static void main(String args[]) {
        HashTest h1 = new HashTest("1");
        HashTest h2 = new HashTest("1");
        String s1 = new String("2");
        String s2 = new String("2");
        String s3 = "2";  
        
        HashSet<Object> hs = new HashSet<Object>();
        hs.add(h1);
        hs.add(h2);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        
        //System.out.println(s1==s2);
        System.out.println(s1.hashCode() + " " +s2.hashCode() +s3.hashCode());
        
        System.out.print(hs.size() + "  "+hs);
    }
}