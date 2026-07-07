package e_LinkedList.a_SinglyLinkedList.d_TwoPointers;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 143. Reorder List
    Difficulty: Medium
    TC: O(N) | SC: O(1)
    Approach:  Find Middle Node -> Reverse the second half -> Merge
*/

public class ReorderList {
    public static void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        // 1. Find Middle Node
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half
        ListNode curr = slow.next;
        slow.next = null;

        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3. Merge the two halves
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {

            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));


        System.out.print("Before : ");
        for(ListNode curr=head; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");

        System.out.println();
        reorderList(head);

        ListNode temp = head;
        System.out.print("After : ");
        for(ListNode curr=temp; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");
    }
}
