/**
 * Question: 16. Write a program to demonstrate type casting.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

import java.util.Scanner;

class TypeCasting{

    public static void main(String []args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an integer value: ");
	float fl = sc.nextFloat();
	int in = (char) fl;
	System.out.println("Integer value of the given float number : "+in);
    }
}