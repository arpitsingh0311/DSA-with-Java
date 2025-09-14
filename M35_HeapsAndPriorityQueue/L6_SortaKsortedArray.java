// package M35_HeapsAndPriorityQueue;
import java.util.PriorityQueue;
public class L6_SortaKsortedArray {
    public static void main(String[] args) {
        
// Ques-3-) Sort a 'k' sorted array(sort a nearly sorted array)      T.C. =  O(nlogk)

        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        int[] arr2 = new int[arr.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int j=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k) arr2[j++] = pq.remove();
        }
        while(pq.size()>0 && j < arr.length) arr2[j++] = pq.remove();
        for(int ele : arr2){
            System.out.print(ele + " ");
        }

    }
}
