/**
 * Question: 8. Write a program to check whether a given string is
 * 		palindrome or not.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

public class StringPalindrome {

    public static void main(String[] args) {

        String strings = "HoobdbooH";
        int len = strings.length();
        boolean flag = true;
        for (int i = 0; i < len/2; i++)
        {
            if (strings.charAt(i) != strings.charAt(len-1-i))
            {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(strings + " is a string palindrome.");
        else
            System.out.println(strings + " is not a string palindrome.");
    }
}