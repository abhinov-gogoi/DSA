package Practice.CodingNinjas.Basic.MultiDimArrays;

/**
 * https://www.codingninjas.com/studio/problems/matrix-is-symmetric_799361
 *
 */
public class MatrixSymmetric {

    public static final int[][] MATRIX_1 = {{1, 2, 3}, {2, 4, 5}, {3, 5, 8}};

    public static void main(String[] args) {
        System.out.println(isMatrixSymmetric(MATRIX_1));
    }

    /**
     *  In a Symmetric matrix the
     *  transpose(changing row to column and column to row)
     *  is equal to original matrix
     */
    public static boolean isMatrixSymmetric(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] != matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }


}
