package M27_Stack_1;

import java.util.Stack;

public class L1_Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());

        st.push(1);
        st.push(5);
        st.push(4);
        st.push(500);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st);
        st.push(50);
        st.push(80);
        st.push(90);
        System.out.println(st);

        // for access first element of stack 
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());

        System.out.println(st.isEmpty());







    }
}
