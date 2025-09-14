public class L3_MinSizeSubarraySum {
    public static void main(String[] args) {
        

// Ques-2-) Leetcode 209(Medium) Minimum Size Subarray Sum


// BRUTE FORCE BUT TLE ERROR

/*
class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length, minLen = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum = arr[i],j=i;
            while(j<n && sum<target){
                sum += arr[j++];
            }
            int len = j-i+1;
            if(sum>=target) minLen = Math.min(minLen,len);
        }
        if(minLen==Integer.MAX_VALUE) return 0;
        return minLen;
    }
}
*/



// USING SLIDING WINDOW


/*
class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length, minLen = Integer.MAX_VALUE;
        int i=0,j=0,sum=0;
        while(j<n&& sum<target){ //first window
            sum += arr[j++];
        }
        j--;
        while(i<n && j<n){
            int len = j-i+1;
            if(sum>=target) minLen = Math.min(minLen,len);
            sum -= arr[i];
            i++; j++;
            while(j<n&& sum<target){ 
                sum += arr[j++];
            }
            j--;
        }
        if(minLen==Integer.MAX_VALUE) return 0;
        return minLen;
    }
}
*/



// Ques-3-) Leetcode 713(Medium) Subarray Product less than k.
 



    }
}
