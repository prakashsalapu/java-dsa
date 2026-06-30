package e_LinkedList.a_SinglyLinkedList.a_BasicOperations;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    TC: O(N) | SC: O(1)
*/

public class ArrayToSLL {

    public static ListNode arrayToLL(int[] nums){

        ListNode head = new ListNode(nums[0]);
        ListNode mover = head;

        for(int i=1; i<nums.length; i++){
            ListNode temp = new ListNode(nums[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};

        ListNode temp = arrayToLL(nums);

        for(ListNode curr = temp; curr != null; curr = curr.next){
            System.out.print(curr.data + " -> ");
        }
        System.out.println("null");
    }

}
