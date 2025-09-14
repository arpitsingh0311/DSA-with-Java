
import java.util.Collections;
import java.util.PriorityQueue;

// package M35_HeapsAndPriorityQueue; 

public class L1toL4_Introduction {
    public static void main(String[] args) {

        // For min heap

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.add(-65);
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        System.out.println(pq+" "+pq.peek());
        pq.add(0);
        System.out.println(pq+" "+pq.peek());
        pq.add(-9999);
        System.out.println(pq+" "+pq.peek());



        // For Max Heap

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        System.out.println("Max Heap");
        pq2.add(2);
        System.out.println(pq2+" "+pq2.peek());
        pq2.add(10);
        System.out.println(pq2+" "+pq2.peek());
        pq2.add(1);
        System.out.println(pq2+" "+pq2.peek());
        pq2.add(-65);
        System.out.println(pq2+" "+pq2.peek());
        pq2.remove();
        System.out.println(pq2+" "+pq2.peek());
        pq2.remove();
        System.out.println(pq2+" "+pq2.peek());
        pq2.add(0);
        System.out.println(pq2+" "+pq2.peek());
        pq2.add(-9999);
        System.out.println(pq2+" "+pq2.peek());

    }
}
