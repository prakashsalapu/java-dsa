package c_Arrays.b_TwoPointers;
import java.util.Arrays;

/*
    LeetCode: 75. Sort Colors
    Difficulty: Easy
    TC: O(N) | SC: O(1)
    Approach : TwoPointers - opposite ends
*/


public class SortColors {

    public static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high =  nums.length-1;

        while(mid <= high){

            if(nums[mid] == 0){
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
                mid++;
            }

            else if(nums[mid] == 1){
                mid++;
            }

            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }

        }

    }

    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(nums));

        sortColors(nums);
        System.out.println(Arrays.toString(nums));



    }
}
