package M26_LinkedList_3;

import org.w3c.dom.Node;

public class L5_FlattenMultiLevelDLL {
   

// Ques -23-) Leetcode 430    Flatten a Multilevel Doubly Linked List.

/* //Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while(temp!=null){
            Node n = temp.next;
            if(temp.child!=null){
                Node c = flatten(temp.child);
                Node d = c;
                while(d.next!=null) d = d.next;
                temp.next = c; c.prev= temp;
                d.next = n; if(n!=null)n.prev = d;
                temp.child = null;
            }
            temp = n;
        }
        return head;


    }
} */







}
