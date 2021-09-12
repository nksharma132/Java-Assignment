/**
 * Question: 2. Write a program to find the greatest and smallest among
 *		a. Three numbers
 *		b. Four numbers
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

import java.util.Scanner;

public class GreatestAndSmallestAmongFour {

    void greatestAndSmallest(int num1, int num2, int num3, int num4)
    {
        int greatest = num1, smallest = num1;

        if (greatest < num2)
        {
            greatest = num2;
            if (greatest < num3)
            {
                greatest = num3;
                if (greatest < num4)
                    greatest = num4;
            }
            else if (greatest < num4)
                greatest = num4;
        }
        else if (greatest < num3){
            greatest = num3;
            if (greatest < num4)
                greatest = num4;
        }
        else if (greatest < num4)
            greatest = num4;

        // smallest searching code
        if (smallest > num2)
        {
            smallest = num2;
            if (smallest > num3)
            {
                smallest = num3;
                if (smallest > num4)
                    smallest = num4;
            }
            else if (smallest > num4)
                smallest = num4;
        }
        else if (smallest > num3)
        {
            smallest = num3;
            if (smallest > num4)
                smallest = num4;
        }
        else if (smallest > num4)
	{
            smallest = num4;
	}
	System.out.println("Greatest = "+ greatest+ " and Smallest = "+smallest);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        GreatestAndSmallestAmongFour obj= new GreatestAndSmallestAmongFour();
        boolean flag = true;
        while (flag)
        {
            System.out.println("Enter four number: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int num4 = input.nextInt();
            obj.greatestAndSmallest(num1,num2,num3,num4);
            System.out.println("Do you want to continue(true/false)??");
            flag = input.nextBoolean();
        }
    }
}