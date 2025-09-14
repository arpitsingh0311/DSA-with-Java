public class L13_PathwithMinimumEffort {
  
// Ques-16-) Leetcode 1631(Medium) Path with Minimum Effort

/*class Solution {
  public class Triplet implements Comparable<Triplet>{
    int row,col,effort;
    Triplet(int row,int col,int effort){
      this.row = row;
      this.col = col;
      this.effort = effort;
    }
    public int compareTo(Triplet t){
      if(this.effort == t.effort) return this.row - t.row;
      return this.effort - t.effort;
    }
  }
  public int minimumEffortPath(int[][] arr) {
    int m = arr.length, n = arr[0].length;
    int[][] ans = new int[m][n];
    for(int i=0;i<m;i++) Arrays.fill(ans[i],Integer.MAX_VALUE);
    ans[0][0] = 0;
    PriorityQueue<Triplet> pq = new PriorityQueue<>();
    pq.add(new Triplet(0,0,0));
    while(pq.size()>0){
      Triplet top = pq.remove();
      int row=top.row, col=top.col, effort=top.effort;
      if(row==m-1 && col==n-1) return effort;
      if(row>0){ // going up
        int e = Math.abs(arr[row][col]-arr[row-1][col]);
        e = Math.max(e,effort);
        if(e < ans[row-1][col]){
          ans[row-1][col]=e;
          pq.add(new Triplet(row-1,col,e));
        }
      }
      if(col>0){ // going left
        int e = Math.abs(arr[row][col]-arr[row][col-1]);
        e = Math.max(e,effort);
        if(e<ans[row][col-1]){
          ans[row][col-1]=e;
          pq.add(new Triplet(row,col-1,e));
        }
      }
      if(row<m-1){ // going down
        int e = Math.abs(arr[row][col]-arr[row+1][col]);
        e = Math.max(e,effort);
        if(e<ans[row+1][col]){
          ans[row+1][col]=e;
          pq.add(new Triplet(row+1,col,e));
        }
      }
      if(col<n-1){ // going right
        int e = Math.abs(arr[row][col]-arr[row][col+1]);
        e = Math.max(e,effort);
        if(e<ans[row][col+1]){
          ans[row][col+1]=e;
          pq.add(new Triplet(row,col+1,e));
        }
      }
    }
    return -1;
  }
}*/

// MORE COMPILED

/*class Solution {
  public class Triplet implements Comparable<Triplet>{
    int row,col,effort;
    Triplet(int row,int col,int effort){
      this.row = row;
      this.col = col;
      this.effort = effort;
    }
    public int compareTo(Triplet t){
      if(this.effort == t.effort) return this.row - t.row;
      return this.effort - t.effort;
    }
  }
  public int minimumEffortPath(int[][] arr) {
    int m = arr.length, n = arr[0].length;
    int[][] ans = new int[m][n];
    for(int i=0;i<m;i++) Arrays.fill(ans[i],Integer.MAX_VALUE);
    ans[0][0] = 0;
    PriorityQueue<Triplet> pq = new PriorityQueue<>();
    pq.add(new Triplet(0,0,0));
    int[] r = {-1,0,1,0};
    int[] c = {0,-1,0,1};
    while(pq.size()>0){
      Triplet top = pq.remove();
      int row=top.row, col=top.col, effort=top.effort;
      if(row==m-1 && col==n-1) return effort;
      for(int i=0;i<=3;i++){
        int newRow= row + r[i];
        int newCol= col + c[i];
        if(newRow<0 || newCol<0 || newRow>m-1 || newCol>n-1) continue;
        int e = Math.abs(arr[row][col]-arr[newRow][newCol]);
        e = Math.max(e,effort);
        if(e < ans[newRow][newCol]){
          ans[newRow][newCol]=e;
          pq.add(new Triplet(newRow,newCol,e));
        }
      }
    }
    return -1;
  }
}*/

}
