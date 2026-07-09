package e_LinkedList.b_DoublyLinkedList.MergeOrSort;

/*
    LeetCode: 430. Flatten a Multilevel Doubly Linked List
    Difficulty: Medium
    TC: O(N) | SC: O(H)
    Approach : DFS
*/

class Node {
    public int data;
    public Node prev;
    public Node next;
    public Node child;

    Node(int data){
        this.data = data;
    }
};

public class FlattenMultilevel {

    public static Node flatten(Node head) {

        if (head == null)
            return null;

        // Brute
    /*
        Node temp = head;
        while (temp != null) {

            if (temp.child != null) {

                Node next = temp.next;

                temp.next = temp.child;
                temp.child.prev = temp;

                Node tail = temp.child;
                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = next;

                if (next != null) {
                    next.prev = tail;
                }

                temp.child = null;

            }

            temp = temp.next;
        }
    */

        // Optimal

        dfs(head);

        return head;

    }

    private static Node dfs(Node head) {

        Node curr = head;
        Node last = null;

        while (curr != null) {

            Node next = curr.next;

            if (curr.child != null) {

                Node childNode = curr.child;

                Node childTail = dfs(childNode);

                curr.next = childNode;
                childNode.prev = curr;
                curr.child = null;

                childTail.next = next;

                if (next != null) {
                    next.prev = childTail;
                }

                last = childTail;
                curr = childTail;
            } else {
                last = curr;
            }

            curr = curr.next;

        }
        return last;
    }

    public static void main(String[] args) {

        // Level 1
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.next = n2; n2.prev = n1;
        n2.next = n3; n3.prev = n2;
        n3.next = n4; n4.prev = n3;
        n4.next = n5; n5.prev = n4;
        n5.next = n6; n6.prev = n5;

        // Level 2
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);

        n7.next = n8; n8.prev = n7;
        n8.next = n9; n9.prev = n8;
        n9.next = n10; n10.prev = n9;

        // Level 3
        Node n11 = new Node(11);
        Node n12 = new Node(12);

        n11.next = n12;
        n12.prev = n11;

        // Child connections
        n3.child = n7;
        n8.child = n11;

        Node temp = flatten(n1);

        // DLL Traversal
        System.out.print("null <- ");
        for(Node curr = temp; curr != null; curr = curr.next){
            System.out.print(curr.data + " ");

            if (curr.next != null) {
                System.out.print(" <-> ");
            }
        }
        System.out.print(" -> null");
    }

}
