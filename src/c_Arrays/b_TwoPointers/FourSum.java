package c_Arrays.b_TwoPointers;
import java.util.*;

/*
    LeetCode: 18. 4Sum
    Difficulty: Medium
    TC: O(N^3) | SC: O(K)
    Approach : Sort → Fix First → Fix Second → Two Pointers → Skip Duplicates
*/


public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {

            // skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {

                // skip duplicate first elements
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {

                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // skip duplicate numbers
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;

    }

    public static void main(String[] args) {

        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(Arrays.toString(nums));

        List<List<Integer>> result = fourSum(nums,0);
        System.out.println(result.toString());




    }
}
