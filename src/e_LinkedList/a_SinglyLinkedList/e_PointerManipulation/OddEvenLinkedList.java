package e_LinkedList.a_SinglyLinkedList.e_PointerManipulation;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 328. Odd Even Linked List
    Difficulty: Medium
    TC: O(N) | SC: O(1)
*/

public class OddEvenLinkedList {

    public static ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;

    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        ListNode temp = oddEvenList(head);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
