package Practice.Leetcode.Easy;

/**
 * 1480. Running Sum of 1d Array
 */
public class E1480_RunningSumOf_1D_Array {
    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
            arr[i] = sum;
        }
        return arr;
    };
}

