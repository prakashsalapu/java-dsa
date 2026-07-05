package e_LinkedList.a_SinglyLinkedList.d_TwoPointers;
import e_LinkedList.a_SinglyLinkedList.ListNode;
import e_LinkedList.a_SinglyLinkedList.b_FastSlowPointers.FindMiddleNode;

/*
    LeetCode: 2130. Maximum Twin Sum of a Linked List
    Difficulty: Medium
    TC: O(N) | SC: O(1)
*/

public class MaximumTwinSum {

    public static int pairSum(ListNode head) {

        if(head == null  || head.next == null) return -1;

        // Brute -  TC: O(N+M) | SC: O(N)
    /*
        Deque<Integer> st = new ArrayDeque<>();

        ListNode temp = head;
        int size = 0;

        while(temp != null){
            size++;

            st.push(temp.data);
            temp = temp.next;

        }

        temp =  head;
        int maxSum = 0;
        for(int i=0; i < size/2; i++){

            int sum = temp.data + st.peek();
            maxSum = Math.max(maxSum, sum);

            st.pop();
            temp = temp.next;

        }

        return maxSum;
    */

        // 1. Find Middle Node
        ListNode slow = FindMiddleNode.middleNode(head);

        // 2. Reverse Second half
        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null){

            ListNode front = curr.next;

            curr.next =  prev;
            prev = curr;
            curr = front;
        }

        // 3. Twin sum
        int maxSum = 0;
        ListNode first = head;
        ListNode second = prev;

        while(second != null){
            int sum = first.data + second.data;
            maxSum = Math.max(maxSum, sum);

            first = first.next;
            second = second.next;

        }

        return maxSum;

    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        int result = pairSum(head);

        System.out.println(result);
    }
}
