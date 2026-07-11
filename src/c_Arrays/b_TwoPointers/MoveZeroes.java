package c_Arrays.b_TwoPointers;
import java.util.Arrays;

//  LeetCode : 283. Move Zeroes
//  TC: O(n) | SC: O(1)

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,-1,0,2};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
