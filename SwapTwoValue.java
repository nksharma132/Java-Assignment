/**
 * Question: 1. Write a program to swap two values.
 *		a. Using a third variable.
 *		b. Without using a third variable.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

public class SwapTwoValue {

    public static void main(String[] args) {
	int num1, num2, temp;

	System.out.println("Swaping using third variable\n");

	num1 = 3; num2 = 8;
        System.out.println("Number before swapping");
        System.out.println("Num1 = "+ num1);
        System.out.println("Num2 = "+ num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Number after swapping");
        System.out.println("Num1 = "+ num1);
        System.out.println("Num2 = "+ num2);

	System.out.println("\nSwaping without thrid variable\n");

	num1 = 3; num2 = 8;
	System.out.println("Number before swapping");
        System.out.println("Num1 = "+ num1);
        System.out.println("Num2 = "+ num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("Number after swapping");
        System.out.println("Num1 = "+ num1);
        System.out.println("Num2 = "+ num2);
    }
}