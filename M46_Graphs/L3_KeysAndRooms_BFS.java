public class L3_KeysAndRooms_BFS {
    
// Ques-2-) Leetcode 841(Medium) Keys and Rooms

/*class Solution {
    public void bfs(int start, List<List<Integer>> adj, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(q.size()>0){
            int front = q.remove();
            for(int ele: adj.get(front)){
                if(!visited[ele]){
                    visited[ele] = true;
                    q.add(ele);
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        bfs(0,adj,visited);
        for(boolean ele:visited){
            if(ele==false) return false;
        }
        return true;
    }
}*/

}
