
public class L9_TopKFrequentElements {
    public static void main(String[] args) {
        

// Ques-6-) Leetcode 347(medium) Top K frequent elements


/* 
class Pair implements Comparable<Pair>{
    int ele;
    int freq;
    Pair(int ele, int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Pair p){
        return this.freq-p.freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(); 
        for(int ele : arr){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }
            else map.put(ele,1);
        }
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele,freq));
            if(pq.size()>k) pq.remove();
        }
        for(int i=0;i<k;i++){
            Pair p = pq.remove();
            ans[i] = p.ele;
        }
        return ans;
    }
}
*/


// Ques-7-) Leetcode  1636(med)  Sort array by increading frequency.




    }
}
