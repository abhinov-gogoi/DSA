package Practice.CodingNinjas.Day1;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/non-decreasing-array/
 * https://www.codingninjas.com/studio/problems/non-decreasing-array_699920
 */
public class NonDecreasingArray {

    /**
     * Sample Input
      4
      3
      8 4 6
      3
      8 4 2
      10
      -78 -68 -51 -20 187 -182 42 64 66 93
     10
     -90 -70 -61 -57 -246 -28 1 14 35 63
     * <p>
     * Sample Output
     * true
     * false
     * false
     * true
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

            // is non-decreasing array ?
            boolean isNonDecreasingArray = isPossible(array, size);
            System.out.println(isNonDecreasingArray);
        }
    }

    public static boolean isPossible(int[] array, int size) {
        // compare adjacent elements
        boolean alreadyDecreasedOnce = false;
        for (int i = 0; i < array.length - 1; i++) {
            int firstElement = array[i];
            int secondElement = array[i+1];
            if (firstElement > secondElement) {
                if (!alreadyDecreasedOnce) {
                    if(i==0 || array[i+1] >= array[i-1]) {
                        array[i] = array[i + 1];
                    } else {
                        array[i+1] = array[i];
                    }

                    alreadyDecreasedOnce = true;

                    // go back 2 elements before and check again
                    i=i-2;
                    if(i<0) {
                        i=0;
                    }

                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
