/**
 * Question: 12. Write a program to calculate the area and circumference
 *		 of a circle through object and parameterized method.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

import java.util.Scanner;

class AreaCircumOfCircle {

    void areaOfCircle(float r) {
	System.out.println("Area of circle = "+ 3.141*r*r);
    }
    void circumOfCircle(float r) {
	System.out.println("Circumference of circle = "+ 2*3.141*r);
    }
    
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter the radius of circle: ");
	float radius = input.nextFloat();
	AreaCircumOfCircle obj = new AreaCircumOfCircle();
	obj.areaOfCircle(radius);
	obj.circumOfCircle(radius);
    }
}