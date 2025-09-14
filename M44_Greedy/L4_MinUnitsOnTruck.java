public class L4_MinUnitsOnTruck {

// Ques-4-) Leetcode 1710(Easy) Minimum Units on a Truck

/*
class Solution {
    public int maximumUnits(int[][] arr, int s) {
        Arrays.sort(arr,(a1,a2)->a2[1]-a1[1]);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int boxNo=arr[i][0];
            int unit = arr[i][1];
            int min = Math.min(boxNo,s);
            s-=min;
            sum +=min*unit;
            if(s==0) return sum;
        }
        return sum;
    }
}
*/



}
