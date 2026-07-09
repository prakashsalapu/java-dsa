package e_LinkedList.a_SinglyLinkedList.g_HashMapOrStack;
import e_LinkedList.a_SinglyLinkedList.ListNode;
import java.util.ArrayList;
import java.util.PriorityQueue;

/*
    LeetCode: 23. Merge k Sorted Lists
    Difficulty: Hard
    TC: O(N log K) | SC: O(K)
    Approach : Min Heap (Priority Queue)
*/

public class MergeKSortedLists {

    public static ListNode mergeKLists(ListNode[] lists) {

    // Brute - ArrayList
    /*
        ArrayList<Integer> nodes = new ArrayList<>();

        // list to Array
        for (ListNode head : lists) {

            while (head != null) {
                nodes.add(head.data);
                head = head.next;
            }
        }

        // sort the list
        Collections.sort(nodes);

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        // array  to LL
        for (int num : nodes) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    */

    // Optimal - Min Heap(PriorityQueue)

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        // Add Nodes to Heap
        for (ListNode head : lists) {
            if (head != null) {
                pq.offer(head);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // Create new list
        while (!pq.isEmpty()) {

            ListNode curr = pq.poll();

            tail.next = curr;
            tail = tail.next;

            if (curr.next != null) {
                pq.offer(curr.next);
            }

        }

        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = {l1, l2, l3};

        ListNode temp = mergeKLists(lists);
        System.out.print("Merged List : ");
        for(ListNode curr=temp; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");
    }
}
