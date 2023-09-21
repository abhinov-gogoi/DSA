package Practice.CodingNinjas.Basic.Arrays;

import java.util.Arrays;

/**
 * https://www.codingninjas.com/studio/problems/second-largest-element-in-the-array_873375?leftPanelTab=0
 */
public class SecondLargestElement {
    public static void main(String[] args) {
        System.out.println(findSecondLargest(5, new int[]{1, 2, 3, 4, 5, -20}));
        System.out.println(findSecondLargest(5, new int[]{10, 25, -12, -6, 20, 20}));
        System.out.println(findSecondLargest(5, new int[]{-10, -40, -25, -12, -25, -10}));
        System.out.println(findSecondLargest(5, new int[]{9, 9, 9, 9, 9, 9}));
        System.out.println(findSecondLargest(5, new int[]{-3, -3, -3, -3}));
    }

    /**
     * This is optimised solution involving  only 1 single pass.
     * But we have to return -1 if there is no second-largest number,
     * this is not possible here if array contains -ve nos;
     */
    public static int findSecondLargestOptimised(int n, int[] arr) {
        // Write your code here.
        int largestNum = arr[0];
        int secondLargestNum = -1;

        for (int currentNumber : arr) {
            if (currentNumber > largestNum) {
                // update the values
                secondLargestNum = largestNum;
                largestNum = currentNumber;
            } else if (currentNumber < largestNum && currentNumber > secondLargestNum) {
                secondLargestNum = currentNumber;
            }
        }
        return secondLargestNum;
    }

    public static int findSecondLargest(int n, int[] arr) {
        Arrays.sort(arr);
        int largestNum = arr[arr.length-1];
        int secondLargestNum = -1;

        for(int i=arr.length-1; i>=0; i--) {
            int currentNumber = arr[i];
            if(currentNumber!=largestNum) {
                secondLargestNum= arr[i];
                break;
            }
        }
        return secondLargestNum;
    }
}
