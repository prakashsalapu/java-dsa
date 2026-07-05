package c_Arrays.Medium.Easy;

//  LeetCode: 26. Remove Duplicates from Sorted Array
//  TC: O(n) | SC: O(1)

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){

        int i = 0;
        for(int j =1;j<nums.length; j++){
           if(nums[i]!=nums[j]) {
               nums[i + 1] = nums[j];
               i++;
           }
        }
        return i+1;


    }
    public static void main(String[] args) {
        int[] nums = {-2, 2, 4, 4, 4, 4, 5, 5};
        int result = removeDuplicates(nums);

        for(int i=0; i<result; i++){
            System.out.print(nums[i] + " ");
        }

    }

}
