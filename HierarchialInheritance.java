/**
 * Question: 18. Write a program to demonstrate hierarchial inheritance.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

import java.util.Scanner;
class BaseClass {
    void message() {
	System.out.println("You are in Base Class");
    }
}

class DerivedClassA extends BaseClass {
    void messageA() {
	System.out.println("You are in Derived Class A");
    }
}

class DerivedClassB extends BaseClass {
    void messageB() {
	System.out.println("You are in Derived Class B");
    }
}

class HierarchialInheritance {

    public static void main(String []args) {
	
	DerivedClassA objA = new DerivedClassA();
	objA.message();		// invoke BaseClass method
	objA.messageA();	// invoke DerivedClassA method
	DerivedClassB objB = new DerivedClassB();
	objB.message();		// invode BaseClass method
	objB.messageB();	// invoke DerivedClassB method
    }
}