package M24_LinkedList_1;

class SLL{  // User defined data structure
    private Node head;
    private Node tail;
    private int size;

    void InsertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null) head = tail=temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void inserAtStart(int val){
        Node temp = new Node(val);
        if(head==null) head = tail=temp;
        else{
            temp.next = head;
            head = temp; 
        }
        size++;
    }

    void insert(int idx, int val){
        Node temp = new Node(val);
        Node x =head;
        if(idx==0) {
            inserAtStart(val);
            return;
        }
        if(idx==size){
            InsertAtEnd(val);
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
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    int get(int idx) throws Error {
        Node x =head;
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
            throw new Error("Invalid Index");
        }
        for(int i=0;i<idx;i++){
            x = x.next;
        }
        return x.val;
    }

    void set(int idx, int val){
        Node x =head;
        if(idx==size-1) {
            tail.val = val;
            return;
        }
        if(idx>=size || idx<0){
            throw new Error("Invalid Index");
        }
        for(int i=0;i<idx;i++){
            x = x.next;
        }
        x.val = val;
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("Error");
            return;
        }
        head = head.next;
        size--;
    }

    void delete(int idx){
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(head==null) {
            System.out.println("Error");
            return;
        }
        if(idx<0 || idx>=size) {
            System.out.println("Error");
            return;
        }
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        if(temp.next == tail) tail=temp;
        temp.next = temp.next.next;
        size--;
    }

    void display(){
        Node temp = head;  
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    void size(){
        System.out.println("Length of link list : " + size);
    }

}

public class L5toEnd_Implementation {
    

    public static void main(String[] args)throws Error  {
        SLL list = new SLL();

        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);

        list.display();
        list.size();

        list.InsertAtEnd(56);
        list.size();
        
        list.inserAtStart(658);
        list.display();
        list.size();

        list.insert(2,265);
        list.display();
        list.size();

        list.insert(20,265);
        list.display();
        list.size();

        System.out.println(list.get(4));
        // System.out.println(list.get(50));

        list.set(2,90);
        list.display();

        list.delete(4);
        list.display();
        list.deleteAtHead();
        list.display();

    }
}
