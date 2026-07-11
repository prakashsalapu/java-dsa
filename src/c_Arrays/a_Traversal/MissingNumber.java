package c_Arrays.a_Traversal;

//  TC: O(n) | SC: O(1)

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n*(n+1))/2;

        int sum=0;
        for(int num  : nums){
            sum += num;
        }

        return totalSum-sum;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,5,4};
        System.out.println(missingNumber(nums));
    }

}
