package Practice.CodingNinjas.Basic.MultiDimArrays;

import java.util.ArrayList;

/**
 * https://www.codingninjas.com/studio/problems/array-sum_893287
 */
public class SumOfZeros {

    public static final ArrayList<ArrayList<Integer>> MATRIX_1 = new ArrayList<>() {
        {
            add(new ArrayList<Integer>() {
                {
                    add(1); add(0);
                }
            });
            add(new ArrayList<Integer>() {
                {
                    add(0); add(1);
                }
            });
        }
    };

    public static void main(String[] args) {
        System.out.println(coverageOfMatrix(MATRIX_1));
    }


    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

        // Write your code here.
        return 0;
    }
}
