public class L12_DijkstrasAlgrothim {
  public static void main(String[] args) {
    
// Ques-14-) Leetcode 743(Medium) Network Delay Time

/*class Solution {
  public class Pair implements Comparable<Pair>{
    int node,time;
    Pair(int node, int time){
      this.node = node;
      this.time = time;
    }
    public int compareTo(Pair p){
      if(this.time == p.time) return this.node-p.node;
      return this.time - p.time;
    }
  }
  public int networkDelayTime(int[][] times, int n, int src) {
    List<List<Pair>> adj = new ArrayList<>();
    for(int i=0;i<=n;i++){
      adj.add(new ArrayList<Pair>());
    }
    for(int i=0;i<times.length;i++){
      int u = times[i][0], v = times[i][1], t = times[i][2];
      adj.get(u).add(new Pair(v,t));
    }
    int[] ans = new int[n+1];
    Arrays.fill(ans,Integer.MAX_VALUE);
    ans[src] = 0;
    PriorityQueue<Pair> pq = new PriorityQueue<>();
    pq.add(new Pair(src,0));
    while(pq.size()>0){
      Pair top = pq.remove();
      if(top.time > ans[top.node]) continue;
      for(Pair p : adj.get(top.node)){
        int totalTime = top.time + p.time;
        if(totalTime<ans[p.node]){
          ans[p.node] = totalTime;
          pq.add(new Pair(p.node,totalTime));  
        } 
      }
    }
    int max = -1;
    for(int i=1;i<ans.length;i++){
      max = Math.max(ans[i],max);
    }
    if(max == Integer.MAX_VALUE) return -1;
    else return max;
  }
}*/


// Ques-15-) Leetcode 1514(Medium) Path with Maximum Probability

/*class Solution {
  public class Pair implements Comparable<Pair>{
    int node;
    double prob;
    Pair(int node, double prob){
      this.node = node;
      this.prob = prob;
    }
    public int compareTo(Pair p){
      if(this.prob == p.prob) return this.node-p.node;
      return Double.compare(this.prob,p.prob);
    }
  }
  public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
    List<List<Pair>> adj = new ArrayList<>();
    for(int i=0;i<n;i++) adj.add(new ArrayList<>());
    for(int i=0;i<edges.length;i++){
      int u = edges[i][0], v = edges[i][1];
      double prob = succProb[i];
      adj.get(u).add(new Pair(v,prob));
      adj.get(v).add(new Pair(u,prob));
    }
    double[] ans = new double[n];
    ans[start] = 1;
    PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
    pq.add(new Pair(start,1));
    while(pq.size()>0){
      Pair top = pq.remove();
      int tnode = top.node;
      double tprob = top.prob;
      if(top.prob < ans[tnode]) continue;
      for(Pair p : adj.get(tnode)){
        double totalProb = tprob * p.prob;
        if(totalProb > ans[p.node]){
          ans[p.node] = totalProb;
          pq.add(new Pair(p.node,totalProb)); 
        }
      }
    }
    return ans[end];
  }
}*/




  }
}
