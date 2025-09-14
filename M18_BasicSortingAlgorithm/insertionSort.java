package M18_BasicSortingAlgorithm;

import java.util.Scanner;

public class insertionSort {
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
        int arr[] = inputarr();
        print(arr);  
        int n = arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
        print(arr);



    }
}
