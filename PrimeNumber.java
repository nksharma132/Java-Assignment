/**
 * Question: 6. Write a program to generate the list of prime
 * 		number between 100 and 1000.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

public class PrimeNumber {

    static boolean primeOrNot(int Num)
    {
        for (int i = 2; i <= Num/2; i++)
        {
            if (Num%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 100;
        while (num <= 1000)
        {
            boolean result = PrimeNumber.primeOrNot(num);
            if (result)
                System.out.print(num + " ");
            num++;
        }
    }
}