package Practice.CodingNinjas.Day1;

import java.util.Scanner;

/**
 * https://www.codingninjas.com/studio/problems/rotate-array_1230543
 */
public class RotateAnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take input for size of array
        int sizeOfArray = scanner.nextInt();
        // init an array
        int[] array = new int[sizeOfArray];

        // populate the array
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // take input for no of rotations
        int rotations = scanner.nextInt();

        int[] rotatedArray = rotateArray(rotations, array);
        printArray(rotatedArray);

    }

    private static int[] rotateArray(int rotations, int[] array) {
        while (rotations-- > 0) {
            array = rotateOnce(array);
        }
        return array;
    }

    private static int[] rotateOnce(int[] array) {
        int[] rotatedArray = new int[array.length];
        for (int i = 0; i < rotatedArray.length - 1; i++) {
            rotatedArray[i] = array[i + 1];
        }
        rotatedArray[rotatedArray.length - 1] = array[0];
        return rotatedArray;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
