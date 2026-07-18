package c_Arrays.c_SlidingWindow;

/*
    LeetCode: 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
    Difficulty: Medium
    TC: O(N) | SC: O(1)
    Approach : Sliding Window - Fixed Size
*/

public class AvgGreaterThanThreshold {

    public static int numOfSubarrays(int[] arr, int k, int threshold) {

        double sum = 0, count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum / k >= threshold)
            count++;

        for (int i = k; i < arr.length; i++) {

            sum -= arr[i - k];
            sum += arr[i];

            if (sum / k >= threshold)
                count++;
        }

        return (int) count;

    }

    public static void main(String[] args) {

        int[] nums =  {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;

        int result = numOfSubarrays(nums, k, threshold);
        System.out.println(result);

    }
}
