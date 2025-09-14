package M29_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class L2_basicQues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        // Ques -1-) Print all the elements present in given queue only using add(), remove(), peek(), size(), and extra queue.

        /*Queue temp = new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek() + " ");
            temp.add(q.poll());
        }
        while(temp.size()>0){
            q.add(temp.poll());
        }*/





    }
}
