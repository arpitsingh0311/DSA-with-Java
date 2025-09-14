public class L6_L7_HouseRobberProblem {
    public static void main(String[] args) {
        
// Ques-5-) Leetcode 198(Medium) House Robber Problem 

// USING DP (RECURSION + MEMOIZATION) 

/*
class Solution {
    public int amount(int[] nums,int i,int[] dp){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take = nums[i] + amount(nums,i+2,dp);
        int skip = amount(nums,i+1,dp);
        return dp[i] = Math.max(take,skip);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return amount(nums,0,dp);
    }
}
*/


// USING TABULATION


/*
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n];
        dp[0]=nums[0];
        dp[1]= Math.max(nums[1],nums[0]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}
*/


// Ques-6-) Leetcode 213(Medium) House Robber II


/*
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        
        // Case 1: Rob from the first house to the second-to-last house
        int case1 = robLinear(nums, 0, n - 2);
        // Case 2: Rob from the second house to the last house
        int case2 = robLinear(nums, 1, n - 1);
        
        return Math.max(case1, case2);
    }
    
    // Helper function to solve the linear house robbing problem
    private int robLinear(int[] nums, int start, int end) {
        int prev1 = 0, prev2 = 0;
        for (int i = start; i <= end; i++) {
            int curr = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
*/



    }
}
