import java.util.Arrays;

public class L4_Tabulation2 {



    public static void main(String[] args) {


// Ques-4-) Leetcode 416(Medium) Partition Equal Subset Sum

/*class Solution {
    public boolean canPartition(int[] arr) {
        int sum = 0, n=arr.length;
        for(int ele : arr) sum += ele;
        if(sum%2!=0) return false;
        int target = sum/2;
        int[][] dp = new int[arr.length][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                boolean ans = false;
                boolean skip = (i>0) ? (dp[i-1][j]==1) : (j==0);
                // boolean skip;
                // if(i>1) skip = (dp[i-1][j]==1);
                // else{
                //     skip = (j==0);
                // }
                if(j-arr[i]<0) ans = skip;
                else{
                    boolean pick = (i>0) ? (dp[i-1][j-arr[i]]==1):(j==0);
                    ans = pick || skip;
                }
                dp[i][j] = (ans) ? 1 : 0;
            }
        }
        return (dp[n-1][target]==1);
    }
}*/
 
    }
}
