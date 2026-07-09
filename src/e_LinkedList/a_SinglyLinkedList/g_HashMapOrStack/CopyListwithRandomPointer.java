package e_LinkedList.a_SinglyLinkedList.g_HashMapOrStack;

/*
    LeetCode: 138. Copy List with Random Pointer
    Difficulty: Medium
    TC: O(N) | SC: O(1)
    Approach : Interweaving + Pointer Manipulation
*/


class Node{
    int data;
    Node next;
    Node random;

    Node(int data){
        this.data = data;
    }

    Node(int data, Node next, Node random){
        this.data = data;
        this.next = next;
        this.random = random;
    }
}

public class CopyListwithRandomPointer {

    public  static Node copyRandomList(Node head) {

        if(head == null)
            return null;

        // Brute - HashMap - SC: O(N)
    /*
        HashMap<Node,Node> map = new HashMap<>();

        Node temp = head;
        while(temp != null){
            map.put(temp, new Node(temp.data));
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            Node copy = map.get(temp);
            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);
    */

        // Optimal

        // 1. Insert copied nodes
        Node temp = head;
        while(temp != null){

            Node copy = new Node(temp.data);

            copy.next = temp.next;
            temp.next = copy;

            temp =  copy.next;

        }

        // 2. Assign random pointers
        temp = head;
        while(temp != null){

            if(temp.random != null){
                temp.next.random = temp.random.next;
            }

            temp = temp.next.next;

        }

        // 3. Seperate copied list
        Node dummy = new Node(-1);
        Node copyTail = dummy;

        temp = head;

        while(temp != null){

            Node copy = temp.next;
            temp.next = copy.next;

            copyTail.next = copy;
            copyTail = copy;

            temp = temp.next;

        }

        return dummy.next;

    }

    public static void main(String[] args) {

        /*
              7 -> 13 -> 11 -> 10 -> 1

              Random:
              7  -> null
              13 -> 7
              11 -> 1
              10 -> 11
              1  -> 7
        */

        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        // next pointers
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // random pointers
        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        System.out.print("Original : ");
        for(Node curr = n1; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");

        System.out.println();
        Node temp = copyRandomList(n1);
        System.out.print("Copied : ");
        for(Node curr=temp; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");
    }
}
