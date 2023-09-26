package Practice.CodingNinjas.Basic.MultiDimArrays;

import java.util.ArrayList;

/**
 * https://www.codingninjas.com/studio/problems/array-sum_893287
 */
public class SumOfZeros {

    /**
     * 1 0
     * 0 1
     */
    public static final ArrayList<ArrayList<Integer>> MATRIX_1 = new ArrayList<>() {
        {
            add(new ArrayList<Integer>() {
                {
                    add(1);
                    add(0);
                }
            });
            add(new ArrayList<Integer>() {
                {
                    add(0);
                    add(1);
                }
            });
        }
    };

    public static void main(String[] args) {
        System.out.println(coverageOfMatrix(MATRIX_1));
    }


    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
        int answer = 0;
        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat.get(i).size(); j++) {
                int number = mat.get(i).get(j);
//                System.out.println(number);
                if (number == 0) {
                    answer = answer + getSumOfAdjacentNumbers(i, j, mat);
                }
            }

        }

        return answer;
    }

    /**
     * only get the sum of top, bottom, left, right.
     * DON'T take the cross(sideways) numbers
     */
    private static int getSumOfAdjacentNumbers(int i, int j, ArrayList<ArrayList<Integer>> mat) {
        int sum = 0;
//        top-left
//        try {
//            sum = sum + mat.get(i - 1).get(j - 1);
//        } catch (Exception ignored) {
//        }

        // top-middle
        try {
            sum = sum + mat.get(i - 1).get(j);
        } catch (Exception ignored) {
        }

        // top-right
//        try {
//            sum = sum + mat.get(i - 1).get(j + 1);
//        } catch (Exception ignored) {
//        }

        // centre-left
        try {
            sum = sum + mat.get(i).get(j - 1);
        } catch (Exception ignored) {
        }

        // centre-right
        try {
            sum = sum + mat.get(i).get(j + 1);
        } catch (Exception ignored) {
        }

        // bottom-left
//        try {
//            sum = sum + mat.get(i + 1).get(j - 1);
//        } catch (Exception ignored) {
//        }

        // bottom-middle
        try {
            sum = sum + mat.get(i + 1).get(j);
        } catch (Exception ignored) {
        }

        // bottom-right
//        try {
//            sum = sum + mat.get(i + 1).get(j + 1);
//        } catch (Exception ignored) {
//        }

        return sum;
    }
}
