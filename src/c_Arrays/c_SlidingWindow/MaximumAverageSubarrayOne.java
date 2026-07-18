package c_Arrays.c_SlidingWindow;

/*
    LeetCode: 643. Maximum Average Subarray I
    Difficulty: Easy
    TC: O(N) | SC: O(1)
    Approach : Sliding Window - Fixed Size
*/

public class MaximumAverageSubarrayOne {

    public static double findMaxAverage(int[] nums, int k) {

        double sum = 0;

        for(int i=0; i<k; i++){
            sum += nums[i];
        }

        double maxAvg = sum / k;

        for(int i=k; i<nums.length; i++){
            sum += nums[i];
            sum -= nums[i-k];

            maxAvg = Math.max(maxAvg, sum / k);
        }

        return maxAvg;
    }

    public static void main(String[] args) {

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        double result = findMaxAverage(nums, k);
        System.out.println(result);

    }
}
