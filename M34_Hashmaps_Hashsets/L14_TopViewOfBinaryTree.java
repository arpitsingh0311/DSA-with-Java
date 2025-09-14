public class L14_TopViewOfBinaryTree {
    public static void main(String[] args) {
        

// Ques-9-) Hackerrank   Top view of Binary Tree.

/*
    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
	public static void topView(Node root) {
      HashMap<Integer,Integer> map = new HashMap<>();
      Queue<Pair> q = new LinkedList<>();
      q.add(new Pair(root,0));
      int minLvl = Integer.MAX_VALUE;
      int maxLvl = Integer.MIN_VALUE;
      while(q.size()>0){
          Pair temp = q.remove();
          Node n = temp.node;
          int lvl = temp.level;
          minLvl = Math.min(minLvl,lvl);
          maxLvl = Math.max(maxLvl,lvl);
          if(!map.containsKey(lvl)) map.put(lvl,n.data);
          if(n.left!=null) q.add(new Pair(n.left,lvl-1));
          if(n.right!=null) q.add(new Pair(n.right,lvl+1));
      }
      for(int i=minLvl;i<=maxLvl;i++){
          System.out.print(map.get(i)+ " ");
      }
    }
*/


        // Ques-10-) GFG Bottom view of binary tree 








    }
}
