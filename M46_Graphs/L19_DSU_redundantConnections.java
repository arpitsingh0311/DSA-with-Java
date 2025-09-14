public class L19_DSU_redundantConnections {
  
// CYCLE DETECTION IN UNDIRECTED GRAPH 


// Ques-22-) Leetcode 684(Medium) Redundant Connection

/*class Solution {
  static int[] parent;
  static int[] size;
  public int leader(int u){
    if(parent[u]==u) return u;
    return parent[u] = leader(parent[u]);
  }
  public void union(int u, int v){
    int a = leader(u);
    int b = leader(v);
    if(a!=b){
      if(size[a]>size[b]){
        parent[b]=a;
        size[a]+=size[b];
      } else{
        parent[a]=b;
        size[b]+=size[a];
      }
    }
  }
  public int[] findRedundantConnection(int[][] edges) {
    int n = edges.length;
    parent = new int[n+1];
    size = new int[n+1];
    for(int i=0;i<=n;i++){
      parent[i]=i;
      size[i]=1;
    }
    int[] ans = new int[2];
    for(int[] arr:edges){
      int u = arr[0], v = arr[1];
      if(leader(u)==leader(v)){
        ans[0]=u; ans[1]=v; break;
      } else{
        union(u, v); // connecting group leaders of both
      }
    }
    return ans;
  }
}*/



}
