// package M39_DynamicProgramming_1;

public class L4_L5_MinimumCostClimbingStairs {
    public static void main(String[] args) {
        
// Ques-3-) Leetcode 746(Easy) Min Cost Climbing Stairs


// USING ONLY RECURSION BUT TLE ERROR   T.C. = O(2ª)

/*
class Solution {
    public int minCost(int[] cost, int idx){
        if(idx==0 || idx==1) return cost[idx];
        return cost[idx] + Math.min(minCost(cost,idx-1),minCost(cost,idx-2));
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(minCost(cost, n-1),minCost(cost,n-2));
    }
}
*/


// USING DP (RECURSION + MEMOIZATION)    T.C. = O(n)


/*
class Solution {
    public int minCost(int[] cost, int idx, int[] dp){
        if(idx==0 || idx==1) return cost[idx];
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx] = cost[idx] + Math.min(minCost(cost,idx-1, dp),minCost(cost,idx-2,dp));
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost, n-1, dp),minCost(cost,n-2, dp));
    }
}
*/


// USING TABULATION

/*
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0]=cost[0]; 
        dp[1]=cost[1]; 
        for(int i=2;i<n;i++){
            dp[i] = cost[i] + Math.min(dp[i-2],dp[i-1]);
        }
        return Math.min(dp[n-2],dp[n-1]);
    }
}
*/





// Ques-4-) Leetcode 1137(Easy) Nth Tribonacci Number 

/*
class Solution {
    public int tri(int n, int[] dp){
        if(n==0)return 0;
        if(n==1 || n==2) return 1;
        if(dp[n] != 0) return dp[n];
        return dp[n] = tri(n-1,dp)+ tri(n-2,dp) + tri(n-3,dp);
    }
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        return tri(n,dp);
    }
}
*/

    }
}
