package Topics.Recursion;

/**
 * Problem Statement - Write a program to print the fibonacci series (using iteration)
 * Sample Input - (no sample input)
 * Sample Output - 0, 1, 1, 2, 3, 5, 8, 13 ... and so on
 */
public class FibonacciIteration {
    public static void main(String[] args) {
        printFibonacci(50);
    }

    private static void printFibonacci(long count) {

        long firstNumber = 0;
        long secondNumber = 1;

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        while (count-- > 0) {
            long thirdNumber = firstNumber + secondNumber;
            System.out.println(thirdNumber);

            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
    }
}
