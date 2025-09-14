public class L4_pathExistInGraph_BFS {
   
// Ques-3-) 1971Leetcode (Medium) Find if path exist in graph 

/*class Solution {
    public void bfs(int start, List<List<Integer>> adj, boolean[] visited,int end){
      Queue<Integer> q = new LinkedList<>();
      q.add(start);
      while(q.size()>0){
        int front = q.remove();
        for(int ele: adj.get(front)){
          if(!visited[ele]){
            visited[ele] = true;
            q.add(ele);
            if(ele==end) return;
          }
        }
      }
    }
    public boolean validPath(int n, int[][] edges, int start, int end) {
      if(start==end) return true; 
      List<List<Integer>> adj = new ArrayList<>();
      for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
      }
      for(int i=0;i<edges.length;i++){
        int a = edges[i][0] , b = edges[i][1];
        adj.get(a).add(b);
        adj.get(b).add(a);
      }
      boolean[] vis = new boolean[n];
      vis[start] =true;
      bfs(start,adj,vis,end);
      return vis[end];
    }
}*/


}
