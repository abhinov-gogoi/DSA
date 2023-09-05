package Practice.CodingNinjas.Day2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.codingninjas.com/studio/problems/equilibrium-index_893014
 */
public class EquilibriumIndex {


    /**
     * Sample Input
     2
     10
     0 0 0 0 0 0 0 0 0 0
     6
     1 7 3 6 5 6

     * Sample Output
     * 0
     * 3

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take input for no of test cases
        int noOfTestCases = scanner.nextInt();

        while (noOfTestCases-- > 0) {
            // take input for size of Array
            int size = scanner.nextInt();

            // init an empty array
            int[] array = new int[size];

            // populate the array
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(arrayEquilibriumIndex(array));
        }
    }

    /**
     * Use optimised approach (Prefix sum array logic)
     * Save the sums upto the indexes in another array
     * https://www.enjoyalgorithms.com/blog/find-equilibrium-index-of-an-array
     *
     */
    public static int arrayEquilibriumIndex(int[] array) {
        // create a new array to store the sums
        int[] prefixSumsArray = new int[array.length];
        int sum = 0;
        // populate the prefix sum array
        for(int i=0; i<array.length; i++) {
            sum = sum + array[i];
            prefixSumsArray[i] = sum;
        }
        // System.out.println(Arrays.toString(prefixSumsArray));

        int eqIndex = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int sumOfLeftElements = prefixSumsArray[i]-array[i];
            int sumOfRightElements = prefixSumsArray[prefixSumsArray.length-1] - prefixSumsArray[i];
            if (sumOfRightElements == sumOfLeftElements) {
                eqIndex = i;
                break;
            }
        }
        return eqIndex;
    }

    /**
     * Gives TLE Error due to 2 loops
     */
    public static int arrayEquilibriumIndexBrute(int[] array) {
        int eqIndex = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int sumOfLeftElements = calcSumOfLeftElements(i, array);
            int sumOfRightElements = calcSumOfRightElements(i, array);
            if (sumOfRightElements == sumOfLeftElements) {
                eqIndex = i;
                break;
            }
        }
        return eqIndex;
    }

    private static int calcSumOfRightElements(int startIndex, int[] array) {
        int sum = 0;
        for (int i = startIndex + 1; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    private static int calcSumOfLeftElements(int endIndex, int[] array) {
        int sum = 0;
        for (int i = 0; i < endIndex; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
