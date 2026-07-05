package e_LinkedList.a_SinglyLinkedList.c_Reversal;
import  e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 25. Reverse Nodes in k-Group
    Difficulty: Hard
    TC: O(N) | SC: O(1)
    Approach: Reversal + Pointer Manipulation
*/

public class ReverseKGroup {

    public static ListNode reverseKGroup(ListNode head, int k) {

        if(head==null ||head.next==null|| k<=1)
            return head;

        // Brute - ArrayList
    /*
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        // Reverse every complete group of k
        for (int i = 0; i + k <= arr.size(); i += k) {

            int left = i;
            int right = i + k - 1;

            while (left < right) {

                int swap = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, swap);

                left++;
                right--;
            }
        }

        temp = head;
        int index = 0;

        while (temp != null) {
            temp.val = arr.get(index++);
            temp = temp.next;
        }

        return head;
    */

        // Optimal

        ListNode dummy = new ListNode(0,head);
        ListNode groupPrev = dummy;

        while(true){

            ListNode kth = groupPrev;

            for(int i=0; i<k && kth != null; i++){
                kth = kth.next;
            }

            if(kth == null) break;

            ListNode groupNext = kth.next;

            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;

            while(curr != groupNext){

                ListNode next =  curr.next;
                curr.next = prev;

                prev = curr;
                curr = next;
            }

            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
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
        ListNode temp = reverseKGroup(head,2);

        System.out.print("After : ");
        for(ListNode curr=temp; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");
    }
}
