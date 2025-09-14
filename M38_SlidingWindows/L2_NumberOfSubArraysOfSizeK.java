public class L2_NumberOfSubArraysOfSizeK {
    public static void main(String[] args) {



// Ques-1-) Leetcide 1343(Medium) Number of Subarrays of Size K and average greater than or equal to threshold.


/*
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0,j=k-1;
        int sum=0;
        for(int a=i;a<=j;a++){
            sum += arr[a];
        }
        i++;j++;
        int count = 0;
        if((sum/k) >= threshold) count++;
        while(j<arr.length){
            sum = sum - arr[i-1] + arr[j];
            if((sum/k) >= threshold) count++;
            i++;j++;
        }
        return count;
    }
}
*/

    }
}
