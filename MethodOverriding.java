/**
 * Question: 14. Write a program to explain method overriding.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

class BaseClass {
    void location() {
	System.out.println("Currently in Base Blass.");
    }
}

class DerivedClass extends BaseClass {
    void location() {
	// This method will override the base class method.
	System.out.println("Currently in Derived Class.");
    }
}

class MethodOverriding {

    public static void main(String []args) {
	
	DerivedClass obj = new DerivedClass();	// object of Derived class
	obj.location();			// invoke the derived class method
    }
}