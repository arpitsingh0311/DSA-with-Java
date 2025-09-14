// package M22_MergeAndQuickSort;
import java.util.Scanner;

public class L1_MergeSort {

// ALGORITHM

    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(j<b.length) c[k++] = b[j++];
        while(i<a.length) c[k++] = a[i++];  
    }

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void mergesort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];
        for(int i=0;i<n/2;i++){
            a[i]= arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        //magic
        mergesort(a);
        mergesort(b);
        merge(a, b, arr);
        a=null; b=null;  // for improving space complexity
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // MERGE SORT ALGORITHM
        
        // int[] arr = {86,546,24,15,95,46,35,15,98,96,45};
        // print(arr);
        // mergesort(arr);
        // print(arr);
        System.out.println(4^2);

    }






}
