
import java.util.Arrays;

public class L1_PartitionEqualSubsetSum {

    public static boolean subset(int i, int[] arr, int target,int[][] dp){
        if(i==arr.length){
            if(target==0) return true;
            else return false;
        }
        if(dp[i][target]!=-1) return (dp[i][target]==1);
        boolean ans =false;
        boolean skip = subset(i+1,arr, target,dp);
        if(target-arr[i]<0) ans = skip;
        else{
            boolean pick = subset(i+1,arr, target-arr[i],dp);
            ans = pick||skip;
        }
        if(ans) dp[i][target]=1;
        else dp[i][target]=0;
        return ans;
    }

    public static void main(String[] args) {
    
// Ques-1-) Subset Sum 
// Memoization

        int[] arr = {8,0,2,4};
        int target = 14;
        int[][] dp = new int[arr.length][target+1];
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        System.out.println(subset(0,arr,target,dp));



// Ques-2-) Leetcode 416(Medium) Partition equal Subset sum


/*
class Solution {
    public boolean subset(int i, int[] arr, int target, int[][] dp){
        if(i==arr.length){
            if(target==0) return true;
            else return false;
        }
        if(dp[i][target]!=-1) return (dp[i][target]==1);
        boolean ans = false;
        boolean skip = subset(i+1,arr,target,dp);
        if(target-arr[i]<0) ans = skip;
        else{
            boolean pick = subset(i+1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        dp[i][target] = (ans) ? 1 : 0;
        return ans;
    }
    public boolean canPartition(int[] arr) {
        int sum = 0;
        for(int ele : arr) sum += ele;
        if(sum%2!=0) return false;
        int target = sum/2;
        int[][] dp = new int[arr.length][target+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++) dp[i][j]=-1;
        return subset(0,arr,target,dp);
    }
}
*/

// Leetcode 2915(Medium) 

/*
class Solution {
    public int subset(int i, List<Integer> arr, int t, int[][] dp) {
        // Base cases
        if (t == 0) return 0; // Subsequence found
        if (i == arr.size() || t < 0) return Integer.MIN_VALUE; // No valid subsequence
        // Check memo table
        if (dp[i][t] != -1) return dp[i][t];
        // Skip the current element
        int skip = subset(i + 1, arr, t, dp);
        // Pick the current element
        int pick = Integer.MIN_VALUE;
        if (t - arr.get(i) >= 0) {
            pick = 1 + subset(i + 1, arr, t - arr.get(i), dp);
        }
        // Store the result in memo table
        return dp[i][t] = Math.max(skip, pick);
    }
    public int lengthOfLongestSubsequence(List<Integer> arr, int t) {
        int n = arr.size();
        int[][] dp = new int[n][t + 1];
        // Initialize the memo table with -1
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        // Find the maximum length subsequence
        int result = subset(0, arr, t, dp);
        // If no valid subsequence exists, return 0
        return result < 0 ? -1 : result;
    }
}
*/


    }    
}
