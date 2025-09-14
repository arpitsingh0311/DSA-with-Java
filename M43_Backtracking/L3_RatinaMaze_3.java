// package M43_Backtracking;

public class L3_RatinaMaze_3 {
    

// Ques-3-) Leetcode 63(Medium) Unique Path-II

/*
class Solution {
    public int maze(int m,int n,int[][] dp,int[][] arr){
        if (m == 0 || n == 0 || arr[m - 1][n - 1] == 1) return 0;
        if (m == 1 && n == 1) return 1; 
        if(dp[m][n]!=-1) return dp[m][n];
        int rw = maze(m,n-1,dp,arr);
        int cw = maze(m-1,n,dp,arr);
        return dp[m][n] = rw+cw;
    }
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length, n =arr[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j] = -1;
            }
        }
        return maze(m,n,dp,arr);
    }
}
*/



// Ques-3-) GFG Rat in a maze-3 

// Consider a rat placed at position (0, 0) in an n x n square matrix mat. The rat's goal is to reach the destination at position (n-1, n-1). The rat can move in four possible directions: 'U'(up), 'D'(down), 'L' (left), 'R' (right).
// The matrix contains only two possible values:
// 0: A blocked cell through which the rat cannot travel.
// 1: A free cell that the rat can pass through.

// Method-1

/*
class Solution {
    // Function to find all possible paths
    public static void print(int sr, int sc, int er, int ec, String s, boolean[][] isVisited, ArrayList<String> ans, ArrayList<ArrayList<Integer>> arr) {
        // Base conditions
        if (sr < 0 || sc < 0 || sr > er || sc > ec || isVisited[sr][sc] || arr.get(sr).get(sc) == 0) {
            return;
        }
        if (sr == er && sc == ec) {
            ans.add(s);
            return;
        }
        // Mark the cell as visited
        isVisited[sr][sc] = true;
        // Explore all four direction
        print(sr + 1, sc, er, ec, s + "D", isVisited, ans, arr); // Down
        print(sr, sc - 1, er, ec, s + "L", isVisited, ans, arr); // Left
        print(sr, sc + 1, er, ec, s + "R", isVisited, ans, arr); // Right
        print(sr - 1, sc, er, ec, s + "U", isVisited, ans, arr); // Up
        // Backtrack
        isVisited[sr][sc] = false;
    }
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> arr) {
        int rows = arr.size();
        if (rows == 0) return new ArrayList<>();
        int cols = arr.get(0).size();
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] isVisited = new boolean[rows][cols];
        // Call the recursive function
        print(0, 0, rows - 1, cols - 1, "", isVisited, ans, arr);
        return ans;
    }
}
*/

// METHOD-2 OPTIMIZED

/*
class Solution {
    // Function to find all possible paths
    public static void print(int sr, int sc, int er, int ec, String s,ArrayList<String> ans, ArrayList<ArrayList<Integer>> arr) {
        // Base conditions
        if (sr < 0 || sc < 0 || sr > er || sc > ec || arr.get(sr).get(sc) == 0) {
            return;
        }
        if (sr == er && sc == ec) {
            ans.add(s);
            return;
        }
        if(arr.get(sr).get(sc)==-1) return; // Already visited
        // Mark the cell as visited
        arr.get(sr).set(sc,-1);
        // Explore all four direction
        print(sr + 1, sc, er, ec, s + "D", ans, arr); // Down
        print(sr, sc - 1, er, ec, s + "L", ans, arr); // Left
        print(sr, sc + 1, er, ec, s + "R", ans, arr); // Right
        print(sr - 1, sc, er, ec, s + "U", ans, arr); // Up
        // Backtrack
        arr.get(sr).set(sc,1);
        
    }
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> arr) {
        int rows = arr.size();
        if (rows == 0) return new ArrayList<>();
        int cols = arr.get(0).size();
        ArrayList<String> ans = new ArrayList<>();
        // Call the recursive function
        print(0, 0, rows - 1, cols - 1, "", ans, arr);
        return ans;
    }
}
*/


}
