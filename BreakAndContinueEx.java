/**
 * Question: 11. Write a program to explain the difference
 *		 between break and continue.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

class BreakAndContinueEx {
    
    public static void main(String[] args) {

	// Example of break keyword
	System.out.println("Loop will execute from 1 to 4");
        for (int i = 1; i <= 10; i++) {
	    if (i == 5)
		break;
	    System.out.print(i + " ");
	}
	System.out.println("\nOut of Loop due to \'break\' keyword\n");

	// Example of continue keyword
	// output: 1 3 4 5 6 7 8 9 10
	System.out.println("Loop will execute from 1 to 10 except for 5");
	for (int i = 1; i <= 10; i++) {
	    if (i == 5)
		continue;
	    System.out.print(i + " ");
	}
    }
}