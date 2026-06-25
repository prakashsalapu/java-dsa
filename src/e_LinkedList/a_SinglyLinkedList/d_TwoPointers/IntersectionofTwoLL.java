package e_LinkedList.a_SinglyLinkedList.d_TwoPointers;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 160. Intersection of Two Linked Lists
    Difficulty: Easy
    TC: O(N1 + N2) | SC: O(1)
    Approach : FastSlowPointers + Positioning
*/

public class IntersectionofTwoLL {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;

        // Brute:  HashSet - TC:O(N1 + N2) - SC:O(N)
    /*
        HashSet<ListNode> set = new HashSet<>();

        ListNode t1 = headA;
        while(t1 != null){
            set.add(t1);
            t1 = t1.next;
        }

        ListNode t2 = headB;
        while(t2 != null){
            if(set.contains(t2)){
                return t2;
            }
            t2 = t2.next;
        }

        return null;
    */

        // Better:  TwoPointers - TC:O(N1 + 2N2) - SC:O(1)
    /*
        ListNode t1 =  headA;
        int lenA = 0;
        while(t1 != null){
            lenA++;
            t1 = t1.next;
        }
        ListNode t2 =  headB;
        int lenB = 0;
        while(t2 != null){
            lenB++;
            t2 = t2.next;
        }

        t1 =  headA;
        t2 =  headB;
        int diff = 0;

        if(lenA > lenB){
            diff = lenA - lenB;
            for(int i=0; i<diff; i++){
                t1 = t1.next;
            }
        }
        else{
            diff = lenB - lenA;
            for(int i=0; i<diff; i++){
                t2 = t2.next;
            }
        }

        while(t1 != null){
            if(t1 == t2){
                return t1;
            }
            t1 = t1.next;
            t2 = t2.next;

        }
        return null;
    */

        // Optimal:  TwoPointers - TC:O(N1 + N2) - SC:O(1)

        ListNode t1 = headA;
        ListNode t2 = headB;

        while(t1 != t2){

            t1 = t1.next;
            t2 = t2.next;

            if(t1 == t2) return t1;

            if(t1 == null) t1 = headB;
            if(t2 == null) t2 = headA;
        }

        return t1;

    }

    public static void main(String[] args) {

        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;
        ListNode temp = getIntersectionNode(headA, headB);

        if(temp != null) {
            System.out.println("Intersected at '" + temp.data + "'");
        } else {
            System.out.println(" No intersection");
        }
    }
}
