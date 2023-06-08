package Topics.Recursion;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Problem Statement - Write a program to print the Nth number in the Fibonacci series, (using iteration)
 * Sample Input - 7
 * Sample Output - 13
 * Sample Explanation - 13 is the 7th number in the fibonacci series starting count from 0
 */
public class NthFibonacciIteration {

    // driver code
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter a number : ");
            Scanner scanner = new Scanner(System.in);
            int N = 0;
            try {
                N = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a number");
            }
            if (N < 0) {
                System.out.println("Please enter a positive number");
                continue;
            }
            System.out.println(fibonacci(N));
        }
    }

    private static BigInteger fibonacci(int n) {
        if (n < 2) {
            return BigInteger.valueOf(n);
        }

        BigInteger firstNumber = BigInteger.valueOf(0);
        BigInteger secondNumber = BigInteger.valueOf(1);
        BigInteger thirdNumber = BigInteger.valueOf(0);

        while (--n > 0) {
            // reassign the values
            thirdNumber = firstNumber.add(secondNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

        return thirdNumber;
    }


}
