

public class L6_LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {
        
// Ques-6-) Leetcode 2389(Easy) Longest Subsequence With Limited Sum


/*
class Solution {
    public int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public int[] answerQueries(int[] arr, int[] queries) {
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        for(int i=0;i<queries.length;i++){
            int index = binarySearch(arr, queries[i]);
            queries[i] = index;
        }
        return queries;
    }
}
*/


    }
}
