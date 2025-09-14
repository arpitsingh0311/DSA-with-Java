public class L5_LongestCommonSubsequence {
    public static void main(String[] args) {
        
// Ques-5-) Leetcode 1143(Medium) Longest Common Subsequence

// RECURSION + MEMOIZATION 

/*
class Solution {
    public int lcs(int i,int j,StringBuilder a,StringBuilder b,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return (dp[i][j] = (1+ lcs(i-1,j-1,a,b,dp)));
        else return (dp[i][j] = Math.max(lcs(i-1,j,a,b,dp),lcs(i,j-1,a,b,dp)));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder  a = new StringBuilder(text1);
        StringBuilder  b = new StringBuilder(text2);
        int m=a.length(), n=b.length();
        // i= m-1 to 0 | j=n-1 to 0
        int[][] dp = new int[m][n];
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        return lcs(m-1,n-1,a,b,dp);
    }
}
*/


// TABULATION

// METHOD--1
/*
class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int m=a.length(), n=b.length();
        // i= m-1 to 0 | j=n-1 to 0
        int[][] dp = new int[m][n];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                int p = (i>0 && j>0) ? dp[i-1][j-1] : 0;
                int q = (i>0) ? dp[i-1][j] : 0;
                int r = (j>0) ? dp[i][j-1] : 0;
                if(a.charAt(i)==b.charAt(j)) dp[i][j] = 1+ p;
                else dp[i][j] = Math.max(q,r);
            }
        }
        return dp[m-1][n-1];
    }
}
*/


// METHOD--2
/*
class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int m=a.length(), n=b.length();
        // i= m-1 to 0 | j=n-1 to 0
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)) 
                    dp[i][j] = 1+ dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}
*/


// METHOD--3 (BEST CODE)

/*
class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int m=a.length(), n=b.length();
        // i= m-1 to 0 | j=n-1 to 0
        int[][] dp = new int[2][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)) 
                    dp[1][j] = 1+ dp[0][j-1];
                else dp[1][j] = Math.max(dp[0][j],dp[1][j-1]);
            }
            // Copy the 1st row to 0th row for the next time
            for(int j=0;j<=n;j++) dp[0][j] = dp[1][j];
        }
        return dp[1][n];
    }
}
*/






    }
}
