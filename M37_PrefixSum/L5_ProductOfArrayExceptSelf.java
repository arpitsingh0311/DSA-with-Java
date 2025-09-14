public class L5_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        

// Ques-5-) Leetcode 238(Medium) Product of Array Except Self

/*
class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = 1; 
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]*arr[i-1];
        }
        suf[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            suf[i] = suf[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            arr[i] = pre[i] * suf[i];
        }
        return arr;
    }
}
*/


// using a single extra array

/*
class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = 1; 
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]*arr[i-1];
        }
        int suf = 1;
        for(int i=n-2;i>=0;i--){
            suf *= arr[i+1];
            pre[i] *= suf;
        }
        return pre;
    }
}
*/


    }
}
