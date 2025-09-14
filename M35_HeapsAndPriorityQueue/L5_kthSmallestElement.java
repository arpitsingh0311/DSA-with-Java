import java.util.Collections;
import java.util.PriorityQueue;



public class L5_kthSmallestElement {
    public static void main(String[] args) {
        
// Ques-1-) Find the  kth smallest element in an array.

// TC = O(nlogn) using in built sort

        /*int[] arr = {3,7,2,43,-1,4,89,224};
        int k=4;
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(arr[k-1]);*/


// TC = O(nlogn) using min heap or priority queue

        /*int[] arr = {3,7,2,43,-1,4,89,224};
        int k = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }
        for(int i=1;i<k;i++){
            pq.remove();
        }
        System.out.println(pq.peek());*/


// TC = O(nlogk)  using max heap
        int[] arr = {3,7,2,43,-1,4,89,224};
        int k = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());






// Ques-2-) Find the  kth largest element in an array.








    }
}
