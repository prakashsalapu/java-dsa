package e_LinkedList.a_SinglyLinkedList.a_BasicOperations;

import e_LinkedList.a_SinglyLinkedList.ListNode;

public class InsertNode {

    // Insert at Head
    public static ListNode insertAtHead(ListNode head, int val){
//        ListNode temp = new ListNode(val, head);
        return new ListNode(val,head);
    }

    // Insert at Tail
    public static ListNode insertAtTail(ListNode head, int val){

        if(head == null){
            return new ListNode(val,null);
        }

        ListNode curr = new ListNode(val, null);
        ListNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = curr;
        return head;
    }

    // Insert at Position
    public static ListNode insertAtPosition(ListNode head, int pos, int val){

        if(pos < 1){
            System.out.println("Enter Valid Position..");
            return head;
        }

        if(pos == 1){
            return new ListNode(val,head);
        }

        int count  = 0;
        ListNode temp = head;

        while(temp != null){
            count++;
            if(count == (pos-1)){
                ListNode newNode = new ListNode(val, temp.next);
//                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

       return head;
    }

    // Insert before element
    public static ListNode insertBeforeElement(ListNode head, int val, int element){

        if(head == null) return null;

        if(head.data == element){
            return new ListNode(val,head);
        }

        ListNode temp = head;

        while(temp.next != null){
            if(temp.next.data == element){
                ListNode newNode = new ListNode(val, null);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

       return head;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(3, null))));

//        ListNode temp = insertAtHead(head, 100);
        ListNode temp = insertAtTail(head, 4);
//        ListNode temp = insertAtPosition(head, 3, 5);
//        ListNode temp = insertBeforeElement(head, 5, 20);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
