package binarySearch;

import java.util.Scanner;

public class ques {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ques-1-) Leetcode-704(Easy) Binary Search

        /*class Solution {
            public int search(int[] arr, int target) {
                int n = arr.length;
                int low=0, high=n-1;
                while(low<=high){
                    int mid = low + (high-low)/2;
                    if(arr[mid]==target) return mid;
                    else if(arr[mid]<target) low= mid+1;
                    else high=mid-1;
                }
                return -1;
            }
        }*/


        // Ques-2-) Given a sorted array and an integer 'x',find the lower bound of x. Smallest index such that arr[index] >=x.  

        /*int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int lb = n;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + ((high-low)/2);
            if(arr[mid] >= target) {
                lb = Math.min(mid, lb);
                high = mid - 1;
            } else low = mid + 1;
        }
        System.out.println(lb);*/

        
        //Ques-3-)Given an sorted integer array and an integer 'x'. Upper bound is the minimum index such that arr[index]>x.

        /*int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int ub = n;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + ((high-low)/2);
            if(arr[mid] > target) {
                ub = Math.min(mid, ub);
                high = mid - 1;
            } else low = mid + 1;
        }
        System.out.println(ub);*/


        // Ques-4-) Leetcode 34(Medium) Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. 

        /*class Solution {
            public int[] searchRange(int[] arr, int target) {
                int[] ans = {-1,-1};
                int n = arr.length;
                int lo=0 , hi=n-1;
                boolean flag = false;
                while(lo<=hi){
                    int mid = lo + (hi-lo)/2;
                    if(target>arr[mid]) lo = mid+1;
                    else if(target<arr[mid]) hi = mid-1;
                    else if(target==arr[mid]){
                        flag=true;
                        break;
                    } 
                }
                if(flag==false) return ans;
                int lb=n;
                lo=0; hi=n-1;
                while(lo<=hi){
                    int mid = lo+(hi-lo)/2;
                    if(arr[mid]>=target){
                        lb= Math.min(mid,lb);
                        hi = mid-1;
                    } else lo = mid+1;
                }
                int ub=n;
                lo=0; hi=n-1;
                while(lo<=hi){
                    int mid = lo+(hi-lo)/2;
                    if(arr[mid]>target){
                        ub= Math.min(mid,ub);
                        hi = mid-1;
                    } else lo = mid+1;
                }
                ans[0] = lb;
                ans[1] = ub-1;
                return ans;
            }
        }*/


        //Ques-5-) Leetcode 852(Medium) Peak index in a mountain array. 

        /*
        public static int peakIndexInMountainArray(int[] arr) {
            int n = arr.length;
            int lo=1,hi=n-2;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                    return mid; 
                else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
                    lo = mid+1;
                else hi = mid-1;
            }
            return 0;
        }
        */


        //Ques-6-) Leetcode-69(Easy) Sqrt(x)  

        /* 
        public static int mySqrt(int x) {
            long lo=0,hi=(long)x;
            while(lo<=hi){
                long mid = lo + (hi-lo)/2;
                if(mid*mid == (long)x) return (int)mid;
                else if(mid*mid > (long)x) hi = mid-1;
                else lo = mid + 1;
            }
            return (int)hi;
        }*/



        //Ques-7-) Leetcode 33(Medium) Search in Rotated sorted array. 

        // Method-1

