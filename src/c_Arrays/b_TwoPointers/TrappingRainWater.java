package c_Arrays.b_TwoPointers;
import java.util.Arrays;

/*
    LeetCode: 42. Trapping Rain Water
    Difficulty: Hard
    TC: O(N) | SC: O(1)
    Approach : TwoPointers - opposite ends
*/


public class TrappingRainWater {

    public static int trap(int[] height) {

        int water = 0;

        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];

        while (left < right) {

            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
            }
        }

        return water;
    }

    public static void main(String[] args) {

        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(Arrays.toString(nums));

        int result = trap(nums);
        System.out.println(result);
    }

}
