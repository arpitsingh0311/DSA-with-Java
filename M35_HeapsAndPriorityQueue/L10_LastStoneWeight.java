public class L10_LastStoneWeight {
    public static void main(String[] args) {
        
// Ques-8-) Leetcode 1046(Easy) Last Stone Weight

/* 
class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){
            pq.add(ele);
        }
        while(pq.size() > 1) { // changed from >=1 to >1
            int max1 = pq.remove();
            int max2 = pq.remove();
            int diff = max1 - max2;
            if(diff != 0) pq.add(diff);
        }
        return pq.isEmpty() ? 0 : pq.remove();

    }
}
*/












    }
}
