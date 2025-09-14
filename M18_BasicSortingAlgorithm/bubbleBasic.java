// package M18_BasicSortingAlgorithm;

import java.util.Scanner;

public class bubbleBasic {

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

    public static void main(String[] args) {
        
        int arr[] = inputarr();
        print(arr);
        int n = arr.length;
        // BUBBLE SORT --1-- 

        /*for(int j=0;j<arr.length-1;j++){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        print(arr);*/

        // BUBBLE SORT --2--

        /*for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);*/


        // BUBBLE SORT --3--

        for(int i=0;i<n-1;i++){
            //Check arr is sorted or not
            boolean flag = true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        print(arr);



        // Ques-1-) Leetcode 283(Easy) Push zeroes to the end while maintaining the relative order of other elements.

        /*class Solution {
            public void moveZeroes(int[] arr) {
                int n = arr.length;
                int noz = 0;
                for(int i=0;i<n;i++){
                    if(arr[i]==0) noz++;
                }
                for(int i=0;i<noz;i++){
                    for(int j=0;j<n-1;j++){
                        if(arr[j]==0){
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }
            }
        }*/
        















    }
}
