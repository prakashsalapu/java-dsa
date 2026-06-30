package e_LinkedList.b_DoublyLinkedList.a_BasicOperations;
import e_LinkedList.b_DoublyLinkedList.ListNode;

/*
    TC: O(N) | SC: O(1)
*/

public class ForwardTraversal {

    public static void printForward(ListNode head){

        ListNode temp = head;

        System.out.print("null <- ");
        while(temp != null){
            System.out.print(temp.data + "");
            if(temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.print(" -> null");
    }
    public static void main(String[] args) {

        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3 = new ListNode(30);
        ListNode n4 = new ListNode(40);

        n1.prev = null;
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = null;

        ListNode head = n1;

        printForward(head);



    }
}
