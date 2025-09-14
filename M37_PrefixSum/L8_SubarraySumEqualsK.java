

public class L8_SubarraySumEqualsK {
    public static void main(String[] args) {
        
// Ques-8-) Leetcode 560(Medium) Subarray Sum equals K. 


// BRUTE-FORCE SOLUTION


/*
class Solution {
    public int subarraySum(int[] arr, int k) {
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum==k) count++;
            }
        }
        return count;
    }
}
*/


// OPTIMIZED SOLUTION : PREFIX SUM & HASHMAP


/*
class Solution {
    public int subarraySum(int[] arr, int k) {
        int count = 0;
        int n = arr.length;
        for(int i=1;i<n;i++) arr[i] += arr[i-1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int ele = arr[i];
            if(ele==k) count++;
            int rem = ele - k;
            if(map.containsKey(rem)) count += map.get(ele);
            if(map.containsKey(arr[i])){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        return count;
    }
}
*/

    }
}
