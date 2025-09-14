public class L4_LongestSubarrayOf1s {
    public static void main(String[] args) {
        
// Ques-4-) Leetcode 1493(Medium) Longest subarray of 1's after deleting one element.


/*
class Solution {
    public int longestSubarray(int[] arr) {
        int n = arr.length, i=0,j=0;
        int zeroes = 0, maxLen=0;
        for(int k=0;k<n;k++){
            if(arr[k]==0) zeroes++;
        }
        if(zeroes==0) return (n-1);
        zeroes = 0;
        while(i<n && arr[i]==0) i++;
        if(i==n) return 0;
        j=i;
        while(j<n){
            if(arr[j]==1) j++;
            else{
                if(zeroes==0){
                    j++;
                    zeroes++;
                } else{
                    int len=j-i-1;
                    maxLen = Math.max(len,maxLen);
                    j++;
                    while(i<n && arr[i]==1) i++;
                    i++;
                }
            }
        }
        if(zeroes==0) return j-i;
        if(zeroes==1){
            int len=j-i-1;
            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
    }
}
*/




// Ques-5-) Leetcode 1004(Medium) Max Consecutive ones III.



    }
}
