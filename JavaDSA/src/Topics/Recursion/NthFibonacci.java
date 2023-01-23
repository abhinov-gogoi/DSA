package Topics.Recursion;

import java.util.Scanner;

/**
 * Problem Statement - Write a program to print the Nth number in the Fibonacci series, (using recusrion)
 * Sample Input - 5
 * Sample Output - 3
 * Sample Explanation - 3 is the 5th number in the fibonacci series
 * Link - https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 */
public class NthFibonacci {

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

    private static int fibonacci(int N) {
        if (N < 2) {
            return N;
        }
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
}
