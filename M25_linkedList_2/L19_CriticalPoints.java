package M25_linkedList_2;

public class L19_CriticalPoints {
    
// Ques-21-) Leetcode 2058 Find the minimum and maximum number of nodes between critical points.


/*
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;
        int first = -1, last = -1;
        int idx = 1;
        int[] arr = {-1,-1};
        int minDistance = Integer.MAX_VALUE;
        while(right!=null){
            if(mid.val<left.val && mid.val<right.val || mid.val>left.val && mid.val>right.val){
                if(first==-1) first = idx;
                if(last!=-1){
                    int dist = idx-last;
                    minDistance = Math.min(minDistance,dist);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            right = right.next;
            mid = mid.next;
        }
        if(first==last) return arr;  // 0 or 1 critical pt.
        int maxDistance = last-first;
        arr[0] = minDistance;
        arr[1] = maxDistance;
        return arr;
    }
}
 */


}
