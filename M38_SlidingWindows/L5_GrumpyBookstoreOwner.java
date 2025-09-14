public class L5_GrumpyBookstoreOwner {
    public static void main(String[] args) {
        
// Ques-6-) Leetcode 1052(Medium) Grumpy BookStore Owner


/*
class Solution {
    public int maxSatisfied(int[] arr, int[] grumpy, int minutes) {
        int n=arr.length, i=0, j=minutes-1, unsatisfied=0;
        int a=i,b=j, maxUnsatisfied =0;
        for(int x=i;x<=j;x++){
            if(grumpy[x]==1) unsatisfied += arr[x];
        }
        while(j<n){
            if(maxUnsatisfied<unsatisfied){
                maxUnsatisfied = unsatisfied;
                a=i; b=j;
            }
            i++; j++;
            if(j<n && grumpy[j]==1) unsatisfied += arr[j];
            if(grumpy[i-1]==1) unsatisfied -= arr[i-1];
        }
        for(int x=a;x<=b;x++){
            grumpy[x]=0;
        }
        int satisfied = 0;
        for(int x=0;x<n;x++){
            if(grumpy[x]==0) satisfied += arr[x];
        }
        return satisfied;
    }
}
*/



    }
}
