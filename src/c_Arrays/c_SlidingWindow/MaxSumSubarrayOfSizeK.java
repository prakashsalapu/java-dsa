package c_Arrays.c_SlidingWindow;

/*
    GFG: Max Sum Subarray of size K
    Difficulty: Easy
    TC: O(N) | SC: O(1)
    Approach : Sliding Window - Fixed Size
*/

public class MaxSumSubarrayOfSizeK {
    public static int maxSubarraySum(int[] arr, int k) {

        int sum = 0;

        for(int i=0; i<k; i++){
            sum += arr[i];
        }

        int max = sum;

        for(int i=k; i<arr.length; i++){

            sum -= arr[i-k];
            sum += arr[i];

            max = Math.max(max,sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;

        int result = maxSubarraySum(nums,k);

        System.out.println(result);
    }
}
