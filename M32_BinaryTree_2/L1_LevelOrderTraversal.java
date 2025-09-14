// package M32_BinaryTree_2;
import java.util.*;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class L1_LevelOrderTraversal {

    public static void levelOrder(TreeNode root){
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            TreeNode front = q.remove();
            System.out.print(front.val + " ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); //a is the root
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        a.left = b; a.right=c;
        b.left = d; b.right=e;
        c.left = f; c.right=g;
        e.left = h; e.right=i;


        levelOrder(a);

// Leetcode 102(Medium) Binary Tree Level Order Traversal

/*class Solution {
  class Pair{
    TreeNode node;
    int lvl;
    Pair(TreeNode node,int lvl){
      this.node = node;
      this.lvl = lvl;
    }
  }
  public int levels(TreeNode root){
    if(root==null) return 0;
    return 1 + Math.max(levels(root.left),levels(root.right));
  }
  public void BFS(TreeNode root,List<List<Integer>> ans){
    if(root==null) return;
    Queue<Pair> q = new ArrayDeque<>();
    q.add(new Pair(root,0));
    while(q.size()>0){
      Pair front = q.remove();
      ans.get(front.lvl).add(front.node.val);
      if(front.node.left!=null) q.add(new Pair(front.node.left,front.lvl+1));
      if(front.node.right!=null) q.add(new Pair(front.node.right,front.lvl+1));
    }
  }
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
    int n = levels(root); 
    for(int i=0;i<n;i++) ans.add(new ArrayList<>());
    BFS(root,ans);
    return ans;
  }
}*/








    }
}
