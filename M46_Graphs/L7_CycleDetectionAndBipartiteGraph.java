public class L7_CycleDetectionAndBipartiteGraph {
  
// Ques-8-) Leetcode 785(Medium) Is Graph Bipartite?

/*class Solution {
  static boolean ans;
  public void bfs(int i, int[][] adj, int[] visited){
    Queue<Integer> q = new LinkedList<>();
    visited[i] = 0;
    q.add(i);
    while(q.size()>0){
      int front = q.remove();
      int color = visited[front];
      for(int ele:adj[front]){
        if(visited[ele]==visited[front]){
          ans=false;
          return;
        }
        if(visited[ele]==-1){
          visited[ele] = 1-color;
          q.add(ele);
        }
      }
    }
  }
  public boolean isBipartite(int[][] adj) {
    ans= true;
    int n = adj.length;
    int[] visited = new int[n];
    Arrays.fill(visited,-1);
    // 1-> red, 0->blue
    for(int i=0;i<n;i++){
      if(ans==false) return ans;
      if(visited[i]==-1) bfs(i,adj,visited);
    }
    return ans;
  }
  }*/



}
