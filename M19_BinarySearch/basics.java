package binarySearch;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //ALGORITHM

        int[] arr = {10,15,21,34,81,105,180,210,500,614};
        int n = arr.length;
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int low = 0;
        int high = n-1;
        boolean flag = false;
        while(low<=high){
            int mid = (-low+high)/2 + low;
            if(arr[mid] < target) low = mid + 1;
            else if(arr[mid] > target) high = mid - 1;
            else if(arr[mid]==target) {
                flag = true;
                break;
            }
        }

        if(flag == true)System.out.println("Target is Present ");
        else System.out.println("Target is Absent");



    }
}
