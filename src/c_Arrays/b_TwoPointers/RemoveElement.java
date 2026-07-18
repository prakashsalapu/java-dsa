package c_Arrays.b_TwoPointers;
import java.util.Arrays;

/*
    LeetCode: 27. Remove Element
    Difficulty: Easy
    TC: O(N) | SC: O(1)
    Approach : Two Pointers
*/

public class RemoveElement {

    public static int removeElements(int[] nums, int target){

        int i = 0;
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != target){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,2,4,5,2};
        System.out.println(Arrays.toString(nums));

        int k = removeElements(nums, 2);

        System.out.print("[ ");
        for(int i = 0; i < k; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.print("]");

    }
}
