// package M43_Backtracking;

public class L1_RatinaMaze_1 {
    public static void main(String[] args) {
        

// Ques-1-) Rat in a maze-1 [2 directions]
// Leetcode 62(Medium) Unique Paths

/*
class Solution {
    public int maze(int m,int n,int[][] dp){
        if(m==1||n==1) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        int rw = maze(m,n-1,dp);
        int cw = maze(m-1,n,dp);
        return dp[m][n] = rw+cw;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j] = -1;
            }
        }
        return maze(m,n,dp);
    }
}
*/






    }
}
