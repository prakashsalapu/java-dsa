package e_LinkedList.a_SinglyLinkedList.a_BasicOperations;


import e_LinkedList.a_SinglyLinkedList.ListNode;

public class DeleteNode {

    // Delete Head of the LL
    public static ListNode removeHead(ListNode head) {
        if(head == null) return head;
        ListNode temp = head;
        head = head.next;
        return head;
    }

    // Delete Tail of the LL
    public static ListNode removeTail(ListNode head) {
        if(head == null || head.next == null ) return null;

        ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null; // removes last node
        return head;
    }

    // Delete at Position of the LL
    public static ListNode removePosition(ListNode head, int k) {
        if(head == null) return head;

        if(k==1){
            head = head.next;
            return head;
        }
        int count = 0;
        ListNode temp = head;
//        ListNode prev =  null;

        while(temp != null){
            count++;
            if(count == k - 1){
                temp.next = temp.next.next;
                break;
            }
//            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    // Delete value of the LL
    public static ListNode removeValue(ListNode head, int val) {

        while (head != null && head.data == val) {
            head = head.next;
        }

        ListNode curr = head;
        while ( curr.next != null) {
            if (curr.next.data == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
    
    public static void main(String[] args) {

        ListNode head = new ListNode(10, new ListNode(20, new ListNode(30, new ListNode(40, null))));

        // ListNode temp = removeHead(head);
        // ListNode temp = removeTail(head);
        // ListNode temp = removePosition(head, 3);
        ListNode temp = removeValue(head, 50);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
