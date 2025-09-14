public class L7_CoinChange {
    public static void main(String[] args) {

        
// Ques-7-) Leetcode 322(Medium) Coin Change

// RECURSION + MEMOIZATION

/*
class Solution {
    public long cc(int i, int[] arr, int a,long[][] dp){
        if(i==arr.length){
            if(a==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][a]!=-1) return dp[i][a];
        long skip = cc(i+1,arr,a,dp);
        if(a-arr[i]<0) return dp[i][a] = skip;
        long pick = 1+cc(i,arr,a-arr[i],dp);
        return dp[i][a] = Math.min(skip,pick);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[n][amount+1];
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        int ans = (int)cc(0,coins,amount,dp);
        return (ans==Integer.MAX_VALUE) ? -1:ans;
    }
}
*/

// TABULATION

/*class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[n][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if (j == 0) {
                    dp[i][j] = 0;
                } else if (i == 0) {
                    dp[i][j] = (j % coins[i] == 0) ? j / coins[i] : Integer.MAX_VALUE;
                } else {
                    long skip = dp[i - 1][j]; // Skip the current coin
                    long pick = (j - coins[i] >= 0) ? dp[i][j - coins[i]] + 1 : Integer.MAX_VALUE;
                    dp[i][j] = Math.min(skip, pick);
                }
            }
        }
        return dp[n - 1][amount] == Integer.MAX_VALUE ? -1 : (int) dp[n - 1][amount];
    }
}*/


    }
}
