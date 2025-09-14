public class L6_DFS {
  
// Ques-5-) Leetcode 547(Medium) Number of Provinces (DFS)

/*class Solution {
    public void dfs(int i, boolean[] vis, int[][] adj){
        int n = adj.length;
        vis[i] = true;
        for(int j=0;j<n;j++){
          if(adj[i][j]==1 && vis[j]==false){
            dfs(j,vis,adj);
          }
        }
    }
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count =0;
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,vis,adj);
                count++;
            }
        }
        return count;
    }
}*/

// Ques-6-) Leetcode 200(Medium) Number of Islands (DFS)

/*class Solution {
  public void dfs(int i, int j, char[][] grid, boolean[][] vis) {
    int m = grid.length, n = grid[0].length;
    vis[i][j] = true;
    if((i-1)>=0 && grid[i-1][j] == '1' && vis[i-1][j]==false) 
      dfs(i-1,j,grid,vis);
    if((i+1)<m && grid[i+1][j] == '1' && vis[i+1][j]==false)
      dfs(i+1,j,grid,vis);
    if((j-1)>=0 && grid[i][j-1] == '1' && vis[i][j-1]==false) 
      dfs(i,j-1,grid,vis);
    if((j+1)<n && grid[i][j+1] == '1' && vis[i][j+1]==false)
      dfs(i,j+1,grid,vis); 
  }
  public int numIslands(char[][] grid) {
    int m = grid.length, n = grid[0].length;
    boolean[][] vis = new boolean[m][n];
    int count = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '1' && !vis[i][j]) {
          dfs(i, j, grid, vis);
          count++;
        }
      }
    }
    return count;
  }
}*/

// Ques-7-) Leetcode 841(Medium) Keys and Rooms  (DFS)

/*class Solution {
    public void dfs(int start, List<List<Integer>> adj, boolean[] visited){
      visited[start] = true;
      for(int ele:adj.get(start)){
        if(!visited[ele]) dfs(ele,adj,visited);
      }
    }
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        dfs(0,adj,visited);
        for(boolean ele:visited){
            if(ele==false) return false;
        }
        return true;
    }
}*/

}
