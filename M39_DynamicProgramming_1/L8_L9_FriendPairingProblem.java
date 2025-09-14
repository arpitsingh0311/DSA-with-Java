public class L8_L9_FriendPairingProblem {
    public static void main(String[] args) {
       
        
// Ques-7-) GFG Friends Pairing Problem


// USING DP (RECURSION + MEMOIZATION) 



/*
class Solution
{
    public long pair(int n, long[] dp){
        int MOD = 1000000007;
        if(n==1) return 1;
        if(n==2) return 2;
        if( dp[n]!=-1) return dp[n];
        dp[n] = (pair(n - 1, dp) + (n - 1) * pair(n - 2, dp) % MOD) % MOD;
        return dp[n];
    }
    public long countFriendsPairings(int n){ 
        long[] dp = new long[n+1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return pair(n,dp);
    }
}    
*/



// USING TABULATION



/*
class Solution {
    public long countFriendsPairings(int n) {
        if (n <= 2) return n;
        int MOD = 1000000007;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + (i - 1) * dp[i - 2] % MOD) % MOD;
        }
        return dp[n];
    }
}
*/

// Ques-8-) Count Derangements


// Ques-9-) Leetcode 70(Easy) Climbing Stairs

    }
}
