package M29_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class L7_ReverseTheQueue {
    public static void main(String[] args) {
        
        // Ques-2-) Reverse the queue

        Queue q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        Stack st = new Stack<>();
        while(q.size() != 0){
            st.push(q.remove());
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        System.out.println(q);




    }
}
