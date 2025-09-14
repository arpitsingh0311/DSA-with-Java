public class L10_L11_UniquePaths {
    public static void main(String[] args) {
        
// Ques-10-) Leetcode 62(Medium) Unique Paths

// USING DP (RECURSION + MEMOIZATION) 

/*class Solution {
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
}*/

/*
class Solution {
    public int paths(int row, int col, Integer m, Integer n,int[][] dp){
        if(row>=m || col>=n) return 0;
        if(row==m-1 && col==n-1) return 1;
        if(dp[row][col] != -1) return dp[row][col];
        int rightWays = paths(row,col+1,m,n,dp);
        int downWays = paths(row+1,col,m,n,dp);
        return dp[row][col] = rightWays + downWays;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return paths(0,0,m,n,dp);
    }
}
*/

// USING TABULATION


/*
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0) dp[i][j] = 1;
                else dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}
*/




    }
}
