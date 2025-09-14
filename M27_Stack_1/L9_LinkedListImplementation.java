// package M27_Stack_1;

public class L9_LinkedListImplementation {
    
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int size(){
            return size;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

        void display(){
            displayRec(head);
            System.out.println();
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val + " ");
        }

    }






    public static void main(String[] args) {
        
        Stack st = new Stack();
        st.push(65);
        st.push(58);
        st.push(64);
        st.push(51);
        System.out.println(st.peek());
        // st.pop();
        System.out.println(st.size());
        st.display();
        System.out.println(st.pop());
        st.display();
        st.push(89);
        st.push(75);
        st.display();
        System.out.println(st.isEmpty());
        st.push(456);







    }
}
