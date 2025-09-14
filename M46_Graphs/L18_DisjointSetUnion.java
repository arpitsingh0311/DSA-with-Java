public class L18_DisjointSetUnion {
 
// Ques-21-) Leetcode 547(Medium) Number of Provinces by DSU

/*class Solution {
  static int[] parent;
  public int find(int a){
    if(parent[a]==a) return a;
    return find(parent[a]);
  }
  public void union(int a, int b){
    int leaderA = find(a);
    int leaderB = find(b);
    if(leaderA!=leaderB){
      parent[leaderB] = leaderA;
    }
  }
  public int findCircleNum(int[][] isConnected) {
    int n = isConnected.length;
    parent = new int[n+1];
    for(int i=1;i<=n;i++) parent[i] = i;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        //edge is from i+1 to j+1
        if(i!=j && isConnected[i][j]==1) union(i+1,j+1);  // connecting group leaders of both
      }
    }
    int count=0;
    for(int i=1;i<=n;i++){
      if(parent[i]==i) count++;
    }
    return count;
  }
}*/

// OPTIMISATION 1

/*class Solution {
  static int[] parent;
  static int[] size;
  public int find(int a) {
    if (parent[a] == a)
      return a;
    return find(parent[a]);
  }
  public void union(int a, int b) {
    a = find(a);
    b = find(b);
    if (a != b) {
      if (size[a] > size[b]) { // a sholud be parent of b
        parent[b] = a;
        size[a] += size[b];
      } else {
        parent[a] = b;
        size[b] += size[a];
      }
    }
  }
  public int findCircleNum(int[][] isConnected) {
    int n = isConnected.length;
    parent = new int[n + 1];
    size = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      parent[i] = i;
      size[i] = 1;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        // edge is from i+1 to j+1
        if (i != j && isConnected[i][j] == 1)
          union(i + 1, j + 1); // connecting group leaders of both
      }
    }
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (parent[i] == i)
        count++;
    }
    return count;
  }
}*/

// OPTIMISATION 2 (BEST)

/*class Solution {
  static int[] parent;
  static int[] size;
  public int find(int a) {
    if (parent[a] == a) return a;
    return parent[a] = find(parent[a]);
  }
  public void union(int a, int b) {
    a = find(a);
    b = find(b);
    if (a != b) {
      if (size[a] > size[b]) { // a sholud be parent of b
        parent[b] = a;
        size[a] += size[b];
      } else {
        parent[a] = b;
        size[b] += size[a];
      }
    }
  }
  public int findCircleNum(int[][] isConnected) {
    int n = isConnected.length;
    parent = new int[n + 1];
    size = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      parent[i] = i;
      size[i] = 1;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        // edge is from i+1 to j+1
        if (i != j && isConnected[i][j] == 1)
          union(i + 1, j + 1); // connecting group leaders of both
      }
    }
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (parent[i] == i)
        count++;
    }
    return count;
  }
}*/




}
