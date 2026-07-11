package c_Arrays.a_Traversal;

//  TC: O(n) | SC: O(1)

public class LinearSearch {

    public  static int linearSearch(int[] nums, int target){

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,2,2,3};
        int target=3;

        int result= linearSearch(nums,target);
        System.out.println(result);
    }
}

