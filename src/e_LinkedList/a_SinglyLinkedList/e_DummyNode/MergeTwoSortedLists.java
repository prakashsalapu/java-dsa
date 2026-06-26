package e_LinkedList.a_SinglyLinkedList.e_DummyNode;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 21. Merge Two Sorted Lists
    Difficulty: Easy
    TC: O(N+M) | SC: O(1)
    Approach : Dummy Node, Comparison
*/

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null && list2 == null ) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummy = new ListNode(0,null);
        ListNode curr = dummy;

        ListNode t1 = list1;
        ListNode t2 = list2;

        while(list1 != null  && list2 != null){
            if (list1.data <= list2.data) {
                curr.next = list1;
                list1 = list1.next;
            }
            else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;

        }

        curr.next = (list1 != null) ? list1 : list2;

        return dummy.next;

    }

    public static void main(String[] args) {

        ListNode headA = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(6,null))));
        ListNode headB = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(8,null))));

        ListNode temp = mergeTwoLists(headA,headB);
        System.out.print("After : ");
        for(ListNode curr=temp; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");



    }
}
