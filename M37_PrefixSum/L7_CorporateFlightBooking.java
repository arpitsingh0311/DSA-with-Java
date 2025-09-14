public class L7_CorporateFlightBooking {
    public static void main(String[] args) {
        
// Ques-7-) Leetcode  1109(Medium) Corporate Flight Booking

// BRUTE-FORCE APPROACH


/*
class Solution {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int[] ans = new int[n];
        for(int i=0;i<arr.length;i++){
            int first = arr[i][0];
            int last = arr[i][1];
            int seats = arr[i][2];
            for(int j=first-1;j<=last-1;j++){
                ans[j] += seats;
            }
        }
        return ans;
    }
}
*/



// USING PREFIX SUM


/* 
class Solution {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int[] ans = new int[n];
        for(int i=0;i<arr.length;i++){
            int first = arr[i][0];
            int last = arr[i][1];
            int seats = arr[i][2];
            ans[first-1] += seats;
            if(last<ans.length) ans[last] -= seats; 
        }
        for(int i=1;i<ans.length;i++){
            ans[i] += ans[i-1];
        }
        return ans;
    }
}
*/


    }
}
