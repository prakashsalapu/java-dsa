package e_LinkedList.a_SinglyLinkedList.f_MergeOrSort;
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

        // Brute -  ArrayList
    /*
        ArrayList<Integer> arr = new ArrayList<>();

        while(list1 != null){
            arr.add(list1.val);
            list1 = list1.next;
        }

        while(list2 != null){
            arr.add(list2.val);
            list2 = list2.next;
        }
        
        Collections.sort(arr);

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        
        for(int i=0; i<arr.size();  i++){
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }

        return dummy.next;
    */

        // Optimal - Dummy 

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        ListNode t1 = list1;
        ListNode t2 = list2;

        while (t1 != null && t2 != null) {

            if (t1.val < t2.val) {
                curr.next = t1;
                t1 = t1.next;
            } else {
                curr.next = t2;
                t2 = t2.next;
            }

            curr = curr.next;
        }

        curr.next = (t1 != null) ? t1 : t2;

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
