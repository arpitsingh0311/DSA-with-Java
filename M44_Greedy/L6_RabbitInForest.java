public class L6_RabbitInForest {

// Ques-6-) Leetcode 781(Medium) Rabbit in Forest

/*
class Solution {
    public int numRabbits(int[] arr) {
        int ans=0;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int ele:arr){
            freq.put(ele+1,freq.getOrDefault(ele+1,0)+1);
        }
        for(int key : freq.keySet()){
            int val = freq.get(key);
            int q = val/key;
            int r = val%key;
            ans += q*key;
            if(r>0){
                ans+=key;
            }
        }
        return ans;
    }

*/

}
