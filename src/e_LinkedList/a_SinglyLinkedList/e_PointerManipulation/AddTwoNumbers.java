package e_LinkedList.a_SinglyLinkedList.e_PointerManipulation;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 2. Add Two Numbers
    Difficulty: Medium
    TC: O(max(n,m)) | SC: O(max(n,m))
    Approach:  Pointer Manipulation - digit1 + digit2 + carry
*/

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){

            int sum = carry;

            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            carry = sum / 10;

        }
        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode headA = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        ListNode temp = addTwoNumbers(headA, headB);

        System.out.print("HEAD -> ");
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

