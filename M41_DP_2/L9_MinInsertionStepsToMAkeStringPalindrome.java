public class L9_MinInsertionStepsToMAkeStringPalindrome {
    public static void main(String[] args) {
        
// Ques-9-) Leetcode 1312(Hard) Minimum Insertion Steps to Make string Palindrome

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
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        return s;
    }
    public int longestPalindromeSubseq(String s) {
        return longestCommonSubsequence(s,reverse(s));
    }
    public int minInsertions(String s) {
        int lps = longestPalindromeSubseq(s);
        return s.length()-lps;
    }
}
*/

// TABULATION

/*
class Solution {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        return s;
    }
    public int longestPalindromeSubseq(String a){
        String b = reverse(a);
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
    public int minInsertions(String s) {
        int lps = longestPalindromeSubseq(s);
        return s.length()-lps;
    }
}
*/


// HOMEWORK

// Ques-) Leetcode 583(Medium) Delete Operation for 2 Strings.

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
    public int minDistance(String word1, String word2) {
        return word1.length() + word2.length() - 2*longestCommonSubsequence(word1,word2);
    }
}
*/

// TABULATION

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
    public int minDistance(String word1, String word2) {
        return word1.length() + word2.length() - 2*longestCommonSubsequence(word1,word2);
    }
}*/

    }
}
