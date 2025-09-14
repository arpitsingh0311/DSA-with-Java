public class L2_MaximizeSumOfArrayAfterKNegations {
    

// Ques-2-) Leetcode 1005(Easy) Maximize Sum Of Array After K Negations

// MY APPROACH

/*
class Solution {
    public int Min(int[] arr){
        int mn=Integer.MAX_VALUE;
        int idx = -1;
        for(int i=0;i<arr.length;i++){
            if (arr[i] < mn) {  
                mn = arr[i];                 
                idx = i;             
            }         
        }
        return idx;
    }
    public int largestSumAfterKNegations(int[] arr, int k) {
        for(int i=0;i<k;i++){
            int idx = Min(arr);
            arr[idx] *= -1;
        }
        int sum =0;
        for(int ele:arr){
            sum += ele;
        }
        return sum;
    }
}
*/


// OPTIMISED

/*
class Solution {
    public int largestSumAfterKNegations(int[] arr, int k) {
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length && arr[i]<0 && k>0){
            arr[i] *= -1;
            i++;k--;
        }
        if(k%2==1){
            Arrays.sort(arr);
            arr[0] *=-1;   
        }
        int sum=0;
        for(int ele : arr){
            sum +=ele;
        }
        return sum;
    }
}
*/


}
