package M29_Queue;

import java.util.*;

public class L8_ReverseFirst_K_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Ques-3-)Reverse first k elements in queue.



        Queue q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        Stack st = new Stack<>();
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }
        for(int i=0;i<k;i++){
            q.add(st.pop());
        }
        for(int i=0;i<(q.size()-k);i++){
            q.add(q.remove());
        }
        System.out.println(q);



    }
}
