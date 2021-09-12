/**
 * Question: 7. Write a program to enter five strings from command
 * 		line argument and print the string.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

public class CommandLineString {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }
}