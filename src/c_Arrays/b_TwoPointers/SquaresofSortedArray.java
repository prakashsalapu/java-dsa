package c_Arrays.b_TwoPointers;
import java.util.Arrays;

/*
    LeetCode: 977. Squares of a Sorted Array
    Difficulty: Easy
    TC: O(N) | SC: O(1)
    Approach : TwoPointers - opposite ends
*/

public class SquaresofSortedArray {
    public static int[] sortedSquares(int[] nums) {

        // int[] result = new int[nums.length];
        // int index = 0;

        // for(int num : nums){
        //     result[index++] = num*num;
        // }

        // Arrays.sort(result);

        // return result;

        int[] result = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;

        int index = nums.length - 1;

        while (i <= j) {

            int iSquare = nums[i] * nums[i];
            int jSquare = nums[j] * nums[j];

            if (iSquare > jSquare) {
                result[index--] = iSquare;
                i++;
            } else {
                result[index--] = jSquare;
                j--;
            }

        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(nums));

        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
