package M26_LinkedList_3;

public class L1_RandomPointer {
    

// Ques-22-) Leetcode 138   Copy List with Random Pointer.


/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node deepCopy(Node head){
        Node newHead = new Node(head.val);
        Node t1 = head.next;
        Node t2 = newHead;
        while(t1!=null){
            Node temp = new Node(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;    
        }
        return newHead;
    }

    public void connectAlternatively(Node h1, Node h2){
        Node t1 = h1;
        Node t2 = h2;
        Node dummy = new Node(-1);
        Node t = dummy;
        while(t1!=null && t2!=null){
            t.next = t1;
            t1 = t1.next;
            t = t.next;
            t.next = t2;
            t2 = t2.next;
            t = t.next;       
        }
    }

    public void split(Node h1, Node h2){
        Node t1 = h1;
        Node t2 = h2;
        while(t1!=null){
            t1.next = t2.next;
            t1 = t1.next;
            if(t1==null) break;
            t2.next = t1.next;
            t2 = t2.next;
        }
    }

    public Node copyRandomList(Node head) {
        if(head==null) return null;
        // Step 1: Create deep copy without random connections.
        Node head2 = deepCopy(head);

        // Step 2: Attach both list alternatevily
        connectAlternatively(head,head2);

        // Step 3: Assign random pointers
        Node t1 = head;
        Node t2 = head2;
        while(t1!=null){
            t2 = t1.next;
            if(t1.random!=null) t2.random = t1.random.next;
            t1 = t1.next.next; 
        }

        // Step 4: Split the linked list
        split(head,head2);
        return head2;
    }
} 
    */



}
