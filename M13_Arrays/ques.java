// package M13_Arrays;
import java.util.Scanner;
public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ques-1-) Given an array of marks of students, if the marks of any student is less than 35 print its roll number.

        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter marks of  " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }  
        System.out.println("Students less than 35 : ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]<35){
                System.out.print((i+1) + ", ");
            }
        }*/



        // ques-2-) Linear Search
        //          Find the element 'x' in the array. Take array and x as input.

        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter marks of  " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        } 
        System.out.print("Enter x : ");
        int x =sc.nextInt();
        boolean flag =false;
        for(int i=0; i<arr.length; i++){
            if(x==arr[i]){
                flag = true;
                break;
            } 
        }
        if(flag==true) System.out.println("Found");
        else System.out.println("not found");*/
        


        // ques-3-)Find the maximum value out of all the elements in the array.

        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter marks of  " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        } 
        int max = arr[0];
        for(int i=0;i<arr.length; i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    max = arr[j];
                }
            }
        }
        System.out.print("Maximum Value : " + max);*/



        // ques-4-)Find the min value out of all the elements in the array.

        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter marks of  " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        } 
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print("Maximum Value : " + min);*/



        // Ques-5-) Find the second largest element in the given array.

        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter marks of  " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        } 
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }  
        }    
        int sec_max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if(arr[i] != max){
                sec_max = Math.max(sec_max,arr[i]);
            }
        }
        System.out.print("Second Maximum Value : " + sec_max);*/



        // Ques-6-)find the doublet in the array whose sum is equal to the given value x.

        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        } 
        System.out.print("Enter number x : ");
        int x = sc.nextInt();
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == x){
                    System.out.println("Ans = "+ i + " & "+ j);
                }
            }
        }*/


        // Ques-7-) Write a program to reverse the array without using any extra array.

        // Method -1

        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        } 
        for(int i=0;i<(arr.length/2);i++){
            int j = n-1-i;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int ele: arr){
            System.out.print(ele+", ");
        }*/

        // Method-2 using two pointer and while loop

        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        } 
        int i = 0 ;
        int j = (arr.length-1) ; 
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele: arr){
            System.out.print(ele+", ");
        }*/


        // Ques-8-) Rotate the given array 'a' by k steps , where k is non -negative without using extra array.


        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        } 
        int k = sc.nextInt();
        k = k%n;
        swap(0,n-1,arr);
        swap(0,k-1,arr);
        swap(k,n-1,arr);
        for(int ele: arr){
            System.out.print(ele+", ");
        }*/


        // Ques-9-) sort array of 0's and 1's.

        // method 1 two pass solution

        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array of 0's and 1's ");
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        } 
        int noOfZeroes =0, noOfOnes=0 ;
        for(int i=0;i<n; i++){
            if(arr[i]==0){
                noOfZeroes ++ ; 
            } else{
                noOfOnes ++ ;
            }
        }
        for(int i=0;i<n; i++){
            if(i<noOfZeroes) arr[i] =0;
            else arr[i] =1;
        }
        for(int ele: arr){
            System.out.print(ele+", ");
        }*/
    
        // method 2  one pass solution 
        
        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array of 0's and 1's ");
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }  
        int i=0 , j =n-1;
        while(i<j){
            if (arr[i]==0) i++;
            if (arr[j]==1) j--;
            if(i>j) break;
            if(arr[i]==1 && arr[j]==0){
                arr[i] =0;
                arr[j] =1;
                i++;
                j--;
            }
        }
        for(int ele: arr){
            System.out.print(ele+", ");
        }*/


        // Ques-10-) Sort the array of 0's, 1's, 2's.

        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array of 0's, 1's and 2's ");
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        } 

        // method 1
        /*int noOfZeroes = 0, noOfOnes = 0, noOfTwos = 0;
        for(int i=0;i<n; i++){
            if(arr[i]==0){
                noOfZeroes ++ ; 
            }
            if(arr[i]==1){
                noOfOnes ++ ;
            } 
        }
        for(int i=0;i<n; i++){
            if(i<noOfZeroes) arr[i] = 0;
            else if(i<(noOfZeroes + noOfOnes)) arr[i] =1;
            else arr[i] = 2;
        }
        for(int ele: arr){
            System.out.print(ele+", ");
        }*/

        // method-2   (Dutch flag Algorithm)  ***************** 


        /*
        class Solution {
  public void swap(int i,int j, int[] arr){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
  public void sortColors(int[] arr) {
    int n = arr.length;
    int i=0, j=0, k=n-1;
    while(j<=k){
      if(arr[j]==0){ // swap i & j and increse both
        swap(i,j,arr);
        i++; j++;
      }
      else if(arr[j]==1) j++;
      else{ // swap j & k and decrease k
        swap(j,k,arr); 
        k--;
      }
    }
  }
}
        */












        // Ques-11-) Leetcode 88(Easy) Merge two sorted arrays.

        /*System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Array a : ");
        for(int i=0; i<a.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            a[i] = sc.nextInt();
        } 
        System.out.print("Enter Array Size : ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter Array b : ");
        for(int i=0; i<b.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            b[i] = sc.nextInt();
        } 
        int c[] = new int[n+m];
        int i=0, j=0, k=0;
        // merging
        while(i<n && j<m){
            if(a[i]<=b[j]){
                c[k] = a[i];
                i++; 
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        } 
        if(i==n){
            while(j<m){
                c[k] = b[j];
                j++; k++;
            }
        } 
        if(j == m){
            while(i<n){
                c[k] = a[i];
                i++; k++;
            }
        }
        for(int ele: c){
            System.out.print(ele+", ");
        }*/


        // ques-12-) next greatest element

        //  method 1  very time comsuming  

        /*int arr[] = {12,8,41,37,2,49,16,28,21};
        int n =arr.length;
        int ans[] = new int[n];
        ans[n-1] = -1;
        for(int i=0;i<n-1; i++){
            int max = Integer.MIN_VALUE;
            for(int j=i+1; j<n; j++){
                max = Math.max(max,arr[j]);
            }
            ans[i] = max; 
        }
        for(int ele:ans){
            System.out.print(ele + ", ");
        }*/

        // method 2 optimized

        /*int arr[] = {12,8,60,37,2,49,16,28,21};
        int n =arr.length;
        int ans[] = new int[n];
        ans[n-1] = -1;
        int ng = arr[n-1];
        for(int i=n-2; i>=0; i--){
            ans[i] = ng;
            ng = Math.max(ng, arr[i]);
        }
        for(int ele:ans){
            System.out.print(ele + ", ");
        }*/


        




    }





    //  q-8-)
    public static void swap(int i, int j, int[] nums){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
            // return i,j,nums;
        }
    }



}
