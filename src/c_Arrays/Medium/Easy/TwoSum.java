package c_Arrays.Medium.Easy;
import java.util.Arrays;
import java.util.HashMap;

 // TC: O(1) | SC: O(n)

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];

            if(map.containsKey(comp)){
                return new int[]{map.get(comp), i};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 10, 3};
        int target = 7;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
