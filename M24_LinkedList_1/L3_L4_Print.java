package M24_LinkedList_1;

public class L3_L4_Print {

    // Print using loop
    public static void printll(Node head){
        Node temp = head;  // shallow copy
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    // Print using recursion
    public static void printllr(Node head){
        if(head == null) return;
        System.out.println(head.val);
        printllr(head.next);
    }


    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;  //linking 10->20
        b.next = c;  // 10->20->30
        c.next = d;  // 10->20->30->40
        d.next = e;  // 10->20->30->40->50

        printll(a);
        printllr(a);




        




        
    }
}
