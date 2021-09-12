/**
 * Question: 3. Write a program to read a given number and
 * 		print it digit as a series of word. Ex. 523 Five Two Three.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

import java.util.Scanner;

class PrintingDigitInWord
{
    String[] numberName= {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    void printDigitInWord(int Num)
    {
        int rem = Num % 10;

        if (Num == 0)
            return;
        else
        {
            Num /= 10;
            printDigitInWord(Num);
            System.out.print(numberName[rem]+ " ");
        }
    }
}

public class DigitToWord {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter any number: ");
        int num = input.nextInt();
        PrintingDigitInWord printDigitInWord = new PrintingDigitInWord();
        printDigitInWord.printDigitInWord(num);
    }
}