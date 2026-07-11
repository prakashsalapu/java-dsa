package c_Arrays.b_TwoPointers;
import java.util.Arrays;

//  TC: O(n) | SC: O(1)

public class RotateArray {

    public static void rotateArray(int[] nums, int k) {
          int n = nums.length;
          if(n==0 || k==0) return;
          k%=n;

          // Right Rotation
//           rotate(nums,0,n-1);
//           rotate(nums,0,k-1);
//           rotate(nums,k,n-1);

           // Left Rotation
           rotate(nums,0,k-1);
           rotate(nums,k,n-1);
           rotate(nums,0,n-1);

    }

    private static void rotate(int[] nums, int left,  int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 4;
        rotateArray(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
