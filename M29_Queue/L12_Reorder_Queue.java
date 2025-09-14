// package M29_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class L12_Reorder_Queue {
    public static void main(String[] args) {
        

// Ques-7-) GFG   Reorder queue (Interleave 1st half with 2nd half)

//You are given a queue Q of N integers of even length, rearrange the elements by interleaving the first half of the queue with the second half of the queue.


        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=n/2;i++){
            st.push(q.remove());
        }  // 5 6 7 8         

        while(st.size()>0){
            q.add(st.pop());
        }   //5 6 7 8 4 3 2 1

        for(int i=1;i<=n/2;i++){
            st.push(q.remove());
        }  // 4 3 2 1

        while(st.size()>0){
            //one by one , st then q
            q.add(st.pop());
            q.add(q.remove());
        } // 8 4 7 3 6 2 5 1
        
        System.out.println(q);
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }

        System.out.println(q);
 



/*class Solution {
    public static ArrayList<Integer> rearrangeQueue(int n, Queue<Integer> q) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n/2;i++) st.push(q.remove());
        for(int i=0;i<n/2;i++) q.add(st.pop());
        for(int i=0;i<n/2;i++) st.push(q.remove());
        for(int i=0;i<n/2;i++){
            ans.add(st.pop());
            ans.add(q.remove());
        }        
        Collections.reverse(ans);
        return ans;
    }
}
*/




    }
}
