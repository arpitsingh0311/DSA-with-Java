public class L10_SingleNumber_III {
    
// Ques-14-) Leetcode (Medium) Single Number III


// METHOD-1 USING HASHMAP

/*class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)) map.put(ele,2);
            else map.put(ele,1);
        }
        for(int key : map.keySet()){
            int freq=map.get(key);
            if(freq==1) list.add(key);
        }
        ans[0] = list.get(0);
        ans[1] = list.get(1);
        return ans;
    }
}*/


// METHOD-2

/*class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int xor = 0;
        for(int ele:nums){
            xor ^= ele;
        }
        int rightOffBit = xor & (xor-1);
        int mask = xor ^ rightOffBit;
        for(int ele:nums){
            if((mask&ele)==0) ans[0] ^= ele;
            else ans[1] ^= ele;
        }
        return ans;
    }
}*/

}
