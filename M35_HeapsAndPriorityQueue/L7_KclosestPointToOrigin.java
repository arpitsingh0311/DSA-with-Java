// package M35_HeapsAndPriorityQueue;

public class L7_KclosestPointToOrigin {
    public static void main(String[] args) {

// Ques-4-) Leetcode 973(medium) K closest points to origin

        // We can not do this question using HashMap as distance can be same from two diff points


        // Using Custom comparator 

/*
class Solution {
    public class Triplet implements Comparable<Triplet>{
        int d;
        int x;
        int y;
        Triplet(int d,int x, int y){
            this.d = d;
            this.x = x;
            this.y = y;
        }
        public int compareTo(Triplet t){
            return this.d - t.d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        if(k==points.length) return points;
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<points.length;i++){
            int x  = points[i][0];
            int y  = points[i][1];
            int d = x*x + y*y;
            pq.add(new Triplet(d,x,y));
            if(pq.size()>k) pq.remove();
        }
        int[][] ans = new int[k][2];
        int i=0;
        while(pq.size()>0){
            Triplet t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
            i++;
        }
        return ans;

    }
}
*/


    }
}
