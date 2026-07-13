package d_Strings.a_TwoPointers;

/*
    LeetCode: 125. Valid Palindrome
    Difficulty: Easy
    TC: O(N) | SC: O(1)
    Approach : TwoPointers - opposite ends
*/

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length()-1;

        while(left<right){

            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;

        }

        return true;

    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);

        System.out.println(result);
    }
}
