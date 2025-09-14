// package M39_DynamicProgramming_1;

public class L2_L3_FibonacciNo {
    public static void main(String[] args) {
        
// Ques-1) Leetcode (Easy) Fibonacci Number  (Memoization)

/*
class Solution {
    public int fibo(int n, int[] dp) {
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
    }
    public int fib(int n){
        int[] dp = new int[n+1];
        return fibo(n,dp);
    }
}
*/


// Ques-2) Leetcode (Easy) Fibonacci Number  (Tabulation)

/*
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int[] dp = new int[n+1];
        dp[0]=0; dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
*/


    }
}
