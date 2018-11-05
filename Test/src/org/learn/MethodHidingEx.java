
// Method hiding is a concept where the methods are going to hide while trying to do override, if the methods are static
/* if foo method is static then o/p will be like :
Animal
Animal
cat
Animal
*/
// static method cannot hide the instance method from Animal. Error is coming while static is available in subclass.

// if not then the o/p is : 
/*Animal
cat
cat
Exception in thread "main" java.lang.NullPointerException
	at org.learn.MethodHidingEx.main(MethodHidingEx.java:34)*/
package org.learn;
class Animal{
	 void foo() {
		System.out.println("Animal");
	}
}
class Cat extends Animal{
	 void foo() {
		System.out.println("cat");
	}
}
public class MethodHidingEx {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Cat();
		Cat c= new Cat();
		Animal d= null;
		a.foo();
		b.foo();
		c.foo();
		d.foo();
	}
}
