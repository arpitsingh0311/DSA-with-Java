// package M45_Bit_Manupilation;

import java.util.Arrays;

public class L4_SingleNumber {
    
// Ques-4-) Leetcode 136(Easy) Single number


// METHOD-1 BRUTE FORSE AND VERY VERY BAD

/*
class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean flag=false;
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                if(nums[i]==nums[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false) return nums[i];
        }
        return 324;
    }
}
*/

// METHOD-2 SORTING

/*class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i]!=nums[i+1]) return nums[i];
            else i += 2;
        }
        return nums[nums.length-1];
    }
}*/

// METHOD-3 HASHMAP

/*
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)) map.put(ele,2);
            else map.put(ele,1);
        }
        for(int key : map.keySet()){
            int freq=map.get(key);
            if(freq==1) return key;
        }
        return 8665;
    }
}
*/

// METHOD-4 USING XOR OPERATOR

/*
class Solution {
    public int singleNumber(int[] nums) {
        int n=0;
        for(int ele:nums){
            n ^= ele;
        }
        return n;
    }
}
*/


}
