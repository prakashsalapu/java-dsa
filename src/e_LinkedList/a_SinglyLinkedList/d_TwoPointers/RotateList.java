package e_LinkedList.a_SinglyLinkedList.d_TwoPointers;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 61. Rotate List
    Difficulty: Medium
    TC: O(N) | SC: O(1)
    Approach : FastSlowPointers + Positioning
*/

public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k==0) return head;

        ListNode temp = head;
        int  count = 1;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        k = k % count;

        if(k==0) return head;

        ListNode slow = head;
        ListNode fast = head;

        for(int i=0; i<k; i++){
            fast= fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(50, new ListNode(40, new ListNode(30, new ListNode(20, new ListNode(10,null)))));

        System.out.print("Before : ");
        for(ListNode curr=head; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");

        System.out.println();
        ListNode temp =rotateRight(head,2);
        System.out.print("After : ");
        for(ListNode curr=temp; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");
    }
}
