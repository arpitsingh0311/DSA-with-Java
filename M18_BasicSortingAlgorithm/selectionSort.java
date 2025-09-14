// package M18_BasicSortingAlgorithm;

import java.util.Scanner;

public class selectionSort {
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
        
        for(int i=0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);
    }
}
