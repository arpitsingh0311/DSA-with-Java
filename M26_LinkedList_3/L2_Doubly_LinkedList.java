package M26_LinkedList_3;


class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
}

class DLL{
    dNode head;
    dNode tail;
    int size = 0;
    
    void display(){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }  

    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size==0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size==0) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val){
        dNode temp = new dNode(val);
        dNode x =head;
        if(idx==0) {
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        if(idx>size){
            System.out.println("Error Out of bound");
            return;
        }
        for(int i=1;i<idx;i++){
            x =x.next;
        }
        //insertion
        dNode y = x.next;
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;
        size++;
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("Error");
            return;
        }
        head = head.next;
        head.prev = null;  // extra
        size--;
    }

    void deleteAtTail(){
          
    }


}
public class L2_Doubly_LinkedList {

    public static void print(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printRev(dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display(dNode node){
        dNode temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        // dNode a = new dNode(10);
        // dNode b = new dNode(20);
        // dNode c = new dNode(30);
        // dNode d = new dNode(40);
        // dNode e = new dNode(50);

        // a.next = b; b.prev = a;
        // b.next = c; c.prev = b;
        // c.next = d; d.prev = c; 
        // d.next = e; e.prev = d;

        // print(a);
        // printRev(e);
        // display(c);

        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.display();
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.display();
        System.out.println(list.size);

        list.insertAtHead(100);
        list.display();

        list.insert(2, 400);
        list.display();


    }
}
