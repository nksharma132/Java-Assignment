/**
 * Question: 5. Write a program to enter a number from command line
 * argument and check whether the given number is Armstrong or not.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

public class CommandLineArmstrongNumber {

    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int temp = num, rem, sum = 0;

        while (temp > 0)
        {
            rem = temp % 10;
            sum = sum + rem*rem*rem;
            temp /= 10;
        }
        if (sum == num)
            System.out.println(num +" is an Armstrong Number.");
        else
            System.out.println(num + " is not an Armstrong Number.");
    }
}