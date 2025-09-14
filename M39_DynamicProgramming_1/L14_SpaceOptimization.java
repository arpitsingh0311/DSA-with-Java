public class L14_SpaceOptimization {
    public static void main(String[] args) {
    
// WITH S.C. =  O[1]  FIBBONACI
/* 
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int[] dp = new int[3];
        dp[0]=0; dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[2] = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }
}
*/


//Leetcode 62 UNIQUE PATH 

 
/*
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[2][n];
        for(int j=0;j<n;j++){
            dp[0][j]=1;
            dp[1][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[1][j] = dp[1][j-1] + dp[0][j];
            }
            for(int j=1;j<n;j++){
                dp[0][j] = dp[1][j];
            }
        }
        return dp[1][n-1];
    }
}
*/

    }
}
