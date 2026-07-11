package c_Arrays.a_Traversal;
import java.util.ArrayList;
public class UnionArray {

    public static ArrayList<Integer> unionArray(int[] nums1, int[] nums2){

        ArrayList<Integer> union = new ArrayList<>();

        // Brute - TC: O((n1+n2)log(n1+n2)) | SC: O(n1+n2)
        /*
            TreeSet<Integer> set = new TreeSet<>();
            for(int num : nums1){
                set.add(num);
            }
            for(int num : nums2){
                set.add(num);
            }
            for(Integer num: set){
                union.add(num);
            }
        */

        // Optimal (Two Pointers) - TC: O(n1+n2) | SC: O(n1+n2)
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i=0, j=0;
        while(i<n1 &&  j<n2){
            if(nums1[i] <=  nums2[j]){
                if(union.size()==0 || union.get(union.size()-1) != nums1[i]){
                    union.add(nums1[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1) != nums2[j]){
                    union.add(nums2[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(union.size()==0 || union.get(union.size()-1) != nums1[i]){
                union.add(nums1[i]);
            }
            i++;
        }
        while(j<n2){
            if(union.size()==0 || union.get(union.size()-1) != nums2[j]){
                union.add(nums2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2,4,5,6,8};
        int[] nums2 = {1,3,4,4,6,6,9};

        ArrayList<Integer> result = unionArray(nums1, nums2);
        System.out.println(result);
          }
}
