public class L10_EditDistance {
    public static void main(String[] args) {
        
// Ques-10-) Leetcode 72(Medium) Edit Distance


// RECURSION + MEMOIZATION

/*
class Solution {
    public int minSteps(int i,int j,StringBuilder a,StringBuilder b,int[][] dp){
        if(i==-1) return j+1;
        if(j==-1) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j))
            return dp[i][j]=minSteps(i-1,j-1,a,b,dp);
        else{
            int del = minSteps(i-1,j,a,b,dp);
            int ins = minSteps(i,j-1,a,b,dp);
            int rep = minSteps(i-1,j-1,a,b,dp);
            return dp[i][j] = (1 + Math.min(del,Math.min(ins,rep)));
        }
    }
    public int minDistance(String word1, String word2) {
        StringBuilder a = new StringBuilder(word1);
        StringBuilder b = new StringBuilder(word2);
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        return minSteps(m-1,n-1,a,b,dp);
    }
}
*/


// TABULATION

/*
class Solution {
    public int minDistance(String a, String b) {
        int m = a.length(), n = b.length();
        if(m==0) return n;
        if(n==0) return m;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int p = (i>=1 && j>=1) ? dp[i-1][j-1] : (i==0 ? j:i);
                int q = (j>=1) ? dp[i][j-1] : i;
                int r = (i>=1) ? dp[i-1][j] : j;
                if(a.charAt(i)==b.charAt(j)) dp[i][j]= p;
                else{
                    dp[i][j] = (1 + Math.min(r,Math.min(q,p)));
                }
            }
        }
        return dp[m-1][n-1];
    }
}
*/





    }
}
