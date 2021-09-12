/**
 * Question: 4. Write a program to enter a number from command line argument and find the sum of digit of a 
 * 		given number.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

public class CommandLineSum {

    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        while (num > 0)
        {
            sum = sum + (num %  10);
            num /= 10;
        }
        System.out.print("Sum of digits is : "+sum);
    }
}