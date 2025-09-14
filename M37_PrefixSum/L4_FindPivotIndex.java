// package M37_PrefixSum;

public class L4_FindPivotIndex {
    public static void main(String[] args) {
        
// Ques-3-) Leetcode 724(Easy) Find Pivot Index.

/*
class Solution {
    public int pivotIndex(int[] arr) {
        int pivot = -1;
        int n = arr.length;
        for(int i=1;i<n;i++) arr[i] += arr[i-1];
        if (arr[n - 1] - arr[0] == 0) return 0;
        for(int i=1;i<n;i++){
            if(arr[i-1]==(arr[n-1]-arr[i])) return i;
        }
        return -1;
    }
}
*/



// Ques-4-) Leetcode 2640(Medium) Find the Score of all Prefixes of an Array

/*
class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        long max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,(long)nums[i]);
            arr[i] = (long)nums[i] + max;
        }
        for(int i=1;i<n;i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
}
*/






    }
}
