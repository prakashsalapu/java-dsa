package e_LinkedList.b_DoublyLinkedList.a_BasicOperations;
import e_LinkedList.b_DoublyLinkedList.ListNode;

public class DeleteNode {

    // Delete Head Node
    public static ListNode deleteAtHead(ListNode head){

        if(head == null || head.next == null) return null;

        head = head.next;
        head.prev = null;

        return head;
    }

    // Delete Tail Node
    public static ListNode deleteAtTail(ListNode head){
        if(head == null || head.next == null) return null;

        ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next =  null;

        return head;
    }

    // Delete Node at Position (Kth Element)
    public static ListNode deleteAtPosition(ListNode head, int k){

        if(head == null || k<1 ) return head;

        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            if(count == k){
                break;
            }
            temp =  temp.next;
        }

        // k > length
        if (temp == null) {
            return head;
        }

        ListNode back = temp.prev;
        ListNode front = temp.next;

        // For Single Node
        if(back==null && front==null){
            return null;
        }
        // For Head Node
        if(back ==  null){
           return deleteAtHead(head);
        }
        // For Tail Node
        if(front == null){
           return deleteAtTail(head);
        }

        back.next = front;
        front.prev = back;

        temp.next = temp.prev = null;

        return head;
    }

    // Delete Value Node
    public static ListNode deleteAtValue(ListNode head, int val){

        if(head == null) return null;

        ListNode temp = head;
        while(temp != null && temp.data != val){
            temp =  temp.next;
        }

        // value not found
        if (temp == null) {
            return head;
        }

        ListNode back = temp.prev;
        ListNode front = temp.next;

        // For Single Node
        if(back==null && front==null){
            return null;
        }
        // For Head Node
        if(back ==  null){
            return deleteAtHead(head);
        }
        // For Tail Node
        if(front == null){
            return deleteAtTail(head);
        }

        back.next = front;
        front.prev = back;

        temp.next = null;
        temp.prev = null;

        return head;
    }

    public static void main(String[] args) {

        // Create nodes
        ListNode head = new ListNode(10);
        ListNode n1 = new ListNode(20);
        ListNode n2 = new ListNode(30);
        ListNode n3 = new ListNode(40);
        ListNode n4 = new ListNode(50);

        // Link them
        head.next = n1;
        n1.prev = head;
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = null;


//        ListNode temp = deleteAtHead(head);
//        ListNode temp = deleteAtTail(head);
        ListNode temp = deleteAtPosition(head, 3);
//        ListNode temp = deleteAtValue(head, 50);

        // DLL Traversal
        System.out.print("null <- ");
        for(ListNode curr = temp; curr != null; curr = curr.next){
            System.out.print(curr.data + " ");

            if (curr.next != null) {
                System.out.print(" <-> ");
            }
        }
        System.out.print(" -> null");
    }

}
