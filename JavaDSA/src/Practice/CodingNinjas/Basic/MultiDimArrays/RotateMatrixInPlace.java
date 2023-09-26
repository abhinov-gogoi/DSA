package Practice.CodingNinjas.Basic.MultiDimArrays;

import java.util.Arrays;

/**
 * https://www.codingninjas.com/studio/problems/inplace-rotate-matrix-90-degree_839734
 */
public class RotateMatrixInPlace {

    private static final int[][] MATRIX_1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };


    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(inplaceRotate(MATRIX_1)));
        inplaceRotate(MATRIX_1, 3);
        System.out.println(Arrays.deepToString(MATRIX_1));
    }


    public static void inplaceRotate(int[][] arr, int n) {
        int row = arr.length;
        int col = arr[0].length;
        // transpose matrix
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // swap rows
        for(int i=0;i<row/2;i++){
            for(int j=0;j<col;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[row-1-i][j];
                arr[row-1-i][j] = temp;
            }
        }
    }

    /**
     * Solution is NOT In-Place
     */
    public static int[][] inplaceRotate(int[][] matrix) {
        matrix = transposeMatrix(matrix);
        matrix = swapRowsInMatrix(matrix);
        return matrix;
    }

    private static int[][] swapRowsInMatrix(int[][] matrix) {
        int[][] swapped = new int[matrix.length][matrix.length];
        for(int i=0; i<matrix.length; i++) {
            swapped[i] = matrix[matrix.length-1-i];
        }
        return swapped;
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // swap positions
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
}
