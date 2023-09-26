package Practice.CodingNinjas.Basic.MultiDimArrays;

import java.util.Arrays;

/**
 * https://www.codingninjas.com/studio/problems/set-matrix-zeros_3846774
 * https://www.youtube.com/watch?v=hnN_B7i6myA
 * <p>
 * https://www.interviewbit.com/problems/set-matrix-zeros/
 */
public class SetMatrixZeros {

    private static final int[][] MATRIX = {
            {7, 19, 3},
            {4, 21, 0}
    };

    public static void main(String[] args) {
        setZeros(MATRIX);
        System.out.println(Arrays.deepToString(MATRIX));
    }

    public static void setZeros(int[][] matrix) {
        // Storing dimensions of matrix in n and m.
        int n = matrix.length;
        int m = matrix[0].length;

        // create a new matrix of same size
        boolean[][] boolMatrix = new boolean[n][m];

        // Traversing the original matrix.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If that element of the matrix is equal to 0.
                if (matrix[i][j] == 0) {
                    // Traversing its complete column and setting all the isZero values to be true.
                    for (int k = 0; k < n; k++) {
                        boolMatrix[k][j] = true;
                    }

                    // Traversing its complete row and setting all the isZero values to be true.
                    for (int k = 0; k < m; k++) {
                        boolMatrix[i][k] = true;
                    }
                }
            }
        }

        // Traversing boolMatrix and if isZero at an index is true then we replace that
        // element with zero in original matrix.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (boolMatrix[i][j] == true) {
                    matrix[i][j] = 0;
                }
            }
        }

    }


}
