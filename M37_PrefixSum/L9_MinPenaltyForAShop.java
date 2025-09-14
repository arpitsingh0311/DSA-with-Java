public class L9_MinPenaltyForAShop {
    public static void main(String[] args) {
        
// Ques-9-) Leetcode 2483(Medium) Minimum Penalty for a shop

/*
class Solution {
    public int bestClosingTime(String str) {
        int n = str.length();
        int[] N = new int[n+1];
        int[] Y = new int[n+1];
        for(int i=1;i<=n;i++){
            N[i] = N[i-1];
            if(str.charAt(i-1)=='N') N[i] += 1;
        }
        for(int i=n-1;i>=0;i--){
            Y[i] = Y[i+1];
            if(str.charAt(i)=='Y') Y[i] += 1;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            Y[i] += N[i];
            min = Math.min(min,Y[i]);
        }
        for(int i=0;i<=n;i++){
            if(Y[i]==min) return i;
        }
        return 1234567;
    }
}
*/







    }
}
