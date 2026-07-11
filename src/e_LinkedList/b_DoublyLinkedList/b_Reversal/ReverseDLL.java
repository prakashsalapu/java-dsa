package e_LinkedList.b_DoublyLinkedList.b_Reversal;
import e_LinkedList.b_DoublyLinkedList.ListNode;


public class ReverseDLL {

    public static ListNode reverseDLL(ListNode head){


        // Brute : TC - O(2N) | SC - O(N)
     /*
        Deque<Integer> st = new ArrayDeque<>();

        ListNode temp = head;
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            temp.data = st.peek();
            st.pop();
            temp = temp.next;
        }
    */

        // Optimal : TC - O(N) | SC - O(1)

            if(head == null || head.next == null)
                return head;

            ListNode last = null;
            ListNode curr = head;
            while(curr != null){
                last = curr.prev;
                curr.prev = curr.next;
                curr.next = last;

                curr = curr.prev;
            }
            head = last.prev;

            return head;
    }

    public static void main(String[] args) {

   // 1.Create nodes
    ListNode head = new ListNode(500);
    ListNode n1 = new ListNode(400);
    ListNode n2 = new ListNode(300);
    ListNode n3 = new ListNode(200);
    ListNode n4 = new ListNode(100);

    // 2. Link them
    head.next = n1;
    n1.prev = head;
    n1.next = n2;
    n2.prev = n1;
    n2.next = n3;
    n3.prev = n2;
    n3.next = n4;
    n4.prev = n3;
    n4.next = null;

        ListNode temp = reverseDLL(head);

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