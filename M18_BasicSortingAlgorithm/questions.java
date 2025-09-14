package M18_BasicSortingAlgorithm;

import java.util.Scanner;

public class questions {
     public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static int[] inputarr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter term " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ques-1-) Leetcode 169(Easy) Majority element 

        /*class Solution {
            public int majorityElement(int[] arr) {
                Arrays.sort(arr);
                return arr[(arr.length)/2];
            }
        }*/
        
    }
}
