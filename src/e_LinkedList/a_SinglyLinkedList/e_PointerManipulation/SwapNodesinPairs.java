package e_LinkedList.a_SinglyLinkedList.e_PointerManipulation;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 24. Swap Nodes in Pairs
    Difficulty: Medium
    TC: O(N) | SC: O(1)
    Approach : DummyNode + Reversal
*/

public class SwapNodesinPairs {

    public static ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null){

            ListNode first = prev.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;

        }

        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(50, new ListNode(40, new ListNode(30, new ListNode(20, new ListNode(10,null)))));

        System.out.print("Before : ");
        for(ListNode curr=head; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");

        System.out.println();
        ListNode temp = swapPairs(head);

        System.out.print("After : ");
        for(ListNode curr=temp; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");
    }
}
