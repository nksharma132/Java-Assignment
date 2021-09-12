/**
 * Question: 17. Write a program to demonstrate static members.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

class BaseClass {
    static void staticMethod() {
	System.out.println("Inside static method.");
    }
}

class StaticConcept{

    public static void main() {
	
	staticMethod();		// static method invoked without object
    }
}