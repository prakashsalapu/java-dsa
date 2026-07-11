package c_Arrays.a_Traversal;

//  TC: O(n) | SC: O(1)

public class SecondLargest {

    public static int SecondLargest(int[] nums){
       int max = Integer.MIN_VALUE;
       int sec = Integer.MIN_VALUE;

       for(int num : nums){
           if(num>max){
               sec = max;
               max = num;
           }
           else if (num>sec && num!=max){
               sec = num;
           }
       }

       return sec;
    }
    public static void main(String[] args) {
        int[] nums = {10, 20, 40, 40, 30};
        int n = nums.length;

        int result = SecondLargest(nums);
        System.out.println(result);

    }
}
