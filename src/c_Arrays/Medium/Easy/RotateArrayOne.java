package c_Arrays.Medium.Easy;
import java.util.Arrays;

//  TC: O(n) | SC: O(1)

public class RotateArrayOne {
    public static void rotateArrayByOne(int[] nums) {
        int num = nums[0];
        for(int i=0; i<nums.length-1;i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = num;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        rotateArrayByOne(nums);
        System.out.println(Arrays.toString(nums));
    }
}
