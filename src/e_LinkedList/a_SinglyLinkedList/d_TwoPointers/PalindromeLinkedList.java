package e_LinkedList.a_SinglyLinkedList.d_TwoPointers;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 234. Palindrome Linked List
    Difficulty: Easy
    TC: O(N) | SC: O(1)
    Approach : FastSlowPointers + Reversal
*/

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return true;

        // 1.Find Middle Node
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse Second Half
        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        //  Compare
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            if(first.data != second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1,null))));

        boolean result = isPalindrome(head);

        System.out.println(result);
    }
}