/*
class Solution {
    public static int pivot(int[] arr) {
        int n = arr.length;
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[hi]) {
                lo = mid + 1; // Pivot is in the right part
            } else {
                hi = mid; // Pivot is in the left part
            }
        }
        return lo; // Pivot index
    }
    public int Bsearch(int[] arr, int target,int low,int high) {
        int n = arr.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low= mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        int p = pivot(arr);
        if (target >= arr[p] && target <= arr[arr.length - 1]) {
            return Bsearch(arr, target, p, arr.length - 1); // Right part
        } else {
            return Bsearch(arr, target, 0, p - 1); // Left part
        }
    }
}
*/

        // Method-2

        /*public int search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0, hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<=arr[hi]){ // i am in right sorted array
                if(target > arr[mid] && target<= arr[hi]) lo = mid+1;
                else hi = mid-1;
            }
            else{ // i am in left sorted array
                if(target>=arr[lo] && target < arr[mid]) hi = mid-1;
                else lo = mid+1;
            }
        }
        return -1;
        } */


        //Ques-8-)  Leetcode 658(Medium) Find K closest elements.   

        /*
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>  ans = new ArrayList<>();
        int n = arr.length;
        if(x<arr[0]){
            for(int i=0;i<k;i++){
                ans.add(arr[i]);
            }
            return ans;
        }
        if(x>arr[n-1]){
            for(int i=n-1; i>=(n-k);i--){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }
        int lb = n;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=x){
                lb = mid;
                hi = mid-1;
            } else lo = mid+1;
        }
        int j=lb, i=lb-1;
        while(k>0 && i>=0 && j<n){
            int di = Math.abs(x-arr[i]);
            int dj = Math.abs(x-arr[j]);
            if(di<=dj) {
                ans.add(arr[i]);
                i--;
            }
            else{
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i<0 && k>0){
            ans.add(arr[j]);
            j++;
            k--;
        }
        while(j==n && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(ans);
        return ans;

    }
} */


    // Ques-9-) Leetcode 1283(Medium) Find the smallest Divisor given a Threshold.     
        

    /*class Solution {
    public boolean isLess( int mid, int[] arr, int t){
        int sum = 0;
        int n = arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]%mid==0) sum += arr[i]/mid;
                else sum += arr[i]/mid +1;
            }
        if(sum<=t) return true;
        else return false;
    }
    public int smallestDivisor(int[] arr, int t) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx = Math.max(mx,arr[i]);
        }
        int d=1;
        int lo=1, hi = mx;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isLess(mid,arr,t)==true){
                d = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        
        return d;
    }
} */


    //Ques-10-) Leetcode 1011(Medium) Capacity to ship packages within



    /*class Solution {
        public boolean isPossible(int c, int[] arr, int d){
            int n = arr.length;
            int load = 0;
            int days = 1; 
            for(int i=0;i<n;i++){
                if(load + arr[i] <=c) load += arr[i];
                else{
                    load = arr[i];
                    days++;
                }
            }
            if(days>d) return false;
            else return true;
        }
        public int shipWithinDays(int[] arr, int d) {
            int n = arr.length;
            int sum = 0, mx = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                mx = Math.max(mx,arr[i]);
                sum += arr[i];
            }
            int minC = sum;
            int lo = mx, hi = sum;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(isPossible(mid,arr,d) == true){
                    minC = mid;
                    hi = mid-1;
                }
                else lo = mid+1;
            }
            return minC;
        }
    }*/



    //Ques-11) Leetcode 2064(Medium) Minimized Maximum of products distributed to any store.

    /*class Solution {
        public boolean isPossible(int maxQ, int n, int[] arr){
            int stores = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%maxQ == 0) stores += arr[i]/maxQ;
                else stores += arr[i]/maxQ + 1;
            }
            if(stores > n) return false;
            else return true;
        }
        public int minimizedMaximum(int n, int[] arr) {
            int m = arr.length;
            int mx = Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                mx = Math.max(mx,arr[i]);
            }
            int lo=1, hi=mx;
            int Ans =0;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2 ;
                if(isPossible(mid,n,arr)==true){
                    Ans = mid;
                    hi = mid-1;
                } 
                else lo = mid+1;
            }
            return Ans;
        }
    }*/


    //Ques-12-) Leetcode 1539(Medium) kth Missing positive number


        /*class Solution {
            public int findKthPositive(int[] arr, int k) {
                int lo =0, hi=arr.length-1;
                while(lo<=hi){
                    int mid = lo + (hi-lo)/2;
                    int missed = arr[mid] - (mid+1);
                    if(missed<k) lo = mid+1;
                    else hi = mid-1;
                }
                return k + hi +1;
            }
        }*/

    }
}
