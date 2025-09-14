// public package M38_SlidingWindows;

import java.util.Scanner;

class L1_MaxSumSubarrayOfSizeK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

// Ques-) Max Sum Subarray Of Size K

        int[] arr = {6,4,2,3,4,-5,8,5,2,5,-8,9,5,2,4};
        System.out.print("Enter n : ");
        int k = sc.nextInt();
        int n = arr.length;

        // METHOD-1
        /* 
        int maxSum = 0; 
        for(int i=0;i<n-k+1;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
        */

        // METHOD-2

        int i=0,j=k-1;
        int maxSum=0;
        int sum = 0;
        for(int a=0;a<k;a++){
            sum += arr[a];
        }
        i++; j++; 
        while(j<n){
            sum = sum - arr[i-1] + arr[j];
            maxSum = Math.max(maxSum,sum);
            i++; j++;
        }
        System.out.println(maxSum);


    }
}