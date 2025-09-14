package M27_Stack_1;

public class L8ArrayImplementation {

    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            } else{
                arr[idx] = x;
                idx++;
            }
        }

        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            } else{
                return arr[idx-1];
            }
        }

        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }

        boolean isFull(){
            if(arr.length==idx) return true;
            else return false;
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
        System.out.println(st.isFull());
        st.push(456);







    }
}
