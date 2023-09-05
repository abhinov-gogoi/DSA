package Practice.CodingNinjas.Day2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.codingninjas.com/studio/problems/first-missing-positive_699946
 */
public class FirstMissingPositive {

    /**
     Sample Input 1 :
     2
     5
     3 2 -6 1 0
     5
     0 1 2 3 4

     * Sample Output 1:
     * 4
     * 5
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
            System.out.println(firstMissing(array, array.length));
        }
    }

    public static int firstMissing(int[] array, int length) {
        HashMap<Integer, Integer> mapOfIndexes = new HashMap<>(length * 2);
        for (int index : array) {
            mapOfIndexes.put(index, index);
        }

        int currentPositiveNumberInCheck = 1;
        // looping all positive numbers from +1 to +infinity
        while(true) {
            Integer i = mapOfIndexes.get(currentPositiveNumberInCheck);
            if(i==null) {
                // current Positive Number Not Found;
                return currentPositiveNumberInCheck;
            }
            currentPositiveNumberInCheck++;
        }
    }




}
