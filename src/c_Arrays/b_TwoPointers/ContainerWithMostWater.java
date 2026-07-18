package c_Arrays.b_TwoPointers;

/*
    LeetCode: 11. Container With Most Water
    Difficulty: Medium
    TC: O(N) | SC: O(1)
    Approach : TwoPointers - opposite ends
*/

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        if (height.length == 0)
            return 0;

        int left = 0;
        int right = height.length - 1;

        int max = 0;

        while (left < right) {

            int area = Math.min(height[left], height[right]) * (right - left);

            max = Math.max(max, area);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return max;

    }

    public static void main(String[] args) {

        int[] nums = {1,8,6,2,5,4,8,3,7};

        int result = maxArea(nums);

        System.out.println(result);
    }
}
