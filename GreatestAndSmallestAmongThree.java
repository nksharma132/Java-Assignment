/**
 * Question: 2. Write a program to find the greatest and smallest among
 *		a. Three numbers
 *		b. Four numbers
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

import java.util.Scanner;
public class GreatestAndSmallestAmongThree
{
    void greatestAndSmallest(int num1, int num2, int num3)
    {
        int greatest = 0, smallest = 0;

        if (num1 > num2 && num1 > num3)
        {
            greatest = num1;
            if (num2 > num3)
                smallest = num3;
            else
                smallest = num2;
        }
        else if (num2 > num1 && num2 > num3)
        {
            greatest = num2;
            if (num1 > num3)
                smallest = num3;
            else
                smallest = num1;
        }
        else if (num3 > num1 && num3 > num2)
        {
            greatest = num3;
            if (num1 > num2)
                smallest = num2;
            else
                smallest = num1;
        }
	if(greatest == 0 && smallest == 0)
	{
	    System.out.println("All are same.");
	}
	else
	{
            System.out.println("Greatest = "+ greatest +" and Smallest = "+ smallest);
	}
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        GreatestAndSmallestAmongThree obj = new GreatestAndSmallestAmongThree();
        boolean flag = true;
        while (flag)
        {
            System.out.println("Enter three number: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            obj.greatestAndSmallest(num1,num2,num3);
            System.out.println("Do you want to continue(true/false)??");
            flag = input.nextBoolean();
        }
    }
}