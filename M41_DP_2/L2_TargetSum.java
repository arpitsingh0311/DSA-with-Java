// package M41_DP_2;

public class L2_TargetSum {
    
// Ques-3-) Leetcode 494(Medium) Target Sum

// MEHTOD 1

/*
class Solution {
    static int sum;
    public int ways(int i, int[] arr,int res, int target,int[][] dp){
        if(i==arr.length){
            if(res==target) return 1;
            else return 0;
        }
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
        int add = ways(i+1,arr,res+arr[i],target,dp);
        int sub = ways(i+1,arr,res-arr[i],target,dp);
        return dp[i][res+sum] = add+sub;
    }
    public int findTargetSumWays(int[] arr, int target) {
        //i = 0 to n-1 || target = -sum to sum
        // dp[i][target+sum] -> ways(i,target)
        sum = 0;
        int n=arr.length;
        for(int ele:arr) sum+=ele;
        int[][] dp = new int[n][2*sum+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++) dp[i][j]=-1;
        return ways(0,arr,0,target,dp);
    }
}
*/



// HOMEWORK

// Leetcode 2786(Medium) Visit Array Positions to maximise score

}
