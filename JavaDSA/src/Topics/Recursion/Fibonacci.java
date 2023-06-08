package Topics.Recursion;

/**
 * Problem Statement - Write a program to print the fibonacci series (using recusrion)
 * Sample Input - (no sample input)
 * Sample Output - 0, 1, 1, 2, 3, 5, 8, 13 ... and so on
 */
public class Fibonacci {
    private static int COUNT = 20;

    public static void main(String[] args) {
        while (COUNT-- > 0) {
            printFibonacciNumbers(0, 1);
        }
    }

    private static void printFibonacciNumbers(long firstNumber, long secondNumber) {
        long thirdNumber = firstNumber + secondNumber;
        System.out.println(thirdNumber);
        printFibonacciNumbers(secondNumber, thirdNumber);
    }


}
