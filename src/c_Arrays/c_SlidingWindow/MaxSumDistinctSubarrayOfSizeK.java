package c_Arrays.c_SlidingWindow;
import java.util.HashMap;

/*
    LeetCode: 2461. Maximum Sum of Distinct Subarrays With Length K
    Difficulty: Medium
    TC: O(N) | SC: O(1)
    Approach : Sliding Window - Fixed Size
*/

public class MaxSumDistinctSubarrayOfSizeK {

    public static long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long max = 0;

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            // Expand the window
            sum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            // Shrink if window size exceeds k
            if (j - i + 1 > k) {

                sum -= nums[i];

                map.put(nums[i], map.get(nums[i]) - 1);

                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }

                i++;
            }

            // Window size is exactly k
            if (j - i + 1 == k && map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1,5,4,2,9,9,9};

        int k = 3;

        long result = maximumSubarraySum(nums,k);

        System.out.println(result);
    }
}
