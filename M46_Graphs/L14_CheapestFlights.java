public class L14_CheapestFlights {
  
// Ques-17-) Leetcode 787 Cheapest Flights within K stops

/*class Solution {
  public class Pair {
    int node, cost;
    Pair(int node,int cost) {
      this.node = node;
      this.cost = cost;
    }
  }
  public class Triplet implements Comparable<Triplet>{
    int node,cost,stops;
    Triplet(int node,int cost,int stops){
      this.node = node;
      this.cost = cost;
      this.stops = stops;
    }
    public int compareTo(Triplet t){
      if(this.stops == t.stops) return this.cost - t.cost;
      return this.stops - t.stops;
    }
  }
  public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    List<List<Pair>> adj = new ArrayList<>();
    for (int i = 0; i < n; i++)
      adj.add(new ArrayList<>());
    for (int i = 0; i < flights.length; i++) {
      int u = flights[i][0], v = flights[i][1], price = flights[i][2];
      adj.get(u).add(new Pair(v, price));
    }
    int[] ans = new int[n];
    Arrays.fill(ans,Integer.MAX_VALUE);
    ans[src] = 0;
    PriorityQueue<Triplet> pq = new PriorityQueue<>();
    pq.add(new Triplet(src,0,0));
    while(pq.size()>0){
      Triplet top = pq.remove();
      int node=top.node, cost=top.cost, stops=top.stops;
      // if(node==dst) return ans[node];
      if(stops==k+1) continue;
      for(Pair p:adj.get(node)){
        int totalCost = cost+p.cost;
        if(totalCost<ans[p.node]){
          ans[p.node] = totalCost;
          pq.add(new Triplet(p.node, totalCost,stops+1));
        }
      }
    }
    if(ans[dst]==Integer.MAX_VALUE) return -1; // if ans is max value then it return -1
    else return ans[dst];
  }
}*/

// USING QUEUE

/*class Solution {
  public class Pair {
    int node, cost;
    Pair(int node,int cost) {
      this.node = node;
      this.cost = cost;
    }
  }
  public class Triplet {
    int node,cost,stops;
    Triplet(int node,int cost,int stops){
      this.node = node;
      this.cost = cost;
      this.stops = stops;
    }
  }
  public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    List<List<Pair>> adj = new ArrayList<>();
    for (int i = 0; i < n; i++)
      adj.add(new ArrayList<>());
    for (int i = 0; i < flights.length; i++) {
      int u = flights[i][0], v = flights[i][1], price = flights[i][2];
      adj.get(u).add(new Pair(v, price));
    }
    int[] ans = new int[n];
    Arrays.fill(ans,Integer.MAX_VALUE);
    ans[src] = 0;
    Queue<Triplet> pq = new LinkedList<>();
    pq.add(new Triplet(src,0,0));
    while(pq.size()>0){
      Triplet top = pq.remove();
      int node=top.node, cost=top.cost, stops=top.stops;
      // if(node==dst) return ans[node];
      if(stops==k+1) continue;
      for(Pair p:adj.get(node)){
        int totalCost = cost+p.cost;
        if(totalCost<ans[p.node]){
          ans[p.node] = totalCost;
          pq.add(new Triplet(p.node, totalCost,stops+1));
        }
      }
    }
    if(ans[dst]==Integer.MAX_VALUE) return -1; // if ans is max value then it return -1
    else return ans[dst];
  }
}*/

}
