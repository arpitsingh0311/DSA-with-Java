public class L16_BellmanFordAlgorithm {
  
// Ques-19-) Leetcode 743(Medium) Network Delay Time

/*class Solution {
  public int networkDelayTime(int[][] times, int n, int src) {
    int[] dist = new int[n + 1];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[src] = 0;
    for (int x = 1; x < n; x++) { // n-1 times edges travel
      for (int i = 0; i < times.length; i++) {
        int u = times[i][0], v = times[i][1], wt = times[i][2];
        if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
          dist[v] = dist[u] + wt;
        }
      }
    }
    // nth time relaxation for -ve detection
    for (int i = 0; i < times.length; i++) {
      int u = times[i][0], v = times[i][1], wt = times[i][2];
      if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
        return  -1;
      }
    }
    int max = 0;
    for (int i = 1; i <= n; i++) {
      if (dist[i] == Integer.MAX_VALUE)
        return -1;
      max = Math.max(max, dist[i]);
    }
    return max;
  }
}*/






}
